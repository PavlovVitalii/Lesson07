package com.company.musician.jazz;

import com.company.musician.Musician;

/**
 * @author Pavlov Vitaliy
 */

public class JazzMusician extends Musician {

    String nameBand;

    public JazzMusician(boolean earMusic, String nameBand) {
        super(earMusic);
        this.nameBand = nameBand;
    }

    @Override
    public String toString() {
        return "JazzMusician { " +
                "nameBand = '" + nameBand + '\'' +
                " }";
    }
}
