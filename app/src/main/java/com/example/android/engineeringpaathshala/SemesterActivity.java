package com.example.android.engineeringpaathshala;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SemesterActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sem_layout);
        Button btn_1sem= (Button) findViewById(R.id.first_sem);
        Button btn_2sem= (Button) findViewById(R.id.second_sem);
        Button btn_3sem= (Button) findViewById(R.id.third_sem);
        Button btn_4sem= (Button) findViewById(R.id.fourth_sem);
        Button btn_5sem= (Button) findViewById(R.id.fifth_sem);
        Button btn_6sem= (Button) findViewById(R.id.sixth_sem);
        Button btn_7sem= (Button) findViewById(R.id.seventh_sem);
        Button btn_8sem= (Button) findViewById(R.id.eight_sem);

        btn_1sem.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SemesterActivity.this,CourseActivity1.class));
            }
        });

        btn_2sem.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                startActivity(new Intent(SemesterActivity.this,CourseActivity2.class));
            }
        });

        btn_3sem.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SemesterActivity.this,CourseActivity3.class));
            }
        });

        btn_4sem.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                startActivity(new Intent(SemesterActivity.this,CourseActivity4.class));
            }
        });

        btn_5sem.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SemesterActivity.this,CourseActivity5.class));
            }
        });

        btn_6sem.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                startActivity(new Intent(SemesterActivity.this,CourseActivity6.class));
            }
        });

        btn_7sem.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SemesterActivity.this,CourseActivity7.class));
            }
        });

        btn_8sem.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                startActivity(new Intent(SemesterActivity.this,CourseActivity8.class));
            }
        });
    }
}
