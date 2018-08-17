package Review00;

public class testSplit {

	public static void main(String[] args) {
		String[] tokens = "Java HTML Perl  PHP".split(" ", 0);
		for (int i = 0; i < tokens.length; i++) {
		  System.out.printf("\nCt:%d is TOK:%s", i, tokens[i]);
		}
	}

}
