// Andrew Schaefer
// 8/27/21
// CSD405
// Module 4 Assignment

import java.util.*;

// Creates an AndrewArrayListTest class
class AndrewArrayListTest {

    // Method declaration
    public static Integer max(ArrayList<Integer> awesomeArrayList) {
        
        // Initializes max_value variable 
        Integer max_value = -1;

        // For loop iterates through the ArrayList
        for (int i = 0; i < awesomeArrayList.size(); i++) {

          // If statement compares each ArrayList element and adds the one
          // with the higher value to the max_value variable
          if (awesomeArrayList.get(i) > max_value) {
            max_value = awesomeArrayList.get(i);
          }
        }

        // If statements determines if ArrayList is sent empty and if so,
        // returns 0, otherwise it returns the value of the max_value variable  
        if (awesomeArrayList.size() == 0)
          return 0;
        else
          return max_value;
    }


  // Main method declaration 
  public static void main(String[] args) {
    
    // Creates an ArrayList names awesomeArrayList
    ArrayList<Integer> awesomeArrayList = new ArrayList<Integer>();
     
    // Creates a scanner object for user input
    Scanner scanner = new Scanner(System.in);

    // Displays this program's functionality
    System.out.println("This simple program accepts user input integers, " +
    "adds them to an ArrayList, and returns the integer with the highest value."); 

    // Displays this program's instructions
    System.out.println("Type one integer at a time and press enter to" +
    " add the number to the ArrayList. Enter 0 when finished.");
    
    // While loop allows user to enter multiple integers and breaks 
    // when 0 is entered 
    while (true) {
        System.out.println("Enter an integer: ");
        awesomeArrayList.add(scanner.nextInt());
        if (awesomeArrayList.contains(0) == true)
            break;
    }

    // Calls the max method with awesomeArrayList as an argument to 
    // display the integer with the highest value
    System.out.println("The integer in the ArrayList with the highest value " +
    "is " + max(awesomeArrayList) + ".");

  }

}