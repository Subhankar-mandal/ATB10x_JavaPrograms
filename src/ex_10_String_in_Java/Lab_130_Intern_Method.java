package ex_10_String_in_Java;

public class Lab_130_Intern_Method {
    /** Intern() method: It is used to move the String object into SCP from heap memory.When String is
     *                   created with new keyword, the string object is stored in heap unless it is interned.
     *                   This method helps to save memory because instead of creating new object every time
     *                   it facilitates programmer to reuse same object as a literal. */
    public static void main(String[] args) {
        String name = "Subhankar";                               // in SCP
        String name1 = new String("Subhankar");           // in Heap

        System.out.println(name == name1);  // references two different memory location.

        name1.intern();
        System.out.println(name == name1);  // false result again, intern not effective.
        name1 = name1.intern();

        System.out.println(name == name1);  // true returned, therefore intern done.
    }
}
