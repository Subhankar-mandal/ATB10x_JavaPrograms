package ex_05_TypeCasting_in_Java;

public class Lab_066_TypeCasting_and_its_type {
    /** Type Casting: Typecasting in Java is the process that provides developers a facility to
     *                convert data from one type to another type.It is essential for handling data in
     *                various situations, especially when dealing with different types of variable,expressions.
     * Types of Typecasting: 1.Implicit typecasting (or Widening conversion)
     *                       2.Explicit typecasting (or Narrowing conversion)*/
    public static void main(String[] args) {

        byte b = 127 ;
        short s = 12334 ;
        int i = 825028760 ;
        s = b;
        i = s;
        System.out.println("Short s = "+b);        // byte type data b is able to store in short data-type.

        System.out.println("Int i = "+s);          // short type data s is able to store in int data-type.
    }
}
