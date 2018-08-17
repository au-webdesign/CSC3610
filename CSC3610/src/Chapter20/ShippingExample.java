package Chapter20;

import java.util.ArrayList;
import java.util.List;

public class ShippingExample {

	public static void main(String[] args) {
		ProductWithCompare hammer = new ProductWithCompare("Claw Hammer", 12 );
		ProductWithCompare treeSaw = new ProductWithCompare( "Tree Saw", 26 );
		ProductWithCompare wrench = new ProductWithCompare( "Wrench", 15 );
		ProductWithCompare chainSaw = new ProductWithCompare( "Chain Saw", 35 );
		ProductWithCompare  sDriver = new ProductWithCompare( "Screw Drivers", 4 );
		
		Shipment s = new Shipment();
	    s.add(hammer); 
	    s.add(treeSaw);
	    s.add(wrench);
	    s.add(chainSaw);
	    s.add(sDriver);

	}

}
