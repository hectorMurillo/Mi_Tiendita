package App;

import java.util.HashMap;

public class Catalogue {
    public static HashMap<String,Float> products = new HashMap<>();

    public Catalogue() {
        loadProducts();
    }

    public HashMap<String, Float> getProducts() {
        return products;
    }

    public static void loadProducts(){
        products.put("leche",15.50f);
        products.put("crema",10.00f);
        products.put("mantequilla",4.50f);
        products.put("jamon",35.00f);
        products.put("queso",100.00f);
        products.put("platano",14.00f);
        products.put("manzana",13.00f);
    }
}
