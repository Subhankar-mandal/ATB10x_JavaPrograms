package ex_08_Loop_Statements;

public class Lab_102_For_loop_example_08 {
    public static void main(String[] args) {
        String str = "A";

        for (; str == "A"; str = str+" " ){
            System.out.println(str);
        }
        System.out.println("String is not matched");
    }
}
