package com.company;

import com.company.room.appliances.Microwave;
import com.company.room.appliances.Vacuum;
import com.company.room.enums.FunctionMicrowave;
import com.company.room.enums.ManufactureVacuum;
import com.company.room.enums.ManufacturerMicrowave;
import com.company.room.enums.TypeVacuum;

/**
 * @author Pavlov Vitaliy
 */

public class Main {


    public static void main(String[] args) {

    }

    private void run() {

        // задание 7.1
        Human human = new Human("Василий", 44, 77.5);
        Human human1 = new Human("Василий", 44, 77.5);
        Human human2 = new Human("Виктор", 44, 77.5);
        human.run(human, human1, human2);


    }

}
