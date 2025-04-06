package JavaLabRep.SmartCarFleet;

class ElectricBike extends Motorcycle implements Ecofriendly{

    int batterycapacity;

    ElectricBike(String brand, String model, int year, String type, int batterycapacity){
        super(brand, model, year, type);
        this.batterycapacity=batterycapacity;
    }

    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Capacity of battery: Kwh"+batterycapacity);
    }

    @Override
    void calfuelefficiency(){
        System.out.println("Fuel efficiency: 16 KmPL");
    }

    @Override
    public void charge(){

        System.out.println("Electric Bikes get fast charging via standard chargers");
    }
    
}
