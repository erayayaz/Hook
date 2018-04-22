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



    @Override
    public void start(Stage primaryStage) {

        Pane pane4 = new Pane();

        FullCircle fullCircle = new FullCircle(80, 220);
        FullCircle fullCircle1 = new FullCircle(170, 300);

        EmptyCircle emptyCircle = new EmptyCircle(170, 220);

        SemiCircle semiCircle = new SemiCircle(310,110,15,15,0,180);

        ConnectorLine connectorLineInsideCircle = new ConnectorLine(170,205,170,235);

        ConnectorLine connectorLine = new ConnectorLine(95,220,155,220);
        ConnectorLine connectorLine1 = new ConnectorLine(170,235,170,285);
        ConnectorLine connectorLine2 = new ConnectorLine(185,220,300,220);
        ConnectorLine connectorLine3 = new ConnectorLine(170,120,170,205);
        ConnectorLine connectorLine4 = new ConnectorLine(180,110,185,110);
        ConnectorLine connectorLine5 = new ConnectorLine(310,205,310,210);

        ConnectorArc connectorArc = new ConnectorArc(180,120,10,10,90,90);
        ConnectorArc connectorArc1 = new ConnectorArc(300,210,10,10,270,90);

        PerpendicularLine perpendicularLine = new PerpendicularLine(185,105,185,115);
        PerpendicularLine perpendicularLine1 = new PerpendicularLine(305,205,315,205);

        FlatLine flatLine = new FlatLine(185,110,295,110);
        FlatLine flatLine1 = new FlatLine(310,107,310,205);
        FlatLine flatLine2 = new FlatLine(325,110,340,110);


        Scene scene = new Scene(pane4, 400, 400);
        primaryStage.setTitle("Level 4"); // Set the stage title
        primaryStage.setResizable(false);
        primaryStage.setScene(scene); // Place the scene in the stage
        //   primaryStage.setResizable(false);
        primaryStage.show(); // Display the stage
    }
}