package ex_011_Various_String_method;

public class Lab_137_String_IndexOf_method {
    /** IndexOf() method: In Java, the string indexOf() method is used to return the position i.e. index
     *                    value of the first occurrence of a specified character or string in a particular
     *                    string.
     *  NOTE: It returns the index value of the first occurrence of a specified character or string in a
     *        String but if there is no occurrence of that character or string then it returns -1.
     *        */
    public static void main(String[] args) {
        String s1 = "Subhankar";
        int i_val = s1.indexOf('a');
        System.out.println(i_val);

        String s2 = "I love computer Science";
        System.out.println(s2.indexOf('i'));     // occurrence of 1st i in index 18
        System.out.println(s2.indexOf('o'));     // occurrence of 1st o in index 3
        System.out.println(s2.indexOf('u'));     // occurrence of 1st u in index 11

    }
}
