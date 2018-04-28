package com.company;

public class Person {
    private String name;

    public Person(){
        name = "";
    }

    public Person(String theName){
        name = theName;
    }

    public Person(Person theObject){
        name = theObject.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        return name.equals(((Person)obj).name);
    }
}
