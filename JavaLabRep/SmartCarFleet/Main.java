package JavaLabRep.SmartCarFleet;

public class Main {

    public static void main(String[] args) {
        Car car=new Car("BMW", "M4 CS", 2022, 4);
        Motorcycle motorcycle=new Motorcycle ("Kawasaki", "Ninja H2", 2021, "Sport");
        ElectricCar electriccar=new ElectricCar("Tesla", "Model S", 2023, 4, 100);
        ElectricBike electricbike=new ElectricBike("Super73", "RX", 2023, "Cruiser", 20);

        System.out.println("\nCar Details: ");
        car.displayInfo();
        car.calfuelefficiency();

        System.out.println("\nMotorcycle Details: ");
        motorcycle.displayInfo();
        motorcycle.calfuelefficiency();

        System.out.println("\nElectric Car Details: ");
        electriccar.displayInfo();
        electriccar.calfuelefficiency();
        electriccar.charge();

        System.out.println("\nElectric Bike Details: ");
        electricbike.displayInfo();
        electricbike.calfuelefficiency();
        electricbike.charge();
    }
}
