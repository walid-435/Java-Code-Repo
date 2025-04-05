package BusTicketService;

class BusTicket {
    private String name;
    private String destination;
    private int fare;

    public BusTicket(String name, String destination, int fare){
        this.name=name;
        this.destination=destination;
        this.fare=fare;
    }

    public String getName(){
        return name;
    }

    public String getDestination(){
        return destination;
    }

    public int getFare(){
        return fare;
    }

    public void displayDetails(){
        System.out.println("\nTicket Details: ");
        System.out.println("Passenger name: "+name);
        System.out.println("Destination name: "+destination);
        System.out.println("Fare: BDT"+fare);
    }

    public void calFare(){
        System.out.println("Total fare: BDT"+fare);
    }
}
