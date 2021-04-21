package com.company.building;

/**
 * @author Pavlov Vitaliy
 */

public class School extends Building {

    int numberClassroom;

    public School(double width, double length, double height,
                  TypeRoof roof, int numberClassroom) {

        super(width, length, height, roof);
        this.numberClassroom = numberClassroom;
    }

    @Override
    public String toString() {
        return "School { " +
                "width = " + width +
                ", length = " + length +
                ", height = " + height +
                ", roof = " + roof +
                ", numberClassroom = " + numberClassroom +
                " }";
    }
}
