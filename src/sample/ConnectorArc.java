package sample;

import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;

public class ConnectorArc {

    private double radius = 10;
    private double centerX;
    private double centerY;
    private double startAngle;
    private double length;

    public ConnectorArc() {

    }

    public ConnectorArc(double centerX, double centerY, double startAngel, double length) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.startAngle = startAngel;
        this.length = length;

    }

    public Arc connectorArc() {
        Arc connectorArc = new Arc(centerX, centerY, radius, radius, startAngle, length);
        connectorArc.setStroke(Color.GREY);
        connectorArc.setType(ArcType.OPEN);
        connectorArc.setStrokeWidth(1);
        connectorArc.setFill(Color.TRANSPARENT);


        return connectorArc;
    }
}

