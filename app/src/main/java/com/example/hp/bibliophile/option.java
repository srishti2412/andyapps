package com.example.hp.bibliophile;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class option extends AppCompatActivity {
    RadioGroup rbg;
    RadioButton selected;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);
        rbg=(RadioGroup)findViewById(R.id.radioGroup);


        b=(Button)findViewById(R.id.cont);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedid = rbg.getCheckedRadioButtonId();
                log.
                RadioButton selected = (RadioButton) findViewById(selectedid);
                String text = (String) selected.getText();
                if (text=="Rent In") {
                    Intent i1 = new Intent(option.this, rentin.class);
                    startActivity(i1);
                }
                if (text=="Rent Out") {
                    Intent i2 = new Intent(option.this, rentout.class);
                    startActivity(i2);
                }
            }

        });


            }


    }


