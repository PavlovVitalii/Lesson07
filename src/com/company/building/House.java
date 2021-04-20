package com.company.building;

/**
 * @author Pavlov Vitaliy
 */

public class House extends Building {

    int numberRooms;
    int numberFloors;

    public House(double width, double length, double height, TypeRoof roof,int numberFloors) {
        super(width, length, height, roof);
        this.numberFloors = numberFloors;
    }

    public House(double width, double length, double height,
                 TypeRoof roof, int numberRooms, int numberFloors) {
        super(width, length, height, roof);
        this.numberRooms = numberRooms;
        this.numberFloors = numberFloors;
    }

    @Override
    public String toString() {
        return "House { " +
                "width =  " + width +
                ", length = " + length +
                ", height = " + height +
                ", roof = " + roof +
                ", numberRooms = " + numberRooms +
                ", numberFloors = " + numberFloors +
                " }";
    }
}
