//package exercise1;

//import java.util.ArrayList;

/**
 * I wanted to make a generic class which could take in the ArrayLists and use a generic count method.
 *
 * @param <T> The desired Object type
 */
public class MyList<T> {
	/**
	 * My List is an array.
	 */
	ArrayList<T> myList = new ArrayList<T>();
	
	/**
	 * Empty constructor
	 */
	MyList(){
	}
	
	//Takes in an array of objects and adds them
	/**
	 * A constructor that accepts an array of type T.
	 * @param t The array
	 */
	MyList(T[] t){
		for(T i: t) {
			myList.add(i);
		}
	}
	
	//Setter
	/**
	 * We set the class by adding to it
	 * @param t
	 */
	public void add(T t){
		myList.add(t);
	}
	
	//Getter
	/**
	 * We get the class by returning what is in the ArrayList.
	 * @return The ArrayList
	 */
	public ArrayList<T> getAll() {
		return myList;
	}
	
	//Counter
	/**
	 * Counts the number of instances within the ArrayList
	 * @return
	 */
	public int count() {
		return myList.size();
	} 
	
	public static void main(String[] args) {
		Double[] testDouble = { 1.1, 1.2, 1.3, 1.4, 1.5, 1.6, 1.7,1.8};
		Integer[] testInt = {1,2,3,4,5,6};
		String[] testString = {"This", "is" ,"a" , "class", "example"};
		MyList<Double> doubleList = new MyList<Double>(testDouble);
		MyList<Integer> intList = new MyList<Integer>(testInt);
		MyList<String> stringList = new MyList<String>(testString);
		

		
		
		System.out.println(stringList.count());
		System.out.println(intList.count());
		System.out.println(doubleList.count());
		System.out.println( stringList.getAll());

		
		
	}
	

}
