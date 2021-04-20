package com.company.musician;

/**
 * @author Pavlov Vitaliy
 */

public class GuitarPlayer extends RockMusician{

    MusicalInstruments instrument;

    public GuitarPlayer(boolean earMusic, String nameBand,
                        boolean leatherJacket, boolean longHair,
                        MusicalInstruments instrument) {

        super(earMusic, nameBand, leatherJacket, longHair);
        this.instrument = instrument;
    }

    @Override
    public String toString() {
        return "GuitarPlayer { " +
                "instrument = " + instrument +
                ", nameBand = '" + nameBand + '\'' +
                ", rock = '" + rock + '\'' +
                " }";
    }
}
