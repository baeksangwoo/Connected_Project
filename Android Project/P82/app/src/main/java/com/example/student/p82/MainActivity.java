package com.example.student.p82;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button bt1,bt2,bt3,bt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        makeui();
    }

    public void makeui(){
        bt1= findViewById(R.id.bt1); //버튼의 리소스를 가져온다
        bt2= findViewById(R.id.bt2);
        bt3= findViewById(R.id.bt3);
        bt4= findViewById(R.id.bt4);



        bt2.setVisibility(View.INVISIBLE);
        bt3.setVisibility(View.INVISIBLE);
        bt4.setVisibility(View.INVISIBLE);

    }


    public void start(View v){
        bt1.setVisibility(View.INVISIBLE);
        bt2.setVisibility(View.VISIBLE);
        bt3.setVisibility(View.VISIBLE);
        bt4.setVisibility(View.VISIBLE);
    }

    public void click1bt(View v){
        Intent intent =
                new Intent(getApplicationContext(),
                        Main2Activity.class);
        startActivity(intent);
    }
    public void click2bt(View v){
        Intent intent =
                new Intent(getApplicationContext(),
                        Main3Activity.class);
        startActivity(intent);
    }
    public void click3bt(View v){
        Intent intent =
                new Intent(getApplicationContext(),
                        Main4Activity.class);
        startActivity(intent);

        super.onDestroy();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Destory", Toast.LENGTH_SHORT).show();
    }
}
