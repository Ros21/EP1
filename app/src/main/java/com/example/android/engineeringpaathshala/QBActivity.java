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

public class QBActivity extends AppCompatActivity {
    private ListView lv;
    ArrayList<String> listNotes;
    String url;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.qb_layout);

        listNotes = new ArrayList<>();
        listNotes.add("2010 Spring");
        listNotes.add("2012 Fall");
        listNotes.add("2012 Spring");

        ArrayAdapter<String> adapter =
                new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listNotes);
        lv = (ListView) findViewById(R.id.listViewQB);

        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        url = "https://drive.google.com/file/d/0B-hExRW9Hk6aSlJkUmFUZk9OVmM/view";
                        break;
                    case 1:
                        url = "https://drive.google.com/file/d/0B-hExRW9Hk6aV3VXd1JVQWFYQlk/view";
                        break;
                    case 2:
                        url = "https://drive.google.com/file/d/0B-hExRW9Hk6ab2E1UG0ybF9URWs/view";
                        break;
                }
                Intent in1 = new Intent(Intent.ACTION_VIEW);
                in1.setData(Uri.parse(url));
                startActivity(in1);
            }
        });
    }
}
