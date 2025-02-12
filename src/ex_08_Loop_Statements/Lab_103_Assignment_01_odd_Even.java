package ex_08_Loop_Statements;
import java.util.Scanner;

public class Lab_103_Assignment_01_odd_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the final number of the range: ");
        int number = sc.nextInt();

        for (int i=0; i<=number; i++){
            if (i%2==0){
                System.out.println(i+" is even");
            }
            else {
                System.out.println(i+" is odd");
            }

        }




    }
}
