package ex_04_Operators_In_Java;

public class Lab_050_Unary_postfix_Decrement {
    /** Unary Postfix-decrement: It assigns the value to the variable first then the value is decreased.
     * Syntax: operand -- ; eg-> x--, y--, etc. */

    public static void main(String[] args) {
        int x = 10, y;
        y = x--;
        System.out.println(y);        // y = x-- = 10 assigned first, then x = x-1 = 9 stored in memory.
        System.out.println(x);        // x = 9;

    }
}
