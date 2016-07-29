package com.example.android.quizzed;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the button view that says Play
        Button play = (Button) findViewById(R.id.play);

        // Set a click listener on that View
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next_activity = new Intent(MainActivity.this, QuestionOne.class);
                startActivity(next_activity);
            }
        });
    }
}
