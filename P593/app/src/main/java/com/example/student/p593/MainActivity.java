package com.example.student.p593;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.net.HttpURLConnection;
import java.net.URL;

public class MainActivity extends AppCompatActivity {
    EditText pid,password;
    LoginTest loginTest;
    ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pid=findViewById(R.id.id);
        password=findViewById(R.id.password);
        progressDialog =new ProgressDialog(MainActivity.this);
    }
    public void clickBt(View v){
        String id= pid.getText().toString();
        String pwd= password.getText().toString();

        if(id==null || pwd==null || id.equals("")  || pwd.equals("") ){
            return;
        }

        loginTest=new LoginTest("http://70.12.114.147/Android/login.jsp");
        loginTest.execute(id.trim(),pwd.trim());
    }
    class LoginTest extends AsyncTask<String,String,String>{

        String url;
        public LoginTest(){

        }

        public LoginTest(String url){
            this.url=url;
        }

        @Override
        protected void onPreExecute() {
            progressDialog.setMessage("Loginn...");
            progressDialog.show();
        }

        @Override
        protected String doInBackground(String... strings) {
            String id =strings[0];
            String pwd =strings[1];
            //http request
            url+="?id="+id+"&pwd="+pwd;
            StringBuilder sb=new StringBuilder();

            URL url=null;
            HttpURLConnection con=null;
            try{
                url = new URL(this.url);
                con =(HttpURLConnection) url.openConnection();
                if(con!=null){
                    con.setReadTimeout(1000);
                    con.setRequestMethod("GET");
                    con.setRequestProperty("Accept","*/*");
                    if(con.getResponseCode() !=HttpURLConnection.HTTP_OK)
                        return null;
                }

            }catch (Exception e){
                Toast.makeText(MainActivity.this, "connection Error:"+e.getMessage(),Toast.LENGTH_SHORT);

            }finally {
                    con.disconnect();
            }

            return sb.toString();
        }

        @Override
        protected void onPostExecute(String s) {
            progressDialog.dismiss();
        }
    }
}
