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

        int a;





       Pane pane = new Pane();
       Arc arc = new Arc(50,50,10,10,90,90);
       arc.setStroke(Color.DARKGREY);
       arc.setType(ArcType.OPEN);
       arc.setStrokeWidth(2);
       arc.setFill(Color.WHITE);



       Line flat = new Line (50,40,60,40);
       flat.setStrokeWidth(2);
       flat.setStroke(Color.TEAL);

       Line flat2 = new Line (40,50,40,150);
       flat2.setStrokeWidth(2);
       flat2.setStroke(Color.TEAL);

        Rectangle r3 = new Rectangle(60, 40, 5, 40);
        r3.setArcWidth(5);
        r3.setArcHeight(40);
        r3.setStroke(Color.DARKSLATEGREY);


        pane.getChildren().addAll(arc,flat,flat2,r3); // Add arc to pane
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Eray Ayaz");
        Scene scene = new Scene (pane,300,300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

