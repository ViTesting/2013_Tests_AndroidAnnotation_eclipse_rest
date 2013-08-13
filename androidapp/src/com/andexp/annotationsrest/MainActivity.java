package com.andexp.annotationsrest;

import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

import com.andexp.annotationsrest.rest.Header;
import com.andexp.annotationsrest.rest.HeaderData;
import com.andexp.annotationsrest.rest.TimeData;
import com.andexp.annotationsrest.rest.MyRestClient;
import com.googlecode.androidannotations.annotations.Background;
import com.googlecode.androidannotations.annotations.Click;
import com.googlecode.androidannotations.annotations.EActivity;
import com.googlecode.androidannotations.annotations.UiThread;
import com.googlecode.androidannotations.annotations.ViewById;
import com.googlecode.androidannotations.annotations.rest.RestService;

@EActivity(R.layout.main_activity)
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

	@Click(R.id.main_btn_launch_time)
	void launchTimeSync() {
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

	@Click(R.id.main_btn_launch_header)
	void launchHeaderSync() {
		loadHeader();
	}

	@Background
	void loadHeader() {
		Header header = restClient.getHeader();
		displayHeaderData(header.getHeaderData());
	}

	@UiThread
	void displayHeaderData(HeaderData headerData) {
		this.mTextView.setText(headerData.toString());		
	}

}
