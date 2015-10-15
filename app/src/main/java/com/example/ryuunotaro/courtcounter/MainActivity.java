package com.example.ryuunotaro.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayForTeamA(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_a_points);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_b_points);
        scoreView.setText(String.valueOf(score));
    }

    public void plus3A(View view){
        scoreA += 3;
        displayForTeamA(scoreA);
    }

    public void plus3B(View view){
        scoreB += 3;
        displayForTeamB(scoreB);
    }

    public void plus2A(View view){
        scoreA += 2;
        displayForTeamA(scoreA);
    }

    public void plus2B(View view){
        scoreB += 2;
        displayForTeamB(scoreB);
    }

    public void plus1A(View view){
        scoreA += 1;
        displayForTeamA(scoreA);
    }

    public void plus1B(View view){
        scoreB += 1;
        displayForTeamB(scoreB);
    }

    public void resetScore(View view){
        scoreA = 0;
        scoreB = 0;

        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }
}
