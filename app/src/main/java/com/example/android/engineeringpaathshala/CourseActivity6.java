package com.example.android.engineeringpaathshala;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Roshan on 10/20/2016.
 */
public class CourseActivity6 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sixth_sem_layout);

    }

    public void DCFunction(View view) {
        ButtonContainer.ButtonValue.buttonClicked = 61;
        Intent intent = new Intent(CourseActivity6.this,NotesActivity.class);
        startActivity(intent);

    }

    public void ESFunction(View view) {
        ButtonContainer.ButtonValue.buttonClicked = 62;
        Intent intent = new Intent(CourseActivity6.this,NotesActivity.class);
        startActivity(intent);
    }


    public void OOSEFnction(View view) {
        ButtonContainer.ButtonValue.buttonClicked = 63;
        Intent intent = new Intent(CourseActivity6.this,NotesActivity.class);
        startActivity(intent);
    }

    public void SMFunction(View view) {
        ButtonContainer.ButtonValue.buttonClicked = 64;
        Intent intent = new Intent(CourseActivity6.this,NotesActivity.class);
        startActivity(intent);
    }

//    public void AdvJavaFunction(View view) {
//        ButtonContainer.ButtonValue.buttonClicked = 65;
//        Intent intent = new Intent(CourseActivity6.this,NotesActivity.class);
//        startActivity(intent);
//    }
}
