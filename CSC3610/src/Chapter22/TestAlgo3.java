package Chapter22;

public class TestAlgo3 {
	public static void main(String[] args) {
		int[] testVals = { 10, 20, 30, 5, 2, 3, 4, 5};
		int[] retVals = reduce(testVals);
		int ct=1;
		for(  int val : retVals ) {
			System.out.printf( "\nct:%d V:%d", ct++, val);
		}
	}
	public static int[] reduce( int[] vals ) {
		int minIndex = 0;
		for( int i=0; i<vals.length; i++ ) {
			if ( vals[i] < vals[minIndex] ) {
				minIndex = i;
			}
		}
	    int minVal = vals[minIndex];
	    //System.out.printf("MinVal:%s",  minVal );
	    for( int i=0; i<vals.length; i++ ) {
			vals[i] = vals[i] - minVal; 
	    }
	    return vals;
	}
}
