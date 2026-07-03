package OOPS;
import java.util.Arrays;
import java.util.Scanner;

//NOTES:
//Constructor - a special function in a class used to initialize values to object at its creation time
//When no constructor is created then a default constructor is used which initialize the instance variable to null or 0
//constructor is invoked at the time of object creation
//this - points to the current object
//Constructor overloading - when different constructors in a class are called according to the parameters list

class Student{
    String name;
    int roll_no;
    double marks;

    //Calling a constructor from another constructor
    Student(){
        this("Aksh Dubey", 43, 100.0);
    }
    //Student() constructor calls this constructor
    Student(String name, int roll_no, double marks){
        this.name = name;
        this.roll_no = roll_no;
        this.marks = marks;
    }
};

public class FirstLecture {
    public static void main(String[] args){
        Student s1 = new Student();
        System.out.println(s1.name + " " + s1.roll_no + " " + s1.marks);
    }
}
