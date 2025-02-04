package ex_05_TypeCasting_in_Java;

public class Lab_067_Implicit_TypeCasting {
    /** Implicit Typecasting: Converting a lower data-type into a higher one is called implicit typecasting.
     *                        It is also known as widening typecasting because data is assigned into bigger
     *                        data-type.
     *    Features: 1. It is done by the compiler automatically.
     *              2. It is safe because there is no risk of data loss.
     *              3. No explicit notation is required.
     *              4. Conversion from a smaller data-type to any larger data-type is allowed. */

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
