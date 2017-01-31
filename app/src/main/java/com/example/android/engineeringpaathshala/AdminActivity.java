package com.example.android.engineeringpaathshala;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseListAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by Roshan on 1/31/2017.
 */

public class AdminActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_layout);

        ListView listView =(ListView) findViewById(R.id.listViewAdmin);
        DatabaseReference ref = FirebaseDatabase.getInstance().getReference("Feedback");
        final FirebaseListAdapter<String> adapter =
                new FirebaseListAdapter<String>(AdminActivity.this, String.class, android.R.layout.simple_list_item_1, ref) {
                    @Override
                    protected void populateView(View v, String model, int position) {

                        TextView text = (TextView) v.findViewById(android.R.id.text1);
                        text.setText(model);

                    }
                };
        listView.setAdapter(adapter);

    }
}
