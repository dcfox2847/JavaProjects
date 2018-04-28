package com.company;

public class Main {

    public static void main(String[] args) {

        boolean dodoEndangered;
        boolean sameAnimal;

        Animal dog = new Animal();
        dog.setName("Collie");
        dog.setPopulation(100);
        dog.setGrowthRate(50.0);

        dog.endangeredMethod();
        dog.animalInfo();
        System.out.println("This animal is endangered... True or False?");
        System.out.println(dog.endangeredMethod());

        Animal horse = new Animal("Clydesdale Horse", 3000, 10.0);
        System.out.println(horse.toString());

        Animal dodo = new Animal("Dodo Bird", 10, -50.0);
        dodoEndangered = dodo.endangeredMethod();
        System.out.println(dodoEndangered);

        sameAnimal = dodo.equals(dog);
        System.out.println("Is the Dodo the same as Dog?");
        System.out.println(sameAnimal);



    }
}
