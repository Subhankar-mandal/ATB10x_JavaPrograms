package ex_09_Functions_in_Java;

public class Lab_118_Type_of_Function {
    /** Types of function: There are two type of function.They are discussed below.
     * 1. Built-in function: Built-in functions in Java are the function which are already defined in the
     *                       class libraries.This is also known as standard library method or Predefined
     *                       methods in Java.
     *                       e.g. Math.PI() (returns pi value); Math.max() (returns big between two); etc.
     * 2. User-defined function: It is another type of function which is defined by the programmer depending
     *                           on the requirement of the program.
     *                           e.g. int maxBetweenTwo(); greet(); etc.                       */

    public static void main(String[] args) {
        float max = Math.max(0.001f,0.01f);               // predefined method
        System.out.println("Big value = "+max);

        int big = maxBetweenTwo(34,23);             // function is being called by passing value
        System.out.println("Biggest number = "+ big);

    }
    public static int maxBetweenTwo(int a, int b){           // User-defined function
        int result = a > b? a : b;
        return result;
    }
}
