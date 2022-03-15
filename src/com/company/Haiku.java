package com.company;

public class Haiku extends Poem {

    public Haiku(){
        super(3);
    }

    public int getSyllables(int l){
        if (l == 1 || l == 3) {
            return 5;
        }
        if (l == 2) {
            return 7;
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
