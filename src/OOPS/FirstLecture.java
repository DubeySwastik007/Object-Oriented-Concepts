package OOPS;
import java.util.Arrays;
import java.util.Scanner;

//NOTES:
//class - a named group of properties and functions or a blueprint of objects, theoretical/logical construct
//objects - an instance/reality/practical representation of a class
//Objects originally occupy space in the memory
//Instance variable - variables declared inside the class but outside the constructors and methods
//dot (.) operator - links the instance variable with the reference name of the object
//new operator - creates an object or dynamically(at runtime) allocates memory at runtime and returns the reference to it
//When we create an object of a class then the class is instantiated

class Student{
    String name;            //instance variable1
    int roll_no;            //instance variable2
    double marks;           //instance variable3
};

public class FirstLecture {
    public static void main(String[] args){
        Student s1;     //s1 is the reference variable
                        //This is just declaring the reference to the object and not the creation of object
        //object creation and initialization
        s1 = new Student();
        s1.name = "Swastik";
        s1.roll_no = 43;
        s1.marks = 43;
        System.out.println(s1.name);
        System.out.println(s1.roll_no);
        System.out.println(s1.marks);
    }
}
