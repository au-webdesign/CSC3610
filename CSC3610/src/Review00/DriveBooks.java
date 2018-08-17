package Review00;

public class DriveBooks {

	public static void main(String[] args) {
		Books[] myBooks = new Books[3];
		
		myBooks[0] = new Books();
		myBooks[0].setHardBack(true);
		myBooks[0].setCost(12.99);
		myBooks[0].setPrice(16.99);
		myBooks[0].setPublished(true);
		
		myBooks[1] = new Books("Jurasic Park", 9.99, 6.99, true, false );
		
		myBooks[2] = new Books("Jurasic Park II", 19.99, 16.99, true, false );
		
		outBooks( myBooks );
		
	}
	
	public static void outBooks( Books[] inBooks ) {
		for( int i=0; i<inBooks.length; i++ ) {
			System.out.printf( "\nBook: %s Title:%s Earnings per sale:%s", (i+1), inBooks[i].getTitle(), inBooks[i].getEarnings());
		}
		
	}

}
