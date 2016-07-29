package com.example.android.quizzed;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class QuestionFive extends AppCompatActivity {
    public static int scoreFive = 0;
    public static int scoreTotal = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question5);
    }

    private void scoreFive() {
        RadioButton rb = (RadioButton) findViewById(R.id.five_ans);
        if (rb.isChecked()) {
            scoreFive = 1;
        }
    }

    /**
     * Displays the calculated score
     */

    public void displayScore(View view) {
        scoreFive();
        scoreTotal = QuestionOne.scoreOne + QuestionTwo.scoreTwo + QuestionThree.scoreThree + QuestionFour.scoreFour + scoreFive;
        TextView scoreView = (TextView) findViewById(R.id.score);
        TextView yourView = (TextView) findViewById(R.id.your);
        yourView.setText(String.valueOf("Your score is "));
        scoreView.setText(String.valueOf(scoreTotal + "/5"));
    }
}


