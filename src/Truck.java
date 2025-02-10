public class Truck extends Vehicle {
    private double cargoCapacity ;

    public Truck(String ownerName , String brand ,String model , int year , double cargoCapacity) {
        super(ownerName, brand, model, year);
        this.cargoCapacity = cargoCapacity ;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }
    
    @Override
    public void displayInfo(){
        System.out.println("Owner: " + getOwnerName());
        System.out.println("Truck: " + getBrand()+ " Model: " + getModel() + " Year : (" + getYear() + " )" );
        System.out.println("Cargo Capacity: " + getCargoCapacity() );
    }
}
