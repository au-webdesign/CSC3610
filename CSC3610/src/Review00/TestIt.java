package Review00;

public class TestIt {
	public static void main(String[] args) {
		String s1 = new String("String 1");
		String s2 = new String("String 1");
		if (s1 == s2) {
	    System.out.println("Equal");
		}
		else {
	    System.out.println("Not equal");
		}
		String string1 = new String("Coursera");
		char letter = string1.charAt(4);
		 System.out.println( "Letter:" + letter );
		 
		 String text2 = new String ("Practice, practice, practice!");
		 System.out.println("Index:" +text2.indexOf("prac") );
		 
		 String text = "Hurray!!#! It's Friday! finally...";
		 String[] words = text.split("!+");
		 System.out.println("Words:");
		 for ( int i=0; i<words.length; i++ )
			 System.out.println("Word:" + words[i] );
		 //Assume that you have a Document object stored in the variable d, whose whole text string is

		 //"this is a test.23,54,390."

		 // Which of the following calls to getTokens will return the list of Strings given here:

		 // ["this is a test", "23", "54", "390"]
		 // a. d.getTokens("[^.,]+");
		 // b. d.getTokens("[a-z0-9]+");
		 //d.getTokens("[a-z0-9 ]+");
		 
		 String s = "Hello";
		 s.concat(" World!");
		 System.out.println(s);
	}
}
