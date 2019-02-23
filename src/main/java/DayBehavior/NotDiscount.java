package DayBehavior;

import Client.Product;

import java.util.ArrayList;

public class NotDiscount implements DiscountBehavior {
    @Override
    public float discount(ArrayList<Product> products) {
        return 0;
    }
}
