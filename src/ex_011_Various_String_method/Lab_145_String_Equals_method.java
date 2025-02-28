package ex_011_Various_String_method;

public class Lab_145_String_Equals_method {
    /** String equals() method: In Java, the equals() method in String checks the equality between two
     *                          string and returns boolean value either true or false.This method is
     *                          case-sensitive means it also checks the case type of the string.
     * Syntax: equals(Sting_name);
     * Parameter: It takes String as parameter.
     * Return type: boolean value either true or false.                 */

    public static void main(String[] args) {
        String s1 = "I Love CS";
        String s2 ="I Love CS ";
        boolean result = s1.equals(s2);
        System.out.println(result);        // false

        String s3 = "I love SM";
        System.out.println(s2.equals(s3));   // false
        String s4 = "I love SM";
        System.out.println(s3.equals(s4));    // true
        String s5 = "I Love cs";
        System.out.println(s5.equals(s1));    // false
    }
}
