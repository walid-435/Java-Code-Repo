package Ashraf;

public class ExplosiveKill extends Hitman{
    public ExplosiveKill(String targetName) {
        super(targetName);
        this.price = 3000; // Explosives are cheaper, less subtle
    }


    @Override
    public void executeHit() {
        System.out.println("💥 BOOM! " + getTargetName() + " went out with a bang.");
    }
}
