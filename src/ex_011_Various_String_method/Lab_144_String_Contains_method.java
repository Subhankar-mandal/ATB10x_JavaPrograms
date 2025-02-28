package ex_011_Various_String_method;

public class Lab_144_String_Contains_method {
    /** Contains() method: In Java, the contains() method first checks a sequence of characters is present
     *                     or not in the given String and returns boolean value either true or false
     *                     according to the result.
     * Syntax: contains(String_name);
     * Parameter: It takes string as parameter.
     * Return type: boolean value either true or false.*/
    public static void main(String[] args) {
        String s1 = "Subhankar";
        boolean b = s1.contains("Subha");
        System.out.println(b);                   // true

        System.out.println(s1.contains("kar"));      // true
        System.out.println(s1.contains("sankar"));   // false
        System.out.println(s1.contains("a"));        // true
        System.out.println(s1.contains("Sum"));      // false
    }
}
