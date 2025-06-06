package com.MC;

import com.birdbrain.Finch;
// instatiates the bird object for the code to function 
public class FinalFinch {
    public static void main(String[] args){
        Finch bird = new Finch();

// makes the finch bird light up and shows a blue color when lit
// and makes sure note plays while the bird makes the house
        bird.setTail(1,100,0,50);
        bird.setBeak(0,100,50);
        bird.setTail("all",0,100,50);
        bird.playNote(60,100);
// this makes the body of the house (the square)
        bird.setMove("F",10,60);
        bird.setTurn("R",90,50);
        bird.setMove("F", 10,60);
        bird.setTurn("R", 90,50);
        bird.setMove("F",10,60);
        bird.setTurn("R",90,50);
        bird.setMove("F", 10,60);
        
// makes the triangle roof on the top of the house
// it is also connected to the square 
        bird.setTurn("R",45,50);
        bird.setMove("F", 7,60);
        bird.setTurn("R",90,50);
        bird.setMove("F", 7,60);

    }
}

// public static class 