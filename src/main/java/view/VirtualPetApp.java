package view;

import controller.PetController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import model.Pet;

public class VirtualPetApp extends Application {

        // The start method is the entry point for JavaFX applications
    @Override
    public void start(Stage window) {
        // Create the Pet and Canvas
        Pet pet = new Pet();
        Canvas canvas = new Canvas(500, 500);
        PetView petView = new PetView(canvas, pet);
        PetController petController = new PetController(canvas, pet, petView);

        StackPane layout = new StackPane();
        layout.getChildren().add(canvas);

        Scene view = new Scene(layout, 500, 500);
        window.setScene(view);
        window.setTitle("Virtual Pet");
        window.show();
    }
}
