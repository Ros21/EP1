package com.example.android.engineeringpaathshala;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by Roshan on 1/31/2017.
 */

public class QAActivity extends AppCompatActivity {
    private TextView textViewQ;
    private TextView textViewA;
    private String s;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.qa_layout);
        s = getIntent().getStringExtra("Question");
        textViewQ = (TextView) findViewById(R.id.textViewMainQuestion);
        textViewQ.setText(s);

    }

    public void postAns(View view) {
        DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference("DiscussionAns");
        DatabaseReference mRef = mDatabase.child(s).push();
        textViewA = (TextView) findViewById(R.id.editTextPostAns);
        String ans = textViewA.getText().toString().trim();
        if(!TextUtils.isEmpty(ans)){
        mRef.setValue(ans);
        textViewA.setText("");}

    }
}
