package com.nandana.calc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class sub extends AppCompatActivity {
    EditText ed1,ed2;
    Button b1,b2;
   String getNum1, getNum2,result;
    int num1, num2, diff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sub);

        ed1=(EditText) findViewById(R.id.n1);
        ed2=(EditText) findViewById(R.id.n2);
        b1=(Button) findViewById(R.id.sub);
        b2=(Button) findViewById(R.id.m2);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob= new Intent(getApplicationContext(), MainActivity.class);
                startActivity(ob);
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getNum1=ed1.getText().toString();
                getNum2=ed2.getText().toString();
                num1=Integer.parseInt(getNum1);
                num2=Integer.parseInt(getNum2);
                diff=num1-num2;
                result=String.valueOf(diff);
                Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();
            }
        });


    }
}