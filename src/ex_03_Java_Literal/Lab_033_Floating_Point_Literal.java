package ex_03_Java_Literal;

public class Lab_033_Floating_Point_Literal {
    /** Floating-point literal: For floating-point data-type we can specify literals only in
     *                          decimal form (0-9 digits).Use of octal and hexadecimal form
     *                          is not allowed for this literal.
     *  Syntax for literal: format specifier-> %.<precision> f this specifies the number of digits after
     *                      decimal point.
     *  Using printf() method: eg-> System.out.printf("%.3f",number);
     *  Using String.format() -> format string-> "%.<precision> f" : Similar to the printf format specifier.
     *                          eg-> String formattedNumber = String.format(%.3f",number) */

    public static void main(String[] args) {
        float PI = 3.14f;

        double d = 22.0/7.0;               // floating-point literal
        System.out.printf("%.3f",d);

    }
}
