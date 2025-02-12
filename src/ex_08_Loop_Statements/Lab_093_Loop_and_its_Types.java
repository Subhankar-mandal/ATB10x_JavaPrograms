package ex_08_Loop_Statements;

public class Lab_093_Loop_and_its_Types {
    /** Loop Statement: In programming languages looping is a feature that facilitates on the execution
     *                  of a set of instruction/ a code block repeatedly while some condition evaluates
     *                  to true.In JAVA there are four types of loop statement - while, do-while, for
     *                  and for-each loop.
     * Types of Loop Statement: Depending on the time of condition checking Loop statement is classified into
     *                          two types. 1. Entry-controlled Loop statement.
     *                                       ex- for loop, while loop
     *                                     2. Exit-controlled Loop statement.
     *                                       ex- do-while loop
     *  Part of Loop Statement: A Loop statement must contain 3 statements.
     *                          1. Counter variable : It is used to count the number of iteration.To count the
     *                                                iteration the variable must be initialized first by a value.
     *                          2. Condition: It allows the control flow to enter into the body of the loop.
     *                                        if condition becomes true then statement under the body of the loop
     *                                        is executed.
     *                          3. Increment/decrement of Counter: It is important statement for a Loop.To update
     *                                                             the counter variable is important because it
     *                                                             determines termination of loop statement.*/
    public static void main(String[] args) {
        int i = 0;                     // Loop
        while (i<=5){
            System.out.println(i);
            i++;
        }

    }
}
