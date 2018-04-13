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

public class Level1 extends Application {

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

        Line flat4 = new Line (115,110,170,110);
        flat4.setStrokeWidth(2.5);
        flat4.setStroke(Color.BLACK);


        Circle circle1 = new Circle();
        circle1.setCenterX(100);
        circle1.setCenterY(285);
        circle1.setRadius(15);
        circle1.setFill(Color.BLACK);

        Arc arc = new Arc(110,120,10,10,90,90);
        arc.setStroke(Color.GREY);
        arc.setType(ArcType.OPEN);
        arc.setStrokeWidth(1);
        arc.setFill(Color.WHITE);

        Arc arc1 = new Arc(165,110,15,15,270,180);
        arc1.setStroke(Color.BLACK);
        arc1.setType(ArcType.OPEN);
        arc1.setStrokeWidth(2.5);
        arc1.setFill(Color.WHITE);



        pane2.getChildren().addAll(flat,flat2,flat3,flat4,circle1,arc,arc1);


        Scene scene = new Scene(pane2, 400, 400);
        primaryStage.setTitle("Level 1"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        //   primaryStage.setResizable(false);
        primaryStage.show(); // Display the stage


    }

    public static void main(String[] args){
        launch(args);
    }

}

