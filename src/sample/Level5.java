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

public class Level5 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {


        Pane pane5 = new Pane();


        Circle circle1 = new Circle();
        circle1.setCenterX(80);
        circle1.setCenterY(200);
        circle1.setRadius(15);
        circle1.setFill(Color.BLACK);

        Circle circle2 = new Circle();
        circle2.setCenterX(80);
        circle2.setCenterY(260);
        circle2.setRadius(15);
        circle2.setFill(Color.BLACK);

        Circle circle3 = new Circle();
        circle3.setCenterX(180);
        circle3.setCenterY(320);
        circle3.setRadius(15);
        circle3.setFill(Color.BLACK);

        Circle circle4 = new Circle();
        circle4.setCenterX(310);
        circle4.setCenterY(320);
        circle4.setRadius(15);
        circle4.setFill(Color.BLACK);

        Circle circle5 = new Circle();
        circle5.setCenterX(180);
        circle5.setCenterY(260);
        circle5.setRadius(15);
        circle5.setFill(Color.TRANSPARENT);
        circle5.setStroke(Color.BLACK);
        circle5.setStrokeWidth(2.5);

        Circle circle6 = new Circle();
        circle6.setCenterX(180);
        circle6.setCenterY(200);
        circle6.setRadius(15);
        circle6.setFill(Color.TRANSPARENT);
        circle6.setStroke(Color.BLACK);
        circle6.setStrokeWidth(2.5);

        Line flat = new Line (95,200,165,200);
        flat.setStrokeWidth(1);
        flat.setStroke(Color.GREY);

        Line flat2 = new Line (95,260,165,260);
        flat2.setStrokeWidth(1);
        flat2.setStroke(Color.GREY);

        Line flat3 = new Line (180,275,180,305);
        flat3.setStrokeWidth(1);
        flat3.setStroke(Color.GREY);

        Line flat4 = new Line (165,260,195,260);
        flat4.setStrokeWidth(1);
        flat4.setStroke(Color.GREY);

        Line flat5 = new Line (180,215,180,245);
        flat5.setStrokeWidth(1);
        flat5.setStroke(Color.GREY);

        Line flat6 = new Line (180,185,180,215);
        flat6.setStrokeWidth(1);
        flat6.setStroke(Color.GREY);

        Line flat7 = new Line (195,200,250,200);
        flat7.setStrokeWidth(1);
        flat7.setStroke(Color.GREY);

        Line flat8 = new Line (260,185,260,190);
        flat8.setStrokeWidth(1);
        flat8.setStroke(Color.GREY);

        Line flat9 = new Line (255,185,265,185);
        flat9.setStrokeWidth(2.5);
        flat9.setStroke(Color.BLACK);

        Line flat10 = new Line (260,130,260,185);
        flat10.setStrokeWidth(2.5);
        flat10.setStroke(Color.BLACK);

        Line flat11 = new Line (260,82,260,100);
        flat11.setStrokeWidth(2.5);
        flat11.setStroke(Color.BLACK);

        Line flat12 = new Line (310,125,310,305);
        flat12.setStrokeWidth(1);
        flat12.setStroke(Color.GREY);

        Line flat13 = new Line (295,115,300,115);
        flat13.setStrokeWidth(1);
        flat13.setStroke(Color.GREY);

        Line flat14 = new Line (295,110,295,120);
        flat14.setStrokeWidth(2.5);
        flat14.setStroke(Color.BLACK);

        Line flat15 = new Line (257,115,295,115);
        flat15.setStrokeWidth(2.5);
        flat15.setStroke(Color.BLACK);

        Line flat16 = new Line (180,95,180,185);
        flat16.setStrokeWidth(1);
        flat16.setStroke(Color.GREY);

        Line flat17 = new Line (190,85,195,85);
        flat17.setStrokeWidth(1);
        flat17.setStroke(Color.GREY);

        Line flat18 = new Line (195,80,195,90);
        flat18.setStrokeWidth(2.5);
        flat18.setStroke(Color.BLACK);

        Line flat19 = new Line (195,85,245,85);
        flat19.setStrokeWidth(2.5);
        flat19.setStroke(Color.BLACK);

        Line flat20 = new Line (275,85,333,85);
        flat20.setStrokeWidth(2.5);
        flat20.setStroke(Color.BLACK);

        Line flat21 = new Line (330,50,330,70);
        flat21.setStrokeWidth(2.5);
        flat21.setStroke(Color.BLACK);

        Line flat22 = new Line (195,260,320,260);
        flat22.setStrokeWidth(1);
        flat22.setStroke(Color.GREY);

        Line flat23 = new Line (330,245,330,250);
        flat23.setStrokeWidth(1);
        flat23.setStroke(Color.GREY);

        Line flat24 = new Line (325,245,335,245);
        flat24.setStrokeWidth(2.5);
        flat24.setStroke(Color.BLACK);

        Line flat25 = new Line (330,100,330,245);
        flat25.setStrokeWidth(2.5);
        flat25.setStroke(Color.BLACK);



        Arc arc = new Arc(250,190,10,10,270,90);
        arc.setStroke(Color.GREY);
        arc.setType(ArcType.OPEN);
        arc.setStrokeWidth(1);
        arc.setFill(Color.WHITE);

        Arc arc2 = new Arc(300,125,10,10,0,90);
        arc2.setStroke(Color.GREY);
        arc2.setType(ArcType.OPEN);
        arc2.setStrokeWidth(1);
        arc2.setFill(Color.WHITE);

        Arc arc3 = new Arc(260,115,15,15,90,180);
        arc3.setStroke(Color.BLACK);
        arc3.setType(ArcType.OPEN);
        arc3.setStrokeWidth(2.5);
        arc3.setFill(Color.TRANSPARENT);

        Arc arc4 = new Arc(260,85,15,15,0,180);
        arc4.setStroke(Color.BLACK);
        arc4.setType(ArcType.OPEN);
        arc4.setStrokeWidth(2.5);
        arc4.setFill(Color.TRANSPARENT);

        Arc arc5 = new Arc(190,95,10,10,90,90);
        arc5.setStroke(Color.GREY);
        arc5.setType(ArcType.OPEN);
        arc5.setStrokeWidth(1);
        arc5.setFill(Color.WHITE);

        Arc arc6 = new Arc(330,85,15,15,270,180);
        arc6.setStroke(Color.BLACK);
        arc6.setType(ArcType.OPEN);
        arc6.setStrokeWidth(2.5);
        arc6.setFill(Color.TRANSPARENT);

        Arc arc7 = new Arc(320,250,10,10,270,90);
        arc7.setStroke(Color.GREY);
        arc7.setType(ArcType.OPEN);
        arc7.setStrokeWidth(1);
        arc7.setFill(Color.WHITE);













        pane5.getChildren().addAll(circle1,circle2,circle3,circle4,circle5,circle6,flat,flat2,flat3,flat4,flat5,flat6,flat7,flat8,flat9,flat10,flat11,flat12,flat13,flat14,flat15,flat16,flat17,flat18,flat19,flat20,flat21,flat22,flat23,flat24,flat25,arc,arc2,arc3,arc4,arc5,arc6,arc7);

        Scene scene = new Scene(pane5, 400, 400);
        primaryStage.setTitle("Level 5"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        //   primaryStage.setResizable(false);
        primaryStage.show(); // Display the stage
    }
}
