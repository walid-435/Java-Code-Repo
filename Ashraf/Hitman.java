package Ashraf;

public class Hitman {
    private String targetName;
    protected double price; // Price varies based on the method


    // Constructor
    public Hitman(String targetName) {
        this.targetName = targetName;
    }


    // Method to execute a hit (to be overridden)
    public void executeHit() {
        System.out.println("Hitman is ready for the job...");
    }


    // Display price
    public void showPrice() {
        System.out.println("Total Price: $" + price);
    }


    // Getter for target name
    public String getTargetName() {
        return targetName;
    }
}
