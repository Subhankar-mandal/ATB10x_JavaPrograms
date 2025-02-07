package ex_06_Conditional_Statements_inJAva;

public class Lab_071_If_Statement {
    /** If statement: The if statement is the simplest conditional statement.It is used to decide whether
     *                a certain statement or block of statement will be executed or not depending on the
     *                result of the condition.If condition becomes true the statements under if block will
     *                be executed else will not be executed.
     *  Note: It is possible to have only one statement under if block then {} (curly braces)is not required.
     *        Only one statement is considered as if under if-statement then.After executing that statement
     *        the control flow will move to the next line.
     *  Syntax:   if (condition ?){
     *               statement 01;
     *               statement 02;
     *            }
     *            statement x;    */
    public static void main(String[] args) {
        int i = 10;
        i = --i;
        if (i<=10)                                   // condition
            System.out.println("The value of i is within either 0-9 or 10."); // statement 01
        i+=2;                                                                 // statement 02 after if
        System.out.println("The current value of i is = "+i);                 // statement 03  "     "
    }
}
