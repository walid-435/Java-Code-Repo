package JavaLabRep;

import java.util.*;

class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(String meassage){
        super(meassage);
    }

}

class InvalidAmountException extends Exception{

    public InvalidAmountException(String meassage){
        super(meassage);
    }

}

public class ATMwithdrawalSystem {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        try {
            System.out.print("Enter your current balance: ");
            double balance=sc.nextDouble();


            System.out.print("Enter withdrawal amount: ");
            double amount=sc.nextDouble();

            if(amount<=0){
                throw new InvalidAmountException("Invalid withdrawal amount.");
            }

            if (amount > balance) {
                throw new InsufficientBalanceException("Insufficient funds!");
            }

            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: $" + balance);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a valid number.");
        } catch (InvalidAmountException | InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Transaction complete. Thank you for banking with us!");
        }

        sc.close();
    }
    
}
