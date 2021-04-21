package com.company.musician.jazz;

import com.company.musician.MusicalInstruments;

/**
 * @author Pavlov Vitaliy
 */

public class Saxophonist extends JazzMusician{

    MusicalInstruments instrument = MusicalInstruments.SAXOPHONE;

    public Saxophonist(boolean earMusic, String nameBand) {
        super(earMusic, nameBand);
    }

    @Override
    public String toString() {
        return "Saxophonist { " +
                "nameBand = '" + nameBand + '\'' +
                ", instrument = " + instrument +
                " }";
    }
}
