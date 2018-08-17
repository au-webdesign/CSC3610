package ExampleType;

class SLLNode2<E> {

	  SLLNode2<E> next;
	  E data;

	  public SLLNode2() {
	    this.next = null;
	    this.data = null;
	   // System.out.printf("\nFL1: 0 arg");
	  }

	  public SLLNode2(E theData) {
	    this.data = theData;
	    //System.out.printf("\nFL1: 1 Arg ");
	  }

	  public SLLNode2(E theData,
	                 SLLNode2<E> prevNode) {
		 
	    this(theData);
	    //System.out.printf("\nFL2: 2 arg - second line");
	    this.next = prevNode.next;
	    prevNode.next = this;
	  }

	  public static void main(String[] args) {
		  // Part 1 --- what happens if create in this order?
		       //System.out.print("\n-----n0 Start ");
	    SLLNode2<Integer> n0 = new SLLNode2<Integer>();
	           //System.out.print("\n-----n0 DONE ---- Start N1 ");
	   SLLNode2<Integer> n1= new SLLNode2(1,n0);
	          //System.out.print("\n-----n1 DONE ---- Start N2 ");
	          //System.exit(1);
	         //System.out.print("\n-----n2 DONE ---- Start N3 ");
	    SLLNode2<Integer> n2 = new SLLNode2(2,n0);
	    
	
	   
	  }
}
