package com.apps.palka.matt.rockpaperscissorslizzardspock;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class OnePlayerGameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_player_game);

        //Finds views with their ids
        TextView choseRockButton = (TextView) findViewById(R.id.rock_button_player);
        TextView chosePaperButton = (TextView) findViewById(R.id.paper_button_player);
        TextView choseScissorsButton = (TextView) findViewById(R.id.scissors_button_player);
        TextView choseLizardButton = (TextView) findViewById(R.id.lizard_button_player);
        TextView choseSpockButton = (TextView) findViewById(R.id.spock_button_player);

        //action to perform while tapping rock button
        choseRockButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "ROCK", Toast.LENGTH_SHORT).show();
            }
        });

        //action to perform while tapping paper button
        chosePaperButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "PAPER", Toast.LENGTH_SHORT).show();
            }
        });

        //action to perform while tapping scissors button
        choseScissorsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "SCISSORS", Toast.LENGTH_SHORT).show();
            }
        });

        //action to perform while tapping lizard button
        choseLizardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "LIZARD", Toast.LENGTH_SHORT).show();
            }
        });

        //action to perform while tapping spock button
        choseSpockButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "SPOCK", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
