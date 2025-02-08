package ex_07_Switch_Statement_VsExpressions_inJava;

public class Lab_80_Switch_Statement_with_groupedCase {
    /** Switch Expression: It may be a variable or literal.The expression is evaluated first, and it
     *                     must result in a value of one of following data type.
     * Expression result type: byte, short, int, char, enum, String (Since JAVA 7) and wrapper classes for
     *                         all these data-type.
     * Case matching: The value of exp^n is compared with the value of each case until it matches.
     *                At th point it matches then the code under that case value is executed.If it doesn't
     *                match then the default block is executed.
     * Break statement: The break statement is crucial.it terminates the switch statement once a match is
     *                  found and the corresponding code is executed.Without break, execution "falls through"
     *                  to the next case,Which is not needed.
     * Default case: It is optional.It provides a block of statement to execute if none of the case value
     *               match the expression's value.        */

    public static void main(String[] args) {
        int number = 4;

        switch (number) {
            case 1:
            case 2:
            case 3:
                System.out.println("Number is between 1 and 3.");
                break;
            case 4:
            case 5:
                System.out.println("Number is 4 or 5.");
                break;
            default:
                System.out.println("Number is greater than 5.");
        }
        System.out.println("good");
    }
}
