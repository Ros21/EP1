package com.example.android.engineeringpaathshala;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * Created by Roshan on 2/18/2017.
 */

public class NotesDcActivity extends AppCompatActivity {
    private ListView lv;
    ArrayList<String> listNotes;
    String url;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notes_dc);

        listNotes = new ArrayList<>();
        listNotes.add("DC Notes by East University");
        listNotes.add("Chapter 1 Introduction");
        listNotes.add("Chapter 3 Signals");
        listNotes.add("DC notes Tutorials Point");
        listNotes.add("rs232 rs449");
        listNotes.add("Tutorial 3_Problems_Signals & Systems_2015 Fall");


        ArrayAdapter<String> adapter =
                new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listNotes);
        lv = (ListView) findViewById(R.id.listViewDC);

        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //String item = adapterView.getItemAtPosition(i).toString();
                //Log.v("SaiG ","Value is " + i);
                switch (i){
                    case 0:
                        url = "https://drive.google.com/file/d/0B-hExRW9Hk6abGFoSGpqdUM4ak0/view";
                        break;
                    case 1:
                        url = "https://drive.google.com/file/d/0B-hExRW9Hk6aUmlwTHVUb2JRMVU/view";
                        break;
                    case 2:
                        url = "https://drive.google.com/file/d/0B-hExRW9Hk6adzhCVWwtaG9DMFk/view";
                        break;
                    case 3:
                        url = "https://drive.google.com/file/d/0B-hExRW9Hk6aYndEemNaNjRaNHc/view";
                        break;
                    case 4:
                        url = "https://drive.google.com/file/d/0B-hExRW9Hk6aME5ZUEJyU25nVTA/view";
                        break;
                    case 5:
                        url = "https://drive.google.com/file/d/0B-hExRW9Hk6aZ1ZrN09vc1JhVFU/view";
                        break;
                }
                Intent in1 = new Intent(Intent.ACTION_VIEW);
                in1.setData(Uri.parse(url));
                startActivity(in1);
            }
        });
    }
}
