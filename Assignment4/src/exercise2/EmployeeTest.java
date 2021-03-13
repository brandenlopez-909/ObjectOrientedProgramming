//package exercise2;

/**
 * Tests if the employee class handles exceptions properly 
 * @author JungleBook
 *
 */
public class EmployeeTest {

	public static void main(String[] args) {
		int[] hours = {40,23,1,0,-5,45};
		
		Employee test = new Employee("John", "Smith", 101,35);
		float earnings; 
		//Put the for loop on the outside to run thru all possible scenarios. 
		for(int i:hours) {
			try {
			earnings = test.computePay(i);
			System.out.println(earnings);
			}
			catch(TooManyHoursWorkedException| NumberFormatException x){
				System.out.println(x.getMessage());
			}
		}
	}
	
}
