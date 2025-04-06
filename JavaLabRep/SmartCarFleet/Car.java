package JavaLabRep.SmartCarFleet;

class Car extends Vehicel{

    int numberofdoors;

    Car(String brand, String model, int year, int numberofdoors){
        super(brand, model, year);
        this.numberofdoors=numberofdoors;
    }

    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Number of Doors: "+numberofdoors);
    }

    @Override
    void calfuelefficiency(){
        System.out.println("Fuel efficiency: 15 KmPL");
    }
    
}
