package com.example.android.engineeringpaathshala;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseListAdapter;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

/**
 * Created by Roshan on 1/31/2017.
 */

public class AdminActivity extends AppCompatActivity {
    private float rat;
    private TextView textViewR;
    private RatingBar ratingBar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_layout);
      //  textViewR = (TextView) findViewById(R.id.textViewRating);
        ratingBar =(RatingBar) findViewById(R.id.ratingBarAvg);
        LayerDrawable stars = (LayerDrawable) ratingBar.getProgressDrawable();
        stars.getDrawable(2).setColorFilter(Color.YELLOW, PorterDuff.Mode.SRC_ATOP);

        ListView listView =(ListView) findViewById(R.id.listViewAdmin);
        DatabaseReference ref = FirebaseDatabase.getInstance().getReference("Feedback");
        DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference("Ratings").child("total");

        mDatabase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                rat= dataSnapshot.getValue(Float.class);
//                String text =  Float.toString(rat) ;
//                textViewR.setText(text);
                ratingBar.setRating(rat);
              // Log.v("Sai Baba King","Value is" +rat);
            }
            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
            }
        });
        //String text =  Float.toString(rat) ;
        //ratingBarAv.setRating(rat);
      //  String mytext=Float.toString(rat);
      /////  Log.v("Sai Baba","Value is" +rat);
       // textViewR.setText(mytext);
        //ratingBarAv.setRating(Float.parseFloat(rat));

        final FirebaseListAdapter<String> adapter =
                new FirebaseListAdapter<String>(AdminActivity.this, String.class, android.R.layout.simple_list_item_1, ref) {
                    @Override
                    protected void populateView(View v, String model, int position) {

                        TextView text = (TextView) v.findViewById(android.R.id.text1);
                        text.setText(model);
                        if (position % 2 == 1) {
                            v.setBackgroundColor(Color.YELLOW);
                        } else {
                            v.setBackgroundColor(Color.GREEN);
                        }

                    }
                };
        listView.setAdapter(adapter);

    }
}
