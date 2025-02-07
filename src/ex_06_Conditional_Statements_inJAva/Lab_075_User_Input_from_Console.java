package ex_06_Conditional_Statements_inJAva;
import java.util.Scanner;
public class Lab_075_User_Input_from_Console {
    /** scanner class: The most common way to take user input in Java is using Scanner class which is
     *                 the part of java.util package.The scanner class can read input from different
     *                 sources like console, files and streams.This class was introduced in Java ver.5.
     * Steps to follow the user input:1. Import the Scanner class by using import java.util.Scanner;
     *                                2.Create object of Scanner class and connect system with scanner
     *                                  by passing argument System.in as
     *                                   Scanner sc = new Scanner(System.in);*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter the value of a: ");
        a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        b = sc.nextInt();
        c = a+b;
        System.out.println("The result = "+ c);
    }
}
