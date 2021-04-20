package com.company.building;

/**
 * @author Pavlov Vitaliy
 */

public class Building {

    double width;
    double length;
    double height;
    TypeRoof roof;

    public Building(double width, double length, double height, TypeRoof roof) {
        this.width = width;
        this.length = length;
        this.height = height;
        this.roof = roof;
    }

    @Override
    public String toString() {
        return "Building{" +
                "width=" + width +
                ", length=" + length +
                ", height=" + height +
                ", roof=" + roof +
                '}';
    }
}
