package com.example.administrator.mydemo_onepic_2;

import android.app.Activity;
import android.content.Context;
import android.database.sqlite.SQLiteAbortException;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

/**
 * Created by Administrator on 2016/11/30 0030.
 */
public class GlideActy extends Activity {



    Button button;
    ImageView imageView,imageView2,imageView3;
    Glide glide;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glide);

        button = (Button) findViewById(R.id.button);
        imageView = (ImageView) findViewById(R.id.iv_item_0);
        imageView2 = (ImageView) findViewById(R.id.iv_item_1);
        imageView3 = (ImageView) findViewById(R.id.iv_item_2);

                glide.with(GlideActy.this).load("http://i.imgur.com/DvpvklR.png").priority(Priority.HIGH).into(imageView);
                glide.with(GlideActy.this).load("http://i.imgur.com/DvpvklR.png").priority(Priority.NORMAL).into(imageView2);
                glide.with(GlideActy.this).load("http://i.imgur.com/DvpvklR.png").priority(Priority.LOW).into(imageView3);

        // 必须在UI线程中调用
        Glide.get(context).clearMemory();




    }
}
