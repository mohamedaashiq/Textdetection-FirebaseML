package com.example.textrecognition;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {


    TextView resultTV;
    Button back;

    String result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        resultTV = findViewById(R.id.result_textview);
        back = findViewById(R.id.back_button);

        result = getIntent().getStringExtra(TextDetection.RESULT_TEXT);

        resultTV.setText(result);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
