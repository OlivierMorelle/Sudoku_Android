package com.example.olivier.sudoku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectLevelActivity extends AppCompatActivity {

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
                Intent gameActivity = new Intent(SelectLevelActivity.this, SudokuGameActivity.class);
                startActivity(gameActivity);
            }
        });
        buttonDifficult = (Button) findViewById(R.id.ButtonDifficult);
        buttonDifficult.setEnabled(false); // Non disponible.


    }
}
