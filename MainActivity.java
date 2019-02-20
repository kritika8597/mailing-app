package com.example.kritika.mytestapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;

import static android.widget.Toast.*;

public class MainActivity extends AppCompatActivity {
            public static String ABC = "";
        EditText et2, et3;
        Button btn;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);



            setContentView(R.layout.activity_main);


            et2 = (EditText) this.findViewById(R.id.mail);
            et3 = (EditText) this.findViewById(R.id.password);
            btn = (Button) this.findViewById(R.id.button);


            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {


                            if (isValidEmaillId(et2.getText().toString().trim())) {
                                Toast.makeText(getApplicationContext(), "Valid Email Address.", Toast.LENGTH_LONG).show();
                                Intent intent = new Intent(MainActivity.this, Main3Activity.class);
                                startActivity(intent);



                            } else {
                                Toast.makeText(getApplicationContext(), "InValid Email Address.", Toast.LENGTH_LONG).show();
                            }





                        }
                        //}
                    });


                }
            });


        }


        private boolean isValidEmaillId(String email) {
            return Pattern.compile("^(([\\w-]+\\.)+[\\w-]+|([a-zA-Z]{1}|[\\w-]{2,}))@"
                    + "((([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
                    + "[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\."
                    + "([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
                    + "[0-9]{1,2}|25[0-5]|2[0-4][0-9])){1}|"
                    + "([a-zA-Z]+[\\w-]+\\.)+[a-zA-Z]{2,4})$").matcher(email).matches();
        }



    }
