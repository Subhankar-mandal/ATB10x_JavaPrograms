package ex_05_TypeCasting_in_Java;

public class Lab_068_Explicit_TypeCasting {
    /** Explicit Typecasting: Converting a higher data type into a lower one is called explicit typecasting.
     *                        It is also known as narrowing typecasting or casting up.
     *  Features: 1. It is done by the programmer manually.
     *            2. Explicit notation using parentheses is required for typecasting.
     *            3. There is risk of data loss due to truncation.
     *            4. Conversion from a large dta-type to a smaller data-type is allowed.
     *  Syntax: (data-type) variable_name. eg -> double d = 1223.5666; int i = (int) d;     */

    public static void main(String[] args) {
        double d = 1223.5666;
        int i = (int) d;
        System.out.println("double type data d converted into integer type i = "+i);
        short s = (short) i;
        System.out.println("integer type data is being stored in short type s = "+s);

    }
}
