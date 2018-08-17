package GenericsReview;

public class DriveDemo1 {

	public static void main(String[] args) {
		DemoObject1 DO = new DemoObject1();
		
		String myName = "Dave";
		Integer numClasses = 3;
		Integer numSemesters = 2;
		
		DO.set(myName);
		
		DO.set( numClasses );
		Object c1 = DO.get();
		
	}
}
