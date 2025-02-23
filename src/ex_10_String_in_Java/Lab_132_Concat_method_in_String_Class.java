package ex_10_String_in_Java;

public class Lab_132_Concat_method_in_String_Class {
    /** Concat() Method: The string concat() method concatenates (appends) a string to the end of another
     *                   string.It returns the combined string.It is used for string concatenation in Java.
     *                   It returns NullPointerException if any one of the strings is Null.
     *  Syntax: public String concat(String str);
     *  Parameters: A string to be concatenated at the end of the other string.
     *  Return Value: Concatenated(combined) string.
     *  Exception: NullPointerException: When either of the string is Null.
     * */
    public static void main(String[] args) {
        String str1 = "Computer";
        String str2 = " Science.";

        String str3 = str1.concat(str2);
        System.out.println(str3);
        String str4 = new String("I Love ");        // in Heap

        str4 = str4.concat(str3);
        System.out.println(str4);

    }
}
