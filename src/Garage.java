public class Garage {
    private Vehicle[] vehicles ; 
    private int count ;

    public Garage (){
        this.vehicles = new Vehicle[100];
        this.count = 0;
    }
    public void addVehicle(Vehicle Vehicle){
        if(count < vehicles.length){
            vehicles[count] = Vehicle ;
            count++ ;
            System.out.println("Vehicle Add to Garage .");
        }else{
            System.out.println("Garage is full. Can't add more vehicles ");
        }
    }
    public void updateVehicle(String currentOwner , String newOwner , String brand , String model , int year ){
        boolean found = false ;
        for(int i = 0 ; i < count ; i++){
            if(vehicles[i].getOwnerName().equalsIgnoreCase(currentOwner)){
                vehicles[i].setOwnerName(newOwner);
                vehicles[i].setBrand(brand);
                vehicles[i].setModel(model);
                vehicles[i].setYear(year);
                found = true ;
                System.out.println("Vehicle updated successfully ");
                break; 
            }
        }
        if(!found){
            System.out.println("Vehicle with Owner ' " + currentOwner + " ' not found. update failed");
        } 
    }
    public void removeVehicle(String ownerName){
        boolean found = false ;
        for(int i = 0 ; i < count ; i++){
            if(vehicles[i].getOwnerName().equalsIgnoreCase(ownerName)){
                vehicles[i] = vehicles[count-1] ;
                vehicles[count - 1] = null ;
                count-- ;
                System.out.println("vehicles removed from garage.");
                found = true ;
            }
        }
        if(!found){
            System.out.println("vehicle with owner ' " + ownerName + " ' not found. remove failed");
        }
    }

    public void displayVehicles(){
        if (count == 0) {
            System.out.println("Garage is empty");
        } else {
            for (int i = 0; i < count; i++) {
                vehicles[i].displayInfo();
                System.out.println();
            }
        }
    }

    public void displayVehicleDetails(String ownerName){
        boolean found = false;
        for(int i = 0; i < count ; i++){
            if(vehicles[i].getOwnerName().equalsIgnoreCase(ownerName)){
                System.out.println("Vehicle Founded");
                System.out.println(
                "Owner : " + vehicles[i].getOwnerName() 
                );
                System.out.println(
                "Brand : " + vehicles[i].getBrand()
                + "\n Model : "+ vehicles[i].getModel() 
                + "\n Year : " + vehicles[i].getYear() 
                );
                found = true ; 
                break ; 
            }
        }
        if(!found){
            System.out.println("vehicle with owner ' " + ownerName + " ' not found.");
        }
    }


}
