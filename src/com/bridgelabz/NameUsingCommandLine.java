package com.bridgelabz;

//To get the name using the command line
public class NameUsingCommandLine {
    public static void main(String[] args) {
        System.out.println("Name Using Command Line Arguments:-");
        for (String string: args) {
            System.out.println(string);
        }
    }
}
