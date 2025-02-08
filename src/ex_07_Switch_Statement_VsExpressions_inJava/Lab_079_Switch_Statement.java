package ex_07_Switch_Statement_VsExpressions_inJava;

public class Lab_079_Switch_Statement {
    /** Switch Statement: Switch statement in Java is a multi-way branch statement that provides an
     *                    efficient way to transfer the control flow of execution to the different
     *                    part of the program based on the value of an expression.It's often used
     *                    as an alternative to a long chain if-else-if statement when it is needed
     *                    to check multiple conditions on same variable.
     * Syntax: Switch (expression){
     *             case value 1: code to execute if expression == value 1;
     *             break;
     *             case value 2: code to execute if expression == value 2;
     *             break;
     *             ... case value n;
     *             break;
     *             default: code to execute if no case matches;
     *         }                                                                    */

    public static void main(String[] args) {
        int day = 7;
        String dayname ;
        switch (day){
            case 1:
                dayname = "Day 1 = Monday";
                break;
            case 2:
                dayname = "Day 2 = Tuesday";
                break;
            case 3:
                dayname = "Day 3 = Wednesday";
                break;
            case 4:
                dayname = "Day 4 = Thursday";
                break;
            case 5:
                dayname = "Day 5 = Friday";
                break;
            case 6:
                dayname = "Day 6 = Saturday";
                break;
            case 7:
                dayname = "Day 7 = Sunday";
                break;
            default:
                dayname = "Oops! It is not a valid weekday.";

        }
        System.out.println(dayname);

    }
}
