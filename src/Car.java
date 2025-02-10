public class Car extends Vehicle {
    private int seatingCapacity ;
    
    public Car (String ownerName , String brand ,String model , int year ,int seatingCapacity){
        super(ownerName, brand, model, year);
        this.seatingCapacity = seatingCapacity ;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }
    
    @Override
    public void displayInfo(){
        System.out.println("Owner: " + getOwnerName());
        System.out.println("Car: " + getBrand()+ " Model: " + getModel() + " Year : (" + getYear() + " )" );
        System.out.println("Seats Capacity: " + getSeatingCapacity() );
    }
}
