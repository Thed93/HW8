package products;

import java.util.Objects;

public class Products {

    private final String name;
    private final float cost;


    public Products(String name, float cost) {
        if (name == null || name.isBlank() || name.isEmpty() || cost < 0) {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        }
        this.name = name;
        this.cost = cost;

    }

    public String getName() {
        return name;
    }

    public float getCost() {
        return cost;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Products product = (Products) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return String.format("%s, Цена: %s",
                this.name, this.cost);
    }
}