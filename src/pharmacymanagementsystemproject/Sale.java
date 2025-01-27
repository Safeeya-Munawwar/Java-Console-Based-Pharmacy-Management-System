package pharmacymanagementsystemproject;

class Sale {
    private String medicineName;
    private int medicineId;
    private double price;
    private int quantity;
    
    public Sale (String medicineName, int medicineId, double price, int quantity){
        this.medicineName = medicineName;
        this.medicineId = medicineId;
        this.price = price;
        this.quantity = quantity;
    }
    
    public double getTotalPrice(){
        return price * quantity;
    }
    
    @Override
    public String toString(){
        return "Sale{" +
                "medicineName='" +
                medicineName + '\'' +
                ", medicineId=" +
                medicineId +
                ", price=" + price +
                ", quantitiy=" + quantity +
                ", totalPrice=" +
                getTotalPrice() +
                '}';
    }
}
