package com.company.building;

/**
 * @author Pavlov Vitaliy
 */

public class ApartmentHouse extends House {

    int numberApartments;

    public ApartmentHouse(double width, double length, double height, TypeRoof roof,
                          int numberFloors, int numberApartments) {
        super(width, length, height, roof, numberFloors);
        this.numberApartments = numberApartments;
    }

    @Override
    public String toString() {
        return "ApartmentHouse { " +
                "numberApartments = " + numberApartments +
                ", width = " + width +
                ", length = " + length +
                ", height = " + height +
                ", roof = " + roof +
                ", numberFloors = " + numberFloors +
                " }";
    }
}
