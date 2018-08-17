package Chapter24;



public class TestLinkedObjects {

	public static void main(String[] args) {
		  MyPokemonNode  head, tail;
		  tail=null;
		  
		  
		  MyPokemonNode pika = new MyPokemonNode( "Pikachu");
		  pika.next=null;
		  
		  MyPokemonNode charz = new MyPokemonNode( "Charzard");
		  pika.next=charz;
		  head = pika;

		  System.out.printf("Linked them... First:%s Second:%s", head.theName, head.next.theName);
		  
		  MyPokemonNode weedle = new MyPokemonNode( "Weedle");
		  charz.next = weedle;
		  
		  MyPokemonNode Mu2 = new MyPokemonNode( "Mu2");
		  weedle.next = Mu2;
		  
		  MyPokemonNode SomeName = new MyPokemonNode( "SomeName");
		  Mu2.next = SomeName;
		  
		  MyPokemonNode MyHand = new MyPokemonNode("Head");
		  		  
		  MyHand.next = pika;

		  
		  // Lets find weedle
		  MyPokemonNode current = MyHand;
		  int index = 4;   // weedle
		  for (int i = 1; i <=index; i++) {
		        current = current.next;
		   }
		  System.out.printf( "\nFOUND index:%s Pokemon:%s", index, current.theName );

	}

}

 class MyPokemonNode {
    String theName;
    MyPokemonNode next;

    public MyPokemonNode(String theName ) {
      this.theName = theName;
    }
  }