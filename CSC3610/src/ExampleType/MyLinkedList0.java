package ExampleType;

public class MyLinkedList0<E> {
	private ListNode<E> head;
	private ListNode<E> tail;
	private int size;
	
	public MyLinkedList0() {
		size = 0;
		head = new ListNode<E>(null);
		tail = new ListNode<E>(null);
		head.next = tail;
		tail.prev = head;
	}

}
