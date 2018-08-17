package Chapter20;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class DriveProductsWithSuppliers {

	public static void main(String[] args) {
		ProductWithCompare hammer = new ProductWithCompare("Claw Hammer", 12 );
		ProductWithCompare treeSaw = new ProductWithCompare( "Tree Saw", 26 );
		ProductWithCompare wrench = new ProductWithCompare( "Wrench", 15 );
		ProductWithCompare chainSaw = new ProductWithCompare( "Chain Saw", 35 );
		ProductWithCompare  sDriver = new ProductWithCompare( "Screw Drivers", 4 );
		
		List<ProductWithCompare> products = new ArrayList<>();
		products.add( hammer );
		products.add( treeSaw );
		
		Supplier Jake = new Supplier( "Jakes Goods", products );
		List<ProductWithCompare> products2 = new ArrayList<>();
		products2.add( wrench );
		products2.add( chainSaw );
		Supplier Elwoods = new Supplier( "Elwoods Blues Goods", products2 );
		
		System.out.printf("Our First supplier is %s", Jake.getName() );
		List<ProductWithCompare> jakesProducts = Jake.getProducts();
	
		System.out.print("\n-------Jakes Products ---------\n");
		for ( ProductWithCompare product:jakesProducts ) {
			System.out.printf("\nProduct Name:%s weighs:%d", product.getName(), product.getWeight());
			
		}
		
		

	}

}
