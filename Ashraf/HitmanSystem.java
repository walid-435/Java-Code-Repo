package Ashraf;

import java.util.Scanner;

class SniperKill extends Hitman {
    public SniperKill(String targetName) {
        super(targetName);
        this.price = 7000; // Sniper kill is premium
    }


    @Override
    public void executeHit() {
        System.out.println("🎯 One shot, one kill! " + getTargetName() + " is down.");
    }
}

public class HitmanSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Get target name from user
        System.out.print("Enter the target's name: ");
        String target = scanner.nextLine();


        // Show available methods
        System.out.println("\nChoose a method of elimination:");
        System.out.println("1. Silent Kill ($5000)");
        System.out.println("2. Explosive Kill ($3000)");
        System.out.println("3. Sniper Kill ($7000)");
        System.out.print("Enter your choice (1-3): ");
       
        int choice = scanner.nextInt();
        Hitman hitman;


        // Select the appropriate hitman method
        switch (choice) {
            case 1:
                hitman = new SilentKill(target);
                break;
            case 2:
                hitman = new ExplosiveKill(target);
                break;
            case 3:
                hitman = new SniperKill(target);
                break;
            default:
                System.out.println("Invalid choice! No hit was taken.");
                return;
        }


        // Execute the hit
        hitman.executeHit();
        hitman.showPrice();


        scanner.close();
    }
}
