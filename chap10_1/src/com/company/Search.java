package com.company;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Search {

    private String[] boyNames = new String[1000];
    private String[] girlNames = new String[1000];
    private int[] boyCount = new int[1000];
    private int[] girlCount = new int[1000];

    public void readFile(String fileName){
        String[] names = new String[1000];
        int[] count = new int[1000];
        try {
            String line;
            int counter = 0;
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            while((line = br.readLine()) != null){
                String[] data = line.split(" ");
                names[counter] = data[0];
                count[counter] = Integer.parseInt(data[1]);
                counter++;
            }
            if(fileName.contains("boynames.txt")){
                this.boyNames = names;
                this.boyCount = count;
            }else{
                this.girlNames = names;
                this.girlCount = count;
            }
            br.close();
        } catch (FileNotFoundException e){
            System.out.println("File not found.");
            e.printStackTrace();
        }catch (IOException e){
            System.out.println("An error occured with the input file");
            e.printStackTrace();
        }

    }

    public void getNameData(){
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a boy or girls name: ");
        String name = in.next();
        if(Arrays.asList(this.boyNames).contains(name)){
            int index = Arrays.asList(this.boyNames).indexOf(name);
            int occurences = boyCount[index];
            System.out.println(name + " is ranked " + (index + 1) + " in popularity among boys with " + occurences + " namings.");
        }else{
            System.out.println(name + " is not ranked among the top 1000 boy names.");
        }
        if(Arrays.asList(this.girlNames).contains(name)){
            int index = Arrays.asList(this.girlNames).indexOf(name);
            int occurences = girlCount[index];
            System.out.println(name + " is ranked " + (index + 1) + " in popularity among girls with " + occurences + " namings.");
        }else{
            System.out.println(name + " is not ranked among the top 1000 girls names.");
        }
    }

}
