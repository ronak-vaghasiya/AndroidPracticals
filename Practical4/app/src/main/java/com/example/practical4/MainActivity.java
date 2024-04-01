package com.example.practical4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2,e3,e4,e5,e6;
    Button b1,b2;
    DataStore ds;
    String s1,s2,s3,s4,s5,s6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.name);
        e2=findViewById(R.id.address);
        e3=findViewById(R.id.contact);
        e4=findViewById(R.id.email);
        e5=findViewById(R.id.dob);
        e6=findViewById(R.id.password);

        b1=findViewById(R.id.login);
        b2=findViewById(R.id.register);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Login.class);
                startActivity(i);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ds= new DataStore(getApplicationContext());

                s1=e1.getText().toString();
                s2=e2.getText().toString();
                s3=e3.getText().toString();
                s4=e4.getText().toString();
                s5=e5.getText().toString();
                s6=e6.getText().toString();

                if(ds.addData(s1,s2,s3,s4,s5,s6)){
                    Intent i = new Intent(MainActivity.this, Login.class);
                    startActivity(i);
                }
                else {
                    Toast.makeText(MainActivity.this,"Registration unsuccessful",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
