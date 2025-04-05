package BusTicketService;

class AcBus extends BusTicket {
    private int  extra=200;
    
    public AcBus(String name, String destination, int fare){
        super(name, destination, fare);
    }

    public void calFare(){
        int totalfare=getFare()+extra;
        System.out.println("Bus type: AC");
        System.out.println("Total Fare (With AC charge): BDT "+totalfare);
    }
    public void displayDetails(){
        System.out.println("\nTicket Details: ");
        System.out.println("Passernger Name: "+getName());
        System.out.println("Destination: "+getDestination());
        System.out.println("Bus type: AC");
        System.out.println("Fare: BDT "+(getFare()+extra));
    }
    }
