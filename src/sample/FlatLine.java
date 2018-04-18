package sample;

import javafx.application.Application;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;

import static javafx.scene.paint.Color.GREY;

public class FlatLine {

    private double startX;
    private double startY;
    private double endX;
    private double endY;

    public FlatLine() {

    }

    public FlatLine(double startX, double startY, double endX, double endY) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;

    }

    public Line flatLine(){
        Line flatLine = new Line (startX, startY, endX, endY);
        flatLine.setStrokeWidth(2.5);
        flatLine.setStroke(Color.BLACK);

        return flatLine;
    }
}
