package ex_07_Switch_Statement_VsExpressions_inJava;

public class Lab_083_Yield_keyword_in_SwitchExpression01 {
    /** Yield Keyword: Yield keyword was introduced by Java 13 for implementing Switch Expression if
     *                 there exist complex logic with multiple statements then yield keyword helps there
     *                 to return a value, Hence the importance of yield keyword.It is basically act like
     *                 return keyword whose function is to return value.    */
    public static void main(String[] args) {

        int x=2, y =4;

        int result = switch(y/x){
            case 1  -> 4;
            case 3 -> 1;
            case 4 -> {
                int z = y/x;
                yield z = z+1;
            }
            default -> 9;
        };
        System.out.println(result);
    }
}
