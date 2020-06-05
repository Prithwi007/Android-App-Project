package com.example.androidstudioproject.globaltalenteducation;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

public class CourseActivity extends AppCompatActivity {
    CardView CardView,CardView1,CardView2,CardView3,CardView4,CardView5;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);
        CardView CardView = (CardView) findViewById(R.id.CardView);
        CardView CardView1 = (CardView) findViewById(R.id.CardView1);
        CardView CardView2 = (CardView) findViewById(R.id.CardView2);
        CardView CardView3 = (CardView) findViewById(R.id.CardView3);
        CardView CardView4 = (CardView) findViewById(R.id.CardView4);
        CardView CardView5 = (CardView) findViewById(R.id.CardView5);
        CardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CourseActivity.this,PlacementActivity.class);
                startActivity(intent);

            }
        });
        CardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CourseActivity.this,ProfessionalActivity.class);
                startActivity(intent);
            }
        });
        CardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CourseActivity.this,ShortActivity.class);
                startActivity(intent);
            }
        });
        CardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CourseActivity.this,EntranceActivity.class);
                startActivity(intent);
            }
        });

        CardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CourseActivity.this,SchoolActivity.class);
                startActivity(intent);
            }
        });
        CardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CourseActivity.this,PlaceActivity.class);
                startActivity(intent);
            }
        });





    }
}
