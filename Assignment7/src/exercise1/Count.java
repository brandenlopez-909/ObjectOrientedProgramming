//package exercise1;

//import java.util.List;

/**
 * This class has a static method which will count the number of elements within an array
 *
 */
public class Count {
	
	/**
	 * A generic static count method 
	 * @param <T> The ArrayList object type 
	 * @param t The ArrayList
	 * @return An integer indicating the size of the ArrayList t. 
	 */
	public static <T> int count(List<T> t) {
		return t.size();
	}
	
}
