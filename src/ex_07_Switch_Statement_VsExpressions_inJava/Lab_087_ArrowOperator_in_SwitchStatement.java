package ex_07_Switch_Statement_VsExpressions_inJava;

public class Lab_087_ArrowOperator_in_SwitchStatement {
    /** Arrow operator : Arrow Operator is used for defining single statement in Switch construct.This
     *                   feature was introduced in 14th version of JAVA.
     *  Syntax : switch (expression){
     *                case value -> statement 1;
     *                case value -> statement 2;
     *                default -> statement 3:
     *           }                                         */

    public static void main(String[] args) {
        int itemCode = 001;
        switch(itemCode){
            case 001 -> System.out.println("This is for mobile");
            case 002 -> System.out.println("This is for Laptop");
            case 003 -> System.out.println("This is for SmartTV");
            default -> System.out.println("This is other category");
        }
    }
}
