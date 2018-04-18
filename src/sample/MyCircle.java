package sample;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class MyCircle {

    private String Color = "BLACK";
    private double radius = 15;
    private double centerX;
    private double centerY;
    boolean Fill;

    public MyCircle() {

    }

    public MyCircle(double centerX, double centerY, boolean Fill) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.Fill = Fill;
    }

    public Circle TheCircle() {
        Circle circle2 = new Circle();
        circle2.setCenterX(265);
        circle2.setCenterY(210);
        circle2.setRadius(15);
        circle2.setFill(Color.BLACK);
    }
}

