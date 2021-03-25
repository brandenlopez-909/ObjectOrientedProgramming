//package exercise2;

import java.util.Collections;
import java.util.LinkedList;


import java.util.Comparator;

public class Student {

	private String firstName, lastName, major, department;
	private int age;
	private float gpa;
	
	private LinkedList<Course> courses = new LinkedList<Course>();
	
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
	
	//Course Methods 
		/**
		 * Adds a new course
		 * @param newCourse The desired course.
		 */
		public void addCourse(Course newCourse) {this.courses.add(newCourse);}
		/**
		 * Removes the specified course
		 * @param course the course to be removed
		 */
		public void removeCourse(Course course) {this.courses.remove(course);}
		/**
		 * Sorts the courses based on a method.
		 * @param method A string variable, the course string we will sort on(courseName, courseDescription, department, time, weekday). 
		 * @param ascending A boolean variable indicating if it is ascending or descending
		 */
		public void sortCourses(String method ,boolean ascending) {
			if(ascending) {
				if(method == "courseName") {
					Collections.sort(this.courses, new Comparator<Course>() {
					@Override
					public int compare(Course c1, Course c2) {
						return c1.getCourseName().compareTo(c2.getCourseName()); 
						}
					});
				}	
				if(method =="department") {
					Collections.sort(this.courses, new Comparator<Course>() {
					@Override
					public int compare(Course c1, Course c2) {						//We need the getmethod to change below. 
						return c1.getDepartment().compareTo(c2.getDepartment()); 
						}
					});
				}	
				
				if(method == "weekday") {					
					Collections.sort(this.courses, new Comparator<Course>() {
					@Override
					public int compare(Course c1, Course c2) {						//We need the getmethod to change below. 
						return c1.getWeekday().compareTo(c2.getWeekday()); 
						}
					});
				}
				if(method == "courseDescription") {					
					Collections.sort(this.courses, new Comparator<Course>() {
					@Override
					public int compare(Course c1, Course c2) {						//We need the getmethod to change below. 
						return c1.getCourseDescription().compareTo(c2.getCourseDescription()); 
						}
					});
				}
				
				if(method == "time") {					
					Collections.sort(this.courses, new Comparator<Course>() {
					@Override
					public int compare(Course c1, Course c2) {
						//We need the getmethod to change below. 
						return c1.getTime().compareTo(c2.getTime()); 
						}
					});
				}
				
			}
			else {
				if(method == "courseName") {
					Collections.sort(this.courses, new Comparator<Course>() {
					@Override
					public int compare(Course c1, Course c2) {
						return c2.getCourseName().compareTo(c1.getCourseName()); 
						}
					});
				}	
				if(method =="department") {
					Collections.sort(this.courses, new Comparator<Course>() {
					@Override
					public int compare(Course c1, Course c2) {						//We need the getmethod to change below. 
						return c2.getDepartment().compareTo(c1.getDepartment()); 
						}
					});
				}	
				
				if(method == "weekday") {					
					Collections.sort(this.courses, new Comparator<Course>() {
					@Override
					public int compare(Course c1, Course c2) {						//We need the getmethod to change below. 
						return c2.getWeekday().compareTo(c1.getWeekday()); 
						}
					});
				}
				if(method == "courseDescription") {					
					Collections.sort(this.courses, new Comparator<Course>() {
					@Override
					public int compare(Course c1, Course c2) {						//We need the getmethod to change below. 
						return c2.getCourseDescription().compareTo(c1.getCourseDescription()); 
						}
					});
				}
				
				if(method == "time") {					
					Collections.sort(this.courses, new Comparator<Course>() {
					@Override
					public int compare(Course c1, Course c2) {						//We need the getmethod to change below. 
						return c2.getTime().compareTo(c1.getTime()); 
						}
					});
				}
				}
			for(Course i: this.courses) {
				i.printInfo();
				}
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
		 * Prints the info of the student class and the Course variable if it is not null
		 */
		public void printInfo() {
			if(courses == null) {
			System.out.println( this.firstName +" "+ this.lastName+ ", age "+ this.age + " " + this.gpa +"gpa in "
					+ this.major + " within " + this.department);
		}
			else {
				System.out.println( this.firstName +" "+ this.lastName+ ", age "+ this.age + " " + this.gpa +"gpa in "
						+ this.major + " within " + this.department);
				//course.printInfo();
			}
				
		}
			
	public static void main(String[] args) {
		//Here I am testing the class
			Course spring = new Course("CS151", "Object Oriented Design and Programming", "CS", "6:00pm", "Tue" );
			Student test = new Student("John", "Smith", 20, (float)3.6, "Computer Science", "School of Computer Science");
			Course springtwo = new Course("PSTAT120A", "Probability and Statistics", "PSTAT", "1:00pm", "Tue" );
			Course springthree = new Course("Math104B", "Numerical Analysis", "MATH", "11:00am", "Wed" );
			test.addCourse(springtwo);
			test.addCourse(spring);
			test.addCourse(springthree);
			//Note the method .sortCourses( courseVariableString , booleanForAscending)
			test.sortCourses("courseDescription",false);
	}
}
