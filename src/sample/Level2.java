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

public class Level2 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane pane2 = new Pane();

        Line flat = new Line (100,120,100,270);
        flat.setStrokeWidth(1);
        flat.setStroke(Color.GREY);

        Line flat2 = new Line (115,105,115,115);
        flat2.setStrokeWidth(2.5);
        flat2.setStroke(Color.BLACK);

        Line flat3 = new Line (110,110,115,110);
        flat3.setStrokeWidth(1);
        flat3.setStroke(Color.GREY);

        Line flat4 = new Line (115,110,168,110);
        flat4.setStrokeWidth(2.5);
        flat4.setStroke(Color.BLACK);

        Line flat5 = new Line (165,65,165,95);
        flat5.setStrokeWidth(2.5);
        flat5.setStroke(Color.BLACK);

        Line flat6 = new Line (165,125,165,155);
        flat6.setStrokeWidth(2.5);
        flat6.setStroke(Color.BLACK);

        Line flat7 = new Line (165,185,165,230);
        flat7.setStrokeWidth(2.5);
        flat7.setStroke(Color.BLACK);

        Line flat8 = new Line (160,230,170,230);
        flat8.setStrokeWidth(2.5);
        flat8.setStroke(Color.BLACK);

        Line flat9 = new Line (165,230,165,270);
        flat9.setStrokeWidth(1);
        flat9.setStroke(Color.GREY);

        Line flat10 = new Line (210,230,220,230);
        flat10.setStrokeWidth(2.5);
        flat10.setStroke(Color.BLACK);

        Line flat11 = new Line (215,230,215,270);
        flat11.setStrokeWidth(1);
        flat11.setStroke(Color.GREY);

        Line flat12 = new Line (215,167,215,230);
        flat12.setStrokeWidth(2.5);
        flat12.setStroke(Color.BLACK);

        Line flat13 = new Line (162,170,200,170);
        flat13.setStrokeWidth(2.5);
        flat13.setStroke(Color.BLACK);

        Line flat14 = new Line (230,170,320,170);
        flat14.setStrokeWidth(2.5);
        flat14.setStroke(Color.BLACK);

        Line flat15 = new Line (320,165,320,175);
        flat15.setStrokeWidth(2.5);
        flat15.setStroke(Color.BLACK);

        Line flat16 = new Line (322,170,327.5,170);
        flat16.setStrokeWidth(1);
        flat16.setStroke(Color.GREY);

        Line flat17 = new Line (337.5,180,337.5,270);
        flat17.setStrokeWidth(1);
        flat17.setStroke(Color.GREY);

        Circle circle1 = new Circle();
        circle1.setCenterX(100);
        circle1.setCenterY(285);
        circle1.setRadius(15);
        circle1.setFill(Color.BLACK);

        Circle circle2 = new Circle();
        circle2.setCenterX(165);
        circle2.setCenterY(285);
        circle2.setRadius(15);
        circle2.setFill(Color.BLACK);

        Circle circle3 = new Circle();
        circle3.setCenterX(215);
        circle3.setCenterY(285);
        circle3.setRadius(15);
        circle3.setFill(Color.BLACK);

        Circle circle4 = new Circle();
        circle4.setCenterX(337.5);
        circle4.setCenterY(285);
        circle4.setRadius(15);
        circle4.setFill(Color.BLACK);

        Arc arc = new Arc(110,120,10,10,90,90);
        arc.setStroke(Color.GREY);
        arc.setType(ArcType.OPEN);
        arc.setStrokeWidth(1);
        arc.setFill(Color.WHITE);

        Arc arc1 = new Arc(165,110,15,15,270,180);
        arc1.setStroke(Color.BLACK);
        arc1.setType(ArcType.OPEN);
        arc1.setStrokeWidth(2.5);
        arc1.setFill(Color.TRANSPARENT);

        Arc arc2 = new Arc(165,170,15,15,90,180);
        arc2.setStroke(Color.BLACK);
        arc2.setType(ArcType.OPEN);
        arc2.setStrokeWidth(2.5);
        arc2.setFill(Color.TRANSPARENT);

        Arc arc3 = new Arc(215,170,15,15,0,180);
        arc3.setStroke(Color.BLACK);
        arc3.setType(ArcType.OPEN);
        arc3.setStrokeWidth(2.5);
        arc3.setFill(Color.TRANSPARENT);

        Arc arc4 = new Arc(327.5,180,10,10,0,90);
        arc4.setStroke(Color.GREY);
        arc4.setType(ArcType.OPEN);
        arc4.setStrokeWidth(1);
        arc4.setFill(Color.TRANSPARENT);



        pane2.getChildren().addAll(flat,flat2,flat3,flat4,flat5,flat6,flat7,flat8,flat9,flat10,flat11,flat12,flat13,flat14,flat15,flat16,flat17,circle1,circle2,circle3,circle4,arc,arc1,arc2,arc3,arc4);


        Scene scene = new Scene(pane2, 400, 400);
        primaryStage.setTitle("Level 2"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        //   primaryStage.setResizable(false);
        primaryStage.show(); // Display the stage


    }

    public static void main(String[] args){
        launch(args);
    }

}

