package com.example.student.p277;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextClock;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    LinearLayout container;
    LayoutInflater inflater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        makeui();

    }

    public void makeui(){
        container=findViewById(R.id.container);
        inflater=(LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //inflater에는 레이아웃에 다른 xml을 붙일때
    }


    public void clickBt(View v){
        View v1=
        inflater.inflate(R.layout.activity_sub,container,true);
        TextView stv =container.findViewById(R.id.stv);
        stv.setText("Button Click");
        Button sbt1 =container.findViewById(R.id.sbt1);

        Button sbt2 =container.findViewById(R.id.sbt2);
        sbt1.setText("sub Button 1");
        sbt2.setText("sub Button 2");

        sbt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //sub2변경

            }
        });
        sbt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //sub3 변경
            }
        });
    }
}
