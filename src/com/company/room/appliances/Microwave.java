package com.company.room.appliances;

import com.company.room.enums.FunctionMicrowave;
import com.company.room.enums.ManufacturerMicrowave;

/**
 * @author Pavlov Vitaliy
 */

public class Microwave extends Appliances {

    private FunctionMicrowave[] functionMicrowaves;
    private ManufacturerMicrowave microwave;
    private int size;

    public Microwave(int power,
                     FunctionMicrowave[] functionMicrowaves,
                     ManufacturerMicrowave microwave,
                     int size) {
        super(power);
        this.functionMicrowaves = functionMicrowaves;
        this.microwave = microwave;
        this.size = size;
    }

    public FunctionMicrowave[] getFunctionMicrowaves() {
        return functionMicrowaves;
    }

    public ManufacturerMicrowave getMicrowave() {
        return microwave;
    }

    public int getSize() {
        return size;
    }
}
