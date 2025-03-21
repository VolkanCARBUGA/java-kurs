package classes;

public class Product {
    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;

    public Product(int id, String name, String description, double price, int stockAmount) {
        this.description = description;
        this.id = id;
        this.name = name;
        this.price = price;
        this.stockAmount = stockAmount;
    }

    public Product() {
        System.out.println("Product created");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

}
