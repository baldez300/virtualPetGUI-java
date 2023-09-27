package controller;

import javafx.scene.canvas.Canvas;
import javafx.scene.input.MouseEvent;
import model.Pet;
import view.PetView;

public class PetController {
    private final Canvas canvas;
    private final Pet pet;
    private final PetView petView;

    public PetController(Canvas canvas, Pet pet, PetView petView) {
        this.canvas = canvas;
        this.pet = pet;
        this.petView = petView;

        // Set up mouse event listeners
        canvas.addEventHandler(MouseEvent.MOUSE_MOVED, this::handleMouseMoved);
    }

    private void handleMouseMoved(MouseEvent event) {
        // Get the mouse position
        double mouseX = event.getX();
        double mouseY = event.getY();

        // Check if the mouse is within the canvas
        if (mouseX >= 0 && mouseX <= canvas.getWidth() && mouseY >= 0 && mouseY <= canvas.getHeight()) {
            pet.updatePosition(mouseX, mouseY);
            petView.draw();
        }
    }
}


