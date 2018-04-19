package sample;

import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

public class PerpendicularLine {
    private double startX;
    private double startY;
    private double endX;
    private double endY;

    public PerpendicularLine() {

    }

    public PerpendicularLine(double startX, double startY, double endX, double endY) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;

    }

    public Line perpendicularLine(){
        Line perpendicularLine = new Line (startX, startY, endX, endY);
        perpendicularLine.setStrokeWidth(2.5);
        perpendicularLine.setStroke(Color.BLACK);

        return perpendicularLine;
    }
}
