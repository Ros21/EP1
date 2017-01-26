package com.example.android.engineeringpaathshala;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Roshan on 1/25/2017.
 */

public class DiscussionActivity extends AppCompatActivity {
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forum_layout);
        textView =(TextView) findViewById(R.id.textViewForum);
       // String value = getIntent().getExtras().getString("Data");
       // textView.setText(value);
    }
    public void askFunction(View view){
        Intent in1= new Intent(DiscussionActivity.this,LoginActivity.class);
        startActivity(in1);

    }
}
