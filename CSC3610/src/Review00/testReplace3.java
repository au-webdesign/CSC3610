package Review00;

public class testReplace3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String testStr = "Oh Happy Day";
		String newString = replaceIt( testStr, 'a', 'x');
		System.out.printf( "Old String:%s New String: %s", testStr, newString);
	}
	public static String replaceIt( String word, char targetCh, char newCh) {
		
		char[] cList = word.toCharArray();
		char[] newWord = new char[cList.length];
		int i = 0;
		for ( char c: cList ) {
			if ( c == targetCh ) {
				c = newCh;
			}
			newWord[i] = c;
			i++;
		}
	    return new String( newWord );	
	}
}
