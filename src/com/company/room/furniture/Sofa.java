package com.company.room.furniture;

import com.company.room.enums.SofaMechanism;

/**
 * @author Pavlov Vitaliy
 */

public class Sofa extends Furniture {

   private SofaMechanism sofaMechanism;
   private String fabricator;

    public Sofa(String name,
                String color,
                double width,
                double length,
                double height,
                SofaMechanism sofaMechanism,
                String fabricator) {
        super(name, color, width, length, height);
        this.sofaMechanism = sofaMechanism;
        this.fabricator = fabricator;
    }

    public SofaMechanism getSofaMechanism() {
        return sofaMechanism;
    }

    public String getFabricator() {
        return fabricator;
    }
}
