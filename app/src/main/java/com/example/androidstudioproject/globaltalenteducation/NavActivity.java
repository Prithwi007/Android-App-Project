package com.example.androidstudioproject.globaltalenteducation;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NavActivity extends AppCompatActivity {
    private TextView button;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nav_header_next);
        button = (TextView) findViewById(R.id.textView);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // String url = textView.getText().toString();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.gteducation.in"));
                startActivity(intent);
            }
        });

    }
}
