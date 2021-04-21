package com.company.room.appliances;

import com.company.room.enums.ManufacturerWasher;

/**
 * @author Pavlov Vitaliy
 */

public class Washer extends Appliances {

    int width;
    int length;
    ManufacturerWasher washer;

    public Washer(int power, int width, int length, ManufacturerWasher washer) {
        super(power);
        this.width = width;
        this.length = length;
        this.washer = washer;
    }

    @Override
    public String toString() {
        return "Washer { " +
                "power = " + power +
                ", width = " + width +
                ", length = " + length +
                ", washer = " + washer +
                " }";
    }
}
