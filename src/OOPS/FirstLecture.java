package OOPS;
import java.util.Arrays;
import java.util.Scanner;

public class FirstLecture {
    public static void main(String[] args){
//        WRAPPER CLASSES
        Scanner sc = new Scanner(System.in);
        int a = 1;   //a is not an object
//        OR
        Integer num = new Integer(sc.nextInt());  //num is an object of type integer
        System.out.println(a + " " + num);
        Integer num1 = sc.nextInt();  //or Integer num1 = 10;     //here the value of object is either user defined or 10
        System.out.println(num1);
    }
}
