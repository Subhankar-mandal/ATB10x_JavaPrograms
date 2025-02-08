package ex_07_Switch_Statement_VsExpressions_inJava;
import java.util.Scanner;

public class Lab_82_SwitchExpression_with_multipleValues {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Day: ");
        String day = sc.nextLine();

        String dayType = switch(day){                        // assigning switch statement to a variable
            case "Monday","Tuesday","Wednesday","Thursday","Friday" -> "Weekday";

            case "Saturday","Sunday" -> "Weekend";      // Case with multiple values
            default -> "Invalid Day";
        };
        System.out.println("This is "+ dayType);

    }
}
