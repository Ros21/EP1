package com.example.android.engineeringpaathshala;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Roshan on 10/20/2016.
 */
public class NotesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notes_layout);

        Button btn_syll = (Button) findViewById(R.id.syllabus);
        btn_syll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //ButtonValue.buttonClicked = 1;
               //callIntent();

                String url = "https://drive.google.com/open?id=0B-hExRW9Hk6aZ25WU3otZ3hpUlE";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);

            }
        });

        Button btn_notes = (Button) findViewById(R.id.notes);
        btn_notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                ButtonValue.buttonClicked = 2;
//               callIntent();
                switch (ButtonContainer.ButtonValue.buttonClicked ) {
                    case 61:

                        String url = "https://drive.google.com/open?id=0B-hExRW9Hk6aTkJQbGd1cXgzOXM";
                        Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse(url));
                        startActivity(i);
                    case 62:

                        url = "https://drive.google.com/open?id=0B-hExRW9Hk6aWUdxc0hXSjdkRHM";
                        i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse(url));
                        startActivity(i);
                }

            }
        });

    }
//    private void callIntent(){
//        Intent intent = new Intent(NotesActivity.this, WebViewActivity.class);
//        startActivity(intent);
//    }
}