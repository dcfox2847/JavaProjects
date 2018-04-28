package com.company;
import java.util.Scanner;

public class Pet {

    private String name;
    private String type;
    private int age;
    private double weight;

    public String toString(){
        return ("Type: " + type + " Name: " + name + " Age: " + age + " years" + "\nWeight: " + weight + " pounds");
    }
    public double acepromazine(){
        if((type.equalsIgnoreCase("dog"))){
            return (weight / 2.2) * (0.03 / 10);
        }else return (weight / 2.2) * (0.002 / 10);
    }
    public double carprofen(){
        if((type.equalsIgnoreCase("dog"))){
            return (weight / 2.2) * (0.5 / 12);
        }else return (weight / 2.2) * (0.25 / 12);
    }
    public Pet(String initialName, String type, int initialAge, double initialWeight){
        name = initialName;
        if((initialAge < 0) || (initialWeight < 0)){
            System.out.println("Error: Negative age or weight.");
            System.exit(0);
        }else{
            age = initialAge;
            this.type = type;
            weight = initialWeight;
        }
    }
    public void set(String newName, String newType,  int newAge, double newWeight){
        name = newName;
        if((newAge < 0) || (newWeight < 0)){
            System.out.println("Error: Negative age or weight.");
            System.exit(0);
        }else{
            age = newAge;
            type = newType;
            weight = newWeight;
        }
    }
    public Pet(String iniitialName){
        name = iniitialName;
        type = null;
        age = 0;
        weight = 0;
    }
    public Pet(int initialAge){
        name = "No name yet.";
        type = "No type yet.";
        weight = 0;
        if(initialAge < 0){
            System.out.println("Error: Negative Age.");
            System.exit(0);
        }else{
            age = initialAge;
        }
    }
    public void setAge(int newAge){
        if (newAge < 0){
            System.out.println("Error: Negative Age.");
            System.exit(0);
        }else{
            age = newAge;
        }
    }
    public Pet(double initialWeight){
        name = "No name yet.";
        type = "No type yet.";
        age = 0;
        if (initialWeight < 0){
            System.out.println("Error: Negative weight.");
            System.exit(0);
        }else{
            weight = initialWeight;
        }
    }
    public void setWeight (double newWeight){
        if (newWeight < 0){
            System.out.println("Error: Negative weight.");
            System.exit(0);
        }else {
            weight = newWeight;
        }
    }
    public Pet(){
        name = "No name yet.";
        type = "No type yet.";
        age = 0;
        weight = 0;
    }
    public String getName(){
        return name;
    }
    public String getType(){
        return type;
    }
    public int getAge(){
        return age;
    }
    public double getWeight(){
        return weight;
    }
}
