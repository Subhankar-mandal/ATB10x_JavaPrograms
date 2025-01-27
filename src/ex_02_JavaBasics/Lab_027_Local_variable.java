package ex_02_JavaBasics;

public class Lab_027_Local_variable {
    /** Local variable: A variable defined within a block or method or constructor is called
     *                  local variable.
     *  Notes: The local variable s created at the time of declaration and destroyed after
     *         exiting from the block or when call returns from the function.
     *       -> The scope of local variable is limited within that particular block or method in
     *          which it is created.
     *       -> Initialization of the local variable is mandatory before using it in the defined
     *          scope. */
    public static void main(String[] args) {
//       int i;            variable i is not initialized.
//       i += 1;             Using is not valid.
         int j = 0;
         j-=1;
        System.out.println(j);       // j is local variable.
    }
}
