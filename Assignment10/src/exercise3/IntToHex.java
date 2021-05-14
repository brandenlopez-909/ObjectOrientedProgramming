/*
package exercise3;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;
*/
public class IntToHex {

	
	public static void main(String[] args) {
		Scanner scnr =null;
		try {
		scnr = new Scanner(System.in);
		System.out.print("Please enter any integer: ");
		Integer value = (Integer)scnr.nextInt();
		
		//I remembered that Integer API mentioned something about this. 
		String hex = Integer.toHexString(value);
		System.out.println("Our hexidecimal is "+ hex);
		
		//Taken from: https://www.javatpoint.com/java-hex-to-decimal
		int decimal=Integer.parseInt(hex,16);
		
		System.out.println("Converting back to an integer we have: "+ decimal);
	}catch(InputMismatchException x) {
		System.out.println("InputMismatchException: This application only accepts integers");
		}
		
	}
}
