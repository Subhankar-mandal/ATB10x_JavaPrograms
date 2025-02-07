package ex_06_Conditional_Statements_inJAva;

import java.util.Scanner;

public class Lab_077_Grade_calculator_EdgeCases_HackerRank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks obtained by student: ");
        int marks = sc.nextInt();
        char grade = 'F';
        if (marks >=90 && marks <=100){
            grade = 'A';
        } else if (marks >=80 && marks <=89){
            grade = 'B';
        } else if (marks >=70 && marks <=79) {
            grade = 'C';
        } else if (marks >=60 && marks <=69) {
            grade = 'D';
        } else if (marks >=0 && marks <=59) {
            grade = 'F';
        }
        System.out.println(grade);

    }
}
