package com.company.musician.rock;

import com.company.musician.MusicalInstruments;
import com.company.musician.rock.RockMusician;

/**
 * @author Pavlov Vitaliy
 */

public class Drummer extends RockMusician {

MusicalInstruments instrument = MusicalInstruments.DRUMS;

    public Drummer(boolean earMusic, String nameBand,
                   boolean leatherJacket, boolean longHair) {

        super(earMusic, nameBand, leatherJacket, longHair);
    }

    @Override
    public String toString() {
        return "Drummer{" +
                "instrument=" + instrument +
                ", nameBand='" + nameBand + '\'' +
                ", rock='" + rock + '\'' +
                '}';
    }
}
