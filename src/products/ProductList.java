package products;

import java.util.HashMap;

public class ProductList {
    private final HashMap<Products, Integer> products = new HashMap<>();

    public void addProduct (Products product, Integer quantity){
        if (product == null) {
            return;
        }
        if (this.products.containsKey(product)) {
            throw new RuntimeException("Продукт уже имеется");
        } else {
            this.products.put(product, quantity);
        }
    }

}
