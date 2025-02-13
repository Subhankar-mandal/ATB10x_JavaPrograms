package ex_08_Loop_Statements;
import java.util.Scanner;

public class Lab_106_Skipping_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the highest value of the range: ");
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
            else {
                continue;
            }
        }
    }
}
