package ex_04_Operators_In_Java;

public class Lab_049_Unary_prefix_Decrement {
    /** Unary Prefix-decrement: It decreases the value first then the value is assigned to the variable.
     * Syntax: -- operand; eg-> --x, --y etc. */

    public static void main(String[] args) {
        int x = 10, y;
        y = --x;
        System.out.println(y);           // --x -> x = x-1 = 9 decrement first, final value of x=9;

    }
}
