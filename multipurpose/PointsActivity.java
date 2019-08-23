package com.example.multipurpose;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PointsActivity extends AppCompatActivity {
    int tas=0,tab=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_points);
    }



    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamA(View v) {
        tas=tas+1;
        displayForTeamA(tas);
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    public void addTwoForTeamA(View v) {
        tas=tas+2;
        displayForTeamA(tas);
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    public void addThreeForTeamA(View v) {
        tas=tas+3;
        displayForTeamA(tas);
    }




    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addOneForTeamB(View v) {
        tab=tab+1;
        displayForTeamB(tab);
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    public void addTwoForTeamB(View v) {
        tab=tab+2;
        displayForTeamB(tab);
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    public void addThreeForTeamB(View v) {
        tab=tab+3;
        displayForTeamB(tab);
    }




    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void reset(View view){
        TextView scoreViewa = (TextView) findViewById(R.id.team_a_score);
        scoreViewa.setText("0");

        TextView scoreViewb = (TextView) findViewById(R.id.team_b_score);
        scoreViewb.setText("0");

    }


}
