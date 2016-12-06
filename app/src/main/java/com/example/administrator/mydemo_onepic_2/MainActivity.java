package com.example.administrator.mydemo_onepic_2;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.util.ArrayList;
import java.util.List;
import android.content.DialogInterface;

public class MainActivity extends Activity  {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.bt_dialog);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater layoutInflater  = LayoutInflater.from(MainActivity.this);
                View view = layoutInflater.inflate(R.layout.activity_dialog,null);
                Dialog dialog = new AlertDialog.Builder(MainActivity.this).
                        setTitle("对话框的标题").
                        setMessage("对话框的内容").
                        setIcon(R.mipmap.ic_launcher).
                        setPositiveButton("确定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(MainActivity.this,"确定",Toast.LENGTH_SHORT).show();

                            }
                        }).
                        setNegativeButton("取消", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(MainActivity.this,"取消",Toast.LENGTH_SHORT).show();
                            }
                        }).
                        setView(view).
                        create();

                dialog.show();

            }
        });




    }
}
