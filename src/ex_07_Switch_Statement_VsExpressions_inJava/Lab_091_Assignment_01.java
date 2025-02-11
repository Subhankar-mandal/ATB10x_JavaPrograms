package ex_07_Switch_Statement_VsExpressions_inJava;
import java.util.Scanner;

public class Lab_091_Assignment_01 {
    //Please do this assignment program for us
    //CLI Options
    //
    //Take a user input - Name, Age and Salary and print them in the end.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = sc.nextLine();                   // To take user input from console

        System.out.println("Enter the age: ");
        int age = sc.nextInt();

        System.out.println("Enter the salary: ");
        double salary = sc.nextDouble();

        System.out.println("---- User information ----");
        System.out.println("The user name ->  "+name);
        System.out.println("Age -> "+age);
        System.out.println("Salary -> "+salary);
        sc.close();
    }
}
