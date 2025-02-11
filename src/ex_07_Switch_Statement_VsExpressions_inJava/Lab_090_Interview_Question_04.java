package ex_07_Switch_Statement_VsExpressions_inJava;

public class Lab_090_Interview_Question_04 {
    public static void main(String[] args) {
        char code = 'C';
        switch (code){
            default:
                System.out.println("Hello, I'm by default.");
                break;
            case 'A':
                System.out.println("65");
                break;
            case 'B':
                System.out.println("66");
                break;
        }
    }
}
