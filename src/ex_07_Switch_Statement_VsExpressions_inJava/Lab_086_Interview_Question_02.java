package ex_07_Switch_Statement_VsExpressions_inJava;

public class Lab_086_Interview_Question_02 {
    public static void main(String[] args) {
        int a = 10;
        switch(a){

        }
        char ch = 'A';
        switch(ch){
            case 'A':
                System.out.println("I'm treated as character.");
        }

        switch(ch){
            case 65:
                System.out.println("Ch is taking the ASCII value of character A");
                System.out.println("As expression can take integer,so case value matches with value of A");
        }
    }
}
