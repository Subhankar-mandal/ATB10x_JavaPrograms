package ex_03_Java_Literal;

public class Lab_032_Integral_Literal_02 {
    /** Integral literal: For integral data-type (byte, short, int, long), we can specify
     *                    literal in 4 ways.
     *  1. Decimal literal: In this form, the allowed digits are 0-9.
     *  2. Octal literal: In this form, the allowed digits are 0-7.This literal stared with the
     *                    prefix 0. eg-> 0123, 03457, etc.
     *  3. Hexadecimal literal: In this literal, the allowed digits are 0-9, and characters a-f
     *                          for 10-15.Both uppercase & lowercase letters are allowed.This literal
     *                          started with the prefix 0X or 0x. eg-> 0x045, 0Xa3d58, etc.
     *  4.Binary literal: In this form of literal 0 & 1 digit are allowed.This literal is prefixed
     *                    0b or 0B. eg-> 0b101, 0B10011, 0b0110 etc.*/

    public static void main(String[] args) {
        int octal_lit = 03457;                 // Octal literal.

        long hexadecimal_lit = 0xa347fcd;      // Hexadecimal literal.

        short binary_lit01 = 0B11001;          // Binary literal.

        byte binary_lit02 = 0X011;             // Hexadecimal literal.
        System.out.println(binary_lit02);



    }
}
