package ex_09_Functions_in_Java;

public class Lab_121_Assignment_02 {
    /** Function of type_02: Without return type but with parameters.*/
    public static void main(String[] args) {
        employeeData("Angan Maity.","Pune,Mumbai.", 23);

    }
    public static void employeeData(String name, String address, int age){
        System.out.println("--- Employee details ---");
        System.out.println("Name -> "+name);
        System.out.println("Address -> "+address);
        System.out.println("Age -> "+age);
    }

}
