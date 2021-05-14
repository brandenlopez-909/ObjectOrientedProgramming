/*
package exercise2;
import java.io.*;
import java.util.Scanner;
*/
public class ReadFileInput {

	public static void main(String[] args) {
		Scanner scnr =null;
		File newFile= null;
			try {
				newFile = new File("./quote.txt");
				scnr= new Scanner(newFile);
				while(scnr.hasNext()) {
					System.out.println(scnr.nextLine());
				}
			} catch (FileNotFoundException e) {
				System.out.println("FileNotFoundException: Please go to the 151 class page download 'quote.txt' "
						+ " and place it in the correct folder.");
			}

			
		
	
	}
}
