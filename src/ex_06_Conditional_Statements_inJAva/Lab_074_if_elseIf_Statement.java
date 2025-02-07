package ex_06_Conditional_Statements_inJAva;

public class Lab_074_if_elseIf_Statement {
    /** If-else-if statement or else-if ladder: When the else part of an if-else statement contain another
     *                                          if statement sequentially such as there exist multiple condition
     *                                          and within those conditions if one condition becomes true then
     *                                          the body of that if-block will execute otherwise the else-block
     *                                          of the main if-else statement will execute.
     *   Syntax:                                        */

    public static void main(String[] args) {
        int a = 15;
        if (a>15){
            System.out.println("The value of a is greater than 15.");
        } else if (a<0){
            System.out.println("The value of a is lesser than 0.");
        } else if (a<15) {
            System.out.println("The value of a is lesser than 15. ");
        }
        else {
            System.out.println("The value of a is equal to 15.");
        }

    }
}
