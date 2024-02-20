package com.example.json;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
AppCompatButton appCompatButton;
EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        appCompatButton=findViewById(R.id.button);
        editText=findViewById(R.id.edittext);
        appCompatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input=editText.getText().toString();
                Intent intent=new Intent(MainActivity.this, People.class);
                intent.putExtra("company",input);
                startActivity(intent);
            }
        });
    }
}
