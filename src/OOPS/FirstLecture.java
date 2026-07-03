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
    //this is not default constructor
    Student(){
        this.name = "Aksh Dubey";
        this.roll_no = 43;
        this.marks = 432.5;
    }
    //Copy Constructor
    Student(Student other){
        System.out.println("Copy constructor invoked");
        this.name = other.name;
        this.roll_no = other.roll_no;
        this.marks = other.marks;
    }

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
        Student s2 = new Student("Swastik Dubey", 41, 213.432);
        System.out.println(s2.name + " " + s2.roll_no + " " + s2.marks);
        Student s3 = new Student(s2);
        System.out.println(s3.name + " " + s3.roll_no + " " + s3.marks);
    }
}
