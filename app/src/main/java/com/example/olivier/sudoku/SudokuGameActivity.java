package com.example.olivier.sudoku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class SudokuGameActivity extends AppCompatActivity {
    List<Object> vGrille = new ArrayList<Object>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sudoku_game);

        TextView text = (TextView) findViewById(R.id.textView1);
        Bundle objetbunble = this.getIntent().getExtras();
        String InfoPasse= objetbunble.getString("InfoLevelDifficult");
        text.setText(InfoPasse);

        ListView vGrille = (ListView) findViewById(R.id.listView1);
        Bundle objetbunblevGrille = this.getIntent().getExtras();
        String InfoGrille= objetbunble.getString("InfovGrille");
        text.setText(InfoPasse);
    }



}
