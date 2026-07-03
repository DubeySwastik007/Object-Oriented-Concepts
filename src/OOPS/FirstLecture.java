package OOPS;
import java.util.Arrays;
import java.util.Scanner;

//final - makes the variable a constant(same as const in c/c++)
//final variables are always initialized at the time of declaration
//final ensures immutability for primitives only
//if a non primitive is final then we cannot reassign it

class Car{
    String name;
    Car(String name){
        this.name = name;
    }
}

public class FirstLecture {
    public static void main(String[] args){
        Car c1 = new Car("Audi");
        System.out.println(c1.name);
        final Car c2 = new Car("BMW");
        c2.name = "Mercedes";   //this is allowed
        c2 = c1;                //this is wrong
    }
}
