package sample;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class FullCircle extends Circle {

    private double radius = 15;
    private double centerX;
    private double centerY;

    //Create a constructor
    public FullCircle(double centerX, double centerY) {
        super(centerX,centerY,15);
        //adding the features for full circle
        this.centerX = centerX;
        this.centerY = centerY;
        this.setCenterX(centerX);
        this.setCenterY(centerY);
        this.setFill(Color.BLACK);
    }
}