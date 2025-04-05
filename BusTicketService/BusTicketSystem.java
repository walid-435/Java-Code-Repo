package BusTicketService;

import java.util.Scanner;

class NonAcBus extends BusTicket {

    public NonAcBus(String name, String destination, int fare) {
        super(name, destination, fare);
    }

    public void calFare() {
        System.out.println("Bus type: Non AC");
        System.out.println("Total Fare: BDT " + getFare());
    }

    public void displayDetails(){
        System.out.println("\nTicket Details: ");
        System.out.println("Passernger Name: "+getName());
        System.out.println("Destination: "+getDestination());
        System.out.println("Bus type: Non-AC");
        System.out.println("Fare: BDT "+getFare());
    }
}

public class BusTicketSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter passenger name: ");
        String name = sc.nextLine();

        System.out.println("\nSelect your Destination:");
        System.out.println("1. Dhaka to Chittagong: BDT 1200");
        System.out.println("2. Dhaka to Rajshahi: BDT 1500");
        System.out.println("3. Dhaka to Khulna: BDT 1300");
        System.out.println("\nSelect destination between (1 to 3): ");
        int des = sc.nextInt();

        String destination = "";
        int fare = 0;
        switch (des) {
            case 1:
                destination = "Dhaka to Chittagong";
                fare = 1200;
                break;
            case 2:
                destination = "Dhaka to Rajshahi";
                fare = 1500;
                break;
            case 3:
                destination = "Dhaka to Khulna";
                fare = 1300;
                break;
            default:
                System.out.println("Wrong method! Try again!");
                return;
        }

        BusTicket ticket = null;
        System.out.println("\nBus Type (Select 1 for AC and 2 for Non-AC): ");
        int type = sc.nextInt();
        if (type == 1) {
            ticket = new AcBus(name, destination, fare);
        } else if (type == 2) {
            ticket = new NonAcBus(name, destination, fare);
        } else {
            System.out.println("Wrong method! Try again!");
            return;
        }
        ticket.calFare();
        ticket.displayDetails();
    }
}