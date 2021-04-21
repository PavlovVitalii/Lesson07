package com.company.musician.jazz;

import com.company.musician.MusicalInstruments;

/**
 * @author Pavlov Vitaliy
 */

public class Drammer extends JazzMusician {

    MusicalInstruments instrument;


    public Drammer(boolean earMusic, String nameBand) {
        super(earMusic, nameBand);
    }

    @Override
    public String toString() {
        return "Drammer { " +
                "instrument = " + instrument +
                ", nameBand = '" + nameBand + '\'' +
                " }";
    }
}
