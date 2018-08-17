package ExampleType;

class SLLNode<E> {

	  SLLNode<E> next;
	  E data;

	  public SLLNode() {
	    this.next = null;
	    this.data = null;
	   // System.out.printf("\nFL1: 0 arg");
	  }

	  public SLLNode(E theData) {
	    this.data = theData;
	    //System.out.printf("\nFL1: 1 Arg ");
	  }

	  public SLLNode(E theData,
	                 SLLNode<E> prevNode) {
		 
	    this(theData);
	    //System.out.printf("\nFL2: 2 arg - second line");
	    this.next = prevNode.next;
	    prevNode.next = this;
	  }

	  public static void main(String[] args) {
		  // Part 1 --- what happens if create in this order?
		       //System.out.print("\n-----n0 Start ");
	    SLLNode<Integer> n0 = new SLLNode<Integer>();
	           //System.out.print("\n-----n0 DONE ---- Start N1 ");
	   SLLNode<Integer> n1= new SLLNode(1,n0);
	          //System.out.print("\n-----n1 DONE ---- Start N2 ");
	          //System.exit(1);
	         //System.out.print("\n-----n2 DONE ---- Start N3 ");
	    SLLNode<Integer> n2 = new SLLNode(2,n0);
	    
	
	   
	  }
}
