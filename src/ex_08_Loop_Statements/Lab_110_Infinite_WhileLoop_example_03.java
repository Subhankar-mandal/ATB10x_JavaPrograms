package ex_08_Loop_Statements;

public class Lab_110_Infinite_WhileLoop_example_03 {
    /** Infinite Loop: When the entry point that is condition of a loop statement evaluates to true always,
     *                 loop never terminates.Then loop is executed infinite number of times.This is called
     *                 infinite loop.    */

    public static void main(String[] args) {
        int i = 10;
        while (i>1){
            System.out.println(i);
            i++;
        }
    }
}
