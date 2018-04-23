package sample;

import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

public class PerpendicularLine extends Line {
    private double startX;
    private double startY;
    private double endX;
    private double endY;

    //Create a constructor
    public PerpendicularLine(double startX, double startY, double endX, double endY) {
        super(startX,startY,endX,endY);
        //adding the features for perpendicular line
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
        this.setStrokeWidth(2.5);
        this.setStroke(Color.BLACK);

    }

}