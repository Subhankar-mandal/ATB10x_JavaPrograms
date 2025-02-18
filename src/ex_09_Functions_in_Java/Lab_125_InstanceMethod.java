package ex_09_Functions_in_Java;

public class Lab_125_InstanceMethod {
    /** Instance Method:
     * 1. Belong to an object -> Instance methods are associated with individual objects (instances) of
     *                         a class.
     * 2. Accessed using an object -> Instance method can be called using an object of the class by dot
     *                               operator (.).
     * 3. Have access to instance variables -> This methods can directly access and modify instance variables
     *                                         because they have an implicit this reference to the object
     *                                         they're called on.                 */

    public static void main(String[] args) {
        Lab_125_InstanceMethod obj = new Lab_125_InstanceMethod();
        obj.printMessage();

    }
    public void printMessage(){
        System.out.println("This is an instance method.");
    }
}
