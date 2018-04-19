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

public class Level1 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Pane pane = new Pane();

        ConnectorArc connectorArc = new ConnectorArc(90, 120, 90, 90);
        ConnectorArc connectorArc1 = new ConnectorArc(90, 200, 180, 90 );

        SemiCircle semiCircle = new SemiCircle(215, 110, 0, 180);

        ConnectorLine connectorLine = new ConnectorLine(90, 110, 100, 110);
        ConnectorLine connectorLine1 = new ConnectorLine(80, 120, 80, 200);
        ConnectorLine connectorLine2 = new ConnectorLine(90, 210, 250, 210);
        ConnectorLine connectorLine3 = new ConnectorLine(215, 200, 215, 240);

        PerpendicularLine perpendicularLine = new PerpendicularLine(100, 105, 100, 115);
        PerpendicularLine perpendicularLine1 = new PerpendicularLine(210, 200, 220, 200);

        FlatLine flatLine = new FlatLine (102.5,110,200,110);
        FlatLine flatLine1 = new FlatLine(230, 110, 250, 110);
        FlatLine flatLine2 = new FlatLine(215, 105, 215,200);

        FullCircle fullCircle = new FullCircle(215,255);
        FullCircle fullCircle1 = new FullCircle(265, 210);


        pane.getChildren().addAll(connectorArc.connectorArc(), connectorArc1.connectorArc(), semiCircle.semiCircle(),
                connectorLine.connectorLine(), connectorLine1.connectorLine(), connectorLine2.connectorLine(), connectorLine3.connectorLine(), perpendicularLine.perpendicularLine(),
                perpendicularLine1.perpendicularLine(), flatLine.flatLine(), flatLine1.flatLine(), flatLine2.flatLine(), fullCircle.fullCircle(), fullCircle1.fullCircle()); // Add arc to pane
        primaryStage.setTitle("Level 1");
        primaryStage.setResizable(false);
        Scene scene = new Scene (pane,400,400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}