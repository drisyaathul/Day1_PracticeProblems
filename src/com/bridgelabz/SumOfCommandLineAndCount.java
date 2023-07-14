package com.bridgelabz;
//To find the sum of command-line arguments and count the invalid integers entered.

import java.util.Scanner;
public class SumOfCommandLineAndCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st number : ");
        int a = scanner.nextInt();
        System.out.println("Enter 2nd number : ");
        int b = scanner.nextInt();
        int c = a+b;
        System.out.println("Sum : "+c);
    }
}
