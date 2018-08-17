package Chapter22;

import java.util.Scanner; 

public class ComputeFibonacci {
	static int counter = 0;
	static void incr() { 
		counter++;
	}
  /** Main method */
  public static void main(String args[]) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an index for the Fibonacci number: ");
    int index = input.nextInt();

    // Find and display the Fibonacci number
    System.out.println( 
      "Fibonacci number at index " + index + " is " + fib(index));
    System.out.printf( "\nincr called:%s times", counter );
    	      
  }

  /** The method for finding the Fibonacci number */
  public static long fib(long index) {
	 incr();
    if (index == 0) {// Base case
    	System.out.print(" --- Case0:" + 0);
      return 0;
    }  else if (index == 1) {// Base case
    	System.out.print(" --- Case1:" + 1);
      return 1;
    } else  { // Reduction and recursive calls
      //return fib(index - 1) + fib(index - 2);
    	System.out.print(" --- MainCase:" + index);
    	//return fib(index - 1) + fib(index - 2);
    	//return fib(index - 1);
    	
    	System.out.printf("\n----------------------------FIRST index-1:%s ctr:%d", (index-1), counter);
    	long fib1 = fib(index - 1); 
    	System.out.printf("\n-------------------------SECOND index-2:%s ctr:%d", (index-2), counter );
    	long fib2 = fib(index - 2);
    	System.out.printf( "\n-------- returning ctr:%d Fib1+fib2:%d - Fib1:%d Fib2:%d", counter, (fib1+fib2), fib1, fib2 );
    	return fib1+fib2;
    }
  }
}
