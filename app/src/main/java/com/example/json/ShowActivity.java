package com.example.json;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class ShowActivity extends AppCompatActivity {
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        textView=findViewById(R.id.textshow);
        Intent intent=getIntent();
        String adr=intent.getStringExtra("address");
        textView.setText(adr);
        ArrayList<String> hobbies = getIntent().getStringArrayListExtra("hobbies");

        // Do whatever you want with the hobbies, such as displaying them in a TextView
        TextView hobbiesTextView = findViewById(R.id.hobbiesTextView);
        if (hobbies != null && !hobbies.isEmpty()) {
            StringBuilder hobbiesText = new StringBuilder("Hobbies: ");
            for (String hobby : hobbies) {
                hobbiesText.append(hobby).append(", ");
            }
            // Remove the trailing comma and space
            hobbiesText.delete(hobbiesText.length() - 2, hobbiesText.length());
            hobbiesTextView.setText(hobbiesText.toString());
        } else {
            hobbiesTextView.setText("No hobbies specified.");
        }
    }
}
