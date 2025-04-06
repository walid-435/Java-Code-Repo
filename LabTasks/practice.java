import java.util.*;
public class practice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[n]=sc.nextInt();
        }
        System.out.println("The elements are: ");
        for(int i=0; i<n; i++){
            System.out.println(arr[i]+" ");
        }
    }
}
