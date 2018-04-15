package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Level4 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {



        Pane pane4 = new Pane();


        Circle circle1 = new Circle();
        circle1.setCenterX(80);
        circle1.setCenterY(220);
        circle1.setRadius(15);
        circle1.setFill(Color.BLACK);

        Circle circle2 = new Circle();
        circle2.setCenterX(170);
        circle2.setCenterY(300);
        circle2.setRadius(15);
        circle2.setFill(Color.BLACK);

        Circle circle3 = new Circle();
        circle3.setCenterX(170);
        circle3.setCenterY(220);
        circle3.setRadius(15);
        circle3.setFill(Color.TRANSPARENT);
        circle3.setStroke(Color.BLACK);
        circle3.setStrokeWidth(2.5);

        Line flat = new Line (95,220,155,220);
        flat.setStrokeWidth(1);
        flat.setStroke(Color.GREY);

        Line flat2 = new Line (170,235,170,285);
        flat2.setStrokeWidth(1);
        flat2.setStroke(Color.GREY);

        Line flat3 = new Line (170,205,170,235);
        flat3.setStrokeWidth(1);
        flat3.setStroke(Color.GREY);

        Line flat4 = new Line (185,220,300,220);
        flat4.setStrokeWidth(1);
        flat4.setStroke(Color.GREY);

        Line flat5 = new Line (170,120,170,205);
        flat5.setStrokeWidth(1);
        flat5.setStroke(Color.GREY);

        Line flat6 = new Line (180,110,185,110);
        flat6.setStrokeWidth(1);
        flat6.setStroke(Color.GREY);

        Line flat7 = new Line (185,105,185,115);
        flat7.setStrokeWidth(2.5);
        flat7.setStroke(Color.BLACK);

        Line flat8 = new Line (185,110,295,110);
        flat8.setStrokeWidth(2.5);
        flat8.setStroke(Color.BLACK);

        Line flat9 = new Line (310,205,310,210);
        flat9.setStrokeWidth(1);
        flat9.setStroke(Color.GREY);

        Line flat10 = new Line (305,205,315,205);
        flat10.setStrokeWidth(2.5);
        flat10.setStroke(Color.BLACK);

        Line flat11 = new Line (310,107,310,205);
        flat11.setStrokeWidth(2.5);
        flat11.setStroke(Color.BLACK);

        Line flat12 = new Line (325,110,340,110);
        flat12.setStrokeWidth(2.5);
        flat12.setStroke(Color.BLACK);

        Arc arc = new Arc(180,120,10,10,90,90);
        arc.setStroke(Color.GREY);
        arc.setType(ArcType.OPEN);
        arc.setStrokeWidth(1);
        arc.setFill(Color.WHITE);

        Arc arc2 = new Arc(310,110,15,15,0,180);
        arc2.setStroke(Color.BLACK);
        arc2.setType(ArcType.OPEN);
        arc2.setStrokeWidth(2.5);
        arc2.setFill(Color.TRANSPARENT);

        Arc arc3 = new Arc(300,210,10,10,270,90);
        arc3.setStroke(Color.GREY);
        arc3.setType(ArcType.OPEN);
        arc3.setStrokeWidth(1);
        arc3.setFill(Color.WHITE);


        pane4.getChildren().addAll(circle1,circle2,circle3,flat,flat2,flat3,flat4,flat5,flat6,flat7,flat8,flat9,flat10,flat11,flat12,arc,arc2,arc3);

        Scene scene = new Scene(pane4, 400, 400);
        primaryStage.setTitle("Level 4"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        //   primaryStage.setResizable(false);
        primaryStage.show(); // Display the stage
    }
}
