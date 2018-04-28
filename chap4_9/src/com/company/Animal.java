package com.company;

public class Animal {

    private String name;
    private int population;
    private double growthRate;

    //Constructors (includes overloaded)

    public Animal(String name, int population, double growthRate){
        this.name = name;
        this.population = population;
        this.growthRate = growthRate;
        System.out.println("Creating Record....");
    }

    public Animal(){
        System.out.println("Creating Record....");
    }

    //Getter and Setter methods

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
        System.out.println("Setting name.");
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {

        this.population = population;
        System.out.println("Setting population.");
    }

    public double getGrowthRate() {
        return growthRate;
    }

    public void setGrowthRate(double growthRate) {

        this.growthRate = growthRate;
        System.out.println("Setting growthRate.");
    }


    //Additional methods

    public void animalInfo(){
        System.out.println("Record is: " + name + " , Current Population: " + population +
        " , Growth Rate: " + growthRate + "%");
    }

    public boolean endangeredMethod(){
        if (growthRate < 0){
            return true;
        }else{
            return false;
        }
    }



}

