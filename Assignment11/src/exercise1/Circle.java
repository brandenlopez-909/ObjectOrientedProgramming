//package exercise1;

/**
 * Circle Class
 *
 */
public class Circle extends Shape{
	
		//Needs a ctr
		//Note length = width for circles 
		//Note2 length/2 = r 
		/**
		 *Circle Constructor. The radius of the circle.   
		 * @param newLength
		 */
		Circle(double newLength){
			super(newLength);
		}
		
		/**
		 * Circle constructor that takes no arguments 
		 */
		Circle(){super();}
		
		//Setters
		/**
		 * Sets the length
		 */
		public void setLength(double newLength) {
			super.setLength(newLength);
		}
		
		/**
		 * Sets the width
		 */
		public void setWidth() {
			super.setWidth(width);
		}
		
		//Getters 
		/**
		 * Gets the width
		 */
		public double getWidth(){
			return super.getWidth();
		}
		
		/**
		 * Gets the length
		 */
		public double getLength(){
			return super.getLength();
		}
		
		//What is the best way to do this? 
		//I wanted to use anonymous classes
		// Area of a circle:  Math.PI * Math.pow(super.getLength()/2 , 2)
		// 
		
		
		/**
		 * Computes the area
		 */
		@Override
		synchronized public double computeArea() {
			return Math.PI * Math.pow(super.getLength() , 2);
		}
		
		/**
		 * Returns the information in a neat string.  
		 */
		public String toString() {
			return ("Circle: The length is " + this.len + " the width is "+ 
					this.width + " the area is " + this.computeArea());
					}
		
		
		
	
	
}
