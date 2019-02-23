package Client;

import DayBehavior.DiscountMennoniteDay;

public class SaleWednesday extends Sale{

    public SaleWednesday() {
        this.discountBehavior = new DiscountMennoniteDay();
    }
}
