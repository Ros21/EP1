package com.example.android.engineeringpaathshala;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

/**
 * Created by Roshan on 1/25/2017.
 */

public class DiscussionActivity extends AppCompatActivity {
    private GridView gridView;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forum_layout);


        gridView = (GridView) findViewById(R.id.gridViewQuestion);
        final ArrayList<String> words = new ArrayList<>();
        words.add("What is Simulation?");
        words.add("What is Simulation?");
        words.add("What is Simulation?");
        words.add("What is Simulation?");
        words.add("What is Simulation?");

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,words);
        gridView.setAdapter(adapter);


        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference().child("Discussion");


        // Read from the database
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                String value = dataSnapshot.getValue(String.class);
                words.add(value);
                adapter.notifyDataSetChanged();
                //Log.d("TAG", "Value is: " + value);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.w("TAG", "Failed to read value.", error.toException());
            }
        });
       // String value = getIntent().getExtras().getString("Data");
       // textView.setText(value);
    }
    public void askFunction(View view){
        Intent in1= new Intent(DiscussionActivity.this,PostActivity.class);
        startActivity(in1);

    }
}
