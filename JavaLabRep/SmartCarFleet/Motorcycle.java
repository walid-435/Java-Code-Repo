package JavaLabRep.SmartCarFleet;

class Motorcycle extends Vehicel{

    String type;

    Motorcycle(String brand, String model, int year, String type){
        super(brand, model, year);
        this.type=type;
    }

    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Motorcycle type: "+type);
    }

    @Override
    void calfuelefficiency(){
        System.out.println("Fuel efficiency: 35 KmPL");
    }

}
