package com.company.musician.rock;

import com.company.musician.MusicalInstruments;
import com.company.musician.rock.RockMusician;

/**
 * @author Pavlov Vitaliy
 */

public class BassGuitarPlayer extends RockMusician {

    MusicalInstruments instrument = MusicalInstruments.BAS_GUITAR;

    public BassGuitarPlayer(boolean earMusic, String nameBand,
                            boolean leatherJacket, boolean longHair) {

        super(earMusic, nameBand, leatherJacket, longHair);
    }

    @Override
    public String toString() {
        return "BassGuitarPlayer {" +
                "instrument = " + instrument +
                ", nameBand = '" + nameBand + '\'' +
                ", rock = '" + rock + '\'' +
                " }";
    }
}
