package ex_09_Functions_in_Java;

import java.math.BigInteger;
import java.util.Scanner;

public class Lab_122_Assignment_03 {
    // Create a Function of Addition, Subtraction, Mul and Div
    // with parameter, a & b (take the parameter from the User)

    public static void main(String[] args) {
        //  --- Logic Building ---

        // Step 1 -> Inputs and Outputs
        //  a, b - int -> Scanner
        //  int -> variable result ->

        // Step 2 - Rough logic -> Create functions
        // function -> type 4th - with return and with arguments/ parameters

        // Step 3 - Write the code and Find and Fix  -> Edge Cases

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = -1;
        // prevention of edge cases
        if (sc.hasNextInt()){
            a = sc.nextInt();
        }
        else {
            System.out.println("Enter integer only!");
            System.exit(0);
        }
        // to avoid very long integer number  we can use BigInteger num
        // BigInteger b = sc.nextBigInteger();
        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();

        int sum = addition(a,b);
        int sub = subtraction(a,b);
        int mul = mul(a,b);
        int quo = div(a,b);
        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(quo);


    }
    public static int addition (int a, int b){
        return a+b;
    }
    public static int subtraction (int a, int b){
        return a-b;
    }
    public static int mul (int a, int b){
        return a*b;
    }
    public static int div (int a, int b){
        if (b == 0){
            System.out.println("Division by zero is not possible.");
            System.exit(0);
        }
        return a/b;
    }
}
