package ex_08_Loop_Statements;

public class Lab_107_While_loop {
    /** While loop: It is an important entry controlled loop statement which is also used widely.
     * Syntax :    loop counter initialization ;
     *             while (condition ?) {
     *                 statement 1 ;
     *                 statement 2 ;
     *                 statement n ;
     *                 counter variable increment/decrement ;
     *             } */
    public static void main(String[] args) {
        int i = 1;
        while (i != 0){
            System.out.println(i);
            --i;
        }

    }
}
