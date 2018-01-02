package com.apps.palka.matt.rockpaperscissorslizzardspock;

import android.app.Application;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by matt on 31.12.2017.
 */

public class GameLogic {

    /**
     * 1 = rock
     * 2 = paper
     * 3 = scissors
     * 4 = lizard
     * 5 = spock
     */
    private int mPlayerChoice;
    private String mOpponentChoice;

    private String mRock1 = "Rock";
    private String mPaper2 = "Paper";
    private String mScissors3 = "Scissors";
    private String mLizard4 = "Lizard";
    private String mSpock5 = "Spock";

    private int mPlayerStat = 0;
    private int mOpponentStat = 0;

    public int getPlayerStat() {
        return mPlayerStat;
    }

    ;

    public int getOpponentStat() {
        return mOpponentStat;
    }

    ;


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private int computerChoice() {
        int result = ThreadLocalRandom.current().nextInt(1, 6);

        switch (result) {
            case 1:
                mOpponentChoice = mRock1;
                break;
            case 2:
                mOpponentChoice = mPaper2;
                break;
            case 3:
                mOpponentChoice = mScissors3;
                break;
            case 4:
                mOpponentChoice = mLizard4;
                break;
            default:
                mOpponentChoice = mSpock5;
                break;
        }
        return result;
    }

    public void setPlayerOneChoice(int choice) {
        switch (choice) {
            case 1:
                mPlayerChoice = 1;
                break;
            case 2:
                mPlayerChoice = 2;
                break;
            case 3:
                mPlayerChoice = 3;
                break;
            case 4:
                mPlayerChoice = 4;
                break;
            case 5:
                mPlayerChoice = 5;
                break;
        }
    }

    public int getPlayerChoice() {
        return mPlayerChoice;
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public String getOpponentChoice() {
        computerChoice();
        return mOpponentChoice;
    }


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void gameResult() {
        getPlayerChoice();

        int computer = computerChoice();

        if (mPlayerChoice == computer) {
            mPlayerStat += 0;
            mOpponentChoice += 0;
        } else if (mPlayerChoice == 1) { //ROCK
            switch (computer) {
                case 1: //ROCK

                    break;
                case 2:  //PAPER
                    mOpponentStat ++;
                    break;
                case 3: //SCISSORS
                    mPlayerStat ++;
                    break;
                case 4: //LIZARD
                    mPlayerStat ++;
                    break;
                case 5: //SPOCK
                    mOpponentStat ++;
                    break;
            }
        } else if (mPlayerChoice == 2) { //PAPER
            switch (computer) {
                case 1: //ROCK
                    mPlayerStat ++;
                    break;
                case 2: //PAPER

                    break;
                case 3: //SCISSORS
                    mOpponentStat ++;
                    break;
                case 4: //LIZARD
                    mOpponentStat ++;
                    break;
                case 5: //SPOCK
                    mPlayerStat ++;
                    break;
            }

        } else if (mPlayerChoice == 3) { //SCISSORS
            switch (computer) {
                case 1: //ROCK
                    mOpponentStat ++;
                    break;
                case 2: //PAPER
                    mPlayerStat ++;
                    break;
                case 3: //SCISSORS

                    break;
                case 4: //LIZARD
                    mPlayerStat ++;
                    break;
                case 5: //SPOCK
                    mOpponentStat ++;
                    break;
            }

        } else if (mPlayerChoice == 4) { //LIZARD
            switch (computer) {
                case 1: //ROCK
                    mOpponentStat++;
                    break;
                case 2: //PAPER
                    mPlayerStat ++;
                    break;
                case 3: //SCISSORS
                    mOpponentStat++;
                    break;
                case 4: //LIZARD

                    break;
                case 5: //SPOCK
                    mPlayerStat ++;
                    break;
            }

        } else { //SPOCK
            switch (computer) {
                case 1: //ROCK
                    mPlayerStat++;
                    break;
                case 2: //PAPER
                    mOpponentStat++;
                    break;
                case 3: //SCISSORS
                    mPlayerStat++;
                    break;
                case 4: //LIZARD
                    mOpponentStat++;
                    break;
                case 5: //SPOCK

                    break;
            }

        }
    }

}
