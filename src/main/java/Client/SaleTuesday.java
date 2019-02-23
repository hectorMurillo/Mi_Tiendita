package Client;

import DayBehavior.DiscountSeniorDay;
import DayBehavior.NotDiscount;

public class SaleTuesday extends Sale{
    public SaleTuesday() {
        discountBehavior = new NotDiscount();
    }
}
