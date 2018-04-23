package sample;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class EmptyCircle extends Circle {

    private double radius = 15;
    private double centerX;
    private double centerY;

    //Create a constructor
    public EmptyCircle(double centerX, double centerY) {
        super(centerX,centerY,15);
        //adding the features for empty circle
        this.centerX = centerX;
        this.centerY = centerY;
        this.setCenterX(centerX);
        this.setCenterY(centerY);
        this.setRadius(radius);
        this.setFill(Color.TRANSPARENT);
        this.setStroke(Color.BLACK);
        this.setStrokeWidth(2.5);

    }
}