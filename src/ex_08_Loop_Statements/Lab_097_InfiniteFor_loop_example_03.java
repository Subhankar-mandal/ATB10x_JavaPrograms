package ex_08_Loop_Statements;

public class Lab_097_InfiniteFor_loop_example_03 {
    /** Infinite Loop: */
    public static void main(String[] args) {
        for (int i = 0; ; i++) {
            System.out.println(i);
        }

        // exit code 130 (Stop by Yourself. - Kill) Red Button - interrupted by signal
        // exit code 0 - Successful
    }
}
