package JavaLabRep.SmartCarFleet;

abstract class Vehicel {
    
    String brand;
    String model;
    int year;

    Vehicel(String brand, String model, int year){
        this.brand=brand;
        this.model=model;
        this.year=year;
    }

    void displayInfo(){
        System.out.println("Brand Name: "+brand);
        System.out.println("Model Name: "+model);
        System.out.println("Manufacture Year: "+year);
    }

    abstract void calfuelefficiency();

}
