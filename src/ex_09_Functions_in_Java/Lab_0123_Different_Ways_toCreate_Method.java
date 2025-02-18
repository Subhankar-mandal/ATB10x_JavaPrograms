package ex_09_Functions_in_Java;

public class Lab_0123_Different_Ways_toCreate_Method {
    /** Different ways to create method in Java: There are basically two ways to create method in Java.
     *  1.Static Method: It can access the static data using class name. It is declared inside the class.
     *                   It doesn't use the instance of the class. So can be called without creating object.
     *    Accessed using class name -> A static method can be called using class name by dot operator(.).
     *
     *  2.Instance Method: It can access the instance of class using the object name.It must be declared
     *                     inside the class.      */

    public static void main(String[] args) {
        float result = avgOfNumbers(23,46,89);
        System.out.println("The average is = "+result);

    }
    static float avgOfNumbers(float a, float b, float c){     // static method
        float avg = (a+b+c)/3;
        return avg;
    }
}
