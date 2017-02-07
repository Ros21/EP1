package com.example.android.engineeringpaathshala;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.ui.database.FirebaseListAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.DateFormat;
import java.util.Date;

import static com.example.android.engineeringpaathshala.ButtonContainer.ButtonValue.Uname;

/**
 * Created by Roshan on 1/31/2017.
 */

public class QAActivity extends AppCompatActivity {
    private TextView textViewQ;
    private TextView textViewA;
    private String s;
    private String total;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.qa_layout);

        setTitle("Discussion Forum");
        s = getIntent().getStringExtra("Question");
        textViewQ = (TextView) findViewById(R.id.textViewMainQuestion);
        textViewQ.setText(s);

        ListView listView = (ListView) findViewById(R.id.listViewAnswers);
        DatabaseReference ref1 = FirebaseDatabase.getInstance().getReference("DiscussionAns");
        DatabaseReference ref = ref1.child(s);
        final FirebaseListAdapter<String> adapter =
                new FirebaseListAdapter<String>(QAActivity.this, String.class, android.R.layout.simple_list_item_1, ref) {
                    @Override
                    protected void populateView(View v, String model, int position) {

                        TextView text = (TextView) v.findViewById(android.R.id.text1);
                        text.setText(model);

                    }
                };
        listView.setAdapter(adapter);


    }

    public void postAns(View view) {
        if (!TextUtils.isEmpty(ButtonContainer.ButtonValue.Uname)) {


            DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference("DiscussionAns");
            DatabaseReference mRef = mDatabase.child(s).push();
            textViewA = (TextView) findViewById(R.id.editTextPostAns);
            String ans = textViewA.getText().toString().trim();
            if (!TextUtils.isEmpty(ans)) {

                final String currentDateTimeString = DateFormat.getDateTimeInstance().format(new Date());

//           Log.v("Aum Sai Ram ====", "Name is "+Uname);
                if (!TextUtils.isEmpty(Uname)) {
                    ans = ans + '\n' + '\n' + "Posted by: " + Uname;
                } else {
                    ans = ans + '\n';
                }
                ans = ans + '\n' + "Time: " + currentDateTimeString;
                mRef.setValue(ans);
                textViewA.setText("");
            } else {
                Toast.makeText(this, "Answer Empty", Toast.LENGTH_SHORT).show();
            }

        } else {
            ButtonContainer.ButtonValue.ReturnString = "QA";
            Intent in1 = new Intent(QAActivity.this, LoginActivity.class);
            startActivity(in1);
        }
    }
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.menu.menu_discussion, menu);
//        return true;
//    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle item selection
//        switch (item.getItemId()) {
//            case R.id.DSignin:
//                startActivity(new Intent(QAActivity.this,LoginActivity.class));
//                return true;
//
//            default:
//                return super.onOptionsItemSelected(item);
//        }
//    }
}