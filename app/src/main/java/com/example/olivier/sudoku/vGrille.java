package com.example.olivier.sudoku;

public class vGrille {
    private int levl, num, done;
    vGrille(int levl, int num, int done) {
        this.levl = levl;
        this.num = num;
        this.done = done;
    }
    public int getlevl()    {
        return levl;
    }
    public int getnum(){
        return num;
    }
    public int getdone(){
        return done;
    }

}

