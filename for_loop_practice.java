
// This program practices for and for each loops
// java for_loop_practice.java

import java.util.*;

public class for_loop_practice {
	public static void main(String [] args) {
		
	for (int x = 1; x < 11; x++) {
		System.out.println(x);
	} // end of 1st for loop


	for (int x = 1; x < 9; x++) {
		for (int y = 1; y < 11; y++) {
			System.out.print(y);
			System.out.print(" ");	
		} // end of 2nd for loop
		System.out.println(x);
	} // end of 1st for loop
	
	
	String[] animals = {"Tiger", "Dog", "Snake", "Monkey", "Parrot", "Horse"};
	
		for (String i : animals) {
			System.out.println(i);
		} // end of 3rd for loop
	
	} // end of main method
} // end of for_loop_practice class