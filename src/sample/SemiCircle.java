package sample;

import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;

public class SemiCircle extends Arc{

    private double radius = 15;
    private double centerX;
    private double centerY;
    private double startAngle;
    private double length;
    private double radiusX;
    private double radiusY;

    //Create a constructor
    public SemiCircle(double centerX, double centerY,double radiusX,double radiusY, double startAngel, double length) {
        super(centerX,centerY,radiusX,radiusY,startAngel,length);
        //adding the features for semi circle
        this.centerX = centerX;
        this.centerY = centerY;
        this.radiusX = radiusX;
        this.radiusY = radiusY;
        this.startAngle = startAngel;
        this.length = length;
        this.setStroke(Color.BLACK);
        this.setType(ArcType.OPEN);
        this.setFill(Color.TRANSPARENT);
        this.setStrokeWidth(2.5);
    }

}