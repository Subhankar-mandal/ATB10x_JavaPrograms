package ex_04_Operators_In_Java;

public class Lab_044_Logical_Operator {
    /** Logical Operator: It is a binary operator which performs Logical AND (&&), Logical OR (||) and
     *                    Logical NOT (!) operation on two operands and provides boolean value true or
     *                    false according to the one of the following logical operation.
     *  Examples: */
    public static void main(String[] args) {
        int x = 30, y = 40;
        boolean a, b, c;
        a = x>y && x<y;                   // x>y-> false (0), x<y-> true (1) ; 0 && 1 -> false
        b = x>y || x<y;                   // x>y-> false (0), x<y-> true (1) ; 0 || 1 -> true
        c = !a;                           // a = false, !a = !false = true.

        System.out.println("The result of logical AND operation = "+a);

        System.out.println("The result of logical OR operation = "+b);
        System.out.println("The result of logical NOT operation = "+c);

    }
}
