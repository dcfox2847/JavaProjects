package com.company;

public class Main {

    public static void main(String[] args) {

        Person p1 = new Person();
        System.out.println("p1: " + p1.toString());
        p1.setName("Bob");
        System.out.println("p1's name is: " + p1.getName());
        Person p2 = new Person("Joe");
        System.out.println("p2: " + p2.toString());
        Person p3 = new Person("Bob");
        System.out.println("p3 equal to p1: " + p3.equals(p1));
        System.out.println("p2 equal to p1: " + p2.equals(p1));
        Vehicle v1 = new Vehicle();
        System.out.println("v1: " + v1.toString());
        v1.setManuName("Ford");
        v1.setCylinders(4);
        v1.setOwner(p2);
        System.out.println("v1's manufacturer is: " +v1.getManuName());
        System.out.println("v1's cylinders: " + v1.getCylinders());
        System.out.println("v1's owner: " + v1.getOwner());
        Person p4 = new Person("Betty");
        Vehicle v2 = new Vehicle("Chevy", 4, p4);
        System.out.println("v2: " + v2.toString());
        Vehicle v3 = new Vehicle("Ford", 4, p2);
        System.out.println("v3 equal to v1: " + v3.equals(v1));
        System.out.println("v2 equal to v1: " + v2.equals(v1));
        Truck t1 = new Truck();
        System.out.println(t1.toString());
        t1.setLoadCap(54.36);
        t1.setTowCap(10);
        System.out.println("t1's load capacity is: " + t1.getLoadCap());
        System.out.println("t1's towing capacity is: " + t1.getTowCap());
        Truck t2 = new Truck("Chevy", 4, p4, 34.5, 65);
        Truck t3 = new Truck();
        t3.setLoadCap(54.36);
        t3.setTowCap(10);
        System.out.println("t3 equal to t1: " + t3.equals(t1));
        System.out.println("t2 equal to t1: " + t2.equals(t1));

    }
}
