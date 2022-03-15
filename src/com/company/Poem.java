package com.company;

public class Poem {

    private int numLines;

    public Poem(int l){
        numLines = l;
    }

    public int getNumLines(){
        return numLines;
    }

    public void printRhythm(){
        System.out.println("Free Verse!");
    }

    public void printTAS(int Syl){
        for (int j = 1; j <= Syl; j ++){
            System.out.print("ta");
            if (j != Syl){
                System.out.print("-");
            }
        }
        System.out.println("");
    }


}
