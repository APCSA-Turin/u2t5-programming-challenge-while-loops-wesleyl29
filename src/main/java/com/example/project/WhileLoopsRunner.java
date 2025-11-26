package com.example.project;


public class WhileLoopsRunner{

    public static void main(String[] args) {
        WhileLoops test = new WhileLoops();
        System.out.println(test.countDownBy(5,5));
        System.out.println(test.countEvensUpTo(10));
        System.out.println(test.minutesUntilDead(10, 1));
    }
}