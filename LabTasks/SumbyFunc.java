import java.util.*;
public class SumbyFunc {
    public static int calculateSum(int a, int b){
        int sum= a+b;
        return sum;
    }
    public static int calculateProduct(int a, int b){
        return a*b;
    }
    public static void printFactorial(int n){
        if(n<0){
            System.out.println("Invalid number");
            return;
        }
        int factorial=1;
        for(int i=n; i>=1; i--){
            factorial=factorial*i;
        }
        System.out.println(factorial);
        return;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int n=sc.nextInt();
        int sum= calculateSum(a, b);
        System.out.println("Sum of numbers: "+ sum);
        System.out.println("Product of numbers: "+ calculateProduct(a, b));
        printFactorial(n);
    }
}
