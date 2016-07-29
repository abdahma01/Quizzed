package com.example.android.quizzed;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class QuestionTwo extends AppCompatActivity {
    public static int scoreTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);
        // Find the button view that says next
        Button next_two = (Button) findViewById(R.id.next_two);
        // Set a click listener on that View
        next_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next_activity = new Intent(QuestionTwo.this, QuestionThree.class);
                startActivity(next_activity);
                scoreTwo();
            }
        });
    }

    private void scoreTwo() {
        CheckBox a = (CheckBox) findViewById(R.id.a);
        CheckBox b = (CheckBox) findViewById(R.id.b);
        CheckBox c = (CheckBox) findViewById(R.id.c);
        CheckBox d = (CheckBox) findViewById(R.id.d);
        if (a.isChecked() && b.isChecked() && c.isChecked() && !d.isChecked()) {
            scoreTwo = 1;
        }
    }
}
