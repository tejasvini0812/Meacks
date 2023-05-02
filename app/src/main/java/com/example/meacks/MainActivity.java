package com.example.meacks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 = (Button) findViewById(R.id.loginbtn);
        Button b2 = (Button) findViewById(R.id.registerbtn);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myintent2 = new Intent(MainActivity.this, login.class);
                startActivity(myintent2);


            }

        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myintent2 = new Intent(MainActivity.this, register.class);
                startActivity(myintent2);


            }
        });
    }
}

   // }
    //protected void openactivity_login() {

     //   Intent intent = new Intent(this, login.class);
       // startActivity(intent);
    //}

//
  //      protected void openactivity_register () {
    //        Intent intent = new Intent(this, register.class);
      //      startActivity(intent);

        //}


//}