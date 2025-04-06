package JavaLabRep.AnimalKingdom;

class Mammal extends Animal {
    String furtype;

    Mammal(String name, String habitat, String diet, String furtype){
        super(name, habitat, diet);
        this.furtype=furtype;
    }

    void displayDetails(){
        super.displayDetails();
        System.out.println("Animal FurType: "+furtype);
    }
}
