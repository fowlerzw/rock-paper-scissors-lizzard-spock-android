package com.apps.palka.matt.rockpaperscissorslizzardspock;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class RulesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rules);

        TextView rulesText = findViewById(R.id.rules_text);

        rulesText.setText("The game is an expansion on the game Rock, Paper, Scissors. Each player picks a variable and reveals it at the same time. The winner is the one who defeats the others. In a tie, the process is repeated until a winner is found. Almost always, the boys will all pick Spock at the same time and tie over and over again."
                + "\n \n" +"Scissors cuts Paper"
                + "\nPaper covers Rock"
                + "\nRock crushes Lizard"
                + "\nLizard poisons Spock"
                + "\nSpock smashes Scissors"
                + "\nScissors decapitates Lizard"
                + "\nLizard eats Paper"
                + "\nPaper disproves Spock"
                + "\nSpock vaporizes Rock"
                + "\n(and as it always has) Rock crushes Scissors");

    }
}
