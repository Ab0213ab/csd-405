// Andrew Schaefer
// 9/6/21
// CSD-405
// Module 7 Assignment (b)

// This simple program demonstrates the use of the VBox JavaFX layout pane.

// Imports the necessary JavaFX packages
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

// Creates a Mod_7_VBox class that inherits from Application
public class Mod_7_VBox extends Application {

    // Overrides the start method in the Application class
    @Override
    public void start(Stage stage) {

        // Sets the stage title 
        stage.setTitle("Mod_7_VBox");

        // Creates an HBox instance
        VBox root = new VBox();
       
        // Creates 4 Button instances
        Button b1 = new Button("Button 1");
        Button b2 = new Button("Button 2");
        Button b3 = new Button("Button 3");
        Button b4 = new Button("Button 4");

        // Gets current and adds new components in VBox
        root.getChildren().addAll(b1, b2, b3, b4);

        // Creates a Scene instance
        Scene scene = new Scene(root);
        // Places the scene in the stage
        stage.setScene(scene);
        // Display the stage
        stage.show();
    }
    
    // Main method
    public static void main(String[] args) {
        Application.launch(args);
    }
    
}
