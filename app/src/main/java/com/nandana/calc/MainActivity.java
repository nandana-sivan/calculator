package com.nandana.calc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        b1=(Button) findViewById(R.id.but1);
        b2=(Button) findViewById(R.id.but2);
        b3=(Button) findViewById(R.id.but3);
        b4=(Button) findViewById(R.id.but4);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob= new Intent(getApplicationContext(), add.class);
                startActivity(ob);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob1= new Intent(getApplicationContext(), sub.class);
                startActivity(ob1);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob2= new Intent(getApplicationContext(), mul.class);
                startActivity(ob2);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob3= new Intent(getApplicationContext(), div.class);
                startActivity(ob3);
            }
        });
    }
}