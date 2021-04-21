package com.company;

import com.company.building.*;
import com.company.musician.jazz.ContraBassPlayer;
import com.company.musician.jazz.JazzMusician;
import com.company.musician.jazz.Saxophonist;
import com.company.musician.jazz.Trumpeter;
import com.company.musician.rock.BassGuitarPlayer;
import com.company.musician.rock.Drummer;
import com.company.musician.rock.GuitarPlayer;
import com.company.musician.MusicalInstruments;
import com.company.musician.Musician;
import com.company.musician.rock.RockMusician;

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
        House house = new House(8.5, 12.5, 7.5, TypeRoof.FLAT, 7, 2);
        ApartmentHouse apartmentHouse = new ApartmentHouse(10.5, 25.00, 100,
                TypeRoof.FLAT, 50, 1000);
        School school = new School(10, 20, 20, TypeRoof.PITCHED, 40);
        NurserySchool nurserySchool = new NurserySchool(30, 60, 30,
                TypeRoof.FLAT, 30, 20, 15);

        System.out.println(school.toString());
        System.out.println(nurserySchool.toString());
        System.out.println(building.toString());
        System.out.println(house.toString());
        System.out.println(apartmentHouse.toString());
        System.out.println();

        // задание 7.4
        System.out.println();
        Musician musician = new Musician(false);
        RockMusician rockMusician = new RockMusician(true, "Monsters",
                true, true);
        GuitarPlayer guitarPlayer = new GuitarPlayer(true, "Tram-Tararam",
                false, true, MusicalInstruments.RITM_GUITAR);
        Drummer drummer = new Drummer(true, "Monsters", true, true);
        BassGuitarPlayer bassGuitarPlayer = new BassGuitarPlayer(true, "Monsters",
                true, true);
        JazzMusician jazzMusician = new JazzMusician(true, "JazzBand");
        ContraBassPlayer contraBassPlayer = new ContraBassPlayer(true, "JazzBand");
        Saxophonist saxophonist = new Saxophonist(true, "jazzBand");
        Trumpeter trumpeter = new Trumpeter(true, "jazzBand");

        System.out.println(musician.toString());
        System.out.println(rockMusician.toString());
        System.out.println(guitarPlayer.toString());
        System.out.println(bassGuitarPlayer.toString());
        System.out.println(drummer.toString());
        System.out.println();
        System.out.println();
        System.out.println(jazzMusician.toString());
        System.out.println(saxophonist.toString());
        System.out.println(trumpeter.toString());
        System.out.println(contraBassPlayer.toString());
    }

}
