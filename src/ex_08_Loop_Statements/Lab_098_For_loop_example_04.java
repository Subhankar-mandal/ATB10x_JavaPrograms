package ex_08_Loop_Statements;

public class Lab_098_For_loop_example_04 {
    public static void main(String[] args) {
        for (int shruti = 1; shruti < 18; shruti++) {
            if (shruti > 15) {
                System.out.println(shruti+" Gift from Papa, Iphone");
            }else{
                System.out.println(shruti+" No Gift!!");      // no gift until shruti becomes 16, 15 times no gift
            }
        }
    }
}
