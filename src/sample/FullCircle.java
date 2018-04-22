package sample;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class FullCircle extends Circle {

    private double radius = 15;
    private double centerX;
    private double centerY;

    public FullCircle(double centerX, double centerY) {
        super(centerX,centerY,15);
        this.centerX = centerX;
        this.centerY = centerY;
        this.setCenterX(centerX);
        this.setCenterY(centerY);
        this.setFill(Color.BLACK);
    }
}