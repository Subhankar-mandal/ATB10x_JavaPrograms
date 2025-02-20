package ex_10_String_in_Java;

public class Lab_127_Type_of_String_declaration {
    /** String declaration: There are two ways to declare a string in Java.
     *   1. By String literal: e.g. String name = "Subh";
     *   2. Using new keyword (i.e. making object of String class):
     *        e.g. String name = new String();                     */

    public static void main(String[] args) {
        String name = "Subhankar";      // by String literal

        String name1 = new String("Subha");   // Using new keyword

        System.out.println(name);
        System.out.println(name1);


    }
}
