package ex_06_Conditional_Statements_inJAva;

public class Lab_072_If_Else_Statement {
    /** If-else statement: This conditional statement has two block of statements.One is the if block and
     *                     another is else block of statements.If condition becomes false then the control
     *                     flow of program execution moves to the else block and execute statements under
     *                     it.
     *  Syntax: if (condition?){
     *             statement 01;
     *             statement 02;
     *          }
     *          else{
     *              statement 03;
     *          }*/
    public static void main(String[] args) {
        boolean isEnergetic = !true;
        if (isEnergetic){
            System.out.println("Energy level is high.Feeling energetic!.");
        }
        else{
            System.out.println("Energy level is low. Feeling drowsy. ");
        }

    }
}
