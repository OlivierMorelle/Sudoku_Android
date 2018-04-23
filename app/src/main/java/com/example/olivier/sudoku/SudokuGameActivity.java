package com.example.olivier.sudoku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class SudokuGameActivity extends AppCompatActivity {

    //ListView vGrille = (ListView) findViewById(R.id.listView1);
    List <vGrille>vGrilleList = new ArrayList<vGrille>();

    private void afficher() throws NoSuchFieldException{
        vGrille objetGrille =  vGrilleList.get(1);
        for (vGrilleList objet : objets){
            Log.i("listView1",objetGrille.getlevl());
            Log.i("listView1",objetGrille.getnum());
            Log.i("listView1",objetGrille.getdone());
        }
    }

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
