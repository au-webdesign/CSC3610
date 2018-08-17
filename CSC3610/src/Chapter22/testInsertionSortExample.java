package Chapter22;

public class testInsertionSortExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void insertionSort( int[] vals ) {
		
		int indexInd;
		int currInd;
		
		for ( int pos=1; pos< vals.length; pos++ ) {
			currInd = pos;
			while ( currInd > 0 && vals[currInd] < vals[currInd-1]) {
			for ( int j=0; j< vals.length-1; j++ ) {
				 
					swap( vals, currInd, currInd -1 );
					currInd = currInd - 1;
			}
			
		}
	}
	}
}



