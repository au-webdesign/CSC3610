package Chapter22;

public class TestAlgo2 {
	public static void main(String[] args) {
		String s1 = new String("Oh Happy Day!");
		int c = countLetters( s1, 's', 15);
	}
	public static int  countLetters ( String word, char letter, int threshold  ) {
		int count = 0;
		for ( int i=0; i<word.length(); i++ ) {
			if ( word.charAt(i) == letter ) {
				count++;
			}
		}
		if ( count > threshold )
			System.out.printf("\nThreshold exceeded looking for %s", letter );
		return count;
	}
}
