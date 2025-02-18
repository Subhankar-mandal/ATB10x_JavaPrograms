package ex_09_Functions_in_Java;
import java.util.Scanner;
public class Lab_120_Assignment_01 {
    /** Function of Type-04: 4.With Return Type but Without Parameters
     *                     */
    public static void main(String[] args) {
        double area = areaOfTriangle();
        System.out.println("The area of triangle = "+area+"cm^2.");

    }
    public static double areaOfTriangle (){
        int base = 15;
        float height = 10.8f ;
        double area = (base*height)/2;
        return area;
    }
}
