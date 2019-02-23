
import App.Catalogue;
import Client.Category;
import Client.Product;
import Client.Sale;
import Client.SaleModay;
import DayBehavior.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SalesTest {
    private Sale dateSale;
    public Sale loadTestSale(){
        dateSale = new Sale();
        Catalogue.loadProducts();
        String productsName[] = {"leche","crema","mantequilla","queso","platano","manzana","jamon"};
        Category category[] = {Category.LACTEOS,Category.LACTEOS,Category.LACTEOS,Category.LACTEOS,Category.FRUTAS,Category.FRUTAS,Category.EMBUTIDOS};
        float quantity[] = {10,0.5f,0.250f,0.500f,1,2,1};
        for(int i = 0; i < productsName.length; i++ ){
            String currentProduct = productsName[i];
            dateSale.addItem(new Product(currentProduct,Catalogue.products.get(currentProduct),category[i],quantity[i]));
        }
        return  dateSale;
    }

    @Before
    public void setUp(){
        this.dateSale = loadTestSale();
    }
    @Test
    public void isSaleMondayEqualToHandResult(){
        this.dateSale.setDiscountBehavior(new DiscountSeniorDay());
        Assert.assertEquals(315.31,dateSale.calculateTotal(),0.001);
    }
    @Test
    public void isSaleTuesdayEqualToHandResult(){
        this.dateSale.setDiscountBehavior(new NotDiscount());
        Assert.assertEquals(331.905,dateSale.calculateTotal(),0.001);
    }
    @Test
    public void isSaleWednesdayEqualToHandResult(){
        this.dateSale.setDiscountBehavior(new DiscountMennoniteDay());
        Assert.assertEquals(307.41452,dateSale.calculateTotal(),0.001);
    }
    @Test
    public void isSaleThursdayEqualToHandResult(){
        this.dateSale.setDiscountBehavior(new DiscountDayOfTheFruit());
        Assert.assertEquals(324.945,dateSale.calculateTotal(),0.001);
    }
    @Test
    public void isSaleFridayEqualToHandResult(){
        this.dateSale.setDiscountBehavior(new DiscountOfTheSauges());
        Assert.assertEquals(293.13925,dateSale.calculateTotal(),0.001);
    }
    @Test
    public void isSaleSaturdayEqualToHandResult(){
        this.dateSale.setDiscountBehavior(new NotDiscount());
        Assert.assertEquals(331.905,dateSale.calculateTotal(),0.001);
    }
    @Test
    public void isSaleSundayEqualToHandResult(){
        this.dateSale.setDiscountBehavior(new DiscountSeniorDay());
        Assert.assertEquals(315.30975,dateSale.calculateTotal(),0.001);
    }
}
