package pharmacymanagementsystemproject;
import java.util.Scanner;

public class PharmacyManagementSystemProject {

    public static void main(String[] args) {
        Pharmacy pharmacy = new Pharmacy();
        Scanner scanner = new Scanner (System.in);
        while (true){
            System.out.println("*************************************************");
            System.out.println("Pharmacy Management System: ");
            System.out.println("*************************************************");
            System.out.println("1. Manage Inventory");
            System.out.println("2. Process Sales");
            System.out.println("3. Generate Reports");
            System.out.println("4. Exit");
            System.out.println("Choose an Option: ");          
            
            int choice = scanner.nextInt();
            
            switch (choice){
                case 1:
                    pharmacy.manageInventory();
                    break;
                case 2:
                    pharmacy.processSales();
                    break;
                case 3:
                    pharmacy.generateReports();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    
            }
        }
        
    }
    
}
