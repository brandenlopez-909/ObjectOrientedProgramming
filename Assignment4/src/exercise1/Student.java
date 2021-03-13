//package exercise1;
/**
 * 
 * @author JungleBook
 *
 */

public class Student implements Cloneable{
	private String firstName, lastName, major, department;
	private int age;
	private float gpa;
	
	private Course course;
	
	//The homework notes do not tell us to have the constructor pass a Course argument so I will not include it. 
	//Instead Course must be added by using the set method. 
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
		 * Sets the course
		 * @param newCourse The desired course.
		 */
		public void setCourse(Course newCourse) {this.course = newCourse;}
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
		 * Prints the info of the student class and the Course variable if it is not null
		 */
		public void printInfo() {
			if(course == null) {
			System.out.println( this.firstName +" "+ this.lastName+ ", age "+ this.age + " " + this.gpa +"gpa in "
					+ this.major + " within " + this.department);
		}
			else {
				System.out.println( this.firstName +" "+ this.lastName+ ", age "+ this.age + " " + this.gpa +"gpa in "
						+ this.major + " within " + this.department);
				course.printInfo();
			}
				
		}
		
		/**
		 * Overrides the object's clone() method. 
		 * Throws CloneNotSupportedException
		 */
		@Override
		protected Object clone() throws CloneNotSupportedException{
			Student that = (Student)super.clone();
			that.course = (Course) that.course.clone();
			return that;
		}
		
}
