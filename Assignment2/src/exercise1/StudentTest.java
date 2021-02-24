//package exercise1;
/**
 * This class if for testing the Student.java class. 
 *
 */
public class StudentTest {
	/**
	 * Used to run the test. 
	 */
	public static void main(String[] args)
	{
	//First we instantiate the outer class
	 Student test = new Student("John", "Smith", 20, (float)3.6, "Computer Science", "School of Computer Science");
	 //Next we instantiate the inner class
	 //outerClass.innerClass variable = outerVariable.new innerClass()
	 Student.Course schedule = test.new Course();
	 schedule.printSchedule();
	}
	
}
