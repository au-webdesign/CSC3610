package Review00;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class testGetNumWords {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentance = "Oh Happy Day";
		int res = getNumWords( sentance );
		System.out.printf("\nWord Res:%d sent:%s", res, sentance );
		 
		String sentance2 = "Oh Happy Day! Oh Happy Day!  Oh Happy Day?";
		int res2 = getNumSentances( sentance2 );
		System.out.printf("\nSentance Res:%d sent:%s", res2, sentance );
		}
	public static int getNumWords( String text) {
	  String pattern = "ABC123";
	  String pattern2 = "[a-zA-Z]+";
	  List  nWords  = getTokens( pattern2, text );
	  
	  return nWords.size();
	}
	public static int getNumSentances( String text) {
		  String pattern = "ABC123";
		  String pattern2 = "[^!?.]+";
		  List  nWords  = getTokens( pattern2, text );
		  
		  return nWords.size();
		}
	public static List<String> getTokens(String pattern, String text) {
		ArrayList<String> tokens = new ArrayList<String>();
		System.out.print("\nPattern:" + pattern );
		Pattern tokSplitter = Pattern.compile(pattern);
		Matcher m = tokSplitter.matcher(text);

		while (m.find()) {
			tokens.add(m.group());
			System.out.printf("\n Added:%s ", m.group());
		}

		return tokens;
	}

}
