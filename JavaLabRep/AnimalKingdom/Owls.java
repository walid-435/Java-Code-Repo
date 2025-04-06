package JavaLabRep.AnimalKingdom;

class Owls extends Birds{

    boolean nightvision;

    Owls(String name, String habitat, String diet, double wingspan, boolean nightvision){
        super(name, habitat, diet, wingspan);
        this.nightvision=nightvision;
    }

    void displayDetails(){
        super.displayDetails();
        System.out.println("Does owls have night vision?: "+nightvision);
    }
    
}
