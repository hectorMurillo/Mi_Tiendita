package DayBehavior;

import Client.Product;

import java.util.ArrayList;

public class DiscountSeniorDay implements DiscountBehavior{
    @Override
    public float discount(ArrayList<Product> products) {
        float subtotal = 0;
        for (Product product : products){
            subtotal += product.getPrice() * product.getQuantity();
        }
        //Suponemos que los clientes son de la 3a edad
        float discount = subtotal * 0.05f;
        return discount;
    }
}
