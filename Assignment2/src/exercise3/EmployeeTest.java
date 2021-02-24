//package exercise3;

/**
 * This tests the Employee Class
 *
 */
public class EmployeeTest {
	/**
	 * Used to run the test
	 */
	public static void main(String[] args) {
		
		
		double hours[] = {30,2,4,25,45};
		
		Employee johnSmith = new Employee("John", "Smith", "1580 Barton Rd", "123-45-678", "Male", 32, (float)175.2, 1738, "c", 60.00 );
		Employee lisaGray = new Employee("Lisa", "Gray", "1581 Barton Rd", "213-45-678", "Female", 30, (float)110.2, 1739, "f", 110000 );
		Employee timothyBriggs = new Employee("Timothy", "Briggs", "1582 Barton Rd", "124-35-678", "Male", 26, (float)150.2, 1740, "f", 80000 );
		Employee georgeWallace = new Employee("George", "Wallace", "1583 Barton Rd", "421-35-678", "Male", 24, (float)150.2, 1741, "p", 20.00 );
		Employee amyStudent = new Employee("Amy", "Student", "1584 Barton Rd", "124-35-876", "Female", 21, (float)108.2, 1742, "c", 45.00 );
		Employee test[] = {johnSmith, lisaGray, timothyBriggs, georgeWallace,amyStudent};
		
		for(int i= 0; i<test.length;i++) {
			test[i].introduce();
			test[i].calculatePay(hours[i]);
			System.out.println();
		}
	}
}