package com.company.room.furniture;

import com.company.room.enums.TypeTable;
import com.company.room.furniture.Furniture;

/**
 * @author Palov Vitaliy
 */

public class Table extends Furniture {

    private TypeTable typeTable;
   private String material;

    public Table(String name,
                 String color,
                 double width,
                 double length,
                 double height,
                 TypeTable typeTable,
                 String material) {
        super(name, color, width, length, height);
        this.material = material;
        this.typeTable = typeTable;
    }

    public TypeTable getTypeTable() {
        return typeTable;
    }

    public String getMaterial() {
        return material;
    }
}
