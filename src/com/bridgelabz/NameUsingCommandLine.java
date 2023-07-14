package com.bridgelabz;

import java.util.Scanner;

//To get the name using the command line
public class NameUsingCommandLine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Name : ");
        String name = scanner.nextLine();

        System.out.println("Name : "+name);

    }
}
