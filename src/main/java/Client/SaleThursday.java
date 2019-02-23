package Client;

import DayBehavior.DiscountDayOfTheFruit;

public class SaleThursday extends Sale{
    public SaleThursday() {
        this.discountBehavior = new DiscountDayOfTheFruit();
    }
}