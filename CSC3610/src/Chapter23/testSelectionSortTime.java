package Chapter23;

public class testSelectionSortTime {
    public static void main(String args[])
    {
    	SelectionSort ob = new SelectionSort();
    	long startTime = System.nanoTime();
        int arr[] = {64,25,12,22,11,22,34, 43, 23, 1231, 123,22, 22 ,222};
        try {
			Thread.sleep(3 * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        ob.sort(arr);
        long endTime = System.nanoTime();
        double estTime = (endTime - startTime ) / 100000000.0;
        
        System.out.printf("Sorted array is... ");
        ob.printArray(arr);
        System.out.printf( "this took %3.2f seconds", estTime );
    }
}
