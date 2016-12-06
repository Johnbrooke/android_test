package com.example.administrator.mydemo_onepic_2;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

/**
 * Created by Administrator on 2016/11/21 0021.
 */
public class MenuActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_menu,menu);
        
//        menu.add(Menu.NONE,Menu.NONE,1,"菜单1").setIcon(R.mipmap.ic_launcher);
//        menu.add(Menu.NONE,Menu.NONE,2,"菜单2");
//        menu.add(Menu.NONE,Menu.NONE,3,"菜单3");
//        menu.add(Menu.NONE,Menu.NONE,4,"菜单4");
//        menu.add(Menu.NONE,Menu.NONE,5,"菜单5");
//        menu.add(Menu.NONE,Menu.NONE,6,"菜单6");
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_item:
                Toast.makeText(MenuActivity.this,"第一个",Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_item2:
                Toast.makeText(MenuActivity.this,"第二个",Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_item3:
                Toast.makeText(MenuActivity.this,"第三个",Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_item4:
                Toast.makeText(MenuActivity.this,"第四个",Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_item5:
                Toast.makeText(MenuActivity.this,"第五个",Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_item6:
                Toast.makeText(MenuActivity.this,"第六个",Toast.LENGTH_SHORT).show();
                break;

        }
        return super.onOptionsItemSelected(item);
    }
}
