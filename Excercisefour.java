import java.util.*;
public class Excercisefour {
    public static double getCircumference(double r){
        double circumference=2*3.1416*r;
        return circumference;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double r=sc.nextDouble();
        System.out.println(getCircumference(r));
    }
}