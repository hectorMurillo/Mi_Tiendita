package Client;

import DayBehavior.*;

public class SaleModay extends Sale{
    public SaleModay() {
        discountBehavior = new DiscountSeniorDay();
    }
}
