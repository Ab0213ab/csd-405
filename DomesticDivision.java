
// Andrew Schaefer
// 9/2/21
// CSD405
// Module 6 Assignment (c)

// Creates a subclass that inherits from the Division class
class DomesticDivision extends Division {

    // Data fields
    String co_division_state;

    // Constructor
    public DomesticDivision(String co_division_name, int co_account_number, String co_division_state) {
        super(co_division_name, co_account_number);
        this.co_division_state = co_division_state;
        
    }

    // Method declaration, displays all values
    public void display() {
        System.out.println("Division name is: " + this.co_division_name);
        System.out.println("Account number is: " + this.co_account_number);
        System.out.println("Division state is: " + this.co_division_state);
    }
    
}