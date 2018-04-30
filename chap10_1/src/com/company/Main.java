package com.company;

public class Main {

    public static void main(String[] args) {

        Search search = new Search();
        search.readFile("C:\\Users\\Daniel\\IdeaProjects\\chap10_1\\src\\com\\company\\boynames.txt");
        search.readFile("C:\\Users\\Daniel\\IdeaProjects\\chap10_1\\src\\com\\company\\girlnames.txt");
        search.getNameData();
    }
}
