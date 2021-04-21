package com.company.musician.jazz;

import com.company.musician.MusicalInstruments;

/**
 * @author Pavlov Vitaliy
 */

public class ContraBassPlayer extends JazzMusician {

    MusicalInstruments instrument = MusicalInstruments.CONTRABASS;

    public ContraBassPlayer(boolean earMusic, String nameBand) {
        super(earMusic, nameBand);

    }

    @Override
    public String toString() {
        return "ContraBassPlayer { " +
                "instrument = " + instrument +
                ", nameBand = '" + nameBand + '\'' +
                " }";
    }
}
