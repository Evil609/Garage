public class Motorcycle extends Vehicle {
    private int engineSize ;

    public Motorcycle(String ownerName , String brand ,String model , int year , int engineSize){
        super(ownerName, brand, model, engineSize);
        this.engineSize = engineSize ;
    }   

    public int getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }

    @Override
    public void displayInfo(){
        System.out.println("Owner: " + getOwnerName());
        System.out.println("Motorcycle: " + getBrand()+ " Model: " + getModel() + " Year : (" + getYear() + " )" );
        System.out.println("Engine Size: " + getEngineSize() + " cc");
    }
}
