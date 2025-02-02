package ex_04_Operators_In_Java;

public class Lab_046_Unary_Operator {
    /** Unary Operator: An operator is called unary operator if it is operated with only one operand.
     * Types of Unary operator: 1. Unary minus (-) : It is used to indicate negative value.
     *                          2. Increment by 1 (++): It is used to increment the value of a variable by 1.
     *                          3. Decrement by 1 (--): It is used to decrement the value of a variable by 1.
     *                          4. Not or invert of a boolean value (!): It inverts a boolean value. */

    public static void main(String[] args) {
        int a = 10;
        a = - 10;
        System.out.println(a);
        System.out.println(a++);
        System.out.println(a--);
        System.out.println(a);

    }
}
