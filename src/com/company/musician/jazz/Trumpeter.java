package com.company.musician.jazz;

import com.company.musician.MusicalInstruments;

/**
 * @author Pavlov Vitaliy
 */

public class Trumpeter extends JazzMusician{

    MusicalInstruments instrument = MusicalInstruments.TRUMPET;

    public Trumpeter(boolean earMusic, String nameBand) {
        super(earMusic, nameBand);
    }

    @Override
    public String toString() {
        return "Trumpeter { " +
                "nameBand = '" + nameBand + '\'' +
                ", instrument = " + instrument +
                " }";
    }
}
