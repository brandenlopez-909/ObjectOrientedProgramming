/*
package exercise1;
import java.io.*;
import java.util.Scanner;
*/
public class CreateFile {


	
	public static void main(String[] args) {
	try {
		Scanner scnr =null;
		File newFile= null;
		FileWriter  myFileWriter = null;
		String sentence;
		newFile = new File("command_line_input.txt");
//The true in the below instance tells the writter to append to whatever content already exits 
//https://stackoverflow.com/questions/1625234/how-to-append-text-to-an-existing-file-in-java
		myFileWriter= new FileWriter(newFile, true);
		
		
		//We need to add to the file. 
		scnr = new Scanner(System.in);
		//Instructs the user how to quit 
		System.out.println("Enter @q to quit");
		
		
		//Keep on adding until it reaches the "@q"
		while(true) {
			sentence = (String) scnr.nextLine();
			if (sentence.equals("@q"))
				break;
			myFileWriter.append(sentence);
			//I want it to append on a new line. 
			myFileWriter.append("\n");
			//I believe this line is for decoding? 
			myFileWriter.flush();
		}
		myFileWriter.close();
		scnr.close();
		//If you wish to delete the file from the directory, close the IDE and then do so. 
	}
	//The errors that can be thrown are children of exception. Thus we can do the below.
	catch(Exception x) {x.getMessage();}
		}
}
	
