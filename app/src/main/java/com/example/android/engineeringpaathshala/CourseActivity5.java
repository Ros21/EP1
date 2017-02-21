package com.example.android.engineeringpaathshala;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Roshan on 10/20/2016.
 */
public class CourseActivity5 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fifth_sem_layout);

    }

    public void DCFunction(View view) {
        ButtonContainer.ButtonValue.buttonClicked = 51;
        Intent intent = new Intent(this,NotesActivity.class);
        startActivity(intent);

    }

    public void ESFunction(View view) {
        ButtonContainer.ButtonValue.buttonClicked = 52;
        Intent intent = new Intent(this,NotesActivity.class);
        startActivity(intent);
    }


    public void OOSEFnction(View view) {
        ButtonContainer.ButtonValue.buttonClicked = 53;
        Intent intent = new Intent(this,NotesActivity.class);
        startActivity(intent);
    }

    public void SMFunction(View view) {
        ButtonContainer.ButtonValue.buttonClicked = 54;
        Intent intent = new Intent(this,NotesActivity.class);
        startActivity(intent);
    }

    public void ProbFunction(View view) {
        ButtonContainer.ButtonValue.buttonClicked = 55;
        Intent intent = new Intent(this,NotesActivity.class);
        startActivity(intent);
    }

    public void TocFunction(View view) {
        ButtonContainer.ButtonValue.buttonClicked = 56;
        Intent intent = new Intent(this,NotesActivity.class);
        startActivity(intent);
    }


}
