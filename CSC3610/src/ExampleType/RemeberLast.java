package ExampleType;

public class RemeberLast<T> {
	private T lastElement;
	private  int numElements;
	
	private void RememberLast() {
		numElements = 0;
		lastElement = null;
	}
	public T add ( T element ) {
		T prevLast = lastElement;
		lastElement = element; 
		numElements++;
		return prevLast;
	}
}
