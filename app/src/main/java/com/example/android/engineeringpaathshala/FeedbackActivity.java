package com.example.android.engineeringpaathshala;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by Roshan on 11/12/2016.
 */

public class FeedbackActivity extends AppCompatActivity {
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feedback_layout);
    }

    public void PostFeedbackFunction(View view) {
        editText = (EditText) findViewById(R.id.editTextFeedback);
        String feed = editText.getText().toString().trim();
        if(!TextUtils.isEmpty(feed)){
            DatabaseReference ref = FirebaseDatabase.getInstance().getReference("Feedback");
            String userId = ref.push().getKey();
            ref.child(userId).setValue(feed);
            editText.setText("");
        }
    }
}
