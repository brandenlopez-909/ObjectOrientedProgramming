//package exercise1;

/**
 * Course class for saving information about courses. 
 *
 */
public class Course implements Cloneable{

	private String courseName, courseDescription, department, time, weekday;
	
	/**
	 * This is our class constructor 
	 * @param courseName The course name
	 * @param courseDescription The course description
	 * @param department The department that hosts the course
	 * @param time The time of the course 
	 * @param weekday The weekday the course is held.
	 */
	Course(String courseName,String courseDescription,String department,String time,String weekday){
		this.courseName = courseName;
		this.courseDescription = courseDescription;
		this.department = department;
		this.time = time; 
		this.weekday = weekday; 
	}
	
	//Setters
	/**
	 * Sets the course name 
	 * @param newCourseName The desired name 
	 */
	public void setCourseName(String newCourseName) {this.courseName =newCourseName ;}
	/**
	 * Sets the course description
	 * @param newCourseDescription the desired description
	 */
	public void setCourseDescription(String newCourseDescription) {this.courseDescription =newCourseDescription ;}
	/**
	 * Sets the department which hosts the course
	 * @param newDepartment the desired department
	 */
	public void setDepartment(String newDepartment) {this.department =newDepartment ;}
	/**
	 * Sets the time the course occurs
	 * @param newTime the desired time
	 */
	public void setTime(String newTime) {this.time =newTime ;}
	/**
	 * Sets the weekday the course occurs
	 * @param newWeekday the desired weekday
	 */
	public void setWeekday(String newWeekday) {this.weekday =newWeekday ;}
	
	//Getters
	/**
	 * Gets the course name
	 * @return the desired name
	 */
	public String getCourseName() {return this.courseName ;}
	/**
	 * Gets the course description 
	 * @return the course description
	 */
	public String getCourseDescription() {return this.courseDescription ;}
	/**
	 * Gets the department
	 * @return The department
	 */
	public String getDepartment() {return this.department ;}
	/**
	 * Gets the time which the course occurs
	 * @return The time 
	 */
	public String getTime() {return this.time ;}
	/**
	 * Gets the weekday the course occurs
	 * @return
	 */
	public String getWeekday() {return this.weekday ;}
	
	/**
	 * Prints the info of course
	 */
	public void printInfo() {
		System.out.println( this.courseName +" " + this.courseDescription
				+ " " + this.department + " " + this.time + "," +  this.weekday);
		
	}
	
	/**
	 * Overrides the clone() method for deep copies. 
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException{
		Course thing = (Course)super.clone();
		return thing; 
		
	}
		
	
}
