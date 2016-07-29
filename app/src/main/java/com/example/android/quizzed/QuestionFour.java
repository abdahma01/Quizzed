package com.example.android.quizzed;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class QuestionFour extends AppCompatActivity {
    public static int scoreFour = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question4);

        // Find the button view that says next
        Button next_four = (Button) findViewById(R.id.next_four);

        // Set a click listener on that View
        next_four.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                scoreFour();
                Intent next_activity = new Intent(QuestionFour.this, QuestionFive.class);
                startActivity(next_activity);
            }
        });
    }

    private void scoreFour() {
        RadioButton rb = (RadioButton) findViewById(R.id.four_ans);
        if (rb.isChecked()) {
            scoreFour = 1;
        }
    }
}
