package model;

public class Pet {
    private double x;
    private double y;
    private final double speed;

    public Pet() {
        this.x = 0;
        this.y = 0;
        this.speed = 2;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void updatePosition(double targetX, double targetY) {
        // Calculate the angle between the current position and the target
        double angle = Math.atan2(targetY - y, targetX - x);

        // Calculate the new position based on the angle and speed
        x += speed * Math.cos(angle);
        y += speed * Math.sin(angle);
    }
}


