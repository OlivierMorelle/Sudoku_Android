package com.example.olivier.sudoku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SudokuGameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sudoku_game);

        TextView text = (TextView) findViewById(R.id.textView1);
        Bundle objetbunble = this.getIntent().getExtras();
        String InfoPasse= objetbunble.getString("InfoLevelDifficult");
        text.setText(InfoPasse);
    }
}
