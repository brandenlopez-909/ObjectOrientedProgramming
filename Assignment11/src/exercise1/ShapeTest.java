/*
package exercise1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
*/

/** 
 * The original use of this was to test homework6
 * Instead it is being used for homework11. 
 * Look for the comment indicating where that code starts 
 * Saves the shapes are serialized objects
 */
public class ShapeTest {

	 public static void main(String[] args) {
		 Rectangle testRectangle = new Rectangle(1.0,1.0);
		 Triangle testTri = new Triangle(1, 1);
		 Circle testCircle = new Circle(1);
		 Hexagon testHex = new Hexagon(1);
		 
		 Shapes test = new Shapes();
		 Shape[] container = {testRectangle, testTri, testCircle, testHex};
		 
		 test.setShapeList(container);
		 test.compute();
		 
		 System.out.println("\nNow we illustrate the add method");
		 
		 Rectangle testRectangle2 = new Rectangle(3.0,3.0);
		 Triangle testTri2 = new Triangle(3, 4);
		 Circle testCircle2 = new Circle(3);
		 Hexagon testHex2 = new Hexagon(3);
		 
		 test.add(testRectangle2);
		 test.add(testTri2);
		 test.add(testCircle2);
		 test.add(testHex2);
		 test.compute();
		 
		 System.out.println("\n\nTesting for min and max");
		 test.max();
		 test.min();
		 
		 System.out.println("\nNow we try the thread");
		 
		 Thread t1 = new Thread() {
			 public void run() {
				 System.out.println( "Starting a new thread\n" );
				 test.compute(); 
			 }
		 };
		 
		 Thread t2 = new Thread() {
			 public void run() {
				System.out.println( "Starting a new thread\n" );
				test.compute(); 
			 }
		 };
		/*Wow it worked. 
		For testing purposes I got ride of synchronized in the compute method
		this causes an area in the second thread(t2) to print out before
		 t1 is done. 
		Thus it performed as expected. 
		*/
		t1.start();
		t2.start();
		
		
		/* Homework11
		 * We need to save 8 shapes as serializations. 
		 */
		int counter = 1;
		for(Shape i:test.getShapes()) {
			
			try {
				FileOutputStream streamOut = new FileOutputStream("./Object" +counter+".ser");
				ObjectOutputStream objectOutput = new ObjectOutputStream (streamOut);
				objectOutput.writeObject(i);
				objectOutput.close();
				streamOut.close();
				counter =counter+1;
			}
			catch(IOException e) {e.getMessage();}
		}
		
	}
	
}
