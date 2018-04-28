package com.company;

public class Vehicle {

    //private variables
    private String manuName;
    private int cylinders;
    private Person owner;

    //Constructors

    public Vehicle(){
        manuName = "";
        cylinders = 0;
        owner = null;
    }

    public Vehicle(String manuName, int cylinders, Person owner){
        this.manuName = manuName;
        this.cylinders = cylinders;
        this.owner = owner;
    }

    public Vehicle(Vehicle vehicle){
        manuName = vehicle.manuName;
        cylinders = vehicle.cylinders;
        owner = new Person(vehicle.owner);
    }

    //Methods (Mutator)
    public String getManuName() {
        return manuName;
    }

    public void setManuName(String manuName) {
        this.manuName = manuName;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    //Methods


    @Override
    public java.lang.String toString() {
        return manuName + ", " + cylinders + ", " + owner;
    }

    public boolean equals(Vehicle vehicle) {
        return manuName.equals(vehicle.manuName) && cylinders == vehicle.cylinders;
    }
}
