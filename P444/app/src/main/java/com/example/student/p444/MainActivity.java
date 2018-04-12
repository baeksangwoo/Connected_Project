package com.example.student.p444;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.TaskStackBuilder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.widget.Toast;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    static int cnt=0;
    Date date =null;
    SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp=getSharedPreferences("pref", Activity.MODE_PRIVATE);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show();
        restoreState();
        savesState();
    }


    public void restoreState(){
        Toast.makeText(this, " "+cnt, Toast.LENGTH_SHORT).show();

        if(sp!=null){
            if(sp.contains("cnt") && sp.contains("date")){
                int rcnt= sp.getInt("cnt",0);
                SharedPreferences.Editor editor=sp.edit();
                editor.putInt("cnt",++cnt);
                editor.commit();
                Toast.makeText(this, "얏호"+cnt, Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void savesState(){
        SharedPreferences.Editor editor= sp.edit();
        editor.putInt("cnt",++cnt);
        editor.commit();
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestory", Toast.LENGTH_SHORT).show();
        restoreState();
        savesState();
    }


}
