package com.example.android.engineeringpaathshala;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseListAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by Roshan on 1/25/2017.
 */

public class DiscussionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forum_layout);
//        ArrayList<String> words = new ArrayList<>();
//        words.add("What is Simulation?");
//        words.add("What is Simulation?");
        ListView listView =(ListView) findViewById(R.id.listViewQuestion);
        DatabaseReference ref = FirebaseDatabase.getInstance().getReference("Discussion");
        final FirebaseListAdapter<String> adapter =
                new FirebaseListAdapter<String>(DiscussionActivity.this, String.class, android.R.layout.simple_list_item_1, ref) {
                    @Override
                    protected void populateView(View v, String model, int position) {

                        TextView text = (TextView) v.findViewById(android.R.id.text1);
                        text.setText(model);

                    }
                };
        listView.setAdapter(adapter);

    }





//        gridView = (GridView) findViewById(R.id.gridViewQuestion);
//        final ArrayList<String> words = new ArrayList<>();
//        words.add("What is Simulation?");
//        words.add("What is Simulation?");
//        words.add("What is Simulation?");
//        words.add("What is Simulation?");
//        words.add("What is Simulation?");




    public void askFunction(View view){
        Intent in1= new Intent(DiscussionActivity.this,PostActivity.class);
        startActivity(in1);

    }
}
