package com.example.android.engineeringpaathshala;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by Roshan on 1/25/2017.
 */

public class PostActivity extends AppCompatActivity {
    private EditText mEditText;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_layout);

    }
    public void questionFunction(View view){
        mEditText = (EditText) findViewById(R.id.editTextQuestion);
        String question = mEditText.getText().toString().trim();

      //  Intent intent1 = getIntent();
       /// String name = intent1.getStringExtra("Uname");
       // String finalQuestion = question +"\n" +"
        //                "+name;
        if(!TextUtils.isEmpty(question)) {
            DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference("Discussion");
            String userId = mDatabase.push().getKey();

            mDatabase.child(userId).setValue(question);

            mEditText.setText("");
            Intent intent = new Intent(PostActivity.this, DiscussionActivity.class);
            // intent.putExtra("Data",question);
            startActivity(intent);
        }
        else
        {
            Toast.makeText(this, "Text is empty",Toast.LENGTH_SHORT).show();
        }
    }
}
