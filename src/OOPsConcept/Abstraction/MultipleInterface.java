package OOPsConcept.Abstraction;

//Multiple Inheritance in Java Using Interface

import java.io.*;

// Add interface
interface Add{
    int add(int a,int b);    // by default public and abstract
}

// Sub interface
interface Sub{
    int sub(int a,int b);
}

// Calculator class implementing Add and Sub
class Cal implements Add , Sub
{
    // Method to add two numbers
    public int add(int a,int b){
        return a+b;
    }

    // Method to sub two numbers
    public int sub(int a,int b){
        return a-b;
    }
}
class MultipleInterface{
    // Main Method
    public static void main (String[] args){

        // instance of Cal class
        Cal x = new Cal();
        System.out.println("Addition : " + x.add(2,1));
        System.out.println("Substraction : " + x.sub(2,1));
    }
}