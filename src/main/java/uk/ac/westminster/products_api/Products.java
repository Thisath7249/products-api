package uk.ac.westminster.products_api;

public class Products {

    private Long id;
    private String name;
    private double price;

    public Products() {}

    public Products(Long id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getPrice() { return 0; }
    public void setPrice(float price) { this.price = price; }
}