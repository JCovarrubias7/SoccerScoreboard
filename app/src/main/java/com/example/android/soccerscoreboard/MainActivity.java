package com.example.android.soccerscoreboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int yellowCardTeamA = 0;
    int redCardTeamA = 0;
    int yellowCardTeamB = 0;
    int redCardTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Score reset for Team A and Team B.
     */
    public void resetAllValues(View view){
        scoreTeamA = 0;
        yellowCardTeamA = 0;
        redCardTeamA = 0;
        scoreTeamB= 0;
        yellowCardTeamB = 0;
        redCardTeamB = 0;

        displayScoreForTeamA(scoreTeamA);
        displayYellowForTeamA(yellowCardTeamA);
        displayRedForTeamA(redCardTeamA);
        displayScoreForTeamB(scoreTeamB);
        displayYellowForTeamB(yellowCardTeamB);
        displayRedForTeamB(redCardTeamB);

    }
    /**
     * Displays the given score for Team A.
     */
    public void displayScoreForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given yellow cards for Team A.
     */
    public void displayYellowForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_yellow_card);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given red cards for Team A.
     */
    public void displayRedForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_red_card);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayScoreForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given yellow cards for Team B.
     */
    public void displayYellowForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_yellow_card);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given red cards for Team B.
     */
    public void displayRedForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_red_card);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when the goal button is clicked for Team A.
     */
    public void addOneGoalForTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayScoreForTeamA(scoreTeamA);
    }

    /**
     * This method is called when the yellow card button is clicked for Team A.
     */
    public void addYellowCardForTeamA(View view) {
        yellowCardTeamA = yellowCardTeamA + 1;
        displayYellowForTeamA(yellowCardTeamA);
    }

    /**
     * This method is called when the red card button is clicked for Team A.
     */
    public void addRedCardForTeamA(View view) {
        redCardTeamA = redCardTeamA + 1;
        displayRedForTeamA(redCardTeamA);
    }

    /**
     * This method is called when the goal button is clicked for Team B.
     */
    public void addOneGoalForTeamB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayScoreForTeamB(scoreTeamB);
    }

    /**
     * This method is called when the yellow card button is clicked for Team B.
     */
    public void addYellowCardForTeamB(View view) {
        yellowCardTeamB = yellowCardTeamB + 1;
        displayYellowForTeamB(yellowCardTeamB);
    }

    /**
     * This method is called when the red card button is clicked for Team B.
     */
    public void addRedCardForTeamB(View view) {
        redCardTeamB = redCardTeamB + 1;
        displayRedForTeamB(redCardTeamB);
    }
}

