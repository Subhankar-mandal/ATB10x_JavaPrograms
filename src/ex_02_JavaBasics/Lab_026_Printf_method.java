package ex_02_JavaBasics;

public class Lab_026_Printf_method {
    /** Printf() method: In Java printf method is used to get formatted outputs in the console.
     * It provides more control over the appearance of the output compared to simpler println.
     *  Syntax: System.out.printf(format_string, arg1, arg2, ...)
     *    format_string: A string that specifies the format for the output.
     *                   It contains placeholders (format specifiers) that are replaced
     *                   with the values of the arguments.
     *   arg1, arg2,...: The arguments to be formatted and inserted into the o/p.
     *   format Specifiers: %d-> integer, %f-> floating-point number, %s-> string, %c-> character,
     *                      %b-> boolean, %x-> hexadecimal integer, %o-> octal integer,
     *                      %% -> literal %sign.*/
    public static void main(String[] args) {
        String name = "Subhankar";
        int age = 29;
        float salary = 34529.68f;
        System.out.printf("The employee whose name is %s, age = %d and his salary = %f ", name,age,salary);

        //"The employee whose name is %s, age = %d and his salary = %f " -> format string
        // %s, %d, %f -> format specifier also called as placeholders.
        // name, age, salary -> arguments those are to be formatted and placed as output.
    }
}
