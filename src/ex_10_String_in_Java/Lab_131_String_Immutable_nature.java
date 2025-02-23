package ex_10_String_in_Java;

public class Lab_131_String_Immutable_nature {
    /** Immutability of String: An immutable object is an object whose state cannot be modified after it
     *                          is created. In Java, this concept applies to strings, which means that
     *                          once a string object is created, its content cannot be changed. If we try
     *                          to change a string, a new string object is created instead.*/
    public static void main(String[] args) {

        String str1 = "Subhankar";
        System.out.println("Str1 is pointing the object "+str1);

        System.out.println(str1.concat(" Mandal"));  // object has been modified but not pointed
        System.out.println(str1);                        // Still str1 is pointing same object
        String str2 = str1.concat(" Mandal");    // new ref. variable str2 is pointing modified object
        System.out.println( "Str2 is pointing the modified object "+str2);

        System.out.println("After modification ref. variable Str1 is pointing the same object "+str1);

    }
}
