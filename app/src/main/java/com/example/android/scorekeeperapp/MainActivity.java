package com.example.android.scorekeeperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int foulTeamA = 0;
    int foulTeamB = 0;
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayForTeamA(int score) {
        TextView scoreView1 = (TextView) findViewById(R.id.team_a_score);
        scoreView1.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView2 = (TextView) findViewById(R.id.team_b_score);
        scoreView2.setText(String.valueOf(score));
    }

    public void goalA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    public void goalB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    public void resetGoals(View v) {
        scoreTeamB = 0;
        scoreTeamA = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);

    }

    public void displayFoulForTeamA(int foul) {
        TextView scoreView1 = (TextView) findViewById(R.id.team_a_foul);
        scoreView1.setText(String.valueOf(foul));
    }

    public void displayFoulForTeamB(int foul) {
        TextView scoreView2 = (TextView) findViewById(R.id.team_b_foul);
        scoreView2.setText(String.valueOf(foul));
    }

    public void foulA(View v) {
        foulTeamA = foulTeamA + 1;
        displayFoulForTeamA(foulTeamA);
    }

    public void foulB(View v) {
        foulTeamB = foulTeamB + 1;
        displayFoulForTeamB(foulTeamB);
    }

    public void resetFouls(View v) {
        foulTeamB = 0;
        foulTeamA = 0;
        displayFoulForTeamA(foulTeamA);
        displayFoulForTeamB(foulTeamB);

    }
    public void resetGame(View v) {
        foulTeamB = 0;
        foulTeamA = 0;
        scoreTeamB = 0;
        scoreTeamA = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayFoulForTeamA(foulTeamA);
        displayFoulForTeamB(foulTeamB);

    }
}
