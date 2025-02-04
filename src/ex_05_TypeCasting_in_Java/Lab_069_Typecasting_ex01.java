package ex_05_TypeCasting_in_Java;

public class Lab_069_Typecasting_ex01 {
    public static void main(String[] args) {

        int cost = 100;
        float Gst_InPercent = 18.45f;
        int Gst_Percent = (int) Gst_InPercent;           // explicit Type Casting
        System.out.println(Gst_Percent);
        float total_cost = cost+(cost* Gst_Percent) /100;
        System.out.println(total_cost);

    }
}
