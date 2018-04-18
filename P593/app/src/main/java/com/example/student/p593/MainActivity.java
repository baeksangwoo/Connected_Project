package com.example.student.p593;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText id,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        id=findViewById(R.id.id);
        password=findViewById(R.id.password);

    }
    public void clickBt(View v){
        String pid= id.getText().toString();
        String pwd= password.getText().toString();
    }
    class LoginTest extends AsyncTask<String,String,String>{
        @Override
        protected void onPreExecute() {

        }

        @Override
        protected String doInBackground(String... strings) {
            return null;
        }

        @Override
        protected void onPostExecute(String s) {
           
        }
    }
}
