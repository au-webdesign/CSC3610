package Chapter20;

import java.util.*;

public class TestArrayAndLinkedList {
  public static void main(String[] args) {
    List<Integer> arrayList = new ArrayList<>();
    arrayList.add(1); // 1 is autoboxed to new Integer(1)
    arrayList.add(2);
    arrayList.add(3);
    arrayList.add(1);
    arrayList.add(4);
    arrayList.add(0, 10);
    arrayList.add(3, 30);

    System.out.println("A list of integers in the array list:");
    System.out.println(arrayList);

    LinkedList<Object> linkedList = new LinkedList<>(arrayList);
    linkedList.add(1, "red");
    linkedList.removeLast();
    linkedList.addFirst("green");

    System.out.println("\n--- Display the linked list backward:");
    for (int i = linkedList.size() - 1; i >= 0; i--) {
      System.out.print(linkedList.get(i) + " ");
    }
    
    System.out.println("\n--- Display the linked list2 backward:");
    LinkedList<Object> linkedList2 = new LinkedList<>();
    linkedList2.add("red");
    linkedList2.add("green");
    linkedList2.add("blue");
    linkedList2.add("orange");
    linkedList2.add("purple");
    for (int i = linkedList2.size() - 1; i >= 0; i--) {
        System.out.print(linkedList2.get(i) + " ");
      }
  }
}
