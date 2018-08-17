package Chapter22;

public class testSelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void selectionSort( int[] vals ) {
		
		int indexMin;
		
		for ( int i=0; i< vals.length-1; i++ ) {
			indexMin = 1;
			for ( int j=0; j< vals.length-1; j++ ) {
				if ( vals[j] < vals[indexMin] ) {
					indexMin = j;
				}
			}
			swap( vals, indexMin, i );
		}
	}

}
