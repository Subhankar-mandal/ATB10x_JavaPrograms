package ex_04_Operators_In_Java;

public class Lab_042_Arithmetic_Operator {
    /** Arithmetic operator: The operator that can perform arithmetic operation between the operands
     *                       is known as arithmetic operator.There are several type of arithmetic operators
     *                       in Java.
     * Examples: '+' -> addition, '-' -> subtraction, '*' -> multiplication, '/' -> division
     *          and '%' -> modulo division (for getting remainder of division ) */

    public static void main(String[] args) {
        int a = 30, b = 10, c, x, y, z, rem;
        c = a+b;                     // addition
        x = a-b;                     // subtraction
        y = a*b;                     // multiplication
        z = a/b;                     // division
        rem = a%b;                   // modulo
        System.out.println(c);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(rem);

    }
}
