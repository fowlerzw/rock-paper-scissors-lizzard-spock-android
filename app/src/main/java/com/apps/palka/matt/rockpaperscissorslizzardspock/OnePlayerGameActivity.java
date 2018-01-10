package com.apps.palka.matt.rockpaperscissorslizzardspock;

import android.media.Image;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.ImageButton;

import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import static com.apps.palka.matt.rockpaperscissorslizzardspock.R.id.player_score;

public class OnePlayerGameActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_player_game);



        //Finds views with their ids

        ImageButton choseRockButton = (ImageButton) findViewById(R.id.rock_button_player);
        ImageButton chosePaperButton = (ImageButton) findViewById(R.id.paper_button_player);
        ImageButton choseScissorsButton = (ImageButton) findViewById(R.id.scissors_button_player);
        ImageButton choseLizardButton = (ImageButton) findViewById(R.id.lizard_button_player);
        ImageButton choseSpockButton = (ImageButton) findViewById(R.id.spock_button_player);

        final TextView playerScore = (TextView) findViewById(player_score);
        final TextView opponentScore = (TextView) findViewById(R.id.computer_score);

        final ImageView opponentPickView = (ImageView) findViewById(R.id.opponent_pick);

        final GameLogic gameLogic = new GameLogic();



        //action to perform while tapping rock button
        choseRockButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gameLogic.setPlayerOneChoice(1);
                opponentPickView.setImageResource(gameLogic.getOpponentChoice());
                gameLogic.gameResult();
                playerScore.setText(String.valueOf(gameLogic.getPlayerStat()));
                opponentScore.setText(String.valueOf(gameLogic.getOpponentStat()));
            }
        });

        //action to perform while tapping paper button
        chosePaperButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gameLogic.setPlayerOneChoice(2);
                opponentPickView.setImageResource(gameLogic.getOpponentChoice());
                gameLogic.gameResult();
                playerScore.setText(String.valueOf(gameLogic.getPlayerStat()));
                opponentScore.setText(String.valueOf(gameLogic.getOpponentStat()));

            }
        });

        //action to perform while tapping scissors button
        choseScissorsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gameLogic.setPlayerOneChoice(3);
                opponentPickView.setImageResource(gameLogic.getOpponentChoice());
                gameLogic.gameResult();
                playerScore.setText(String.valueOf(gameLogic.getPlayerStat()));
                opponentScore.setText(String.valueOf(gameLogic.getOpponentStat()));
            }
        });

        //action to perform while tapping lizard button
        choseLizardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gameLogic.setPlayerOneChoice(4);
                opponentPickView.setImageResource(gameLogic.getOpponentChoice());
                gameLogic.gameResult();
                playerScore.setText(String.valueOf(gameLogic.getPlayerStat()));
                opponentScore.setText(String.valueOf(gameLogic.getOpponentStat()));
            }
        });

        //action to perform while tapping spock button
        choseSpockButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gameLogic.setPlayerOneChoice(5);
                opponentPickView.setImageResource(gameLogic.getOpponentChoice());
                gameLogic.gameResult();
                playerScore.setText(String.valueOf(gameLogic.getPlayerStat()));
                opponentScore.setText(String.valueOf(gameLogic.getOpponentStat()));

            }
        });


    }

}
