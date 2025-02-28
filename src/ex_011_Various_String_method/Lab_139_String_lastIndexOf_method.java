package ex_011_Various_String_method;

public class Lab_139_String_lastIndexOf_method {
    /** lastIndexOf() method: The String lastIndexOf() method returns the index value of the last occurrence
     *                        of a given character or substring in a String.The searching start from index 0,
     *                        and if the given substring is not found it returns -1.
     * */
    public static void main(String[] args) {
        String s1 = "google";
        int lastIndexVal = s1.lastIndexOf('g');
        System.out.println(lastIndexVal);

    }
}
