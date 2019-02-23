package Client;

import DayBehavior.DiscountOfTheSauges;

public class SaleFriday extends Sale{
    public SaleFriday() {
        this.discountBehavior = new DiscountOfTheSauges();
    }
}
