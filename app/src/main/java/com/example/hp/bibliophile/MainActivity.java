package com.example.hp.bibliophile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity  {
   EditText u,pass;
    Button signin;
    String username,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        u=(EditText)findViewById(R.id.u);
        pass=(EditText)findViewById(R.id.p);
        signin=(Button)findViewById(R.id.button);



        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                username=u.getText().toString();
                password= pass.getText().toString();
                if(username.equals("a@gmail.com") && password.equals("a")){
                    Intent intent=new Intent(getApplicationContext(),option.class);
                    startActivity(intent);
                }
            }
        });
    }
}
