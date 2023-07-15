package com.bridgelabz;
//To find the sum of command-line arguments and count the invalid integers entered.

public class SumOfCommandLineAndCount {
    public static void main(String[] args) {
        int sum=0;
        for(int i=1; i<args.length; i++){
            sum=sum+Integer.parseInt(args[i]);
        }
        System.out.println(sum);
    }
}
