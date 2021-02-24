//package exercise1;


/**
 * This class Student has functionality for Administration of Students 
@author Branden Lopez  

*/

public class Student {
	private String firstName,lastName, major, department;
	private int age;
	private float gpa;
	
	//An constructor that takes no arguments and fills the instance with non-null values.
	/**
	 * An empty constructor for experimental purpose.
	 */
	public Student() 
	{
		this.firstName = ""; 
		this.lastName = "";
		this.major = "";
		this.department = "";
		this.age =0;
		this.gpa =0;
	}
	
	//The required constructor with all arguments. 
	/**
	 * The constructor you should use, must fill in all arguments or it will not work. 
	 * @param firstName The student's first name.
	 * @param lastName The student's last name.
	 * @param age The student's age in years.
	 * @param gpa The student's gpa.
	 * @param major The student's major.
	 * @param department The department the major belongs to. 
	 */
	public Student(String firstName, String lastName, int age, float gpa, String major, String department) 
	{
		this.firstName = firstName; 
		this.lastName = lastName;
		this.major = major;
		this.department = department;
		this.age = age;
		this.gpa = gpa;	
	}
	
	//All set methods.
	/**
	 * Sets the first name. Good you made a mistake on initialization or are using the empty constructor.
	 * @param newName The students first name.
	 */
	public void setFirstName(String newName) {this.firstName = newName;}
	/**
	 * Sets the last name. Good you made a mistake on initialization or are using the empty constructor.
	 * @param newName The students last name.
	 */
	public void setLastName(String newName) {this.lastName = newName;}
	/**
	 * Sets the Major name. Good you made a mistake on initialization or are using the empty constructor.
	 * @param newMajor The students major.
	 */
	public void setMajor(String newMajor) {this.major = newMajor;}
	/**
	 * Sets the Department the major belongs to. Good you made a mistake on initialization or are using the empty constructor.
	 * @param newDepartment The major's department.
	 */
	public void setDepartment(String newDepartment) {this.department = newDepartment;}
	/**
	 * Sets the student's GPA. Good you made a mistake on initialization or are using the empty constructor.
	 * @param newGPA The student's GPA.
	 */
	public void setGPA(float newGPA) {this.gpa = newGPA;}
	
	/**
	 * Sets the student's age. Good you made a mistake on initialization or are using the empty constructor.
	 * @param newAge The student's age.
	 */
	public void setAge(int newAge) {this.age = newAge;}
	
	
	//All Getters
	/**
	 * Gets the student's first name. 
	 * @return The student's first name 
	 */
	public String getFirstName() {return this.firstName;}
	/**
	 * Gets the student's last name. 
	 * @return The student's last name 
	 */
	public String getLastName() {return this.lastName ;}
	/**
	 * Gets the student's major. 
	 * @return The student's major 
	 */
	public String getMajor() {return this.major;}
	
	/**
	 * Gets the student's major department. 
	 * @return The student's major department.  
	 */
	public String getDepartment() {return this.department;}
	/**
	 * Gets the student's GPA. 
	 * @return The student's GPA. 
	 */
	public float getGPA() {return this.gpa;}
	/**
	 * Gets the student's age. 
	 * @return The student's age.
	 */
	public int getAge() {return this.age;}
	
	/**
	 * Is a nested class for printing the schedule of the student.
	 * Since we do not take the student's schedule, we are taking my schedule. 
	 */
	public class Course
	{	
		/**
		 * This method prints the schedule of the student. 
		 */
		public void printSchedule() 
		{
			System.out.println("CS151 Mon/Wed 6-7:15");
			System.out.println("CS46B Mon/Wed 7:30-8:45");
			
		}
	}
		
		
	}
	
