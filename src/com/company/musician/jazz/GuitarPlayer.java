package com.company.musician.jazz;

import com.company.musician.MusicalInstruments;

/**
 * @author Pavlov Vitaliy
 */

public class GuitarPlayer extends JazzMusician {

    MusicalInstruments instrument;

    public GuitarPlayer(boolean earMusic, String nameBand,
                        MusicalInstruments instrument) {
        super(earMusic, nameBand);
        this.instrument = instrument;
    }
}
