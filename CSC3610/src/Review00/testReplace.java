package Review00;

public class testReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String testStr = "Oh Happy Day";
		String newString = replaceIt( testStr, 'a', 'x');
		System.out.printf( "Old String:%s New String: %s", testStr, newString);
	}
	public static String replaceIt( String word, char targetCh, char newCh) {
		char[] cList = word.toCharArray();
		for ( char c: cList ) {
			if ( c == targetCh ) {
				c = newCh;
			}
		}
	    return word;	
	}

}
