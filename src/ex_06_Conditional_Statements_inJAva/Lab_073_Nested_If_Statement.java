package ex_06_Conditional_Statements_inJAva;

public class Lab_073_Nested_If_Statement {
    /** Nested-if statement: When an if statement resides within another if statement.It is called as
     *                       nested-if statement.It is a complex version of if statement.When it becomes
     *                       important to execute a block of statements depending on multiple conditions
     *                       then nested-if statement is needed to check multiple conditions before execute
     *                       certain block of statements.
     * Syntax: if (condition01 ?){
     *            // code to execute if condition 01 is true
     *            if (condition02 ?){
     *               statement 1 to execute if condition 01 & 02 both are true;
     *            }
     *            else{
     *               statement 2 to execute if condition 02 is false ;
     *            }
     *         }else{
     *             statement x to execute if condition 01 is false;
     *         }  */
    public static void main(String[] args) {
        float total_marks = 375.6f;
        float marks_inMath = 89.5f;
        if (total_marks >= 375){
            if (marks_inMath >=90){
                System.out.println("Student is eligible to enroll in honours course.");
            }
            else{
                System.out.println("Student isn't eligible to enroll in honours course.");
            }
        }
        else{
            System.out.println("Student isn't eligible by total marks to enroll in honours course.");
        }

    }
}
