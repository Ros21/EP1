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
                switch (ButtonContainer.ButtonValue.buttonClicked ) {
                    case 61:

                        String url = "https://drive.google.com/open?id=0B-hExRW9Hk6aZ25WU3otZ3hpUlE";
                        Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse(url));
                        startActivity(i);
                        break;
                    case 62:

                        url = "https://drive.google.com/open?id=0B-hExRW9Hk6aaHl6TUE1VzYzVk0";
                        i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse(url));
                        startActivity(i);
                        break;
                    case 63:

                        url = "https://drive.google.com/open?id=0B-hExRW9Hk6aRUVVVzVIbkR2MHM";
                        i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse(url));
                        startActivity(i);
                        break;
                    case 64:

                        url = "https://drive.google.com/open?id=0B-hExRW9Hk6aSWNJTDBmVHZkSGM";
                        i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse(url));
                        startActivity(i);
                        break;

                }

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

//                        String url = "https://drive.google.com/open?id=0B-hExRW9Hk6aTkJQbGd1cXgzOXM";
//                        Intent i = new Intent(Intent.ACTION_VIEW);
//                        i.setData(Uri.parse(url));
                        startActivity(new Intent(NotesActivity.this,NotesDcActivity.class));
                        break;
                    case 62:

                        String url = "https://drive.google.com/open?id=0B-hExRW9Hk6aWUdxc0hXSjdkRHM";
                        Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse(url));
                        startActivity(i);
                        break;
                    case 63:

                        url = "https://drive.google.com/file/d/0B-hExRW9Hk6aZWRGbTBpbEJhdUU/view";
                        i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse(url));
                        startActivity(i);
                        break;
                    case 64:

                        url = "https://drive.google.com/open?id=0B-hExRW9Hk6adGl1aXc1cGpGQzg";
                        i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse(url));
                        startActivity(i);
                        break;
                }

            }
        });

        Button btn_youtube = (Button) findViewById(R.id.youtubeLinks);
        btn_youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                ButtonValue.buttonClicked = 2;
//               callIntent();
                switch (ButtonContainer.ButtonValue.buttonClicked ) {
                    case 61:

                        String url = "https://www.youtube.com/watch?v=sG6WGvzmVaw&list=PL423F57EA64931D9F";
                        Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse(url));
                        startActivity(i);
                        break;

                    case 62:

                        url = "https://www.youtube.com/watch?v=y9RAhEfLfJs&list=PL84637AA7125111CB";
                        i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse(url));
                        startActivity(i);
                        break;
                    case 63:

                        url = "https://www.youtube.com/watch?v=Z6f9ckEElsU&list=PL0A93F793E2371F15";
                        i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse(url));
                        startActivity(i);
                        break;
                    case 64:

                        url = "https://www.youtube.com/watch?v=iK9Wkuprgn0&list=PL6MpDZWD2gTG1uxUTmKA2Kv9Y2Yi_Bbde";
                        i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse(url));
                        startActivity(i);
                        break;
                }

            }
        });

        Button btn_books = (Button) findViewById(R.id.books);
        btn_books.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                ButtonValue.buttonClicked = 2;
//               callIntent();
                switch (ButtonContainer.ButtonValue.buttonClicked ) {
                    case 61:

                        String url = "https://drive.google.com/file/d/0B-hExRW9Hk6aV0FzWUZXQkZkWGs/view";
                        Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse(url));
                        startActivity(i);
                        break;

                    case 62:

                        url = "https://drive.google.com/open?id=0B-hExRW9Hk6aeHdISEp4dkVhekk";
                        i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse(url));
                        startActivity(i);
                        break;

                    case 63:

                        url = "https://drive.google.com/open?id=0B-hExRW9Hk6acGpfUFF5SkJmaUE";
                        i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse(url));
                        startActivity(i);
                        break;

                    case 64:

                        url = "https://drive.google.com/open?id=0B-hExRW9Hk6aQWxyWUdBR19fZXM";
                        i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse(url));
                        startActivity(i);
                        break;
                }

            }
        });

        Button btn_qb = (Button) findViewById(R.id.question_bank);
        btn_qb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(NotesActivity.this,QBActivity.class));

    }});
    }
}
//    private void callIntent(){
//        Intent intent = new Intent(NotesActivity.this, WebViewActivity.class);
//        startActivity(intent);
//    }
