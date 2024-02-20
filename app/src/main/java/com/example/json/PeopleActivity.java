package com.example.json;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

public class PeopleActivity extends AppCompatActivity {
 ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_people);
        listView=findViewById(R.id.list2);
        Intent intent=getIntent();
        String name= intent.getStringExtra("company");
    }
}
