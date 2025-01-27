package ex_02_JavaBasics;

public class Lab_025_Constant_in_Java {
    /** Constant: In Java, a constant is an unchangeable value that remains fixed
     * throughout the execution of a program.Final keyword is used to declare a variable
     * as a constant.
     *  A variable of any data-type can be set as constant by using final keyword.
     *  Constants are typically declared in uppercase letters with underscore separating words.
     *  Declaration Syntax: final data_type variable_name = value;
     *  eg: final int MAX_VALUE, final double PI = 3.14159; */
    public static void main(String[] args) {
        final double PI = 3.141659;
        System.out.println(PI);
    }
}
