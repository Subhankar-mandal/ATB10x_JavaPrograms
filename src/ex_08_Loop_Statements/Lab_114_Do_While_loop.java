package ex_08_Loop_Statements;

public class Lab_114_Do_While_loop {
    /** Do-while Loop: It is an exit control loop statement which is used to execute code block once
     *                 before checking condition.
     * Syntax:        Loop counter initialization;
     *                do {
     *                    statement 1;
     *                    statement 2;
     *                    statement n;
     *                    loop counter increment/decrement;
     *                }
     *                while (condition ?) ;                     */

    public static void main(String[] args) {
        int i = 1;                      // counter variable is initialized
        do {
            System.out.println(i);      // statement to print
            i++;                        // loop counter increment
        } while (i<=1) ;                // condition evaluates to false
    }
}
