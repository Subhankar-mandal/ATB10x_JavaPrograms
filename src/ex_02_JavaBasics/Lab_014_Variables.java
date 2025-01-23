package ex_02_JavaBasics;

public class Lab_014_Variables {
    public static void main(String[] args) {
        /**Variable: It may be defined as an identifier that is used to store
         *            the value of any data depending on its type within memory
         *            and those values can be changed at any instant of time within
         *            the program.
         *
         *  Declaration Syntax: data_type variable_name = value;          */

        boolean isEnergetic = true;             //Variable isEnergetic -> boolean type
        byte b = 127;                           //Variable    b        -> byte type
        short s = 1234;                         //Var         s        -> short type
        int i = 123456;                         //Var         i        -> integer type
        long mbNumber = 8250287607L;            //Var       mbNumber   -> long type
        char c = 'a';                           //Var         c        -> character type
        float f = 99.99f;                       //Var         f        -> floating-point type
        double d = 96.8999999d;                 //Var         d        -> double type
        System.out.println(mbNumber);
    }
}
