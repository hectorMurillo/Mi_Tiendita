package Client;

import DayBehavior.NotDiscount;

public class SaleSaturday extends Sale{
    public SaleSaturday() {
        this.discountBehavior = new NotDiscount();
    }
}
