package ex_07_Switch_Statement_VsExpressions_inJava;

public class Lab_092_Assignment_01_without_Scanner {
    // We will take input as argument and will put argument in the argument section.
    // To put argument we will edit configuration.

    public static void main(String[] args) {
        String name = args[0]+" "+args[1];

        int age = Integer.parseInt(args[2]);

        double salary = Double.parseDouble(args[3]);

        System.out.println("---- User information ----");
        System.out.println("The user name ->  "+name);
        System.out.println("Age -> "+age);
        System.out.println("Salary -> "+salary);

    }
}
