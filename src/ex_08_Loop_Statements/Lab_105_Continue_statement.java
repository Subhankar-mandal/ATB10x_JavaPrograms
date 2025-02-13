package ex_08_Loop_Statements;

public class Lab_105_Continue_statement {
    /** Continue Statement: The continue statement in Java is a control flow statement that is used to skip
     *                      a particular iteration or the rest of the current iteration of a loop and to be
     *                      continued for the next iteration.It can be used in for, while and do-while loop.
     *  Syntax: continue;                        */

    public static void main(String[] args) {
        int i = 1;

        for (i = 1; i <= 10; i++){
            if (i==5){
                System.out.println("i is vanished!");
                continue;
            }
            else{
                System.out.println(i);
            }

        }
    }
}
