package ex_01_JavaBasics;

public class Lab_010_Println_Vs_print {
    /* Println Vs. Print:
    *  Println() -> This method print O/p followed by a new line character (\n).
    *               This moves the cursor to the beginning of the next line that is newline.
    *  Print() -> This method print O/p but don't follow a new line character.
    *             This remains the cursor at the end of the O/P that means subsequent O/p
    *             will appear on the same line.
    * */
    public static void main(String[] args) {
        System.out.print("I'm Subhankar Mandal.");
        System.out.print("I love CS.");
        System.out.println();
        System.out.println("I've introduced myself already.");
        System.out.print("I like Java programming.");
    }
}
