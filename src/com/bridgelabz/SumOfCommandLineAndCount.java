package com.bridgelabz;
//To find the sum of command-line arguments and count the invalid integers entered.

public class SumOfCommandLineAndCount {
    public static void main(String[] args) {
        int sum = 0;
        int invalid = 0;
        for(int i=0; i<args.length; i++) {
            try {
                sum = sum + Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                invalid++;
            }
        }
        System.out.println("Number of Arguments : "+args.length);
        System.out.println("Sum : "+sum);
        System.out.println("Invalid Integers : "+invalid);
    }
}
