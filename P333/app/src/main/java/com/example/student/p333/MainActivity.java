package com.example.student.p333;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Clickb(View v){
        Intent intent =null;
        switch (v.getId()){
            case R.id.button:
                intent =new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
                break;
            case R.id.button2:
                intent =new Intent(Intent.ACTION_VIEW,
                        Uri.parse("tel:010-1090-1000"));
                break;
            case R.id. button3:
                intent =new Intent(Intent.ACTION_CALL,
                        Uri.parse("tel:010-1090-1000"));
                break;

        }
    }
}
