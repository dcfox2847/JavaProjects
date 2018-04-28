package com.company;

public class Truck extends Vehicle {

    //Private variables
    private double loadCap;
    private int towCap;

    //Constructors
    public Truck(){
        super();
        loadCap = 0;
        towCap = 0;
    }
    public Truck(String manuName, int cylinders, Person owner, double loadCap, int towCap){
        super(manuName,cylinders,owner);
        this.loadCap = loadCap;
        this.towCap = towCap;
    }
    public Truck(Truck other){
        loadCap = other.loadCap;
        towCap = other.towCap;
    }

    //Mutator Methods
    public double getLoadCap() {
        return loadCap;
    }

    public void setLoadCap(double loadCap) {
        this.loadCap = loadCap;
    }

    public int getTowCap() {
        return towCap;
    }

    public void setTowCap(int towCap) {
        this.towCap = towCap;
    }

    //Methods
    public String toString(){
        return super.toString() + ", " + loadCap + " lbs. load, " + towCap + " tow";
    }


    public boolean equals(Truck other) {
        return super.equals(other) && loadCap == other.loadCap && towCap == other.towCap;
    }
}
