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
    String url;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notes_layout);

        Button btn_syll = (Button) findViewById(R.id.syllabus);
        btn_syll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (ButtonContainer.ButtonValue.buttonClicked ) {
                    case 41:
                        url = "https://drive.google.com/file/d/0B-hExRW9Hk6aYnFzMGVCSlIxN3M/view";
                        break;
                    case 42:
                        url = "https://drive.google.com/file/d/0B-hExRW9Hk6aeDh5Z2dLV3hSdFk/view";
                        break;
                    case 43:
                        url = "https://drive.google.com/file/d/0B-hExRW9Hk6aM1ZxaVdHRGlNTEU/view";
                        break;
                    case 44:
                        url = "https://drive.google.com/file/d/0B-hExRW9Hk6aYnBsUzhETDlCcGc/view";
                        break;
                    case 45:
                        url = "https://drive.google.com/file/d/0B-hExRW9Hk6aelBaT2RiazBlQk0/view";
                        break;
                    case 51:
                        url = "https://drive.google.com/file/d/0B-hExRW9Hk6aRXBiZVl4cFMzc1k/view";
                        break;
                    case 52:
                        url = "https://drive.google.com/file/d/0B-hExRW9Hk6aellqRGhVeDRMN2M/view";
                        break;
                    case 53:
                        url = "https://drive.google.com/file/d/0B-hExRW9Hk6aYXNheUhRc184S2M/view";
                        break;
                    case 54:
                        url = "https://drive.google.com/file/d/0B-hExRW9Hk6aam42TG82MUNzdkk/view";
                        break;
                    case 55:
                        url = "https://drive.google.com/file/d/0B-hExRW9Hk6aRDZibjZ5YmNSRjA/view";
                       break;
                    case 56:
                        url = "https://drive.google.com/file/d/0B-hExRW9Hk6aSzl5cUYwNUlORnc/view";
                        break;
                    case 61:
                        url = "https://drive.google.com/open?id=0B-hExRW9Hk6aZ25WU3otZ3hpUlE";
                        break;
                    case 62:
                        url = "https://drive.google.com/open?id=0B-hExRW9Hk6aaHl6TUE1VzYzVk0";
                        break;
                    case 63:
                        url = "https://drive.google.com/open?id=0B-hExRW9Hk6aRUVVVzVIbkR2MHM";
                        break;
                    case 64:
                        url = "https://drive.google.com/open?id=0B-hExRW9Hk6aSWNJTDBmVHZkSGM";
                        break;

                }
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
                    case 41:
                        url = "https://drive.google.com/file/d/0B-hExRW9Hk6abHQzRXpQczcxRjg/view";
                        break;
                    case 42:
                        url = "https://drive.google.com/file/d/0B-hExRW9Hk6aeXBObk9RVHQtQ28/view";
                        break;
                    case 43:
                        url = "https://drive.google.com/file/d/0B-hExRW9Hk6ac3FwQlV1VTllTnM/view";
                        break;
                    case 44:
                        url = "https://drive.google.com/file/d/0B-hExRW9Hk6aSDlkWldIRmRmbE0/view";
                        break;
                    case 45:
                        url = "https://drive.google.com/file/d/0B-hExRW9Hk6aSGVKbFpDRjNxcGc/view";
                        break;
                    case 51:
                        url = "https://drive.google.com/file/d/0B-hExRW9Hk6aOWpkeXlodzNqTEU/view";
                        break;
                    case 52:
                        url = "https://drive.google.com/file/d/0B-hExRW9Hk6aODNPcWwtOTB4TFk/view";
                        break;
                    case 53:
                        url = "https://drive.google.com/file/d/0B-hExRW9Hk6adVdkZUVRNnRzNGM/view";
                        break;
                    case 54:
                        url = "https://drive.google.com/file/d/0B-hExRW9Hk6aN1RERjJoWXdyd2M/view";
                        break;
                    case 55:
                        url = "https://drive.google.com/file/d/0B-hExRW9Hk6aVGl3VEVnNzA3ZnM/view";
                        break;
                    case 56:
                        url = "https://drive.google.com/file/d/0B-hExRW9Hk6aS185S2xHTDJPM1U/view";
                        break;
                    case 61:
//                        String url = "https://drive.google.com/open?id=0B-hExRW9Hk6aTkJQbGd1cXgzOXM";
                        startActivity(new Intent(NotesActivity.this,NotesDcActivity.class));
                        break;
                    case 62:
                        String url = "https://drive.google.com/open?id=0B-hExRW9Hk6aWUdxc0hXSjdkRHM";
                        break;
                    case 63:
                        url = "https://drive.google.com/file/d/0B-hExRW9Hk6aZWRGbTBpbEJhdUU/view";
                        break;
                    case 64:
                        url = "https://drive.google.com/open?id=0B-hExRW9Hk6adGl1aXc1cGpGQzg";
                        break;
                }
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);

            }
        });

        Button btn_youtube = (Button) findViewById(R.id.youtubeLinks);
        btn_youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                switch (ButtonContainer.ButtonValue.buttonClicked ) {
                    case 41:
                        url = "https://www.youtube.com/watch?v=1057YmExS-I&list=PLEbnTDJUr_Ic_9b4PcKmlae41cyxEefot";
                        break;
                    case 42:
                        url = "https://www.youtube.com/watch?v=rAof9Ld5sOg";
                        break;
                    case 43:
                        url = "https://www.youtube.com/watch?v=liRPtvj7bFU&list=PL0E131A78ABFBFDD0";
                        break;
                    case 44:
                        url = "https://www.youtube.com/watch?v=R9MJEjgrUqo&list=PLF3392DC1CDC72398";
                        break;
                    case 45:
                        url = "https://www.youtube.com/watch?v=SXmVym6L8dw&list=PLAC325451207E3105";
                        break;
                    case 51:
                        url = "https://www.youtube.com/watch?v=zLP_X4wyHbY&list=PL5PHm2jkkXmi5CxxI7b3JCL1TWybTDtKq";
                        break;
                    case 52:
                        url = "https://www.youtube.com/watch?v=fwzYuhduME4&list=PL338D19C40D6D1732&index=1";
                        break;
                    case 53:
                        url = "https://www.youtube.com/watch?v=AzroLr1XS5E&list=PLdM-WZokR4tainKO3QVSfvJS5dBb-jExJ";
                        break;
                    case 54:
                        url = "https://www.youtube.com/watch?v=2i2N_Qo_FyM&list=PLEbnTDJUr_If_BnzJkkN_J0Tl3iXTL8vq";
                        break;
                    case 55:
                        url = "https://www.youtube.com/watch?v=3ER8OkqBdpE";
                        break;
                    case 56:
                        url = "https://www.youtube.com/watch?v=eqCkkC9A0Q4&list=PLEbnTDJUr_IdM___FmDFBJBz0zCsOFxfK";
                        break;
                    case 61:
                        url = "https://www.youtube.com/watch?v=sG6WGvzmVaw&list=PL423F57EA64931D9F";
                        break;
                    case 62:
                        url = "https://www.youtube.com/watch?v=y9RAhEfLfJs&list=PL84637AA7125111CB";
                        break;
                    case 63:
                        url = "https://www.youtube.com/watch?v=Z6f9ckEElsU&list=PL0A93F793E2371F15";
                        break;
                    case 64:
                        url = "https://www.youtube.com/watch?v=iK9Wkuprgn0&list=PL6MpDZWD2gTG1uxUTmKA2Kv9Y2Yi_Bbde";
                        break;
                }
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);

            }
        });

        Button btn_books = (Button) findViewById(R.id.books);
        btn_books.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                ButtonValue.buttonClicked = 2;
//               callIntent();
                switch (ButtonContainer.ButtonValue.buttonClicked ) {
                    case 41:
                        url = "https://drive.google.com/file/d/0B-hExRW9Hk6aZjN3NUlVd08xNEE/view";
                        break;
                    case 42:
                        url = "https://drive.google.com/file/d/0B-hExRW9Hk6aeXBObk9RVHQtQ28/view";
                        break;
                    case 43:
                        url = "https://drive.google.com/file/d/0B-hExRW9Hk6adzZEZkFndDBRNFk/view";
                        break;
                    case 44:
                        url = "https://drive.google.com/file/d/0B-hExRW9Hk6aUDdXSmpiNlZrYk0/view";
                        break;
                    case 45:
                        url = "https://drive.google.com/file/d/0B-hExRW9Hk6aNGllNE5fTVNZQUk/view";
                    case 51:
                        url = "https://drive.google.com/file/d/0B-hExRW9Hk6aYWxjOVZBZ2RaVGs/view";
                        break;
                    case 52:
                        url = "https://drive.google.com/file/d/0B-hExRW9Hk6aRHhGZFl3c3BEa2c/view";
                        break;
                    case 53:
                        url = "https://drive.google.com/file/d/0B-hExRW9Hk6aTzVwbTkwTTExTUE/view";
                        break;
                    case 54:
                        url = "https://drive.google.com/file/d/0B-hExRW9Hk6aeFV6NmdSVkk0MFk/view";
                        break;
                    case 55:
                        url = "https://drive.google.com/file/d/0B-hExRW9Hk6aVm1Ha3ZEQnJWcDQ/view";
                        break;
                    case 56:
                        url = "https://drive.google.com/file/d/0B-hExRW9Hk6aVXVra0w5RzNjT00/view";
                        break;

                    case 61:
                        url = "https://drive.google.com/file/d/0B-hExRW9Hk6aV0FzWUZXQkZkWGs/view";
                        break;

                    case 62:
                        url = "https://drive.google.com/open?id=0B-hExRW9Hk6aeHdISEp4dkVhekk";
                        break;

                    case 63:
                        url = "https://drive.google.com/open?id=0B-hExRW9Hk6acGpfUFF5SkJmaUE";
                        break;

                    case 64:
                        url = "https://drive.google.com/open?id=0B-hExRW9Hk6aQWxyWUdBR19fZXM";
                        break;
                }
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);

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