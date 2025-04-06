import java.util.*;
public class Assign {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char Maria;
        System.out.println("Enter a username: ");
        String username=sc.nextLine();
        System.out.println("Enter password");
        String password=sc.nextLine();

        if(username.equals("Maria") && password.equals("Maria ekta goru")){
            System.out.println("Welcome to the system");
        }
        else{
            System.out.println("Username/password is incorrect");
        }
    } 
}
