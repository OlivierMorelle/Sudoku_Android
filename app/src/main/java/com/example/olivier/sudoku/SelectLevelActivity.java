package com.example.olivier.sudoku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectLevelActivity extends AppCompatActivity {

    public final static String AGE = "sdz.chapitreTrois.intent.example.AGE";
    private Button mPasserelle = null;

    private Button buttonEasy;
    private Button buttonDifficult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_level);
        buttonEasy = (Button) findViewById(R.id.ButtonEasy);
        buttonEasy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentGame = new Intent(SelectLevelActivity.this, SudokuGameActivity.class);
                startActivity(intentGame);
            }
        });

        buttonEasy.setEnabled(false); // Non disponible.
        buttonDifficult = (Button) findViewById(R.id.ButtonDifficult);

        final SelectLevelActivity lecontext = this;
        buttonDifficult.setOnClickListener((new Button.OnClickListener(){
            public void onClick(View V) {
                Intent defineIntent = new Intent(lecontext, SudokuGameActivity.class);
                Bundle objetbunble = new Bundle();

                objetbunble.putString("InfoLevelDifficult",buttonDifficult.getText().toString());
                defineIntent.putExtras(objetbunble);
                lecontext.startActivity(defineIntent);
            }
        }));
    }
}