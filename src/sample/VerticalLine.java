package sample;

import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

public class VerticalLine {
    private double startX;
    private double startY;
    private double endX;
    private double endY;

    public VerticalLine() {

    }

    public VerticalLine(double startX, double startY, double endX, double endY) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;

    }

    public Line verticalLine(){
        Line verticalLine = new Line (startX, startY, endX, endY);
        verticalLine.setStrokeWidth(2.5);
        verticalLine.setStroke(Color.BLACK);

        return verticalLine;
    }
}
