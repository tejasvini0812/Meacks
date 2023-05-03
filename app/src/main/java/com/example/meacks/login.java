package com.example.meacks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class login extends AppCompatActivity {
    private Button button;
    private Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        button=(Button) findViewById(R.id.registerbtn);
        button2=(Button) findViewById(R.id.loginbtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openactivity_register();

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openactivity_home();
            }
        });
    }

    public void openactivity_register(){

        Intent intent =new Intent(this,register.class);
        startActivity(intent);
    }

    public void openactivity_home(){

        Intent intent =new Intent(this,home.class);
        startActivity(intent);
    }
}
