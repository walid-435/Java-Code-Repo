package JavaLabRep;
import java.util.*;

class Account{

    private String name;
    private String accNumber;
    private double balance;
    public void setAccNumber(String accNumber){
        this.accNumber=accNumber;
    }

    public void setAccHolderName(String name){
        this.name=name;
    }

    public void setBalance(double balance){
        if(balance>0){
            this.balance=balance;
        }
        else{
            System.out.println("Initial balanace can not be negative");
        }
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        if(amount>0){
            balance= balance+amount;
            System.out.println("The deposited amount is: TK"+amount);
        }
        else{
            System.out.println("Amount must be positive");
        }
    }

    public void withdraw(double amount){
        if(amount>balance){
            System.out.println("Insufficient balance");
        }
        else if(amount<=0){
            System.out.println("Amount must be positive");
        }
        else{
            balance=balance-amount;
            System.out.println("Amount withdrawn: TK"+amount);
        }
    }
}

public class Bank {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Account account=new Account();

        account.setAccNumber("A435E25");
        account.setAccHolderName("Walid Rahman");
        account.setBalance(5000.0);
        
        System.out.println("Current balance: TK"+account.getBalance());

        System.out.println("Enter the amount to deposite: TK");
        double depo=sc.nextDouble();
        account.deposit(depo);
        System.out.println("Current balance: TK"+account.getBalance());

        System.out.println("Enter the amount to withdraw: TK");
        double witdraw=sc.nextDouble();
        account.withdraw(witdraw);
        System.out.println("Current balance: TK"+account.getBalance());

        sc. close();

    }
}