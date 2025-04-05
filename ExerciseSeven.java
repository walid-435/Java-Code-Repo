import java.util.*;
public class ExerciseSeven {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int positive=0, negative=0, zeros=0;
        System.out.println("Press '1' to continue and '0' to stop");
        int input=sc.nextInt();
        while(input==1){
            System.out.println("Enter your number: ");
            int number=sc.nextInt();
            if(number>0){
                positive++;
            }
            else if(number<0){
                negative--;
            }
            else{
                zeros++;
            }
            System.out.println("Press '1' to continue and '0' to stop");
            input=sc.nextInt();
        }
        System.out.println("Positives: "+positive);
        System.out.println("Negatives: "+negative);
        System.out.println("Zero: "+zeros);
    }
}
