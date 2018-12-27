package com.example.niravhathi.basketballscorecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView scoreOfTeamA_TextView,scoreOfTeamB_TextView;
    int scoreOfTeamA=0,scoreOfTeamB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreOfTeamA_TextView=(TextView)findViewById(R.id.scoreOfTeamA_TextView);
        scoreOfTeamB_TextView=(TextView)findViewById(R.id.scoreOfTeamB_TextView);
    }

    public void displayScoreOfTeamA(int scoreOfTeamA){
        scoreOfTeamA_TextView.setText(""+scoreOfTeamA);
    }

    public void displayScoreOfTeamB(int scoreOfTeamB){
        scoreOfTeamB_TextView.setText(""+scoreOfTeamB);
    }

    public void plusThreePointsTeamA(View view) {
        scoreOfTeamA +=3;
        displayScoreOfTeamA(scoreOfTeamA);
    }
    public void plusTwoPointsTeamA(View view) {
        scoreOfTeamA +=2;
        displayScoreOfTeamA(scoreOfTeamA);
    }

    public void plusOnePointTeamA(View view) {
        scoreOfTeamA +=1;
        displayScoreOfTeamA(scoreOfTeamA);
    }

    public void plusThreePointsTeamB(View view) {
        scoreOfTeamB +=3;
        displayScoreOfTeamB(scoreOfTeamB);
    }

    public void plusTwoPointsTeamB(View view) {
        scoreOfTeamB +=2;
        displayScoreOfTeamB(scoreOfTeamB);
    }

    public void plusOnePointTeamB(View view) {
        scoreOfTeamB +=1;
        displayScoreOfTeamB(scoreOfTeamB);
    }

    public void reset(View view) {
        scoreOfTeamA_TextView.setText("0");
        scoreOfTeamB_TextView.setText("0");
    }
}
