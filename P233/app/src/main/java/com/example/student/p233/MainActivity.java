package com.example.student.p233;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    CheckBox cb1,cb2;
    RadioButton rb1,rb2;
    Switch switch1;
    ToggleButton toggleButton;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        makeui();
    }

    public void makeui(){
        cb1=findViewById(R.id.cb1);
        cb2=findViewById(R.id.cb2);
        rb1=findViewById(R.id.rb1);
        rb2=findViewById(R.id.rb2);
        toggleButton=findViewById(R.id.toggleButton);
        editText =findViewById(R.id.editText);

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int i, int i1, int i2) {
                    String d=editText.getText().toString();
                Toast.makeText(MainActivity.this, i+" "+i1+" "+i2+" "+d, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(MainActivity.this, "결과"+isChecked, Toast.LENGTH_SHORT).show();
                if(isChecked==true)
                {
                    rb1.setVisibility(View.INVISIBLE);
                    rb2.setVisibility(View.VISIBLE);
                }
                else
                {
                    rb1.setVisibility(View.VISIBLE);
                    rb2.setVisibility(View.INVISIBLE);
                }
            }
        });
    }


    public void ClickBT(View v) {
        String str = "";

        if (cb1.isChecked())
        {
            str+="공부";
        }
        if(cb2.isChecked()){
            str+="잠자기";
        }
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
    }

    public void ClickBT2(View v){

        String str="";

        if(rb1.isChecked()){
            str+="남자";
        }else if(rb2.isChecked()){
            str+="여자";
        }
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
    }

}
