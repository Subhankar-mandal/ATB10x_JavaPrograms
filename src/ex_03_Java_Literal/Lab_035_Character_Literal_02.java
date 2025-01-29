package ex_03_Java_Literal;

public class Lab_035_Character_Literal_02 {
    /** Char literal as Integral literal:
     *     We can specify char literal as integral literal,which represents the Unicode value
     *     of the character. The integral literal can be of 3 forms decimal, octal and
     *     hexadecimal.But the allowed range is 0 - 65535.
     *      */
    public static void main(String[] args) {

        char ch = 062;             // This is integral representation of char literal in octal form.
        System.out.println(ch);    // this converts octal-> 062 in decimal (50), char value of 50 is 2.

        char ch1 = 0x39;           //    char literal in hexadecimal form
        System.out.println(ch1);   // This converts hex-> 0x39 in decimal(57), char value is 9
    }
}
