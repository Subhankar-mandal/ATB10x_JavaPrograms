package ex_07_Switch_Statement_VsExpressions_inJava;

public class Lab_088_Multiple_CaseValues_in_Switch_Statement {
    public static void main(String[] args) {
        int itemCode = 207;
        switch(itemCode){
            case 101,103,105:
                System.out.println("This is Electronics Gadget category");
                break;
            case 202,204,206:
                System.out.println("This is Mobile category");
                break;
            case 207,209:
                System.out.println("This is Laptop category");
                break;
                default:
                    System.out.println("This is Book category");
        }

    }
}
