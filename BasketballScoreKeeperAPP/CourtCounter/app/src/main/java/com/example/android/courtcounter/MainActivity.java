package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA=0;
    int scoreB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void teamA_3points(View view)
    {
        scoreA=scoreA+3;
        displayA(scoreA);
    }
    public void teamB_3points(View view)
    {
        scoreB=scoreB+3;
        displayB(scoreB);
    }
    public void teamA_2points(View view)
    {
        scoreA=scoreA+2;
        displayA(scoreA);
    }
    public void teamB_2points(View view)
    {
        scoreB=scoreB+2;
        displayB(scoreB);
    }
    public void teamA_1points(View view)
    {
        scoreA=scoreA+1;
        displayA(scoreA);
    }
    public void teamB_1points(View view)
    {
        scoreB=scoreB+1;
        displayB(scoreB);
    }
    public void resetPoints(View view)
    {
        scoreB=0;
        scoreA=0;
        displayA(scoreA);
        displayB(scoreB);
    }
    private void displayA(int number)
    {
        TextView tv=(TextView)findViewById(R.id.pointA_text_view);
        tv.setText("" + number);
    }
    private void displayB(int number)
    {
        TextView tv=(TextView)findViewById(R.id.pointB_text_view);
        tv.setText("" + number);
    }

}
