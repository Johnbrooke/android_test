package com.example.administrator.mydemo_onepic_2;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/11/22 0022.
 */
public class AnimationActy extends Activity {

    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);

        button = (Button) findViewById(R.id.bt_item);
        final Animation animation = AnimationUtils.loadAnimation(this,R.anim.applaud_animation);
        textView = (TextView) findViewById(R.id.tv_item);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v == button){
                    textView.setVisibility(View.VISIBLE);
                    textView.startAnimation(animation);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            textView.setVisibility(View.GONE);
                        }
                    },1000);
                }
            }
        });

    }
}
