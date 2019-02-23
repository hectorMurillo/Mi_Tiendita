package App;

import Client.Category;
import Client.Product;
import Client.Sale;
import Client.SaleModay;
import DayBehavior.*;

import java.util.HashMap;

public class Mi_Tiendita {
    public static void main(String[] args) {
        Catalogue.loadProducts();
        String productsName[] = {"leche","crema","mantequilla","queso","platano","manzana","jamon"};
        Category category[] = {Category.LACTEOS,Category.LACTEOS,Category.LACTEOS,Category.LACTEOS,Category.FRUTAS,Category.FRUTAS,Category.EMBUTIDOS};
        float quantity[] = {10,0.5f,0.250f,0.500f,1,2,1};

        Sale saleMonday = new SaleModay();
        for(int i = 0; i < productsName.length ; i++ ){
            String currentProduct = productsName[i];
            float a = Catalogue.products.get(currentProduct);
            saleMonday.addItem(new Product(currentProduct,Catalogue.products.get(currentProduct),category[i],quantity[i]));
        }
        //Cambio de comportamiento
        System.out.println("Lunes"+saleMonday.calculateTotal());
        saleMonday.setDiscountBehavior(new NotDiscount());
        System.out.println("Martes"+saleMonday.calculateTotal());
        saleMonday.setDiscountBehavior(new DiscountMennoniteDay());
        System.out.println("Miercoles"+saleMonday.calculateTotal());
        saleMonday.setDiscountBehavior(new DiscountDayOfTheFruit());
        System.out.println("Jueves"+saleMonday.calculateTotal());
        saleMonday.setDiscountBehavior(new DiscountOfTheSauges());
        System.out.println("Viernes"+saleMonday.calculateTotal());
        saleMonday.setDiscountBehavior(new NotDiscount());
        System.out.println("Sabado"+saleMonday.calculateTotal());
        saleMonday.setDiscountBehavior(new DiscountSeniorDay());
        System.out.println("Domingo"+saleMonday.calculateTotal());
    }
}
