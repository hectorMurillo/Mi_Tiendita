package DayBehavior;

import Client.Category;
import Client.Product;

import java.util.ArrayList;

public class DiscountMennoniteDay implements DiscountBehavior{
    @Override
    public float discount(ArrayList<Product> products) {
        float discount = 0;
        for(Product product : products){
            if(product.getCategory() == Category.LACTEOS){
                discount += (product.getPrice() * product.getQuantity())*(0.10);
            }
        }
        return discount;
    }
}
