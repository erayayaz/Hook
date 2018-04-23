package sample;

import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;

public class ConnectorArc extends Arc{

    private double radius = 10;
    private double centerX;
    private double centerY;
    private double startAngle;
    private double length;

    //Create a constructor
    public ConnectorArc(double centerX, double centerY,double radiusX,double radiusY ,double startAngel, double length) {
        super(centerX,centerY,radiusX,radiusY,startAngel,length);
        //adding the features for connector arcc
        this.setStroke(Color.GREY);
        this.setType(ArcType.OPEN);
        this.setStrokeWidth(1);
        this.setFill(Color.TRANSPARENT);
    }


}