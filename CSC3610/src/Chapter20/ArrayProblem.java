package Chapter20;

import java.util.Arrays;

//import com.sun.glass.ui.Window;

public class ArrayProblem {

	public static void main(String[] args) {
		Product hammer = new Product("Claw Hammer", 12 );
		Product saw = new Product( "Tree Saw", 6 );
		//Create
		Product[] products = { hammer, saw };
		// Print 
		//System.out.println( products );
		//System.out.println( Arrays.toString( products ));
		
		// Add => Arrays don't allow to add on 
		//Product wrench = new Product("Pliers", 3);
		//products[2] = wrench;    // you'd think this would work but doesn't resize
		System.out.println( Arrays.toString(products ));
		// You could write an add 
		
		// duplicate => suppose you don't want duplicates 
		//         arrays don't have a way to enforce that
		products = add( hammer, products );
		System.out.println( Arrays.toString( products ));
	}
	private static Product[] add( Product product, Product[] array) {
		int length = array.length; 
		Product[] newArray = Arrays.copyOf( array, length + 1);
		return newArray;
	}
}
