// Andrew Schaefer
// 8/22/21
// CSD405
// Module 3 Assignment


// Creates an AndrewInteger class
class AndrewInteger {
	
	// Data field
	private int andrew;
	
  // Constructor no arguments
  public AndrewInteger() {

  }
  
  // Constructor with arguments
  public AndrewInteger(int andrew) {
	  this.andrew = andrew;  
  }
   
  // ___________________________________________________________ 
  // Getter and setter methods:
  
  // Method declaration
  public int getAndrew() {
	  return this.andrew;
  }
  
  // Method declaration
  public void setAndrew(int newAndrew) {
		this.andrew = newAndrew;
	}

  // ___________________________________________________________
  // Non-static methods: 

  // Method declaration	
  public boolean isEven() {
        return (this.andrew % 2) == 0;
    }

  // Method declaration	
  public boolean isOdd() {
	  return (this.andrew % 2) == 1;
	  
    }

  // Method declaration	
  public boolean isPrime() {
		if (this.andrew <= 1)
			return false;
		
		for (int i = 2; i < this.andrew; i++)
			if (this.andrew % i == 0)
				return false;
			
		return true;			
	}

    // ___________________________________________________________
    // Static methods:
	
	// Method declaration
	public static boolean isEven(AndrewInteger myInt) {
        return myInt.isEven();
    }

    // Method declaration
    public static boolean isOdd(AndrewInteger myInt) {
        return myInt.isOdd();
    }
	
    // Method declaration
    public static boolean isPrime(AndrewInteger myInt) {
        return myInt.isPrime();
    }
	
	// ___________________________________________________________
	// Static methods:
	
	// Method declaration
	public static boolean isEven(int myInt) {
        return (myInt % 2) == 0;
    }

    // Method declaration
    public static boolean isOdd(int myInt) {
        return (myInt % 2) == 1;
    }
	
    // Method declaration
    public static boolean isPrime(int myInt) {
        if (myInt == 1 || myInt == 2) {
            return true;
        }
        else {
            for (int i = 2; i < myInt; i++) {
                if (i % myInt == 0) return false;
            }
        }
        return true;
    } 
	

    // ___________________________________________________________
    // Equals() methods:
  
    // Method declaration	
    public boolean equals(int testInt) {
        if (testInt == andrew) 
            return true;
        return false;
    }

    // Method declaration
    public boolean equals(AndrewInteger myInt) {
        if (myInt.andrew == this.andrew) 
            return true;
        return false;
    }	
		
  
// ___________________________________________________________
  // Main method declaration
  public static void main(String[] args) {
	  
  // Initializes objects w/ default values
  AndrewInteger a_i_1 = new AndrewInteger(13);
  AndrewInteger a_i_2 = new AndrewInteger(13);
  AndrewInteger a_i_3 = new AndrewInteger(21);


  // ___________________________________________________________
  // Test code:

  // Displays a heading
  System.out.println("--USING GETTER METHOD--");
  
  System.out.println("The value of andrew is " + a_i_3.getAndrew());

  // Prints a blank line
  System.out.println();

  // Displays a heading
  System.out.println("--USING SETTER METHOD--"); 

  // Uses the setAndrew() method to modify the value of andrew of the a_i_3 object
  a_i_3.setAndrew(25);

  // Displays the new value of andrew of the a_i_3 object 
  System.out.println("The NEW value of andrew is " + a_i_3.getAndrew());

  // Prints a blank line
  System.out.println();  
	
  // Displays a heading
  System.out.println("--USING isEven() METHOD--");
  
  // Uses the isEven() method to determine if the value of andrew for the object is
  // even and prints a message depending on the results  
   if (a_i_1.isEven() == true)
	   System.out.println("The value of andrew is even.");
   else
	   System.out.println("The value of andrew is odd.");
   
  // Prints a blank line
  System.out.println();  
	
  // Displays a heading
  System.out.println("--USING isOdd() METHOD--");
  
  // Uses the isOdd() method to determine if the value of andrew for the object is
  // odd and prints a message depending on the results  
   if (a_i_2.isOdd() == true)
	   System.out.println("The value of andrew is odd.");
   else
	   System.out.println("The value of andrew is even.");
     
  // Prints a blank line
  System.out.println();  
	
  // Displays a heading
  System.out.println("--USING isPrime() METHOD--");
  
  // Uses the isPrime() method to determine if the value of andrew for the object is
  // prime and prints a message depending on the results  
   if (a_i_2.isPrime() == true)
	   System.out.println("The value of andrew is prime.");
   else
	   System.out.println("The value of andrew is not prime.");
   
  // Prints a blank line
  System.out.println();

  // Displays a heading
  System.out.println("--USING equals() METHOD--");  

   // Uses the equals() method to determine if the values of andrew for the objects are
   // equal to each other and prints a message depending on the results 
   if (a_i_1.equals(a_i_2))
	   System.out.println("The two andrew values are equal.");
   else
	   System.out.println("The two andrew values are not equal.");
   
  // Prints a blank line
  System.out.println();  
	
  // Displays a heading
  System.out.println("--USING isEven() METHOD--");
  
   // Uses the isEven() method to determine if the value of andrew for the object is
   // even and prints a message depending on the results 
   if (isEven(a_i_3) == true)
      System.out.println("The value of andrew is even.");
   else
	   System.out.println("The value of andrew is odd.");
   
  // Prints a blank line
  System.out.println();
   
  // Displays a heading
  System.out.println("--USING isOdd() METHOD--");
  
   // Uses the isOdd() method to determine if the value of andrew for the object is
   // odd and prints a message depending on the results 
   if (isOdd(a_i_1) == true)
      System.out.println("The value of andrew is odd.");
   else
	   System.out.println("The value of andrew is even.");
   
  // Prints a blank line
  System.out.println();
     
  // Displays a heading
  System.out.println("--USING isPrime() METHOD--");
  
   // Uses the isOdd() method to determine if the value of andrew for the object is
   // prime and prints a message depending on the results 
   if (isPrime(a_i_1) == true)
      System.out.println("The value of andrew is prime.");
   else
	   System.out.println("The value of andrew is prime.");
     
  // Prints a blank line
  System.out.println();  
	
  // Displays a heading
  System.out.println("--USING isOdd() METHOD--");
  
   // Uses the isOdd() method to determine if the value is even and prints a message 
   // depending on the results   
   if (isOdd(20) == true)
	   System.out.println("The value is odd.");
   else
	   System.out.println("The value is even.");
   
  // Prints a blank line
  System.out.println();  
	
  // Displays a heading
  System.out.println("--USING isPrime() METHOD--");
  
  // Uses the isPrime() method to determine if the value is prime and prints a message 
  // depending on the results  
   if (isPrime(2) == true)
	   System.out.println("The value is prime.");
   else
	   System.out.println("The value is not prime."); 
	   
  }	
	
}