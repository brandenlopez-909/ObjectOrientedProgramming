//package exercise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class ListManipulator {
	ArrayList<Integer> list = new ArrayList<Integer>();
	
	//Not to sure I need a ctor, I think I can make the methods static
	ListManipulator(ArrayList<Integer> list){
		this.list =list;}
	
	/**
	 * This static method allows us to sort an ArrayList
	 * @param myLst The list you wish to sort
	 * @param ascending true for ascending, false for descending order.
	 * @return The sorted list
	 */
	public static ArrayList<Integer> sort(ArrayList<Integer> myLst,boolean ascending){
		if(ascending) {
			//Collections has a lot of good stuff. 
			Collections.sort(myLst);
			return myLst;
			
			}
		else {
			Collections.sort(myLst, Collections.reverseOrder());
			return myLst;
			}
		}
	
	/**
	 * Swaps the largest and smallest elements in the list.
	 * @param myLst The list you wish to perform on 
	 * @return The sorted list. 
	 */
	public static ArrayList<Integer> swapLargestSmallest(ArrayList<Integer> myLst){
		//Swap only the smallest and largest. 
		/* For some reason Java Collections API does not show that we can use 
		 * .indexOf() instead I found it via Stack exchange
		 * https://stackoverflow.com/questions/22911722/how-to-find-array-index-of-largest-value/22911923  
		 */
		int index_min = myLst.indexOf(Collections.min(myLst));
		int index_max = myLst.indexOf(Collections.max(myLst));
		
		Collections.swap(myLst, index_min, index_max);
		return myLst;
	}
		/**
		 * Prints out the elements and the frequency of the element within the array.
		 * @param myLst The list you wish to make a table for. 
		 */
	public static void table(ArrayList<Integer> myLst) {
		//If we sort first, we can display the table in ascending order.
		ListManipulator.sort(myLst, true);
		//Used so we will not repeat the elements in a table. 
		HashSet<Integer> unique = new HashSet<Integer>();
		int freq = 0;
		for(int i: myLst) {
			//When adding to a hashset, it returns true if it the object is unique. Else it returns false. 
			if(unique.add(i)) {
				//Shout of Collections API
			freq = Collections.frequency(myLst, i);
			System.out.println(  i+"->" +freq);
			}
		}
	}
	//Testing my code. 
	public static void main(String[] args) {
		ArrayList<Integer> test = new ArrayList();
		test.add(9);
		test.add(5);
		test.add(7);
		test.add(1);
		test.add(1);
		test.add(4);
		System.out.println(test);	
		ListManipulator.sort(test, true);
		System.out.println(test);	
		
		ListManipulator.swapLargestSmallest(test);
		System.out.println(test);
		
		ListManipulator.table(test);
	}
}
