public class Product {
    private String name;
    private double price;
    private int stock;
    
   
    /*public static final double diskon = 0,9;
    public static final double DISKON = diskon;*/
   

    public Product(String name, double price, int stock) {
        this.setName(name);
        this.setPrice(price);
        this.setStock(stock);
    }

    public void displayProduct() {
        // 10% discount
        System.out.println("Product Name: " + getName());
        System.out.println("Price: $" + getPrice());
       /* System.out.println("Discounted Price: $" + DISKON);*/
         System.out.println("Discounted Price: $" + calculateDiscount());
        System.out.println("Stock: " + getStock());
    }

    private double calculateDiscount() {
        return getPrice() * 0.9;
    }

    public void applyStockAdjustment(int adjustment) {
        setStock(getStock() + adjustment);
        System.out.println("Stock adjusted. New stock: " + getStock());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
class Inventory {
    public Product product;
    public String location;

    public Inventory(Product product, String location) {
        this.product = product;
        this.location = location;
    }

    public void showInventory() {
        System.out.println("Location: " + location);
        product.displayProduct();
    }

}
