package HWRegEx;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class BasicDocument  {
	/** Create a new BasicDocument object
	 * 
	 * @param text The full text of the Document.
	 */
	private String text;
	public BasicDocument(String text){
	
			this.text = text;
	}
	
	/** Returns the tokens that match the regex pattern from the document 
	 * text string.
	 * @param pattern A regular expression string specifying the 
	 *   token pattern desired
	 * @return A List of tokens from the document text that match the regex 
	 *   pattern
	 */
	protected List<String> getTokens(String pattern) {
		ArrayList<String> tokens = new ArrayList<String>();
		Pattern tokSplitter = Pattern.compile(pattern);
		Matcher m = tokSplitter.matcher(text);
		
		while (m.find()) {
			tokens.add(m.group());
		}
		
		return tokens;
	}
	/** Return the entire text of this document */
	public String getText()
	{
		return this.text;
	}
	
	/**
	 * getNumWords - 
     *   @return The number of words in the document
	 *   Where - 
	 *         - A "word":  a contiguous string of alphabetic characters
	 *            i.a any  upper or lower case characters from a to z (or A to Z)
	 *   Note -  
	 *       1. This method should ignore number in word count and you can 
	 *          assume  that the document does not have any strings that combine numbers and letters. 
	 *       2. Check the testCase example for additional examples. 
	 *       3. This method should process the entire text string each time it is called.  
	 */
	public int getNumWords() {
		//TODO: Implement this method (see description above)   
		 int size = 0;
		  
		  return size;
	}
	
	/**
	 * getNumSentences -
	 *     @return  - the number of sentences in the document.
	 *     Where - 
	 *        
	 *     1. A sentence -> a contiguous strings of characters ending in one of these characters: .,   !,  or ?.
	 *                      or the last contiguous document characters characters in the document
	 *                      (even if they don't end with a punctuation mark).
	 *     2. Look at the main method for example test cases. 
     *     3. Make sure to process the entire text string when this method is called 
	 */

	public int getNumSentences() {
	    /* 
	     *   TODO: Implement this method.  
	     */
		 int size = 0;
		  
		 return size;
	}
	
	/**
	 * getNumSyllables()
	 * @return  - The number of syllables in the document.
	 * Where  - 
	 *   - Description: 
	 *             - Examine the stored text and counts the total number of syllables.
	 *   			- Process the entire string each time called. 
	 *   - Syllabus Counting rule: 
	 *        -  Each contiguous sequence of one or more vowels is a syllable, 
	 *            - Special rules: 
	 *            	  - a lone "e" at the end of a word is not a syllable 
	 *               - UNLESS the word has no other syllables. 
	 *       		 - the letter y is considered y a vowel.
	 *       regular expression to 
	 *     - See the main method for examples 
	 *     - Use a countSyllabus (see next method TODO) method inside a loop to count number of syllabus per word. 
	 * 
	 */
	public int getNumSyllables()
	{
	    //TODO: Implement this method
		int count = 0; 
		return count;
	}
	/**
	 * countSyllables()
	 * @return  - The number of syllables in a word.
	 * Where  - 
	 *   - Description: 
	 *             - Examine the input words and  count the total number of syllables.
	 *   			- Process the entire string each time called. 
	 *              - Make sure to implement the special rules getNumSyllables()
	 */
	protected int countSyllables(String word)
	{
		// TODO: Implement this method so that you can call it from getNumSyllables
	   
		int count=0;
		
	    return count;
	}
	/** A method for testing
	 * 
	 * @param doc The Document object to test
	 * @param syllables The expected number of syllables
	 * @param words The expected number of words
	 * @param sentences The expected number of sentences
	 * @return true if the test case passed.  False otherwise.
	 */
	public static boolean testCase(BasicDocument doc, int syllables, int words, int sentences) {
		System.out.println("Testing text: ");
		System.out.print(doc.getText() + "\n....");
		boolean passed = true;
		int syllFound = doc.getNumSyllables();
		int wordsFound = doc.getNumWords();
		int sentFound = doc.getNumSentences();
		if (syllFound != syllables) {
			System.out.println("\nIncorrect number of syllables.  Found " + syllFound 
					+ ", expected " + syllables);
			passed = false;
		}
		if (wordsFound != words) {
			System.out.println("\nIncorrect number of words.  Found " + wordsFound 
					+ ", expected " + words);
			passed = false;
		} else {
			System.out.println("\nCORRECT: number of words.  Found " + wordsFound 
					+ ", expected " + words);
		}
		if (sentFound != sentences) {
			System.out.println("\nIncorrect number of sentences.  Found " + sentFound 
					+ ", expected " + sentences);
			passed = false;
		} else {
			System.out.println("\nCORRECT! number of sentences.  Found " + sentFound 
					+ ", expected " + sentences);
		}
		
		if (passed) {
			System.out.println("passed.\n");
		}
		else {
			System.out.println("FAILED.\n");
		}
		return passed;
	}
	
	/* The main method for testing this class. 
	 * You are encouraged to add your own tests.  */
	public static void main(String[] args)
	{
		/* Each of the test cases below uses the method testCase.  The first 
		 * argument to testCase is a Document object, created with the string shown.
		 * The next three arguments are the ngetTumber of syllables, words and sentences 
		 * in the string, respectively.  You can use these examples to help clarify 
		 * your understanding of how to count syllables, words, and sentences.
		 */
		testCase(new BasicDocument("This is a test.  How many???  "
		        + "Senteeeeeeeeeences are here... there should be 5!  Right?"),
				16, 13, 5);
		testCase(new BasicDocument(""), 0, 0, 0);
		testCase(new BasicDocument("sentence, with, lots, of, commas.!  "
		        + "(And some poaren)).  The output is: 7.5."), 15, 11, 4);
		testCase(new BasicDocument("many???  Senteeeeeeeeeences are"), 6, 3, 2);
		testCase(new BasicDocument("Here is a series of test sentences. Your program should "
				+ "find 3 sentences, 33 words, and 49 syllables. Not every word will have "
				+ "the correct amount of syllables (example, for example), "
				+ "but most of them will."), 49, 33, 3);
		testCase(new BasicDocument("Segue"), 2, 1, 1);
		testCase(new BasicDocument("Sentence"), 2, 1, 1);
		testCase(new BasicDocument("Sentences?!"), 3, 1, 1);
		testCase(new BasicDocument("Lorem ipsum dolor sit amet, qui ex choro quodsi moderatius, nam dolores explicari forensibus ad."),
		         32, 15, 1);
	}
	
}
