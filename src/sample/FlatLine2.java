package sample;

import javafx.application.Application;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;

import static javafx.scene.paint.Color.GREY;

public class FlatLine2 extends Application {

    private String Color = "BLACK";
    private double StrokeWidth = 2.5;
    private double startX;
    private double startY;
    private double endX;
    private double endY;

    public FlatLine2(){

    }
    public FlatLine2(double startX,double startY,double endX,double endY,String Color,double StrokeWidth){
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
        this.Color = Color;
        this.StrokeWidth = StrokeWidth;

    }


    public void setStrokeWidth(double strokeWidth) {
        StrokeWidth = strokeWidth;
    }

    public void setColor(String color) {
        Color = color;
    }

    @Override
    public void start(Stage primaryStage) {

        Line flat = new Line (100,120,100,270);
        flat.setStrokeWidth(1);
        flat.setStroke(GREY);

    }
    public static void main(String[] args) {
        launch(args);
    }
}
