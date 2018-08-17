package Chapter22;

public class TestAlgo {

	public static void main(String[] args) {
		String w = new String("Apple Sauce");
		char letter = 'u';
		if ( hasLetter( w, letter )) {
			System.out.printf("Yes String:%s hasLetter:%s", w, letter);
		} else {
			System.out.printf("NO! String:%s DOES NOT have Letter:%s", w, letter);
		}
	}
	public static boolean hasLetter ( String word, char letter ) {
		for ( int i=0; i<word.length(); i++ ) {
			if ( word.charAt(i) == letter ) {
				return true;
			}
		}
		return false;
	}

}
