package sample;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class FullCircle {

    private double radius = 15;
    private double centerX;
    private double centerY;

    public FullCircle() {

    }

    public FullCircle(double centerX, double centerY) {
        this.centerX = centerX;
        this.centerY = centerY;

    }

    public Circle fullCircle() {
        Circle fullCircle = new Circle();
        fullCircle.setCenterX(centerX);
        fullCircle.setCenterY(centerY);
        fullCircle.setRadius(radius);
        fullCircle.setFill(Color.BLACK);


        return fullCircle;
    }
}

