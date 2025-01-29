package ex_03_Java_Literal;

public class Lab_040_Mixed_Mode_Operation {
    /** Mixed Mode Operation: When we are performing concatenation opr^n,the values within brackets
     * are concatenated.It goes left to right.We should remember it when we are adding different
     * types of literal with the string all the literals are treated as string. */

    public static void main(String[] args) {

        int x = '0';           // The decimal/ASCII value of char '0' is 48 is stored in x.

        int y = '7';           // The decimal/ASCII value of char '7' is 55 is stored in y.

        System.out.println("Insight"+ x +y);

        /** as x & y is being added with the string,the value of x & y is treated as string.Concatenation
         *  can be only performed between string. */
    }
}
