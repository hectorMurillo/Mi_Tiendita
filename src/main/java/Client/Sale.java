package Client;

import DayBehavior.DiscountBehavior;

import java.util.ArrayList;

public class Sale {
    protected DiscountBehavior discountBehavior;
    ArrayList<Product> products = new ArrayList<>();

    public void addItem(Product p){
        products.add(p);
    }

    public DiscountBehavior getDiscountBehavior() {
        return discountBehavior;
    }

    public void setDiscountBehavior(DiscountBehavior discountBehavior) {
        this.discountBehavior = discountBehavior;
    }

    public float calculateTotal(){
        float subtotal = 0;
        for(Product product : this.products){
            subtotal += product.getPrice()*product.getQuantity();
        }
        subtotal -= this.discountBehavior.discount(products);
        float total = subtotal += (subtotal*0.16);
        return total;
    }

}