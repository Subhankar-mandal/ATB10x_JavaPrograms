package ex_09_Functions_in_Java;
import java.util.Scanner;
public class Lab_117_Definition_of_Function {
    /** Function: Function in programming language is a block of code that performs a specific task, and
     *            it can be used by calling multiple times whenever it is required.All functions in Java must
     *            belong to a class.Functions in Java are commonly known as methods.
     *  Syntax:  <access_modifier> <return_type> <function_name> (List of parameters/arguments){
     *
     *                     body of function;
     *           }
     *  1. Access modifier: It specifies the access level (e.g. public, private, protected or default).
     *  2. Returned type: It defines the data-type of the value that is returned by the function.
     *                    It may be any one of the primitive or non-primitive data-type.
     *  3. Function name: It follows Java naming conventions; it should start with a lowercase verb and
     *                    use camel case for multiple words.
     *  4. Parameters: A list of input values (optional). Empty parentheses are used if no parameters
     *                 are needed.
     *  5. Body of function: It contains the code to be executed (optional in the case of abstract methods).*/

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value of a: ");
//        int a = sc.nextInt();
//        System.out.println("Enter the value of b: ");
//        int b = sc.nextInt();
       int result = maxBetweenTwo(23,45);
        System.out.println("The bigger number is = "+result);

    }
    public static int maxBetweenTwo(int x, int y){

        int result = x > y ? x : y;
        return result;
    }
}
