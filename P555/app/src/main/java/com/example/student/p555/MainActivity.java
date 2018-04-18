package com.example.student.p555;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.concurrent.ExecutionException;

public class MainActivity extends AppCompatActivity {

    EditText editText,editText2;
    TextView textView;
    LoginTask loginTask;
    ProgressDialog progressDialog;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText =findViewById(R.id.editText);
        editText2=findViewById(R.id.editText2);
        textView =findViewById(R.id.textView3);

        button=findViewById(R.id.button);

        progressDialog = new ProgressDialog(MainActivity.this);
        progressDialog.setMessage("Progress...");
        progressDialog.setCancelable(false); //프로그래스가 절대 안죽게 할려는 것
    }
    public  void  clickLogin(View v) throws ExecutionException, InterruptedException {
        loginTask =new LoginTask(); //버튼을 누를때마다 동작이 되게 하는것
        String id = editText.getText().toString();
        String pwd = editText2.getText().toString();
        String result="";

       loginTask.execute(id,pwd);
//
//        loginTask.onPreExecute();
//        result=loginTask.execute(id,pwd).get();
//        loginTask.onPostExecute("");
//        if(result.equals("1")){
//            textView.setText("Login OK !");
//        }else{
//            textView.setText("Login FAIL !");
//        }

    }

    class LoginTask extends AsyncTask< String, Void,  String > {
        @Override
        protected void onPreExecute() {
            progressDialog.show();
            button.setEnabled(false);
        }

        @Override
        protected String doInBackground(String... strings) { //strings는 배열
            String id= strings[0]; //값이 첫번쨰로 저장된 것
            String pwd= strings[1]; //값이 두번째로 저장된 것
            String result="";
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(id.equals("qq")&&pwd.equals("11")){
                result="1";
            }else{
                result="0";
            }
            return result;
        }

        @Override
        protected void onPostExecute(String s) {
                progressDialog.dismiss();
            button.setEnabled(true);
            if(s.equals("1")){
                textView.setText("LOGIN OK!");
            }
            else
            {
                textView.setText("LOGIN FAIL");
                
            }
        }
    }

}
