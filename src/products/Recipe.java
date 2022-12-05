package products;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Recipe {
    private final String name;

    private final Map<Products, Integer> products = new HashMap<>();

    public Recipe(String name) {
        if (name == null || name.isBlank() || name.isEmpty()) {
            throw new IllegalArgumentException("Не заполнены все поля");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addProduct(Products products, int quantity){
        if (quantity <= 0) {
            quantity = 1;
        }
        if (this.products.containsKey(products)) {
            this.products.put(products, this.products.get(products) + quantity);
        } else {
            this.products.put(products, quantity);
        }
    }
    public float getRecipePrice() {
        float sum = 0;
        for(Map.Entry<Products, Integer> product:this.products.entrySet() ) {
            sum += product.getKey().getCost() * product.getValue();
        }
        return sum;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        Recipe recipe = (Recipe) o;
        return  Objects.equals(name, recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}