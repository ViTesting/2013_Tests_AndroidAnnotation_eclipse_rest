package com.andexp.annotationsrest;

import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

import com.andexp.annotationsrest.rest.TimeData;
import com.andexp.annotationsrest.rest.MyRestClient;
import com.googlecode.androidannotations.annotations.Background;
import com.googlecode.androidannotations.annotations.Click;
import com.googlecode.androidannotations.annotations.EActivity;
import com.googlecode.androidannotations.annotations.UiThread;
import com.googlecode.androidannotations.annotations.ViewById;
import com.googlecode.androidannotations.annotations.rest.RestService;

@EActivity(R.layout.activity_main)
public class MainActivity extends Activity {
	@RestService
	MyRestClient restClient;

	@ViewById(R.id.main_tv_hello)
	TextView mTextView;

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Click(R.id.main_btn_launch)
	void launchHeaderSync() {
		loadTimeData();
	}

	@Background
	void loadTimeData() {
		TimeData timeData = restClient.getTime();
		displayTimeData(timeData);
	}

	@UiThread
	void displayTimeData(TimeData timeData) {
		mTextView.setText(timeData.toString());
	}

}
