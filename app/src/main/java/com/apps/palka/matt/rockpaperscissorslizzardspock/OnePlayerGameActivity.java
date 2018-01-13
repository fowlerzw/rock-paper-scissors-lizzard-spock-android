package com.apps.palka.matt.rockpaperscissorslizzardspock;


import android.graphics.Color;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


import android.widget.ImageButton;

import android.widget.ImageView;
import android.widget.TextView;


import static com.apps.palka.matt.rockpaperscissorslizzardspock.R.id.player_score;

public class OnePlayerGameActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_player_game);



        //Finds views with their ids

        final TextView gameResult = (TextView) findViewById(R.id.game_result_textView);
        final TextView playAgain = (TextView) findViewById(R.id.play_again_button);

        final ImageButton choseRockButton = (ImageButton) findViewById(R.id.rock_button_player);
        final ImageButton chosePaperButton = (ImageButton) findViewById(R.id.paper_button_player);
        final ImageButton choseScissorsButton = (ImageButton) findViewById(R.id.scissors_button_player);
        final ImageButton choseLizardButton = (ImageButton) findViewById(R.id.lizard_button_player);
        final ImageButton choseSpockButton = (ImageButton) findViewById(R.id.spock_button_player);

        final TextView playerScore = (TextView) findViewById(player_score);
        final TextView opponentScore = (TextView) findViewById(R.id.computer_score);

        final ImageView opponentPickView = (ImageView) findViewById(R.id.opponent_pick);

        final ImageView playerChoice = (ImageView) findViewById(R.id.playerChoice);
        final ImageView computerChoice = (ImageView) findViewById(R.id.computerChoice);


       //opponentPickView.setImageResource(R.drawable.ic_lizard);


        final GameLogic gameLogic = new GameLogic();

        //Ensures that the game starts with "Your Turn" text in game result view and play again button
        //is hidden
        gameResult.setText(R.string.your_turn);
        playAgain.setVisibility(View.INVISIBLE);

        /**
         * Sets the winner text to "YOUR TURN" and makes playbutton clickable after play again button
         * is clicked
         */
        playAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choseLizardButton.setEnabled(true);
                chosePaperButton.setEnabled(true);
                choseRockButton.setEnabled(true);
                choseScissorsButton.setEnabled(true);
                choseSpockButton.setEnabled(true);
                gameResult.setText(R.string.your_turn);
                playAgain.setVisibility(View.INVISIBLE);
            }
        });

        //action to perform while tapping rock button
        choseRockButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gameLogic.setPlayerOneChoice(1);
                opponentPickView.setImageResource(gameLogic.getOpponentChoice());
                gameLogic.gameResult(OnePlayerGameActivity.this);
                playerScore.setText(String.valueOf(gameLogic.getPlayerStat()));
                opponentScore.setText(String.valueOf(gameLogic.getOpponentStat()));
                computerChoice.setImageResource(gameLogic.getOpponentChoice());
                computerChoice.setColorFilter(getResources().getColor(R.color.redPlayer));
            }
        });

        //action to perform while tapping paper button
        chosePaperButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gameLogic.setPlayerOneChoice(2);
                opponentPickView.setImageResource(gameLogic.getOpponentChoice());
                gameLogic.gameResult(OnePlayerGameActivity.this);
                playerScore.setText(String.valueOf(gameLogic.getPlayerStat()));
                opponentScore.setText(String.valueOf(gameLogic.getOpponentStat()));
                computerChoice.setImageResource(gameLogic.getOpponentChoice());
                computerChoice.setColorFilter(getResources().getColor(R.color.redPlayer));
            }
        });

        //action to perform while tapping scissors button
        choseScissorsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gameLogic.setPlayerOneChoice(3);
                opponentPickView.setImageResource(gameLogic.getOpponentChoice());
                gameLogic.gameResult(OnePlayerGameActivity.this);
                playerScore.setText(String.valueOf(gameLogic.getPlayerStat()));
                opponentScore.setText(String.valueOf(gameLogic.getOpponentStat()));
                computerChoice.setImageResource(gameLogic.getOpponentChoice());
                computerChoice.setColorFilter(getResources().getColor(R.color.redPlayer)); }
        });



        //action to perform while tapping lizard button
        choseLizardButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                gameLogic.setPlayerOneChoice(4);
                opponentPickView.setImageResource(gameLogic.getOpponentChoice());
                gameLogic.gameResult(OnePlayerGameActivity.this);
                playerScore.setText(String.valueOf(gameLogic.getPlayerStat()));
                opponentScore.setText(String.valueOf(gameLogic.getOpponentStat()));
                computerChoice.setImageResource(gameLogic.getOpponentChoice());
                computerChoice.setColorFilter(getResources().getColor(R.color.redPlayer));
            }
        });

        //action to perform while tapping spock button
        choseSpockButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gameLogic.setPlayerOneChoice(5);
                opponentPickView.setImageResource(gameLogic.getOpponentChoice());
                gameLogic.gameResult(OnePlayerGameActivity.this);
                playerScore.setText(String.valueOf(gameLogic.getPlayerStat()));
                opponentScore.setText(String.valueOf(gameLogic.getOpponentStat()));
                computerChoice.setImageResource(gameLogic.getOpponentChoice());
                computerChoice.setColorFilter(getResources().getColor(R.color.redPlayer));
            }

        });


    }



}
