package ex_09_Functions_in_Java;
import java.util.Scanner;
public class Lab_119_UserDefined_function_and_itsType {
    /** Different types of User-defined function: Depending on the presence of returned_type and
     *                                            parameters user defined function can be classified
     *                                            into four type.
     *            1.Without Return Type and Without Parameters
     *            2.Without Return Type but With Parameters
     *            3.With Return Type and With Parameters
     *            4.With Return Type but Without Parameters      */

    public static void main(String[] args) {
        printMessage();       // calling type_01 function

        sum(12,23);     // function type_02 is called by passing argument or values to the parameters

        double sum = sumAndProduct(0.005,0.02);  // function returns sum And it is stored by variable
        System.out.println("The sum = "+sum);          // prints result

        String takingSms = printMessage_02("Hi,","How have you been");  // function type_03
        System.out.println(takingSms);

        int maxVal = maxValue();
        System.out.println("The big is "+maxVal);


    }
    //  1.Without Return Type and Without Parameters
    public static void printMessage (){
        System.out.println("It can only print result or message because it doesn't take input.");
    }

    //  2.Without Return Type but With Parameters     (90% time it will be used for automation.)
    public static void sum (int x, int y){
        int sum = x+y;
        int product = x*y;
        System.out.println("The sum of the two numbers = "+sum);
        System.out.println("The product of two numbers = "+product);

    }

    //  3.With Return Type and With Parameters
    public static double sumAndProduct (double x, double y){
        double addition = x+y;
        return addition;
    }
    public static String printMessage_02 (String name, String others){
        String message = name+ " " +others;
        return message;
    }

    //  4.With Return Type but Without Parameters
    public static int maxValue (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();

        int max = a > b ? a : b;
        return max;
    }
}

