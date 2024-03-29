//
// DO NOT EDIT THIS FILE, IT HAS BEEN GENERATED USING AndroidAnnotations.
//


package com.andexp.annotationsrest;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.andexp.annotationsrest.R.id;
import com.andexp.annotationsrest.R.layout;
import com.andexp.annotationsrest.rest.HeaderData;
import com.andexp.annotationsrest.rest.MyRestClient_;
import com.andexp.annotationsrest.rest.TimeData;
import com.googlecode.androidannotations.api.BackgroundExecutor;

public final class MainActivity_
    extends MainActivity
{

    private Handler handler_ = new Handler();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        init_(savedInstanceState);
        super.onCreate(savedInstanceState);
        setContentView(layout.main_activity);
    }

    private void init_(Bundle savedInstanceState) {
        restClient = new MyRestClient_();
    }

    private void afterSetContentView_() {
        mTextView = ((TextView) findViewById(id.main_tv_hello));
        {
            View view = findViewById(id.main_btn_launch_time);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        MainActivity_.this.launchTimeSync();
                    }

                }
                );
            }
        }
        {
            View view = findViewById(id.main_btn_launch_header);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        MainActivity_.this.launchHeaderSync();
                    }

                }
                );
            }
        }
    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        afterSetContentView_();
    }

    @Override
    public void setContentView(View view, LayoutParams params) {
        super.setContentView(view, params);
        afterSetContentView_();
    }

    @Override
    public void setContentView(View view) {
        super.setContentView(view);
        afterSetContentView_();
    }

    public static MainActivity_.IntentBuilder_ intent(Context context) {
        return new MainActivity_.IntentBuilder_(context);
    }

    @Override
    public void displayHeaderData(final HeaderData headerData) {
        handler_.post(new Runnable() {


            @Override
            public void run() {
                try {
                    MainActivity_.super.displayHeaderData(headerData);
                } catch (RuntimeException e) {
                    Log.e("MainActivity_", "A runtime exception was thrown while executing code in a runnable", e);
                }
            }

        }
        );
    }

    @Override
    public void displayTimeData(final TimeData timeData) {
        handler_.post(new Runnable() {


            @Override
            public void run() {
                try {
                    MainActivity_.super.displayTimeData(timeData);
                } catch (RuntimeException e) {
                    Log.e("MainActivity_", "A runtime exception was thrown while executing code in a runnable", e);
                }
            }

        }
        );
    }

    @Override
    public void loadTimeData() {
        BackgroundExecutor.execute(new Runnable() {


            @Override
            public void run() {
                try {
                    MainActivity_.super.loadTimeData();
                } catch (RuntimeException e) {
                    Log.e("MainActivity_", "A runtime exception was thrown while executing code in a runnable", e);
                }
            }

        }
        );
    }

    @Override
    public void loadHeader() {
        BackgroundExecutor.execute(new Runnable() {


            @Override
            public void run() {
                try {
                    MainActivity_.super.loadHeader();
                } catch (RuntimeException e) {
                    Log.e("MainActivity_", "A runtime exception was thrown while executing code in a runnable", e);
                }
            }

        }
        );
    }

    public static class IntentBuilder_ {

        private Context context_;
        private final Intent intent_;

        public IntentBuilder_(Context context) {
            context_ = context;
            intent_ = new Intent(context, MainActivity_.class);
        }

        public Intent get() {
            return intent_;
        }

        public MainActivity_.IntentBuilder_ flags(int flags) {
            intent_.setFlags(flags);
            return this;
        }

        public void start() {
            context_.startActivity(intent_);
        }

        public void startForResult(int requestCode) {
            if (context_ instanceof Activity) {
                ((Activity) context_).startActivityForResult(intent_, requestCode);
            } else {
                context_.startActivity(intent_);
            }
        }

    }

}
