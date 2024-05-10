package org.example;

public class Main {
    public static void main(String[] args) {
        //data types
        short w;
        byte t00;
        long t01;
        int t1;
        float t2;
        double t3;
        char t4;

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        int test1 = 0;
        if(test1 == 0){
            System.out.println("testing 1");
        }
        boolean test2 = true;
        if(test2){
            System.out.println("testing 2");
        }
        //Artimetic Operators + - * /
        //logical operatos
        //expression >>> <<<

        /*
        Is it interpreted or compiled?
        Is it statically or dynamically typed?
        What's the memory model?
        Is it functional, object oriented or both?
        Do the functions call by value, reference or something else?
        is it multi-threaded or single treaded

        Habit read code from java projects


         */
        //{} = braces

        //What is an Operator? Sysmbols that perform an operation
        //What is an Operand? is a term to describe   -  any object that is manipulated by an operator
        //What is an expression? a conbination of a variables,literals, method return values, operators
        //What is Code block? A code block allows more than one statement to be executed


    }

    public static String namesito(String strg) {
        return String.format("Hola %s como estas? ", strg);
    }
}