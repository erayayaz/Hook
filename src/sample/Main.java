package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.scene.text.Text;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
       Pane pane = new Pane();
       Arc arc = new Arc(90,120,10,10,90,90);
       arc.setStroke(Color.GREY);
       arc.setType(ArcType.OPEN);
       arc.setStrokeWidth(1);
       arc.setFill(Color.WHITE);



       Line flat = new Line (90,110,100,110);
       flat.setStrokeWidth(1);
       flat.setStroke(Color.GREY);

       Line flat2 = new Line (80,120,80,200);
       flat2.setStrokeWidth(1);
       flat2.setStroke(Color.GREY);


       Line flat3 = new Line (100,105,100,115);
       flat3.setStrokeWidth(2.5);
       flat3.setStroke(Color.BLACK);


       Line flat4 = new Line (102.5,110,200,110);
       flat4.setStrokeWidth(2.5);
       flat4.setStroke(Color.BLACK);

       Arc arc1 = new Arc(215,110,15,15,0,180);
       arc1.setStroke(Color.BLACK);
       arc1.setType(ArcType.OPEN);
       arc1.setStrokeWidth(2.5);
       arc1.setFill(Color.WHITE);

       Line flat5 = new Line (230,110,250,110);
       flat5.setStrokeWidth(2.5);
       flat5.setStroke(Color.BLACK);

       Arc arc2 = new Arc(90,200,10,10,180,90);
       arc2.setStroke(Color.GREY);
       arc2.setType(ArcType.OPEN);
       arc2.setStrokeWidth(1);
       arc2.setFill(Color.WHITE);

       Line flat6 = new Line (90,210,250,210);
       flat6.setStrokeWidth(1);
       flat6.setStroke(Color.GREY);

       Line flat7 = new Line (215,200,215,240);
       flat7.setStrokeWidth(1);
       flat7.setStroke(Color.GREY);

       Line flat8 = new Line (210,200,220,200);
       flat8.setStrokeWidth(2.5);
       flat8.setStroke(Color.BLACK);

       Line flat9 = new Line (215,105,215,200);
       flat9.setStrokeWidth(2.5);
       flat9.setStroke(Color.BLACK);

       Circle circle1 = new Circle();
       circle1.setCenterX(215);
       circle1.setCenterY(255);
       circle1.setRadius(15);
       circle1.setFill(Color.BLACK);

       Circle circle2 = new Circle();
       circle2.setCenterX(265);
       circle2.setCenterY(210);
       circle2.setRadius(15);
       circle2.setFill(Color.BLACK);


        pane.getChildren().addAll(arc,arc1,arc2,flat,flat2,flat3,flat4,flat5,flat6,flat7,flat8,flat9,circle1,circle2); // Add arc to pane
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Eray Ayaz");
        Scene scene = new Scene (pane,400,400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

