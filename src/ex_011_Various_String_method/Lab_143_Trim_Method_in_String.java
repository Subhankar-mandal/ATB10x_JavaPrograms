package ex_011_Various_String_method;

public class Lab_143_Trim_Method_in_String {
    /** Trim() method in String: In Java, the trim() method of the string class is used to remove the leading
     *                           and trailing white spaces in a given string.It can't remove white space
     *                           from the middle of the string.The original string remain unchanged after
     *                           trimming because it only deals with white space.The uni-code value of a
     *                           white space is "\u0020".
     * Syntax: trim();
     * Parameter: The trim() method accepts no parameters.
     * Return Type: It returns a new string with leading and trailing whitespace removed. If no whitespace
     *              exists, it returns the original string unchanged.                 */

    public static void main(String[] args) {
        String s1 = " I love CS ";
        String s2 = s1.trim();          // trimming done
        System.out.println("The original String :'"+s1 + "'");   // original string
        System.out.println("The trimmed String :'"+s2 + "'");    // after trimming
        // comparing string length before and after trimming
        String s3 = " I";
        String s4 = " love";
        String s5 = " CS";
        System.out.println("length before trimming: "+s3.length()+", "+s4.length()+", "+s5.length());
        s3 = s3.trim();
        s4 = s4.trim();
        s5 = s5.trim();

        System.out.println("length after trimming: "+s3.length()+", "+s4.length()+", "+s5.length());

    }
}
