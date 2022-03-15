package com.company;

public class Limerick extends Poem{

    public Limerick(){
        super(5);
    }

    public int getSyllables(int l){
        if (l == 1 || l == 2 || l == 5) {
            return 9;
        }
        if (l == 3 || l == 4) {
            return 6;
        }
        else{
            return 0;
        }
    }

    public void printRhythm(){
        for (int i = 1; i <= getNumLines(); i ++){
            super.printTAS(getSyllables(i));
        }

    }
}
