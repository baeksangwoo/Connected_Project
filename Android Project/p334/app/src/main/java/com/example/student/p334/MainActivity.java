package com.example.student.p334;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView =findViewById(R.id.textView);
    }
    public void ClickBt(View v){
        Intent intent =new Intent(getApplicationContext(),SecondActivity.class);
        intent.putExtra("name1",1000);
        startActivityForResult(intent,100); //보내고 값을 받겠다
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
       if(requestCode==100 && resultCode == RESULT_OK){
           int result =data.getIntExtra("result",0);
           textView.setText(result+" ");
       }
    }
}
