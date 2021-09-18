// Andrew Schaefer
// 8/29/21
// CSD405
// Module 5 Assignment 
// Program #1

// This program demonstrates the use of Lists and ArrayLists as well as the try and catch keywords. 

// Imports necessary packages
import java.io.*;
import java.util.*;


public class Mod_5_program_1 {
    public static void main(String[] args) {

    // Creates a list to hold all the elements that will go into the ArrayList
    // (This was done to shorten the add() statements)     
    List<String> nameList = Arrays.asList( "1. Charles Darwin", "2. Albert Einstein", "3. Isaac Newton",
    "4. Nikola Tesla", "5. Ada Lovelace", "6. Galileo Galilei", "7. Marie Curie", "8. Stephen Hawking",
    "9. Carl Sagan", "10. Neil DeGrasse Tyson");

    // Creates an ArrayList named myCoolArrayList
    ArrayList<String> myCoolArrayList = new ArrayList<String>();

    // Adds all elements from nameList to myCoolArrayList
    myCoolArrayList.addAll(nameList);

    // Displays a heading
    System.out.println("--Greatest Scientists of all time--");

    // Prints a blank line
    System.out.println();

    // For each loop iterates through myCoolArrayList
    for (String n : myCoolArrayList) {
        System.out.println(n);
    }

    // Creates a scanner object 
	Scanner myInput = new Scanner(System.in);

    // Prompts the user to input which element they would like to display
	System.out.println("\nEnter the number of the scientist you would like to display: ");
	int choice = myInput.nextInt();

    try {
        // Displays the element chosen by user input
        System.out.println(myCoolArrayList.get(choice - 1));
    }

    // Handles exception
    catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("The index you have entered is invalid.");
        System.out.println("A number between 1 & 10 is required.");
        e.printStackTrace();
    }
    

    }
}
