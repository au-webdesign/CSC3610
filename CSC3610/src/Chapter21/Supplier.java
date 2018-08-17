package Chapter21;
import java.util.ArrayList;
import java.util.List;

public class Supplier {
    private final String name;
    private final List<ProductWithCompare> products = new ArrayList<>();

    public Supplier(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<ProductWithCompare> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "Supplier{" +
            "name='" + name + '\'' +
            ", products=" + products +
            '}';
    }
}
