// Andrew Schaefer
// 8/18/21
// CSD405
// Module 2 Assignment

import java.util.ArrayList;

// Creates a UseFans class
class UseFans {
	
  // Data fields	
  final int STOPPED = 0, SLOW = 1, MEDIUM = 2, FAST = 3;
  private int speed = 0;
  private boolean on;
  private double radius = 6;
  String color = "white";
  
  // Constructor no arguments
  public UseFans() {

  }
  
  // Constructor with arguments
  public UseFans(int speed, boolean on, double radius, String color) {
	  this.speed = speed;
	  this.on = on;
	  this.radius = radius;
	  this.color = color;
	  
  }
  
  // Method declaration
  int getSpeed() {
	 return this.speed;
	 
  }
  
  // Method declaration
  boolean getOn() {
	  return this.on;
  }
  
  // Method declaration
   double getRadius() {
	 return this.radius; 
  }
  
  // Method declaration
  String getColor() {
	  return this.color;
  }
  
  // Method declaration
  void setSpeed(int newSpeed) {
		this.speed = newSpeed;
	}
	
  // Method declaration	
  void setOn(boolean newOn) {
		this.on = newOn;
	}
  
  // Method declaration
  void setRadius(double newRadius) {
		this.radius = newRadius;
	}
  
  // Method declaration  
  void setColor(String newColor) {
	    this.color = newColor;
	}
	
  // Method declaration 
  public static void displayStuff(ArrayList<UseFans>useFansList) {
	  System.out.print(useFansList); 
  }
  
  // Method declaration 
  public void displayStuff() {
	  System.out.println("Speed is " + this.speed);
	  System.out.println("ON/OFF state is " + this.on);
	  System.out.println("Radius is " + this.radius);
	  System.out.println("Color is " + this.color);
	  
  }
	
  // toString() method from module 1 removed and replaced with displayStuff() method 
  // as per assignment instructions.
	

  // Main method declaration
  public static void main(String[] args) {
	  
  // Initializes an object w/ default values
  UseFans usefans_1 = new UseFans();
  // Initializes an object w/ specified values 
  UseFans usefans_2 = new UseFans(1, true, 20, "blue");
  // Initializes an object w/ specified values 
  UseFans usefans_3 = new UseFans(2, true, 30, "orange");
   
    
	// Creates an Array List called useFansList
  	ArrayList<UseFans> useFansList = new ArrayList<>();
		
	// Adds usefans objects to Array List	
	useFansList.add(usefans_1);
	useFansList.add(usefans_2);
	useFansList.add(usefans_2);
  
  // Prints a blank line
  System.out.println();
  // Displays a description of the program
  System.out.println("This program demonstrates Java classes, methods, objects and a" + 
  " collection of objects."); 
  // Prints a blank line
  System.out.println();
  
  
  System.out.println("The Array List of usefans objects has the following objects in it: ");
  displayStuff(useFansList);
  
  // Prints a blank line
  System.out.println();
  
  // Uses the displayStuff() method to display the values of the 1st usefans object
  System.out.println("\nA summary description of the first usefans object values is as" +
  " follows: ");
  usefans_1.displayStuff();
  
  System.out.println("-----------------------------------------------------------" + 
  "-----------------------------");
  // Prints a blank line
  System.out.println();
   
  
  // Displays a heading
  System.out.println("--USING GETTER METHODS--");
  
  // Uses the getSpeed() method to display the speed of the 1st fan object
  if (usefans_1.getSpeed() == 0)
	  System.out.println("The first usefans object is STOPPED.");
  else if (usefans_1.getSpeed() == 1)
	  System.out.println("The first usefans object speed is SLOW.");
  else if (usefans_1.getSpeed() == 2)
	  System.out.println("The first usefans object speed is MEDIUM.");
  else
	  System.out.println("The first usefans object speed is FAST.");
  
  // Uses the getOn() method to display the ON/OFF state of the 1st usefans object
  if (usefans_1.getOn() == true)
	  System.out.println("The first usefans object is ON.");
  else
	  System.out.println("The first usefans object is OFF.");
  
  
  // Prints a blank line
  System.out.println();
    
  
  // Displays a heading
  System.out.println("--USING SETTER METHODS--");
  
  // Uses the setSpeed() method to modify the value of speed of the 1st usefans object 
  usefans_1.setSpeed(3);
  
  // Displays the new value of speed of the 1st usefans object
  if (usefans_1.getSpeed() == 0)
	  System.out.println("The first usefans object has been STOPPED.");
  else if (usefans_1.getSpeed() == 1)
	  System.out.println("The first usefans object speed has been changed to SLOW.");
  else if (usefans_1.getSpeed() == 2)
	  System.out.println("The first usefans object speed has been changed to MEDIUM.");
  else
	  System.out.println("The first usefans object speed has been changed to FAST.");
  
  // Uses the setOn() method to modify the value of on for the 1st usefans object
  usefans_1.setOn(true);
  
  // Displays the new value of on for the 1st fan object
  if (usefans_1.getOn() == true)
      System.out.println("The first usefans object has been changed to ON.");
  else
	  System.out.println("The first usefans object has been changed to OFF.");
  
 
  // Prints a blank line
  System.out.println();
  
  
  // Uses the displayStuff() method to display the values of the 2nd usefans object
  System.out.println("A summary description of the second usefans object values is as" +
  " follows: ");
  usefans_2.displayStuff();
  
  System.out.println("-----------------------------------------------------------" + 
  "-----------------------------");
  // Prints a blank line
  System.out.println();
   
  
  // Displays a heading
  System.out.println("--USING GETTER METHODS--");
  
  // Uses the getRadius() method to display the radius of the 2nd usefans object
  System.out.println("The second usefans object radius is " + usefans_2.getRadius() + ".");
  
  // Uses the getColor() method to display the color of the 2nd usefans object
  System.out.println("The second usefans object color is " + usefans_2.getColor() + ".");
  
  
  // Prints a blank line
  System.out.println();
  
  
  // Displays a heading
  System.out.println("--USING SETTER METHODS--");
  
  // Uses the setRadius() method to modify the radius of the 2nd usefans object
  usefans_2.setRadius(50);

  // Uses the getRadius() method to display the new radius of the 2nd usefans object
  System.out.println("The second usefans object radius has been changed to " + usefans_2.getRadius() + ".");
  
  // Uses the setColor() method to modify the color of the 2nd usefans object
  usefans_2.setColor("green");
  
  // Uses the getColor() method to display the new color of the 2nd usefans object
  System.out.println("The second usefans object color has been changed to " + usefans_2.getColor() + ".");
  
  
  // Uses the displayStuff() method to display the values of the 3rd usefans object
  System.out.println("\nA summary description of the third usefans object values is as" +
  " follows: ");
  usefans_3.displayStuff();
  
  System.out.println("-----------------------------------------------------------" + 
  "-----------------------------");
	
  }
}