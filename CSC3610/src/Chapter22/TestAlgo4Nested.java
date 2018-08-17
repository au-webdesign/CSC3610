package Chapter22;

public class TestAlgo4Nested {
	public static void main(String[] args) {
		int[]testVals = { 1, 2, 3, 4, 6, 8, 10, 12, 14 };
		//int[]testVals = { 2, 3, 4, 10 };
							
			int ret = maxDifference( testVals );
			System.out.printf("Result:%s", ret );
		}
		
	public static int  maxDifference( int[] vals ) {
		int max = 0;
		for ( int i=0; i<vals.length; i++ ) {
			for ( int j=0; j<vals.length; j++ ) {
				if ( vals[i] - vals[j] > max ) {
					max = vals[i] - vals[j];
				}
			}
		}
		return max;
		
	}
}
