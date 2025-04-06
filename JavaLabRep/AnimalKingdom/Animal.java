package JavaLabRep.AnimalKingdom;

class Animal {

    String name;
    String habitat;
    String diet;

    Animal(String name, String habitat, String diet){
        this.name=name;
        this.habitat=habitat;
        this.diet=diet;
    }

    void displayDetails(){
        System.out.println("Animal Name: "+name);
        System.out.println("Animal Habitat: "+habitat);
        System.out.println("Animal Diet: "+diet);
    } 
}
