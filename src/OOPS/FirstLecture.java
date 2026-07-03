package OOPS;
import java.util.Arrays;
import java.util.Scanner;

public class FirstLecture {
    public static void main(String[] args){
        //This swap program does not changes the value because the Integer class is a final class
        Scanner in = new Scanner(System.in);
        Integer a = in.nextInt();
        Integer b = in.nextInt();
        System.out.println(a + " " + b);
        swap(a, b);
        System.out.println(a + " " + b);
    }
    static void swap(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }
}
