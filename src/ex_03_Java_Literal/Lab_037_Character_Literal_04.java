package ex_03_Java_Literal;

public class Lab_037_Character_Literal_04 {
    /** Escape sequence character: In Java, an escape sequence s a character combination that starts
     *      with a backslash(\) followed by character or combination of characters.These sequences
     *      are used to represent characters that are difficult to write directly within a string.
     *
     *  Common Escape sequences: \n -> Newline (inserts a new line), \t: tab (4 blank spaces),
     *                           \r -> Carriage return (moves the cursor to the beginning of the current line)
     *                           \b -> Backspace (moves the cursor one character back)
     *                           \'' & \"" -> Both escape sequences are used to represent single & double quote
     *                           within a string respectively.
     *                           \f -> Form feed (starts anew page)
     *                           \\ -> Backslash (used to represent a backslash within a string). */
    public static void main(String[] args) {
        char ch ='\n';
        String myName = "Subhankar";
        String subjectStream = "Computer Science";
        String homeTown = "Midnapore, West Bengal";
        System.out.printf("My name is %s. \nI completed my bachelor's degree in \" %s.\nI live in %s.)\b\rI luv CS",myName,subjectStream,homeTown);


    }
}
