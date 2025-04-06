import java.util.*;
public class Exercisefive {
    public static int isEligible(int age){
        if(age>=18){
            System.out.println("Eligible to vote");
            return 0;
        }
        else{
            System.out.println("Not eligible to vote");
            return 0;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        isEligible(age);
    }
}
