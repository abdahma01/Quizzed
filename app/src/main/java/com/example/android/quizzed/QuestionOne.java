package com.example.android.quizzed;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class QuestionOne extends AppCompatActivity {
    public static int scoreOne = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);
        // Find the button view that says next
        Button next_one = (Button) findViewById(R.id.next_one);
        // Set a click listener on that View
        next_one.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                scoreOne();

                Intent next_activity = new Intent(QuestionOne.this, QuestionTwo.class);
                startActivity(next_activity);
            }
        });
    }

    private void scoreOne() {
        RadioButton rb = (RadioButton) findViewById(R.id.one_ans);
        if (rb.isChecked()) {
            scoreOne = scoreOne + 1;
        }
    }
}
