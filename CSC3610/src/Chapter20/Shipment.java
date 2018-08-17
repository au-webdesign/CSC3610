package Chapter20;

//package com.monotonic.collections._3_lists;

//import com.monotonic.collections.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Shipment implements Iterable<Product>
{
    private static final int LIGHT_VAN_MAX_WEIGHT = 20;
    public static final int PRODUCT_NOT_PRESENT = -1;

    private final List<ProductWithCompare> products = new ArrayList<>();

    private List<ProductWithCompare> lightVanProducts;
    private List<ProductWithCompare> heavyVanProducts;

    public void add(ProductWithCompare product)
    {
        products.add(product);
    }

    public void replace(ProductWithCompare oldProduct, ProductWithCompare newProduct)
    {
        final int index = products.indexOf(oldProduct);
        if (index != PRODUCT_NOT_PRESENT)
        {
            products.set(index, newProduct);
        }
    }

    public void prepare()
    {
        // sort our list of products by weight
        //Collections.sort(products, Product.BY_WEIGHT);
    	Collections.sort(products, ProductWithCompare.BY_WEIGHT);
        // Jave 8 supports a sort method
    	//  ProductWithCompare.sort(ProductWithCompare.BY_WEIGHT);

        // find the product index that needs the heavy van
        int splitPoint = findSplitPoint();

        // assign views of the product list for heavy and light vans
        lightVanProducts = products.subList(0, splitPoint);
        heavyVanProducts = products.subList(splitPoint, products.size());
    }

    private int findSplitPoint()
    {
        for (int i = 0; i < products.size(); i++)
        {
            final ProductWithCompare product = products.get(i);
            if (product.getWeight() > LIGHT_VAN_MAX_WEIGHT)
            {
                return i;
            }
        }

        return 0;
    }

    public List<ProductWithCompare> getHeavyVanProducts()
    {
        return heavyVanProducts;
    }

    public List<ProductWithCompare> getLightVanProducts()
    {
        return lightVanProducts;
    }

    public Iterator<ProductWithCompare> iterator()
    {
        return products.iterator();
    }
}

