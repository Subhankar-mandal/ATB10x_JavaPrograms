package ex_07_Switch_Statement_VsExpressions_inJava;
import java.util.Scanner;

public class Lab_085_Interview_Question_01 {
    // Web Automation
    // ask user which browser he wants to run the code.
    // Chrome -> execute the code in chrome
    // MS-Edge -> execute the code in edge
    // Firefox -> execute the code in firefox

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser");
        String browser = sc.next();

        switch (browser){
            case "chrome":
                System.out.println("Starting the Chrome...");
                System.out.println(".....");
                break;
            case "edge":
                System.out.println("Starting the Edge...");
                break;
            case "firefox":
                System.out.println("Starting the Firefox...");
                break;
            default :
                System.out.println("No idea which browser it is.");
        }


    }
}
