package pharmacymanagementsystemproject;

class Medicine {
    private String name;
    private int id;
    private double price;
    private int quantity;
    
    public Medicine (String name, int id, double price, int quantity){
        this.name = name;
        this.id = id;
        this.price = price;
        this.quantity = quantity;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public int getId(){
        return id;
    }
    
    public double getPrice(){
        return price;
    }
    
    public void setPrice (double price){
        this.price = price;
    }
    
    public int getQuantity(){
        return quantity;
    }
    
    public void setQuantity (int quantity){
        this.quantity = quantity;
    }
    
    @Override
    public String toString(){
        return "Medicine{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }           
}
