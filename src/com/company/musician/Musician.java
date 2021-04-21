package com.company.musician;

/**
 * @author Pavlov Vitaliy
 */

public class Musician {

    boolean earMusic;
    String ear;

    public Musician(boolean earMusic) {

        this.earMusic = earMusic;

        if (earMusic == false){
            ear = "Вы не можете быть музыкантом, у вас не слуха.";
        }else {
            ear = "Вы музыкант!";
        }
    }

    @Override
    public String toString() {
        return "Musician { " +
                "ear = " + ear +
                " }";
    }
}
