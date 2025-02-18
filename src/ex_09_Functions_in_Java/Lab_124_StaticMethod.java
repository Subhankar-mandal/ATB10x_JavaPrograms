package ex_09_Functions_in_Java;

public class Lab_124_StaticMethod {
    /** Static Method:
     * 1. Belong to the class -> Static methods are associated with the class itself, not specific objects
     *                           of the class.
     * 2. Accessed using class name -> A static method can be called using class name by dot operator(.).
     * 3. No use this keyword -> Static methods can't access instance variables (non-static fields) directly
     *                           because they don't have this reference to a specific object.          */

    public static void main(String[] args) {
        double area = Lab_124_StaticMethod.areaOfCircle(15); // call static method using class name
        System.out.println("Area of the circle is = "+area);
    }
    public static double areaOfCircle(int r){
        double area = Math.PI*r*r;
        return area;
    }
}
