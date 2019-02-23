package Client;

import DayBehavior.DiscountSeniorDay;

public class SaleSunday extends  Sale{
    public SaleSunday() {
        this.discountBehavior = new DiscountSeniorDay();
    }
}
