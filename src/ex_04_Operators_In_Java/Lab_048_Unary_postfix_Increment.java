package ex_04_Operators_In_Java;

public class Lab_048_Unary_postfix_Increment {
    /** Unary Postfix-increment: It assigns the value to the variable first then the value is increased
     *                           and stored in the memory.
     *  Syntax: operand ++; eg -> x++, y++, etc  */

    public static void main(String[] args) {

        int a = 10, b;
        b = a++;
        System.out.println(b);       // a++ -> a = 10, then a = a+1 = 11 and stored in memory
        System.out.println(a);       // a = 11;
    }
}
