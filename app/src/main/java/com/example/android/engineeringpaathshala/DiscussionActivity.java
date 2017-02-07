package com.example.android.engineeringpaathshala;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.ui.database.FirebaseListAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by Roshan on 1/25/2017.
 */

public class DiscussionActivity extends AppCompatActivity {
    private ListView listView;
    private DatabaseReference ref;
    private FirebaseListAdapter<String> adapter;
    private Menu signInMenu;
    private Menu signOutMenu;
    private Button signButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forum_layout);
        setTitle("Discussion Forum");

//        ArrayList<String> words = new ArrayList<>();
//        words.add("What is Simulation?");
//        words.add("What is Simulation?");

        listView =(ListView) findViewById(R.id.listViewQuestion);
        ref = FirebaseDatabase.getInstance().getReference("Discussion");
        adapter =
                new FirebaseListAdapter<String>(DiscussionActivity.this, String.class, android.R.layout.simple_list_item_1, ref) {
                    @Override
                    protected void populateView(View v, String model, int position) {

                        TextView text = (TextView) v.findViewById(android.R.id.text1);
                        text.setText(model);

                    }
                };
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = ((TextView)view).getText().toString();
                Intent intent = new Intent(DiscussionActivity.this,QAActivity.class);
                intent.putExtra("Question",item);
                startActivity(intent);
                //Toast.makeText(getBaseContext(), item, Toast.LENGTH_LONG).show();
            }
        });
        signButton = (Button)findViewById(R.id.buttonSign);
        if(!TextUtils.isEmpty(ButtonContainer.ButtonValue.Uname)){
            signButton.setText("Sign Out");
        }

}



    public void askFunction(View view){
        if(TextUtils.isEmpty(ButtonContainer.ButtonValue.Uname)){
            ButtonContainer.ButtonValue.ReturnString = "Post";
            Intent in1 = new Intent(DiscussionActivity.this, LoginActivity.class);
            startActivity(in1);
        }
        else
        {
            Intent in2 = new Intent(DiscussionActivity.this, PostActivity.class);
            startActivity(in2);
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_discussion, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.DSignin:
                ButtonContainer.ButtonValue.ReturnString = "Sign In";
                startActivity(new Intent(DiscussionActivity.this,LoginActivity.class));
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void signFunction(View view) {
        if(TextUtils.isEmpty(ButtonContainer.ButtonValue.Uname)) {
            ButtonContainer.ButtonValue.ReturnString = "Sign In";
            Intent in1 = new Intent(DiscussionActivity.this, LoginActivity.class);
            startActivity(in1);
        }
        else
        {
            signButton = (Button)findViewById(R.id.buttonSign);
            Toast.makeText(this, "Successfully Signed out",   Toast.LENGTH_SHORT).show();
            signButton.setText("Sign In");
            ButtonContainer.ButtonValue.Uname = "";
        }
    }
}
