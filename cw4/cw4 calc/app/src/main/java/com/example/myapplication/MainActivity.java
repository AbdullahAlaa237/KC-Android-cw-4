package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText firstnumber = findViewById(R.id.num1);
        EditText secoundnumber = findViewById(R.id.num2);
        Button Plural = findViewById(R.id.button);
        TextView total = findViewById(R.id.abdo2);

        Plural.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = firstnumber.getText().toString();
                String b = secoundnumber.getText().toString();

                int x = Integer.parseInt(a);
                int y = Integer.parseInt(b);

                int z = x + y;

                total.setText("total is" + z);
    }
}