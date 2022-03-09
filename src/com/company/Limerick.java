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
