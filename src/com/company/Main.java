package com.company;

import com.company.building.ApartmentHouse;
import com.company.building.Building;
import com.company.building.House;
import com.company.building.TypeRoof;
import com.company.musician.GuitarPlayer;
import com.company.musician.MusicalInstruments;
import com.company.musician.Musician;
import com.company.musician.RockMusician;
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
        Main main = new Main();
        main.run();
    }

    private void run() {

        // задание 7.1
        Human human = new Human("Василий", 44, 77.5);
        Human human1 = new Human("Василий", 44, 77.5);
        Human human2 = new Human("Виктор", 44, 77.5);
        human.run(human, human1, human2);

        // задание 7.3
        Building building = new Building(5.0, 5.0, 6.5, TypeRoof.PITCHED);
        House house = new House(8.5, 12.5, 7.5, TypeRoof.FLAT, 7,2);
        ApartmentHouse apartmentHouse = new ApartmentHouse(10.5, 25.00, 100,
                TypeRoof.FLAT, 50, 1000);

        System.out.println(building.toString());
        System.out.println(house.toString());
        System.out.println(apartmentHouse.toString());
        System.out.println();

        // задание 7.4
        System.out.println();
        Musician musician = new Musician(false);
        RockMusician rockMusician = new RockMusician(true,"Monsters",
                true,true);
        GuitarPlayer guitarPlayer = new GuitarPlayer(true,"Tram-Tararam",
                false,true, MusicalInstruments.DRUMS);

        System.out.println(musician.toString());
        System.out.println(rockMusician.toString());
        System.out.println(guitarPlayer.toString());
    }

}
