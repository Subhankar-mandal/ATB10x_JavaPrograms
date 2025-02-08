package ex_07_Switch_Statement_VsExpressions_inJava;

public class Lab_81_Switch_Expressions {
    /** Switch Expressions: This feature was introduced in JAVA 14+.It is more concise and powerful way
     *                      to use the switch construct.It allows the programmer to return a value
     *                      directly from the switch, making it more useful for expressions and functional
     *                      programming contexts.
     * Note: 1. Returns a value -> Unlike switch statements, which primarily execute a block of codes but switch
     *                             expression returns a value.This allows to assign the result of the switch
     *                             to a variable or use it directly in other expressions.
     *       2. Arrow Syntax for cases -> Switch expressions use the arrow (->) operator for defining cases,
     *                                    which makes the code cleaner and less prone to fallthrough errors.
     *                                    That's why each case is independent, and don't need to break statement.
     *       3. Handles multiple values per case -> We can specify multiple values for a single case using comma.
     *       4. Yield keyword (for complex cases) -> If a case requires more complex logic(multiple statements),
     *                                               we can use the yield keyword to return a value from that
     *                                               case block.This is necessary because the arrow syntax is used
     *                                               for single statement.           */
    public static void main(String[] args) {
        int day = 5;
        String dayName = switch (day) {
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            case 7 -> "Saturday";
            default -> "Invalid day";
        };
        System.out.println("The day is "+ dayName);
    }
}
