package com.example.android.footscores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.footscores.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayScoreTeamA(scoreTeamA);
    }

    // Intializing the score
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int foulsTeamA = 0;
    int foulsTeamB = 0;

    // Display scores
    public void displayScoreTeamA(int scoreTeamA){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreTeamA));
    }
    public void displayScoreTeamB(int scoreTeamB){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreTeamB));
    }

    public void displayFoulsTeamA(int foulsTeamA){
        TextView foulsView = (TextView) findViewById(R.id.team_a_fouls);
        foulsView.setText(String.valueOf(foulsTeamA));
    }

    public void displayFoulsTeamB(int foulsTeamB){
        TextView foulsView = (TextView) findViewById(R.id.team_b_fouls);
        foulsView.setText(String.valueOf(foulsTeamB));
    }

    // Methods Team A
    public void goalTeamA (View view){
        scoreTeamA ++;
        displayScoreTeamA(scoreTeamA);
    }

    public void foulTeamA(View view){
        foulsTeamA++;
        displayFoulsTeamA(foulsTeamA);
    }

    // Methods Team B
    public void goalTeamB (View view){
        scoreTeamB ++;
        displayScoreTeamB(scoreTeamB);
    }

    public void foulTeamB(View view){
        foulsTeamB++;
        displayFoulsTeamB(foulsTeamB);
    }

    // reset methid
    public void reset(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        foulsTeamA = 0;
        foulsTeamB = 0;
        displayScoreTeamA(scoreTeamA);
        displayScoreTeamB(scoreTeamB);
        displayFoulsTeamA(foulsTeamA);
        displayFoulsTeamB(foulsTeamB);
    }
}

