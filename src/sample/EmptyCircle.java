package sample;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class EmptyCircle {

    private double radius = 15;
    private double centerX;
    private double centerY;

    public EmptyCircle() {

    }

    public EmptyCircle(double centerX, double centerY) {
        this.centerX = centerX;
        this.centerY = centerY;

    }

    public Circle emptyCircle() {
        Circle emptyCircle = new Circle();
        emptyCircle.setCenterX(centerX);
        emptyCircle.setCenterY(centerY);
        emptyCircle.setRadius(radius);
        emptyCircle.setFill(Color.TRANSPARENT);
        emptyCircle.setStroke(Color.BLACK);
        emptyCircle.setStrokeWidth(2.5);


        return emptyCircle;
    }
}
