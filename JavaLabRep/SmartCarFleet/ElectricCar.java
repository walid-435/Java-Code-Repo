package JavaLabRep.SmartCarFleet;

class ElectricCar extends Car implements Ecofriendly {

    int batterycapacity;

    public ElectricCar(String brand, String model, int year, int numberofdoors, int batterycapacity){
        super(brand, model, year, numberofdoors);
        this.batterycapacity=batterycapacity;
    }

    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Capacity of battery: Kwh"+batterycapacity);
    }

    @Override
    void calfuelefficiency(){
        System.out.println("Fuel efficiency: 8 KmPL");
    }

    @Override
    public void charge(){

        System.out.println("Electric Cars get fast charging via DC chargers");
  
    }
}
