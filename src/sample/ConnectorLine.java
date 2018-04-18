package sample;

import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

public class ConnectorLine {

    private double startX;
    private double startY;
    private double endX;
    private double endY;

    public ConnectorLine() {

    }

    public ConnectorLine(double startX, double startY, double endX, double endY) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;

    }

    public Line connectorLine(){
        Line connectorLine = new Line (startX, startY, endX, endY);
        connectorLine.setStrokeWidth(1);
        connectorLine.setStroke(Color.BLACK);

        return connectorLine;
    }
}
