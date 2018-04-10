package com.example.student.p66;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void bt1click(View v){
        Toast.makeText(this, "bt1", Toast.LENGTH_SHORT).show();
        Intent intent =
                new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
        startActivity(intent);
    }

    public void bt2click(View v){
        Toast.makeText(this, "bt2", Toast.LENGTH_SHORT).show();
        Intent intent =
                new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.facebook.com/"));
        startActivity(intent);
    }

    public void bt3click(View v){
        Intent intent =
                new Intent(getApplicationContext(),
                        Main2Activity.class);
        startActivity(intent);
    }

}
