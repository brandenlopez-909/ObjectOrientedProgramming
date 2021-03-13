//package exercise1;

public class StudentTest {

	public static void main(String[] args) {
		//Course for john
		Course spring = new Course("CS151", "Object Oriented Design and Programming", "CS", "6:00pm", "Tue" );
		//John is our test student
		Student test = new Student("John", "Smith", 20, (float)3.6, "Computer Science", "School of Computer Science");
		//We were never told to have Course be an argument of our student ctr 
		test.setCourse(spring);
		test.printInfo();
		System.out.println("\nAttempting to copy:");
		System.out.println("Changing the first and last name in the copy and the course:\n");
		
		try{
			Student copy = (Student)test.clone();
			copy.setFirstName("Branden");
			copy.setLastName("Lopez");
			Course twospring = new Course("PSTAT120A", "Probability and Statistics", "PSTAT", "1:00pm", "Tue" );
			copy.setCourse(twospring);
			copy.printInfo();
			
			System.out.println("\nSeeing if it changed the original instance");
			test.printInfo();
			System.out.println("Done!");
			
			}
		catch(CloneNotSupportedException x){ System.out.println(x);}
		
		
		
		
	} 
}
