package sample;

import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;

public class SemiCircle {

    private double radius = 15;
    private double centerX;
    private double centerY;
    private double startAngle;
    private double length;

    public SemiCircle() {

    }

    public SemiCircle(double centerX, double centerY, double startAngel, double length) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.startAngle = startAngel;
        this.length = length;

    }

    public Arc semiCircle() {
        Arc semiCircle = new Arc(centerX, centerY, radius, radius, startAngle, length);
        semiCircle.setStroke(Color.BLACK);
        semiCircle.setType(ArcType.OPEN);
        semiCircle.setStrokeWidth(2.5);
        semiCircle.setFill(Color.TRANSPARENT);


        return semiCircle;
    }
}
