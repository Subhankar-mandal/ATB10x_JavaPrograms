package ex_011_Various_String_method;

public class Lab_136_Substring_method_in_StringClass {
    /** Substring() method: In Java, Substring method of String class is used to return a substring from
     *                      the particular string. This method is most useful when we deal with text
     *                      manipulation, parsing, or data extraction.
     *  NOTE: 1.This method take either 1 parameter or 2 parameters i.e. index value for starting point and
     *          ending point as arguments.
     *        2.If the index value of end-point isn't given, the method will return substring up to the
     *          length of the string.But the staring index must be given.
     *        3.Reminder: Substring includes Starting index but excludes ending index.
     * */
    public static void main(String[] args) {
        String str1 = "I love Computer Science";
        String str2 = str1.substring(7);  // without end index it will go up to end.
        System.out.println(str2);

        int str2_length = str2.length();         // length of str2 = 16
        String str3 = str2.substring(0,str2_length-8); // 0 -> starting index, str2_length-8 -> ending index
        System.out.println("Substring of str2 : "+str3);

    }
}
