package sample;

import javafx.animation.Animation;
import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.util.Duration;
import javafx.animation.Timeline;
import javafx.animation.KeyFrame;
import javafx.event.EventHandler;


public class Main extends Application {

   public static void main(String[] args) {
      launch(args);
   }

   @Override
   public void start(Stage primaryStage) throws Exception {

      Pane pane = new Pane();
      Circle circle2 = new Circle();
      circle2.setCenterX(215);
      circle2.setCenterY(255);
      circle2.setRadius(15);
      circle2.setFill(Color.TRANSPARENT);
      circle2.setStroke(Color.BLACK);

      Line flat7 = new Line (215,200,215,240);
      flat7.setStrokeWidth(1);
      flat7.setStroke(Color.GREY);


      pane.getChildren().addAll(flat7,circle2);



      circle2.setOnMouseClicked(event -> {

         Timeline animation = new Timeline(
                 new KeyFrame(Duration.millis(50), e -> deleteLine(flat7)));
         animation.setCycleCount(Timeline.INDEFINITE);
         animation.play();
      });


      primaryStage.setTitle("Level 1");
      primaryStage.setResizable(false);
      Scene scene = new Scene (pane,400,400);
      primaryStage.setScene(scene);
      primaryStage.show();

   }

   private void deleteLine(Line flat) {
       double x = flat.getStartY();
       x += 1 ;
       flat.setStartY(x);
   }
}