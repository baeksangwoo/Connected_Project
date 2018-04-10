package com.example.student.string;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ClickON(View v){

        String pwd = tx_pwd

        Intent intent =null;
        if(id.equals("qq")&& pwd.equals("11")){
            //intent.putExtra();
            intent = new Intent(getApplicationContext(), LoginOkActivity.class)

        }else{
            intent =
                    new Intent(getApplicationContext(), Acitivity.class)
        }
    }
}
