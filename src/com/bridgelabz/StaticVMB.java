package com.bridgelabz;
//Write a program to demonstrate static variables, methods, and blocks

public class StaticVMB {

    static int a = 5;
    static void display(){
        System.out.println("Static Method");
    }
    static {
        /*
        When a block is decorated or associated with the word static, it is called a static block.
        Static Block is known as the static clause. A static block can be used for the static initialization of a class.
        The code that is written inside the static block run once,
        when the class is getting loaded into the memory.
         */
        System.out.println("Static Block");
    }
    public static void main(String[] args) {
        System.out.println(a);
        display();

    }
}
