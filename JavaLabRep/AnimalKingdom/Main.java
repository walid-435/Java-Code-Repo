package JavaLabRep.AnimalKingdom;

public class Main {
    public static void main(String[] args) {
        Animal animal=new Animal("Generic Animal", "Jungle", "Omnivore");
        Mammal mammal=new Mammal("Lion", "Savannah", "Carnivore", "Thick Fur");
        Birds bird=new Birds("Eagle", "Mountains", "Carnivore", 2.5);
        Dogs dog=new Dogs("Dogs", "Road", "Omnivore", "Short Fur", "Labrador");
        Owls owl=new Owls("Owls", "Forest", "Carnivore", 1.5,  true);

        animal.displayDetails();
        mammal.displayDetails();
        bird.displayDetails();
        dog.displayDetails();
        owl.displayDetails();

    }
    
}
