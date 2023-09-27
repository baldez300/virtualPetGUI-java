package view;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import model.Pet;

public class PetView {
    private final Canvas canvas;
    private final Image petImage;
    private final Pet pet;

    public PetView(Canvas canvas, Pet pet) {
        this.canvas = canvas;
        this.pet = pet;
        // The pet image from a file in the resources folder
        this.petImage = new Image("/pet.png");
    }

    public void draw() {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
        gc.drawImage(petImage, pet.getX(), pet.getY());
    }
}



