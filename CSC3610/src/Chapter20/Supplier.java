package Chapter20;
import java.util.ArrayList;
import java.util.List;

public class Supplier {
    private  String name;
    private  List<ProductWithCompare> products = new ArrayList<>();

    public Supplier(String name, List<ProductWithCompare> products ) {
        this.name = name;
        this.products = products;
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
