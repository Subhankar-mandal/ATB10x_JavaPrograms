package ex_03_Java_Literal;

public class Lab_038_String_Literal {
    /** String literal: Any sequence of characters within double quotes is treated at String literals.
     *  Strings in Java are immutable,that means their values can't be changed after they are created. */

    public static void main(String[] args) {
       String name = "I'm Subhankar Mandal";
       String description = " "+ "My father's name is Ashutosh Mandal.";    // " " string for space.
        System.out.println(name+"."+description);                           //+ is for concatenation.

    }
}
