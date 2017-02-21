package com.example.android.engineeringpaathshala;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Roshan on 10/20/2016.
 */
public class CourseActivity4 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fourth_sem_layout);
}
    public void DCFunction(View view) {
        ButtonContainer.ButtonValue.buttonClicked = 41;
        Intent intent = new Intent(this,NotesActivity.class);
        startActivity(intent);

    }

    public void ESFunction(View view) {
        ButtonContainer.ButtonValue.buttonClicked = 42;
        Intent intent = new Intent(this,NotesActivity.class);
        startActivity(intent);
    }


    public void OOSEFnction(View view) {
        ButtonContainer.ButtonValue.buttonClicked = 43;
        Intent intent = new Intent(this,NotesActivity.class);
        startActivity(intent);
    }

    public void SMFunction(View view) {
        ButtonContainer.ButtonValue.buttonClicked = 44;
        Intent intent = new Intent(this,NotesActivity.class);
        startActivity(intent);
    }

    public void ProbFunction(View view) {
        ButtonContainer.ButtonValue.buttonClicked = 45;
        Intent intent = new Intent(this,NotesActivity.class);
        startActivity(intent);
    }
}


