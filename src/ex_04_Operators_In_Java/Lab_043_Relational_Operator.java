package ex_04_Operators_In_Java;

public class Lab_043_Relational_Operator {
    /** Relational operator: It is a binary operator which is operated on two operands and provides
     *                       a relational value or boolean value true if the relation is satisfied
     *                       and false when relation doesn't satisfy.These operators are mostly used
     *                       in loop statements as well as if-else statements.
     *  Types of Relational operator: '==' -> Equality (Equal to), '!=' -> Not equal to
     *                                '<' -> Lesser than, '>' -> Greater than
     *                                '<=' -> either Lesser than or equal to, '>=' -> either Greater than or equal to */
    public static void main(String[] args) {
        int a = 30, b = 60;

        System.out.println(a>b);               // false

        System.out.println(a<b);               // true

        System.out.println(a>=b);              // false

        System.out.println(a<=b);              // true

        System.out.println(a==b);              // false

        System.out.println(a!=b);              // true
    }
}
