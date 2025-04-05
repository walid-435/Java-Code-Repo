package Ashraf;

public class SilentKill extends Hitman {
    public SilentKill(String targetName) {
        super(targetName);
        this.price = 5000; // Silent kill is expensive
    }


    @Override
    public void executeHit() {
        System.out.println("🔪 Sneaky kill! " + getTargetName() + " has been silently eliminated.");
    }

}
