package ex_011_Various_String_method;

public class Lab_140_Diff_Type_Of_lastIndexOf_method {
    /** Different Type of lastIndexOf() method: There are four types of lastIndexOf method.One is discussed
     *                                          in the previous program.
     * 1. It returns the index of the last occurrence of the specified character.
     *   Syntax: lastIndexOf(char_value);
     * 2. It returns the index of the last occurrence of the specified character by backward searching,
     *    starting at the specified index.
     *   Syntax: lastIndexOf(char_value, index_value);
     * 3. It returns the index of the last occurrence of the specified substring.
     *   Syntax: lastIndexOf(substring_value);
     * 4. It returns the index of the last occurrence of the specified substring by backward searching,
     *    starting at the specified index.
     *   Syntax: lastIndexOf(Substring_value, index_value);          */
    public static void main(String[] args) {
        // Type-01
        String s1 = "Computer Science";
        System.out.println(s1.lastIndexOf('e'));   // index value of last occurrence is 15
        // Type-02
        String s2 = "so on and so forth";
        System.out.println(s2.lastIndexOf('n',15)); // searching backward by index
        // Type-03
        String s3 = "so on and so forth";
        System.out.println(s3.lastIndexOf("so"));
        // Type-04
        String s4 = "so on and so forth";
        System.out.println(s4.lastIndexOf("so", 15));

    }
}
