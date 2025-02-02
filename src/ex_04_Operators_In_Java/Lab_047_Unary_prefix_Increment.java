package ex_04_Operators_In_Java;

public class Lab_047_Unary_prefix_Increment {
    /** Unary Prefix-increment: It increases the value first then the value is assigned to the variable.
     * Syntax: ++ operand; eg -> ++y, ++x, etc */

    public static void main(String[] args) {

        int a = 10, b;
        b = ++a;
        System.out.println(b);      // ++a -> a=a+1=11 -> then a = 11
    }
}
