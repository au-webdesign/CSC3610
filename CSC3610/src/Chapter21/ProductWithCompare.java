package Chapter21;

import java.util.Comparator;

public class ProductWithCompare {
	public static final Comparator<ProductWithCompare> BY_WEIGHT
           = new Comparator<ProductWithCompare>()  {
    public int compare(final ProductWithCompare p1, final ProductWithCompare p2)
    {
        return Integer.compare(p1.getWeight(), p2.getWeight());
    }
};

private  String name;
private  int weight;

public ProductWithCompare(String name, int weight)
{
    this.name = name;
    this.weight = weight;
}

public String getName()
{
    return name;
}

public int getWeight()
{
    return weight;
}

@Override
public String toString()
{
    return "ProductWithCompare{" +
        "name='" + name + '\'' + 
        ", weight=" + weight +
        '}';
}

}
