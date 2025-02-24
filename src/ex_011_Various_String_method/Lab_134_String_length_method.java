package ex_011_Various_String_method;

public class Lab_134_String_length_method {
    /** String length() method: String length() method in Java returns the length of the string i.e.
     *                          the number of characters present in the string.In this article, we will
     *                          see how to find the length of a string using the String length() method.
     *                          This method provides integer value.                    */

    public static void main(String[] args) {
        String s1 = "Subhankar";
        int s1_length = s1.length();
        System.out.println(s1_length);    // returns integer value 9 as literal contains 9 characters

        String s2 = "Computer Science";
        System.out.println(s2.length());    // returns length = 16 as length includes the space

        String s3 = "";
        int s3_length = s3.length();
        System.out.println(s3_length);   // String s3 is without having any character, so length = 0

        if (s1_length == s3_length){
            System.out.println("The length of s1 = length of s3");
        }
        else{
            System.out.println("The length of s1 != length of s3");
        }
    }
}
