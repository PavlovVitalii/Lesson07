package com.company;

import java.util.Objects;

/**
 * @author Pavlov Vitaliy
 */

public class Human {

    private String name;
    private int age;
    private double weight;

    public Human(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age && Double.compare(human.weight, weight) == 0 && Objects.equals(name, human.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, weight);
    }

    @Override
    public String toString() {
        return String.format("name: %s%nage: %d%nweight: %.1f%n",name,age,weight);
    }

    public void run(Human human, Human human1, Human human2) {

        System.out.printf("Hash Code human: %d%nHash Code human1: %d%n"
                + "Hash Code human2: %d%n%n", human.hashCode(), human1.hashCode(), human2.hashCode());

        System.out.printf("Equals human and human1: %b%nEquals human and human2: %b%n" +
                        "Equals human1 and human2: %b%n%n", human.equals(human1), human.equals(human2),
                human1.equals(human2));

        System.out.printf("To String human: %n%s%n%nTo String human1: %n%s%n%n" +
                        "To String human2: %n%s%n%n", human.toString(), human1.toString(),
                human2.toString());


    }

}
