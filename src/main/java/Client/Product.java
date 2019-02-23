package Client;

public class Product {
    private String description;
    private float price;
    private Category category;
    private float quantity;

    public Product(String description, float price, Category category, float quantity) {
        this.description = description;
        this.price = price;
        this.category = category;
        this.quantity = quantity;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
