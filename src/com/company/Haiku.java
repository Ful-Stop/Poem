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
            for (int j = 1; j <= getSyllables(i); j ++){
                System.out.print("ta");
                if (j != getSyllables(i)){
                    System.out.print("-");
                }
            }
            System.out.println("");
        }
    }
}
