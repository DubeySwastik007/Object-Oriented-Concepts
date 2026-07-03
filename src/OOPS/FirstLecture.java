package OOPS;
import java.util.Arrays;
import java.util.Scanner;

//NOTES:
//Constructor - a special function in a class used to initialize values to object at its creation time
//When no constructor is created then a default constructor is used which initialize the instance variable to null or 0
//constructor is invoked at the time of object creation

class Student{
    String name;
    int roll_no;
    double marks;
    Student(String str, int rno, double mrks){
        System.out.println("Constructor Invoked");
        name = str;
        roll_no = rno;
        marks = mrks;
    }
};

public class FirstLecture {
    public static void main(String[] args){
        Student s1 = new Student("Swastik", 3, 43);
        System.out.println(s1.name + " " + s1.roll_no + " " + s1.marks);
    }
}
