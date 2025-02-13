package ex_08_Loop_Statements;

public class Lab_109_While_loop_example_02 {
    public static void main(String[] args) {
        int i = 10;
        while (i >= 1){
            int j = ++i;
            i = --j;
            System.out.println(i+j);
            i--;
        }

    }
}
