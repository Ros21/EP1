package com.example.android.engineeringpaathshala;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

/**
 * Created by Roshan on 11/12/2016.
 */

public class FeedbackActivity extends AppCompatActivity {
    private EditText editText;
    private RatingBar ratingBar;
    private float totalB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feedback_layout);
        setTitle("FeedBack");

        ratingBar = (RatingBar) findViewById(R.id.ratingBar);

        final DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference("Ratings").child("total");

        mDatabase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                totalB= dataSnapshot.getValue(Float.class);

            }
            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
            }
        });


        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            public void onRatingChanged(RatingBar ratingBar, float rating,
                                        boolean fromUser) {

                float avg = (totalB+rating)/2;
                mDatabase.setValue(avg);
                //textView.setText(String.valueOf(rating));

            }
        });


    }







    public void PostFeedbackFunction(View view) {
        editText = (EditText) findViewById(R.id.editTextFeedback);
        String feed = editText.getText().toString().trim();
        if (!TextUtils.isEmpty(feed)) {
            DatabaseReference ref = FirebaseDatabase.getInstance().getReference("Feedback");
            String userId = ref.push().getKey();
            ref.child(userId).setValue(feed);
            editText.setText("");
            Toast.makeText(this, "Feedback Posted", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Feedback is Empty", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_feed, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.itemFeed:
                startActivity(new Intent(FeedbackActivity.this, AdminActivity.class));
                //Toast.makeText(getApplicationContext(),"SignIn Selected",Toast.LENGTH_LONG).show();
                return true;


            default:
                return super.onOptionsItemSelected(item);
        }
    }
}


