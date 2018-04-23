package sample;

import javafx.scene.shape.*;
import javafx.scene.paint.Color;


public class FlatLine extends Line{

    private double startX;
    private double startY;
    private double endX;
    private double endY;

    //Create a constructor
    public FlatLine(double startX, double startY, double endX, double endY) {
        super(startX,startY,endX,endY);
        //adding the features for flat line
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
        this.setStrokeWidth(2.5);
        this.setStroke(Color.BLACK);

    }

}