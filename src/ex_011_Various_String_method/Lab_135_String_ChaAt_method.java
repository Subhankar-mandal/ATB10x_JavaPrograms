package ex_011_Various_String_method;
import java.io.*;
public class Lab_135_String_ChaAt_method {
    /** String charAt() method: String charAt() method in Java returns the character at the specified index
     *                          in a string.The Index of the first character in a string is 0, the second
     *                          character is 1, and so on.The index value should lie between 0 and
     *                          length() – 1.
     *  NOTE: If the index value is greater than or equal to the string length or negative number it
     *        returns stringIndexOutOfBoundsException.
     *  */

    public static void main(String[] args) {
        String s1 = "Subhankar";
        char ch = s1.charAt(7);
        System.out.println(ch);

        String s2 = "Java is a versatile PL";
        char ch1;
        System.out.println(ch1 = s2.charAt(10));
        // trimming a part of a string
        String b = "";
        for(int i = 10; i<= s2.length()-1; i++){
            char ch2 = s2.charAt(i);
            String str = Character.toString(ch2);
            b = b.concat(str);
        }
        System.out.println(b);

    }
}
