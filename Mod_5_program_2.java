// Andrew Schaefer
// 8/29/21
// CSD405
// Module 5 Assignment 
// Program #2

// This program demonstrates creating, writing to, and reading files as 
// well as using the try and catch keywords.

// Imports necessary packages
import java.io.*;
import java.util.*;


public class Mod_5_program_2 {

    // Main method declaration
    public static void main(String [] args) {
        
        // Creates new file named data.txt if file does not already exist  
        try {
            
            // Creates new File object
            File myObj = new File("data.txt"); 
            
            // If/Else statements determine if file already exists and if not,
            // creates it
            if (myObj.createNewFile()) {  
              System.out.println("File created: " + myObj.getName());  
            } 
            else {  
              System.out.println("File already exists.");  
            }  
        }
        
        // Handles exception
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();  
        } 


        try {
            
            // Creates a new FileWriter object
            FileWriter myWriter = new FileWriter("data.txt");

            // Creates a new Random number object
            Random rand_num = new Random();
            int number;

            // For loop controls how many numbers are added to file
            for (int counter = 0; counter < 11; counter++) {
                number = rand_num.nextInt(10);

                // toString() method converts integers to string
                String ss = Integer.toString(number);

                // Writes string to file
                myWriter.write(ss + ", ");
            }
           
            // Closes file
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        }

        // Handles exception
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        
        
        try {

            File myObj = new File("data.txt");

            // Creates new scanner object
            Scanner myReader = new Scanner(myObj);

            // While loop controls the flow through the file
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();

              // Displays the contents of the file
              System.out.println("The randomly generated number in data.txt" +
              " are: " + data);
            }
            
            // Closes the file
            myReader.close();
        }
        
        // Handles exception
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
       
    }
}