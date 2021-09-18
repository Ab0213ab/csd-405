
// Andrew Schaefer
// 9/2/21
// CSD405
// Module 6 Assignment (a)

// Creates an abstract class
abstract class Division {

    // Data fields
    String co_division_name;
    int co_account_number;

    // Constructor 
    public Division(String co_division_name, int co_account_number) {
        this.co_division_name = co_division_name;
        this.co_account_number = co_account_number;
    }

    // Abstract method declaration
    abstract void display();

}