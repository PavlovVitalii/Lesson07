package com.company.musician;

/**
 * @author Pavlov Vitaliy
 */

public class RockMusician extends Musician {

    String nameBand;
    boolean leatherJacket;
    boolean longHair;
    String rock = "rocker";


    public RockMusician(boolean earMusic, String nameBand, boolean leatherJacket, boolean longHair) {
        super(earMusic);
        this.nameBand = nameBand;
        this.leatherJacket = leatherJacket;
        this.longHair = longHair;
        boolean roker = leatherJacket && longHair;
        if (roker == true){
            rock = "TRY ROKER!!!";
        }
    }

    @Override
    public String toString() {
        return "RockMusician { " +
                "nameBand = '" + nameBand + '\'' +
                ", rock = '" + rock + '\'' +
                " }";
    }
}
