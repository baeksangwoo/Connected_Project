package com.example.student.p334;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {
    TextView textView2;
    int num1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textView2=findViewById(R.id.textView2);

        Intent intent =getIntent();
        num1 = intent.getIntExtra("num1", 0);
        textView2.setText(num1+"");
    }

    public void clickbt(View v)
    {
        int result = (num1+500)*3000;
        Intent intent= new Intent();
        intent.putExtra("result",result);
        setResult(RESULT_OK,intent);
        finish();//엑티비티 종료
    }
}
