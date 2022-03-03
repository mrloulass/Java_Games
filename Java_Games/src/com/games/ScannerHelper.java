package com.games;

import java.util.Scanner;

public class ScannerHelper {
	
	public static String ReadInputString() {
		// declare a new Scanner object
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		// read in user input and store it in the scanned variable
		String scanned = scan.nextLine();
	
		// return the String result to who ever the "ScannerHelper.ReadInputString()" is called
		return scanned;
		
	}
	
    
	
	public static int ReadInputInt(){
        // declare a new Scanner object
        
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

        // read in user input and store it in the scanned variable
        int scanned = scan.nextInt();
 

        // return the int result to wherever the "ScannerHelper.ReadInputInt()" is called
        return scanned;
    }
	
}

