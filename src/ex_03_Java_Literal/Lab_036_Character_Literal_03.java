package ex_03_Java_Literal;

public class Lab_036_Character_Literal_03 {
    /** Unicode representation: We can specify char literals in Unicode representation by the
     *                          Syntax: '\UXXXX', '\UXXXX' represents hexadecimal numbers.u should
     *                          be lowercase always.
     *                          eg-> '\u0061' represents 'a'
     *                                '\u0041' represents 'A'.  */

    public static void main(String[] args) {
        char ch = '\u0061';
        char ch1 = '\u0041';
        System.out.println(ch);
        System.out.println(ch1);
    }
}
