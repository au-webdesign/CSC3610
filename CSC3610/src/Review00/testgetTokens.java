package Review00;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class testgetTokens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> myResult = new ArrayList<String>();
		myResult = getTokens( "a", "Haaappy Daay!");
		for (int counter = 0; counter < myResult.size(); counter++) { 		      
	          System.out.printf("\n - CT:%d RES:%s", counter, myResult.get(counter)); 		
	      }
		System.out.println("\n--------------");
		List<String> myResult2 = new ArrayList<String>();
		myResult2 = getTokens( "a+", "Splitting a String is easy as 1 2 3 44");
		for (int counter = 0; counter < myResult2.size(); counter++) { 		      
	          System.out.printf("\n - CT:%d RES2:%s", counter, myResult2.get(counter)); 		
	      }  

		System.out.println("\n--------------");
		List<String> myResult3 = new ArrayList<String>();
		myResult3 = getTokens( "it*", "Splitting a String is easy as 1 2 3 44");
		for (int counter = 0; counter < myResult3.size(); counter++) { 		      
	          System.out.printf("\n - CT:%d RES3:%s", counter, myResult3.get(counter)); 		
	      }  
		System.out.println("\n--------------");
		List<String> myResult4 = new ArrayList<String>();
		myResult4 = getTokens( "it|St", "Splitting a String is easy as 1 2 3 44");
		for (int counter = 0; counter < myResult4.size(); counter++) { 		      
	          System.out.printf("\n - CT:%d RES4:%s", counter, myResult4.get(counter)); 		
	      } 
		System.out.println("\n--------------");
		List<String> myResult5 = new ArrayList<String>();
		myResult5 = getTokens( "1|2|3|4", "Splitting a String is easy as 1 2 3 44");
		for (int counter = 0; counter < myResult5.size(); counter++) { 		      
	          System.out.printf("\n - CT:%d RES5:%s", counter, myResult5.get(counter)); 		
	      } 
		
	 
		String pattern = "[a-z]";
		//String pattern = "[^a-z]";
		//String pattern = "[0-9]";
		//String pattern = "[0-9][0-0]";
		System.out.println("\n--------------");
		List<String> myResult7 = new ArrayList<String>();
		myResult7 = getTokens( pattern, "Splitting a String is easy as 1 2 3 44");
		for (int counter = 0; counter < myResult7.size(); counter++) { 		      
	          System.out.printf("\n - CT:%d RES7:%s", counter, myResult7.get(counter)); 		
	      }

		
	}
	public static List<String> getTokens(String pattern, String text ) {
		ArrayList<String> tokens = new ArrayList<String>();
		Pattern tokSplitter = Pattern.compile(pattern);
		Matcher m = tokSplitter.matcher(text);

		while (m.find()) {
			tokens.add(m.group());
		}

		return tokens;
	}


}
