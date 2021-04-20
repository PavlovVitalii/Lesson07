package com.company.room.appliances;

import com.company.room.enums.ManufactureVacuum;
import com.company.room.enums.TypeVacuum;

/**
 * @author Pavlov Vitalii
 */

public class Vacuum extends Appliances {

    private ManufactureVacuum vacuum;
    private TypeVacuum typeVacuum;

    public Vacuum(int power,
                  ManufactureVacuum vacuum,
                  TypeVacuum typeVacuum) {
        super(power);
        this.vacuum = vacuum;
        this.typeVacuum = typeVacuum;
    }

    public ManufactureVacuum getVacuum() {
        return vacuum;
    }

    public TypeVacuum getTypeVacuum() {
        return typeVacuum;
    }
}
