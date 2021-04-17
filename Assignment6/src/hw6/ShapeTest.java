//package hw6;

/** 
 * Tests the homework
 * @author Branden Lopez 
 *
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
	}
	
}
