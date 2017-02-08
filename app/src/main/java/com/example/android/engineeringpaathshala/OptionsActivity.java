package com.example.android.engineeringpaathshala;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Roshan on 10/26/2016.
 */
public class OptionsActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.options_layout);

        findViewById(R.id.discussionforumid).setOnClickListener(this);
        findViewById(R.id.fileuploadid).setOnClickListener(this);
        findViewById(R.id.studymaterialid).setOnClickListener(this);
        findViewById(R.id.feedbackid).setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.fileuploadid:
                Intent i = new Intent(OptionsActivity.this, CategoryUpload.class);
                startActivity(i);
                break;

            case R.id.studymaterialid:
                Intent intent = new Intent(OptionsActivity.this, SemesterActivity.class);
                startActivity(intent);
                break;

            case R.id.feedbackid:
                Intent in = new Intent(OptionsActivity.this, FeedbackActivity.class);
                startActivity(in);
                break;

           case R.id.discussionforumid:
               Intent intn1 = new Intent(OptionsActivity.this, DiscussionActivity.class);
               startActivity(intn1);
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.itemSignin:
                startActivity(new Intent(OptionsActivity.this,LoginActivity.class));
                //Toast.makeText(getApplicationContext(),"SignIn Selected",Toast.LENGTH_LONG).show();
                return true;
            case R.id.itemSearch:
                Toast.makeText(getApplicationContext(),"Search Selected",Toast.LENGTH_LONG).show();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}