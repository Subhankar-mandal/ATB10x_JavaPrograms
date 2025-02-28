package ex_011_Various_String_method;

public class Lab_146_String_EqualsIgnoreCase_method {
    /** equalsIgnoreCase() method: In Java, the string equalsIgnoreCase() method checks the equality between
     *                             two string irrespective of case type, whether it is uppercase or lowercase.
     * Syntax: equalsIgnoreCase(String_name) ;
     * Parameter: It takes String as parameter.
     * Return type: Boolean value either true or false.                   */
    public static void main(String[] args) {
        String s1 = "SUBHANKAR";
        String s2 = "Subhankar";
        System.out.println(s1.equalsIgnoreCase(s2));      // true

        String s3 = " Subhankar";
        System.out.println(s2.equalsIgnoreCase(s3));      // case is ignored but value unmatched

        String s4 = " SUBHANKAR";
        System.out.println(s4.equalsIgnoreCase(s3));      // true
    }
}
