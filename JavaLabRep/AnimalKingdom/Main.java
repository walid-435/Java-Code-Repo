package JavaLabRep.AnimalKingdom;

public class Main {
    public static void main(String[] args) {
        Animal animal=new Animal(" ", " ", " ");
        Mammal mammal=new Mammal("Lion", "Savannah", "Carnivore", "Thick Fur");
        Birds bird=new Birds("Eagle", "Mountains", "Carnivore", 2.5);
        Dogs dog=new Dogs("Dogs", "Road", "Omnivore", "Short Fur", "Labrador");
        Owls owl=new Owls("Owls", "Forest", "Carnivore", 1.5,  true);

        System.out.println('\n');
        animal.displayDetails();
        System.out.println('\n');
        
        mammal.displayDetails();
        System.out.println('\n');
        
        bird.displayDetails();
        System.out.println('\n');

        dog.displayDetails();
        System.out.println('\n');

        owl.displayDetails();
        System.out.println('\n');

    }
    
}
