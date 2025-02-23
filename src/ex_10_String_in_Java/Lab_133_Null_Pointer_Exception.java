package ex_10_String_in_Java;

public class Lab_133_Null_Pointer_Exception {
    public static void main(String[] args) {
        String s1 = "Computer";
        String s2 = null;
        String s3 = s1.concat(s2);  // Exception in thread "main" java.lang.NullPointerException
        //System.out.println(s3);
    }
}
