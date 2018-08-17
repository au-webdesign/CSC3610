package Chapter20;

import java.util.*;

public class TestIterator {
  public static void main(String[] args) {
    Collection<String> collection = new ArrayList<>();
    collection.add("New York"); 
    collection.add("Atlanta"); 
    collection.add("Dallas"); 
    collection.add("Madison"); 

    Iterator<String> iterator = collection.iterator();
    while (iterator.hasNext()) {
      System.out.print(iterator.next().toUpperCase() + " ");
    }
    System.out.println("\n====================");
    System.out.println("\n==================== Can also use an anonymous inner class ");
    
    collection.forEach( new java.util.function.Consumer<String>() {
    		    public void accept(String e) {
    		      System.out.print(e.toUpperCase() + " ");
    		    }
    });
                  
  }
}
