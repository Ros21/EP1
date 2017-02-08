package com.example.android.engineeringpaathshala;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

/**
 * Created by Roshan on 2/8/2017.
 */

public class CategoryUpload extends AppCompatActivity implements View.OnClickListener {

    CheckBox syll,notes,qb,others;
    Button submit;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category_upload);

        syll = (CheckBox) findViewById(R.id.checkBoxSyll);
        syll.setOnClickListener(this);
        notes = (CheckBox) findViewById(R.id.checkBoxNotes);
        notes.setOnClickListener(this);
        qb = (CheckBox) findViewById(R.id.checkBoxQB);
        qb.setOnClickListener(this);
        others  = (CheckBox) findViewById(R.id.checkBoxOthers);
        others.setOnClickListener(this);
        submit = (Button)findViewById(R.id.buttonSubmit);

    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.checkBoxSyll:
                if (syll.isChecked())
                {
                    //Toast.makeText(getApplicationContext(), "Syll", Toast.LENGTH_LONG).show();
                    ButtonContainer.ButtonValue.uploadCategory = "syll";
                    notes.setChecked(false);
                    qb.setChecked(false);
                    others.setChecked(false);

                }

                break;
            case R.id.checkBoxNotes:
                if (notes.isChecked()) {
                    ButtonContainer.ButtonValue.uploadCategory = "notes";
                    syll.setChecked(false);
                    qb.setChecked(false);
                    others.setChecked(false);
                    //Toast.makeText(getApplicationContext(), "Notes", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.checkBoxQB:
                if (qb.isChecked()){
                    ButtonContainer.ButtonValue.uploadCategory = "qb";
                    syll.setChecked(false);
                    notes.setChecked(false);
                    others.setChecked(false);
                    //Toast.makeText(getApplicationContext(), "QB", Toast.LENGTH_LONG).show();
                }

                break;
            case R.id.checkBoxOthers:
                if (others.isChecked()){
                    ButtonContainer.ButtonValue.uploadCategory = "others";
                    syll.setChecked(false);
                    notes.setChecked(false);
                    qb.setChecked(false);
                    //Toast.makeText(getApplicationContext(), "Others", Toast.LENGTH_LONG).show();
                }
                break;

        }
    }

    public void submitFunc(View view) {
        if((notes.isChecked()) || (syll.isChecked()) || (qb.isChecked()) || (others.isChecked())){
            Intent in = new Intent(CategoryUpload.this, FireAppActivity.class);
            startActivity(in);
        }
        else
        {
            Toast.makeText(this, "Select an option",   Toast.LENGTH_SHORT).show();
        }

    }
}