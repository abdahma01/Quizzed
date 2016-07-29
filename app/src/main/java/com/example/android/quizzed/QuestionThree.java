package com.example.android.quizzed;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class QuestionThree extends AppCompatActivity {
    public static int scoreThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);

        // Find the button view that says next
        Button next_three = (Button) findViewById(R.id.next_three);

        // Set a click listener on that View
        next_three.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent next_activity = new Intent(QuestionThree.this, QuestionFour.class);
                startActivity(next_activity);
                scoreThree();
            }
        });
    }

    private void scoreThree() {
        EditText third_ans = (EditText) findViewById(R.id.third_ans);
        if (third_ans.getText().toString().equals("Emma") || third_ans.getText().toString().equals("emma")) {
            scoreThree = 1;
        }
    }
}
