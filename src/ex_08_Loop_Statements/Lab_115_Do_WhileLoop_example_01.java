package ex_08_Loop_Statements;

public class Lab_115_Do_WhileLoop_example_01 {
    public static void main(String[] args) {
        int i = 10;
        do {
            System.out.println(i);
            if(i==1)
                break;
            i--;
        } while (i<=10);
    }
}
