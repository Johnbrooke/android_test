package com.example.administrator.mydemo_onepic_2;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.CardView;

/**
 * Created by Administrator on 2016/11/30 0030.
 */
public class CardViewActy extends Activity {

    CardView cardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardview);

        cardView = (CardView) findViewById(R.id.cardview);

        cardView.setRadius(8);    //设置图片圆角的半径大小

        cardView.setCardElevation(8);  //设置阴影部分大小

        cardView.setContentPadding(5,5,5,5);

    }
}
