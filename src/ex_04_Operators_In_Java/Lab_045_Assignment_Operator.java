package ex_04_Operators_In_Java;

public class Lab_045_Assignment_Operator {
    /** Assignment Operator: This operator is used to assign the value of right operand to left
     *                       operand.The right operand may be a variable or constant but the left
     *                       operand must be a variable, never be a constant.If right operand is variable
     *                       then it should be declared first before assigning.
     * Type of Assignment operator: 1. Simple assignment operator (=). Eg-> int a = 10;
     *                              2. Compound assignment operator or Shorthand operator
     *                                 "+=" Add first then assign. Eg-> a+=10 -> a=a+10 -> a=20
     *                                 "-=" Subtract first then assign. Eg-> a-=1 -> a=a-1 -> a=9
     *                                 "*="
     *                                 "/="
     *                                 "%="*/
    public static void main(String[] args) {
        int a = 10;

        System.out.println(a+=10);               // a+=10 -> a=a+10 -> a=20
        System.out.println(a-=10);               // a-=10 -> a=a-10 -> a=20-10 =10
        System.out.println(a*=10);               // a*=10 -> a=a*10 -> a=100
        System.out.println(a/=10);               // a/=10 -> a=a/10 -> a=100/10 =10
        System.out.println(a%=3);                // a%=3 -> a=a%3 -> a=10%3= 1

    }
}
