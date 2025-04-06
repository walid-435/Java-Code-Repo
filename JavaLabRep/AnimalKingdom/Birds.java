package JavaLabRep.AnimalKingdom;

class Birds extends Animal {

    double wingspan;
    Birds (String name, String habitat, String diet, double wingspan) {
        super(name, habitat, diet);
        this.wingspan = wingspan;
    }

    void displayDetails(){
        super.displayDetails();
        System.out.println("Bird's Wingspan: "+wingspan);
    }
    
}
