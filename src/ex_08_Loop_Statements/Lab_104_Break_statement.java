package ex_08_Loop_Statements;

public class Lab_104_Break_statement {
    /** Break Statement: The Break statement in programming language is a control flow statement which is used
     *                   to terminate loops and switch cases.When a break statement is encountered,loops
     *                   iteration stops there and control flow is transferred to the statement immediately
     *                   following the enclosing loops or switch.
     *  Syntax: break; */
    public static void main(String[] args) {
        int i = 1;
        for ( ; i<=10; ++i){

            if (i==5){                                   // i==5 true ,break
                System.out.println("As soon as i became 5 the control moved out of the loop.");
                break;
            }
            System.out.println("The value of i will be printed until break is encountered. " +i); // i = 1,2,3,4
        }

    }
}
