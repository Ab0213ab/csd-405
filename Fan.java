// Andrew Schaefer
// 8/11/21
// CSD405
// Module 1 Assignment

// Creates a Fan class
class Fan {
	
  // Data field	
  final int STOPPED = 0, SLOW = 1, MEDIUM = 2, FAST = 3;
  private int speed = 0;
  private boolean on;
  private double radius = 6;
  String color = "white";
  
  // Constructor no arguments
  public Fan() {

  }
  
  // Constructor with arguments
  public Fan(int s, boolean o, double r, String c) {
	  speed = s;
	  on = o;
	  radius = r;
	  color = c;
	  
  }
  // Method declaration
  int getSpeed() {
	 return speed;
	 
  }
  
  // Method declaration
  boolean getOn() {
	  return on;
  }
  
  // Method declaration
   double getRadius() {
	 return radius; 
  }
  
  // Method declaration
  String getColor() {
	  return color;
  }
  
  // Method declaration
  void setSpeed(int newSpeed) {
		speed = newSpeed;
	}
	
  // Method declaration	
  void setOn(boolean newOn) {
		on = newOn;
	}
  
  // Method declaration
  void setRadius(double newRadius) {
		radius = newRadius;
	}
  
  // Method declaration  
  void setColor(String newColor) {
	    color = newColor;
	}
	
  // Method declaration
  public String toString() {
	return speed + ", " + on + ", " + radius + ", " + color;  
  }

  // Main method declaration
  public static void main(String[] args) {
	  
  // Initializes an object w/ default values
  Fan fan_1 = new Fan();
  
  // Initializes an object w/ specified values 
  Fan fan_2 = new Fan(1, true, 20, "blue");
  
  // Prints a blank line
  System.out.println();
  // Displays a description of the program
  System.out.println("This program demonstrates Java classes, objects, and methods."); 
  // Prints a blank line
  System.out.println();
  // Displays a heading
  System.out.println("--USING toString() METHOD--");  
  
  // Uses the toString() method to display the values of the 1st fan object
  System.out.println("A summary description of the first fan object values is as" +
  " follows: " + fan_1.toString());
  
  System.out.println("-----------------------------------------------------------" + 
  "-----------------------------");
  // Prints a blank line
  System.out.println();
  // Displays a heading
  System.out.println("--USING GETTER METHODS--");
  
  // Uses the getSpeed() method to display the speed of the 1st fan object
  if (fan_1.getSpeed() == 0)
	  System.out.println("The first fan object is STOPPED.");
  else if (fan_1.getSpeed() == 1)
	  System.out.println("The first fan object speed is SLOW.");
  else if (fan_1.getSpeed() == 2)
	  System.out.println("The first fan object speed is MEDIUM.");
  else
	  System.out.println("The first fan object speed is FAST.");
  
  // Uses the getOn() method to display the ON/OFF state of the 1st fan object
  if (fan_1.getOn() == true)
	  System.out.println("The first fan object is ON.");
  else
	  System.out.println("The first fan object is OFF.");
  
  // Prints a blank line
  System.out.println();
  // Displays a heading
  System.out.println("--USING SETTER METHODS--");
  
  // Uses the setSpeed() method to modify the value of speed of the 1st fan object 
  fan_1.setSpeed(3);
  
  // Displays the new value of speed of the 1st fan object
  if (fan_1.getSpeed() == 0)
	  System.out.println("The first fan object has been STOPPED.");
  else if (fan_1.getSpeed() == 1)
	  System.out.println("The first fan object speed has been changed to SLOW.");
  else if (fan_1.getSpeed() == 2)
	  System.out.println("The first fan object speed has been changed to MEDIUM.");
  else
	  System.out.println("The first fan object speed has been changed to FAST.");
  
  // Uses the setOn() method to modify the value of on for the 1st fan object
  fan_1.setOn(true);
  
  // Displays the new value of on for the 1st fan object
  if (fan_1.getOn() == true)
      System.out.println("The first fan object has been changed to ON.");
  else
	  System.out.println("The first fan object has been changed to OFF.");
 
  // Prints a blank line
  System.out.println();
  // Displays a heading
  System.out.println("--USING toString() METHOD--");
  
  // Uses the toString() method to display the values of the 2nd fan object
  System.out.println("A summary description of the second fan object values is as" +
  " follows: " + fan_2.toString());
  
  System.out.println("-----------------------------------------------------------" + 
  "-----------------------------");
  // Prints a blank line
  System.out.println();
  // Displays a heading
  System.out.println("--USING GETTER METHODS--");
  
  // Uses the getRadius() method to display the radius of the 2nd fan object
  System.out.println("The second fan object radius is " + fan_2.getRadius() + ".");
  
  // Uses the getColor() method to display the color of the 2nd fan object
  System.out.println("The second fan object color is " + fan_2.getColor() + ".");
  
    // Prints a blank line
  System.out.println();
  // Displays a heading
  System.out.println("--USING SETTER METHODS--");
  
  // Uses the setRadius() method to modify the radius of the 2nd fan object
  fan_2.setRadius(50);

  // Uses the getRadius() method to display the new radius of the 2nd fan object
  System.out.println("The second fan object radius has been changed to " + fan_2.getRadius() + ".");
  
  // Uses the setColor() method to modify the color of the 2nd fan object
  fan_2.setColor("green");
  
  // Uses the getColor() method to display the new color of the 2nd fan object
  System.out.println("The second fan object color has been changed to " + fan_2.getColor() + ".");
	
  }
}