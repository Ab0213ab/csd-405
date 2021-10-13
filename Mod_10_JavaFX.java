
// Andrew Schaefer
// 9/24/21
// CSD-405
// Module 10 Assignment

// This simple program demonstrates the use of JavaFX image, ImageView, and EventHandler classes.

// Assignment instructions: Write a program that displays four images randomly 
// selected from a deck of 52 cards. The attached zip file has card files titled 
// 1.png, 2.png, 3.png, 4.png, …, 52.png. For this application store the images 
// in a “cards” sub directory and then randomly select four cards for display.
// Finally, add a refresh button below the cards that when clicked, displays 
// another four random cards.


// Imports the necessary JavaFX packages
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import java.util.ArrayList;
import javafx.scene.control.Button;


// Creates a Mod_10_JavaFX class that inherits from Application
public class Mod_10_JavaFX extends Application {

    // Overrides the start method in the Application class
	@Override 
	public void start(Stage primaryStage) {

        // Creates a Button instance
        Button refreshButton = new Button("Refresh");

		// Creates an HBox instance
		VBox pane = new VBox(5);

        // Sets the VBox minimum size
        pane.setMinSize(500, 500);

        // Registers the handler
        refreshButton.setOnAction(handler -> getCards(pane));

        // Calls the getCards() method on the VBox
        getCards(pane);

        // Adds the button to the VBox
        pane.getChildren().add(refreshButton);

        // Sets the stage title
		primaryStage.setTitle("Module 10 JavaFX");
        // Creates a scene instance and places it in the stage
		Scene scene = new Scene(pane);
        // Places the scene in the stage
		primaryStage.setScene(scene);
        // Displays the stage
		primaryStage.show(); 
	}

    // Method declaration (takes a VBox argument)
    private void getCards(VBox pane) {

        // Clears the VBox
        pane.getChildren().clear();

        // Creates an ArrayList of integers
        ArrayList<Integer> cards = new ArrayList<>();

        // Counts up to 52 and adds each integer to the ArrayList
        for (int counter = 0; counter < 52; counter++) {
            cards.add(counter + 1);
        }

        // Randomizes the ArrayList elements
        java.util.Collections.shuffle(cards);

        // Counts up to 4 and uses each integer as the index for the image
        for (int counter = 0; counter < 4; counter++) {

            // Adds images to the VBox
            pane.getChildren().add(new ImageView(new Image("Cards/" + cards.get(counter) + ".png")));
        }
    }

    // Main method
    public static void main(String[] args) {
        Application.launch(args);
    }
}