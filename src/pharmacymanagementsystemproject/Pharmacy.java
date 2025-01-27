package pharmacymanagementsystemproject;
import java.util.ArrayList;
import java.util.Scanner;

class Pharmacy {
    private ArrayList<Medicine> inventory = new ArrayList<>();
    private ArrayList<Sale> sales = new ArrayList<>();
    private Scanner scanner = new Scanner (System.in);
    
    //Inventory Management
    public void manageInventory(){
        while(true){
            System.out.println("***************************************");
            System.out.println("Inventory Management: ");
            System.out.println("1. Add Medicine");
            System.out.println("2. Update Medicine");
            System.out.println("3. Remove Medicine");
            System.out.println("4. Display Medicines");
            System.out.println("5. Search Medicine");
            System.out.println("6. Back to Main Menu");
            System.out.println("Choose an Option: ");
            
            int choice = scanner.nextInt();
            
            switch (choice){
                case 1:
                    addMedicine();
                    break;
                case 2:
                    updateMedicine();
                    break;
                case 3:
                    removeMedicine();
                    break;
                case 4:
                    displayMedicines();
                    break;
                case 5:
                    searchMedicine();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");                   
            }
        }
    }
    
    private void addMedicine(){
        System.out.println("*************************************************");
        System.out.println("Enter Medicine Name: ");
        String name = scanner.next();
        System.out.println("Enter Medicine ID: ");
        int id = scanner.nextInt();
        System.out.println("Enter Medicine Price: ");
        double price = scanner.nextDouble();
        System.out.println("Enter Medicine Quantity: ");
        int quantity = scanner.nextInt();
        
        Medicine medicine = new Medicine(name, id, price, quantity);
        inventory.add(medicine);
        System.out.println("Medicine Added Successfully.");
    }
    
    private void updateMedicine(){
        System.out.println("*************************************************");
        System.out.println("Enter Medicine ID to Update: ");
        int id = scanner.nextInt();
        for(Medicine medicine : inventory){
            if (medicine.getId() == id){
                System.out.println("Enter New Medicine Name: ");
                String name = scanner.next();
                System.out.println("Enter New Medicine Price: ");
                double price = scanner.nextDouble();
                System.out.println("Enter New Medicine Quantity: ");
                int quantity = scanner.nextInt();
                medicine.setName(name);
                medicine.setPrice(price);
                medicine.setQuantity(quantity);
                System.out.println("Medicine Updated Successfully.");
                return;
            }
        }
        System.out.println("Medicine Not Found");
    }
    
    private void removeMedicine(){
        System.out.println("*************************************************");
        System.out.println("Enter Medicine ID to Remove: ");
        int id = scanner.nextInt();
        inventory.removeIf(medicine -> medicine.getId() == id);
        System.out.println("Medicine Removed Successfully.");
    }
    
    private void displayMedicines(){
        System.out.println("Medicines in Inventory: ");
        for(Medicine medicine : inventory){
            System.out.println(medicine);
        }
    }
    
    private void searchMedicine(){
        System.out.println("*************************************************");
        System.out.println("Enter Medicine ID to Search: ");
        int id = scanner.nextInt();
        for(Medicine medicine : inventory){
            if (medicine.getId() == id){
                System.out.println(medicine);
                return;
            }
        }
        System.out.println("Medicine Not Found.");
    }
    
    //Sales Processing
    public void processSales(){
        System.out.println("*************************************************");
        System.out.println("Enter Medicine ID to Sale: ");
        int id = scanner.nextInt();
        for (Medicine medicine : inventory){
            if (medicine.getId() == id)
            {
                System.out.println("Enter Quantity to Sell: ");
                int quantity = scanner.nextInt();
                if (medicine.getQuantity() >= quantity)
                {
                    medicine.setQuantity(medicine.getQuantity()-quantity);
                    Sale sale = new Sale(medicine.getName(), id, medicine.getPrice(), quantity);
                    sales.add(sale);
                    System.out.println("Sale Processed Successfully.");
                }
                else
                {
                    System.out.println("Insufficient Stock");
                }
                return;
            }
        }
        System.out.println("Medicine Not Found");       
    }
    
    //Reports Generation
    public void generateReports(){
        System.out.println("*************************************************");
        System.out.println("Sales Report: ");
        double totalSales = 0;
        for (Sale sale : sales){
            System.out.println(sale);
            totalSales += sale.getTotalPrice();
        }
        System.out.println("Total Sales: $ " + totalSales);
    }
        
}
