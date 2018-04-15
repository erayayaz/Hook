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

public class Level3 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Pane pane3 = new Pane();

        Circle circle1 = new Circle();
        circle1.setCenterX(80);
        circle1.setCenterY(250);
        circle1.setRadius(15);
        circle1.setFill(Color.BLACK);

        Circle circle2 = new Circle();
        circle2.setCenterX(130);
        circle2.setCenterY(280);
        circle2.setRadius(15);
        circle2.setFill(Color.BLACK);

        Circle circle3 = new Circle();
        circle3.setCenterX(190);
        circle3.setCenterY(330);
        circle3.setRadius(15);
        circle3.setFill(Color.BLACK);

        Line flat = new Line (95,250,295,250);
        flat.setStrokeWidth(1);
        flat.setStroke(Color.GREY);

        Line flat2 = new Line (145,280,220,280);
        flat2.setStrokeWidth(1);
        flat2.setStroke(Color.GREY);

        Line flat3 = new Line (190,150,190,315);
        flat3.setStrokeWidth(1);
        flat3.setStroke(Color.GREY);

        Line flat4 = new Line (200,140,205,140);
        flat4.setStrokeWidth(1);
        flat4.setStroke(Color.GREY);

        Line flat5 = new Line (205,135,205,145);
        flat5.setStrokeWidth(2.5);
        flat5.setStroke(Color.BLACK);

        Line flat6 = new Line (205,140,290,140);
        flat6.setStrokeWidth(2.5);
        flat6.setStroke(Color.BLACK);

        Line flat7 = new Line (320,140,350,140);
        flat7.setStrokeWidth(2.5);
        flat7.setStroke(Color.BLACK);

        Line flat8 = new Line (305,137,305,165);
        flat8.setStrokeWidth(2.5);
        flat8.setStroke(Color.BLACK);

        Line flat9 = new Line (305,195,305,240);
        flat9.setStrokeWidth(2.5);
        flat9.setStroke(Color.BLACK);

        Line flat10 = new Line (300,240,310,240);
        flat10.setStrokeWidth(2.5);
        flat10.setStroke(Color.BLACK);

        Line flat11 = new Line (230,190,230,270);
        flat11.setStrokeWidth(1);
        flat11.setStroke(Color.GREY);

        Line flat12 = new Line (240,175,240,185);
        flat12.setStrokeWidth(2.5);
        flat12.setStroke(Color.BLACK);

        Line flat13 = new Line (240,180,308,180);
        flat13.setStrokeWidth(2.5);
        flat13.setStroke(Color.BLACK);

        Arc arc = new Arc(200,150,10,10,90,90);
        arc.setStroke(Color.GREY);
        arc.setType(ArcType.OPEN);
        arc.setStrokeWidth(1);
        arc.setFill(Color.WHITE);

        Arc arc2 = new Arc(305,140,15,15,0,180);
        arc2.setStroke(Color.BLACK);
        arc2.setType(ArcType.OPEN);
        arc2.setStrokeWidth(2.5);
        arc2.setFill(Color.TRANSPARENT);

        Arc arc3 = new Arc(305,180,15,15,270,180);
        arc3.setStroke(Color.BLACK);
        arc3.setType(ArcType.OPEN);
        arc3.setStrokeWidth(2.5);
        arc3.setFill(Color.TRANSPARENT);

        Arc arc4 = new Arc(295,240,10,10,270,90);
        arc4.setStroke(Color.GREY);
        arc4.setType(ArcType.OPEN);
        arc4.setStrokeWidth(1);
        arc4.setFill(Color.WHITE);

        Arc arc5 = new Arc(220,270,10,10,270,90);
        arc5.setStroke(Color.GREY);
        arc5.setType(ArcType.OPEN);
        arc5.setStrokeWidth(1);
        arc5.setFill(Color.WHITE);

        Arc arc6 = new Arc(240,190,10,10,90,90);
        arc6.setStroke(Color.GREY);
        arc6.setType(ArcType.OPEN);
        arc6.setStrokeWidth(1);
        arc6.setFill(Color.WHITE);






        pane3.getChildren().addAll(circle1,circle2,circle3,flat,flat2,flat3,flat4,flat5,flat6,flat7,flat8,flat9,flat10,flat11,flat12,flat13,arc,arc2,arc3,arc4,arc5,arc6);

        Scene scene = new Scene(pane3, 400, 400);
        primaryStage.setTitle("Level 3"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        //   primaryStage.setResizable(false);
        primaryStage.show(); // Display the stage

    }
}
