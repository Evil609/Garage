import java.util.Scanner ;
public class Main {
    public static void main(String[] args) throws Exception {
        Garage garage = new Garage() ;
        Scanner scanner = new Scanner(System.in) ;
        
        int choice = 0 ;

        do { 
            
            System.out.println("Menu :");
            System.out.println("1. Add Wehicle");
            System.out.println("2. Update a vehicle");
            System.out.println("3. Remove a vehicle");
            System.out.println("4. Display vehicles");
            System.out.println("5. Display vhicle information");
            System.out.println("0. Exit");

            System.out.println("Enter your choice : ");
            choice = scanner.nextInt() ;



            switch (choice) {
                case 1 :
                    System.out.println("choose the vehicle type :");

                    System.out.println("1. Car");
                    System.out.println("2. Truck");
                    System.out.println("3. Motorcycle");

                    System.out.println("Enter the vehicle (1-3) : ") ;
                    int vehicleChoice = scanner.nextInt();

                    switch (vehicleChoice){
                        case 1:
                        System.out.println("Enter owner name : ");
                        String carOwner = scanner.next() ;
                        System.out.println("Enter car brand : ");
                        String CarBrand = scanner.next();
                        System.out.println("Enter car model : ");
                        String carModel = scanner.next();
                        System.out.println("Enter car year : ");
                        int carYear = scanner.nextInt() ;
                        scanner.nextLine() ;

                        System.out.println("enter car capacity : ");
                        int carCapacity = scanner.nextInt();

                        garage.addVehicle(new Car(carOwner, CarBrand, carModel, carYear, carCapacity));

                        break;

                        case 2:
                        System.out.println("Enter owner name : ");
                        String truckOwner = scanner.next() ;
                        System.out.println("Enter truck brand : ");
                        String truckBrand = scanner.next() ;
                        System.out.println("Enter truck model : ");
                        String truckModel = scanner.next() ;
                        System.out.println("Enter truck year : ");
                        int truckYear = scanner.nextInt();
                        scanner.nextLine() ;
                        System.out.println("Enter cargoCapacity : ");
                        int truckCargoCapacity = scanner.nextInt() ;
                        garage.addVehicle(new Truck(truckOwner, truckBrand, truckModel, truckYear, truckCargoCapacity));
                        break ;
                        case 3 :
                        System.out.println("Enter owner name : ");
                        String owner = scanner.next();
                        System.out.println("Enter motor brand : ");
                        String brand = scanner.next();
                        System.out.println("Enter motor model : ");
                        String model = scanner.next() ; 
                        System.out.println("Enter motor year : ");
                        int year = scanner.nextInt() ; 
                        scanner.nextLine(); 
                        System.out.println("Enter engine size : ");
                        int engineSize = scanner.nextInt();
                        garage.addVehicle(new Motorcycle(owner, brand, model, year, engineSize));
                        break;
                        default:
                        System.out.println("invalid vehicle type choice ");
                        break;
                    }
                break;    
                case 2:
                    System.out.println("Enter current owner name : ");
                    String currentOwner = scanner.next();
                    System.out.println("Enter new owner name : ");
                    String newOwner = scanner.next();
                    System.out.println("Enter vehicle brand : ");
                    String brand = scanner.next();
                    System.out.println("Enter vehicle model : ");
                    String model = scanner.next();
                    System.out.println("Enter vehicle year : ");
                    int year = scanner.nextInt();
                    garage.updateVehicle(currentOwner, newOwner, brand, model, year);
                    break;

                case 3:
                    System.out.println("Enter vehicle owner name : ");
                    String ownerName = scanner.next();
                    garage.removeVehicle(ownerName);
                    break ;
                case 4 :
                    garage.displayVehicles();
                    break ;
                case 5 :
                    System.out.println("Enter vehicle owner name : ");
                    String ownerName1 = scanner.next();
                    garage.displayVehicleDetails(ownerName1);
                break;
                case 0 :
                System.out.println("Exiting program . GoodBye <3"); 
                break;
                default:
                System.out.println("invalid choice please try again");
            }
        } while (choice != 0);
    }
}
