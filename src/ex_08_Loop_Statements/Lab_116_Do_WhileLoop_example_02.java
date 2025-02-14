package ex_08_Loop_Statements;

public class Lab_116_Do_WhileLoop_example_02 {
    public static void main(String[] args) {
        int i = 10;
        do {
            int j = i;
            System.out.println(i+j);
            i--;
        } while (i>=1);
    }
}
