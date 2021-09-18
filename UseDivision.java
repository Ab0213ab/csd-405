
// Andrew Schaefer
// 9/2/21
// CSD405
// Module 6 Assignment (d)

public class UseDivision {

    // Main method declaration 
    public static void main(String[] args) {

    // Creates 4 instances of the concrete classes    
    InternationalDivision obj_1 = new InternationalDivision("Superclass International", 5377769, "France", "French");
    InternationalDivision obj_2 = new InternationalDivision("Interfaces Incorporated", 4207995, "Venezuela", "Spanish");
    DomesticDivision obj_3 = new DomesticDivision("Polymorphism & Co", 7775230, "Florida");
    DomesticDivision obj_4 = new DomesticDivision("The Method Overriders Corporation", 6068643, "Montana");

    // Method calls
    obj_1.display();
    obj_2.display();
    obj_3.display();
    obj_4.display();

    }
}