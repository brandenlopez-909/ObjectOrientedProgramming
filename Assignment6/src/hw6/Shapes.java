//package hw6;

import java.util.ArrayList;

/**
 * An easy way to manipulate individial shape instances. 
 * @author JungleBook
 *
 */
public class Shapes{
	 ArrayList<Shape> shapeList;
	 
	 /**
	  * An empty constructor, can be filled with the add method or setter method. 
	  * If you wish to pass many shapes, please use setShapeList
	  */
	 Shapes(){
		 shapeList = new ArrayList<Shape>();
	 }
	 
	 //Ctr for one shape
	 /**
	  * This constructor takes one shape.  
	  * If you wish to pass many shapes, please use setShapeList
	  * @param newShape The desired shape
	  */
	 Shapes(Shape newShape){
		 shapeList = new ArrayList<Shape>();
		 shapeList.add(newShape);
	 }
	 
	 /**
	  *  The add method adds individual instances
	  *  @param newShape the shape instance
	  */
	 public boolean add(Shape newShape) {
		 return shapeList.add(newShape);
	 } 
	 
	 //remove
	 /**
	  * Removes a shape from the ArrayList
	  * @param removeShape The instance you wish to remove 
	  * @return True/False. False is the instance does not exist.
	  */
	 public boolean  remove(Shape removeShape) {
		 return shapeList.remove(removeShape);
	 }
	 
	 //Getters 
	 //Aim: get what is held in the shapeList
	 /**
	  * Gets the shapes ArrayList. 
	  * @return An ArrayList of Shapes
	  */
	 public ArrayList<Shape> getShapes(){
		 return shapeList;
	 }
	 
	 //Setters 
	 /**
	  * Sets many shapes at once.  
	  * @param newEntries An arrayList of shapes
	  */
	 public void setShapeList(ArrayList<Shape> newEntries ) {
		 for(Shape i:newEntries ) {
			 shapeList.add(i);
		 } 
		 
	 }
	 //We can overload this to accept an arraylist
	 /**
	  * Sets many shapes at once.
	  * @param newEntries  An array of shapes
	  */
	 public void setShapeList(Shape[] newEntries ) {
		 for(Shape i:newEntries ) {
			 shapeList.add(i);
		 }  
	 }
	 
	 /*Implement a synchronized public method called compute() in which you iterate through the
	 	members of shapeList and make a call to compute the shape’s area and print the result to
	 	command line output
	 */
	 
	 //The issues is that Shape.computeArea does not work.
	 /**
	  * Computes the area of all instances within the Shapes Arraylist.
	  */
	 synchronized public void compute() {
		 //Must we compute this with a thread? I think so! 
		 for(Shape i: shapeList) {
			 System.out.println( i.computeArea() );
			 
		 }
		 
	 }
	 
	 //Min method
	 /**
	  * Prints the minimum instance.
	  */
	 public void min() {
		 double min = Double.MAX_VALUE;
		 Shape minShape = null;
		 for(Shape i: shapeList) {
			 if( i.computeArea() < min) {
				 min = i.computeArea();
				 minShape = i;
			 }
		 }
		 System.out.println("The min is: " + minShape.toString());
	 }
	 
	 //Max method
	 /**
	  * Prints the max instance. 
	  */
	 public void max() {
		 double max = Double.MIN_VALUE;
		 Shape maxShape = null;
		 for(Shape i: shapeList) {
			 if( i.computeArea() > max) {
				 max = i.computeArea();
				 maxShape = i;
			 }
		 }
		 
		 
		 
		 System.out.println("The max is: \n" + maxShape.toString());
	 }
	 
	

}
