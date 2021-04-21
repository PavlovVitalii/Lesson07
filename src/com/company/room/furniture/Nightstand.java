package com.company.room.furniture;

/**
 * @author Pavlov Vitaliy
 */

public class Nightstand extends Furniture {

    private String fabricator;

    public Nightstand(String name, String color, double width,
                      double length, double height, String fabricator) {

        super(name, color, width, length, height);
        this.fabricator = fabricator;
    }

    @Override
    public String toString() {
        return "Nightstand { " +
                "name = '" + name + '\'' +
                ", color = '" + color + '\'' +
                ", width = " + width +
                ", length = " + length +
                ", height = " + height +
                ", fabricator = '" + fabricator + '\'' +
                " }";
    }
}
