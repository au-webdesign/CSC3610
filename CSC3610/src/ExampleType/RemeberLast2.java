package ExampleType;

public class RemeberLast2<T> {
	private T lastElement;
	private  int numElements;
	
	private void RememberLast() {
		numElements = 0;
		lastElement = null;
	}
	public T add ( T element ) throws NullPointerException {
		if ( element == null ) {
			throw new NullPointerException( "RemeberLast Object: Received Null Elelement: Cannot continue");
		}
		T prevLast = lastElement;
		lastElement = element; 
		numElements++;
		return prevLast;
	}
}
