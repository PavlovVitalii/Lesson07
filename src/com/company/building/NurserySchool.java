package com.company.building;

/**
 * @author Pavlov Vitaliy
 */

public class NurserySchool extends School {

    int GameRoom;
    int bedroom;

    public NurserySchool(double width, double length, double height,
                         TypeRoof roof, int numberClassroom, int gameRoom, int bedroom) {

        super(width, length, height, roof, numberClassroom);
        GameRoom = gameRoom;
        this.bedroom = bedroom;
    }

    @Override
    public String toString() {
        return "NurserySchool { " +
                "width = " + width +
                ", length = " + length +
                ", height = " + height +
                ", roof = " + roof +
                ", GameRoom = " + GameRoom +
                ", bedroom = " + bedroom +
                ", numberClassroom = " + numberClassroom +
                " }";
    }
}
