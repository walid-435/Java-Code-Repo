package JavaLabRep.AnimalKingdom;

class Dogs extends Mammal{
    
    String breed;

    Dogs (String name, String habitat, String diet, String furtype, String breed){
        super(name, habitat, diet, furtype);
        this.breed=breed;
    }

    void displayDetails(){
        super.displayDetails();
        System.out.println("The breed of the dog: "+breed);
    }
    
}
