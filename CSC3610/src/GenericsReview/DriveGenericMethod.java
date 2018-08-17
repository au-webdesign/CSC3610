package GenericsReview;

import java.util.ArrayList;

public class DriveGenericMethod {

	public static void main(String[] args) {
		  
		 Integer[] list1 =   new Integer[] {1, 2, 3, 3, 3, 3 };
		 Integer  lookFor = 3;
		
	      Integer ct =  countAllOccurrences(  list1, lookFor );
	      System.out.printf( "Found ct:%s occurrences", ct );
	}

	public static <T> int countAllOccurrences(T[] list, T item) {
		   int count = 0;
		   if (item == null) {
		      for ( T listItem : list )
		         if (listItem == null)
		            count++;
		   }
		   else {
		      for ( T listItem : list )
		         if (item.equals(listItem))
		            count++;
		   }
		   return count;
	} 
}
