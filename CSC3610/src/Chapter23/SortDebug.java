package Chapter23;

public class SortDebug {
	  public static void dumpItOut( int[] myList ) {
		    int ct = 0;
			for( int i: myList ){
				System.out.printf("\nct:%d i:%d", ct, i);
				ct++;
			}
	  }
	  public static void printIt( String msg, String flag ) {
		    System.out.printf("\n---- flag:%s msg:%s", msg, flag);
	  }
}
