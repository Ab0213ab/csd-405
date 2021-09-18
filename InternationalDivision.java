
// Andrew Schaefer
// 9/2/21
// CSD405
// Module 6 Assignment (b)

// Creates a subclass that inherits from the Division class
class InternationalDivision extends Division {

    // Data fields
    String co_division_country;
    String language_spoken;

    // Constructor
    public InternationalDivision(String co_division_name, int co_account_number, String co_division_country, String language_spoken) {
        super(co_division_name, co_account_number);
        this.co_division_country = co_division_country;
        this.language_spoken = language_spoken;
        
    }

    // Method declaration, displays all values
    public void display() {
        System.out.println("Division name is: " + this.co_division_name);
        System.out.println("Account number is: " + this.co_account_number);
        System.out.println("Division country is: " + this.co_division_country);
        System.out.println("Language spoken is: " + this.language_spoken); 
    }

}