//package exercise1;

//import java.util.ArrayList;
//import static exercise1.Count.count;

public class MethodTest {
	public static void main(String[] args) {
		Double[] testDouble = { 1.1, 1.2, 1.3, 1.4, 1.5, 1.6, 1.7,1.8};
		Integer[] testInt = {1,2,3,4,5,6};
		String[] testString = {"This", "is" ,"a" , "static", "example"};
		
		ArrayList<Double> staticDouble = new ArrayList<Double>();
		for(double i: testDouble) {
			staticDouble.add(i);
		}
		
		ArrayList<Integer> staticInteger = new ArrayList<Integer>();
		for(int i: testInt) {
			staticInteger.add(i);
		}
		
		ArrayList<String> staticString = new ArrayList<String>();
		for(String i: testString) {
			staticString.add(i);
		}
		System.out.println(count(staticString));
		System.out.println(count(staticInteger));
		System.out.println(count(staticDouble));
		System.out.println( staticString );
	}
	
	
}
