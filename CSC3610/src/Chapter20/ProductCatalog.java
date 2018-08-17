package Chapter20;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ProductCatalog implements Iterable<Product> {
	private Set<ProductWithCompare> products = new HashSet<>();
	public void isSuppliedBy( Supplier supplier );
	

	@Override
	public Iterator<Product> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
