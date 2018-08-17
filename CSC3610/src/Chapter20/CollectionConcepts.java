package Chapter20;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionConcepts {

	public static void main(String[] args) {
		Product hammer = new Product("Claw Hammer", 12 );
		Product saw = new Product( "Tree Saw", 6 );
		Product wrench = new Product( "Wrench", 15 );
		//Create a generic type collection of products
		Collection<Product> products = new ArrayList<Product>();
		// arrayList implements list interface that extends the collection interface
		Collection<Product> products2 = new ArrayList<>(); // can also do it this way
	    
		// add our items into the products collection
		//
		products.add(hammer);
		products.add(saw);
		products.add(wrench);
		// the ArrayList will call the toString method
		System.out.println(products);
		// 
		// Can also use the iterator
		// The iterator lets us step through products 1 at a time
		
		final Iterator<Product> productIterator = products.iterator();
		while ( productIterator.hasNext()) {
			Product product = productIterator.next();
			System.out.println( product );
		}
		// Explicitely using the iterator is not common
		// But could also do the following using a foreach loop
		//  -- Under the hood will expand the loop and use an iterator
		//  -- A clean -> hidden iterator
		System.out.print("\n----------------\n");
		for ( Product product:products ) {
			System.out.println( product );
		}
		// Still there are some uses for iterators ..
		// E.g., want to remove items during the loop.
		final Iterator<Product> productIterator2 = products.iterator();
		while ( productIterator2.hasNext()) {
			Product product2 = productIterator2.next();
			if (product2.getWeight() < 6 ) {
				productIterator2.remove();
			}
			
		}
		System.out.println( "Our list now is ----");
		System.out.println( products );
		
		// Other things you can do
		System.out.println( "Products Size=" +products.size());
		System.out.println( "Products IsEmpty=" +products.isEmpty() );
		
		System.out.println( "Hammer?" + products.contains( hammer ));
		
		
		// Using removeAll()
		Collection<Product> subProducts = new ArrayList<Product>();
		subProducts.add( hammer );
		subProducts.add( saw );
		// Remove all takes another collection to figure 
		//   out what to remove 
		products.removeAll( subProducts);
		System.out.print("Products=" + products );
		
		// If looping over collection with foreach 
		// cannot modify it
	}

}
