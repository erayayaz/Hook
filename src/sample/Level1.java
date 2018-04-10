package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Level1 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane pane2 = new Pane();

        Circle circle1 = new Circle();
        Circle circle2 = new Circle();
        circle1.setCenterX(200);
        circle1.setCenterY(200);
        circle2.setCenterX(295);
        circle2.setCenterY(160);
        circle1.setRadius(25);
        circle2.setRadius(25);
        circle1.setFill(Color.BLACK);
        circle2.setFill(Color.BLACK);

        pane2.getChildren().addAll(circle1, circle2);


        Scene scene = new Scene(pane2, 500, 500);
        primaryStage.setTitle("Level 1"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        //   primaryStage.setResizable(false);
        primaryStage.show(); // Display the stage


    }

    public static void main(String[] args){
        launch(args);
    }

}

