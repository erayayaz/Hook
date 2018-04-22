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



    @Override
    public void start(Stage primaryStage) {

        Pane pane3 = new Pane();

        ConnectorArc connectorArc = new ConnectorArc(200,150,10,10,90,90);
        ConnectorArc connectorArc1 = new ConnectorArc(295,240,10,10,270,90);
        ConnectorArc connectorArc2 = new ConnectorArc(220,270,10,10,270,90);
        ConnectorArc connectorArc3 = new ConnectorArc(240,190,10,10,90,90);

        ConnectorLine connectorLine = new ConnectorLine(95,250,295,250);
        ConnectorLine connectorLine1 = new ConnectorLine(145,280,220,280);
        ConnectorLine connectorLine2 = new ConnectorLine(190,150,190,315);
        ConnectorLine connectorLine3 = new ConnectorLine(190,150,190,315);
        ConnectorLine connectorLine4 = new ConnectorLine(200,140,205,140);
        ConnectorLine connectorLine5 = new ConnectorLine(205,135,205,145);
        ConnectorLine connectorLine6 = new ConnectorLine(230,190,230,270);

        FullCircle fullCircle = new FullCircle(80, 250);
        FullCircle fullCircle1 = new FullCircle(130, 280);
        FullCircle fullCircle2 = new FullCircle(190, 330);

        PerpendicularLine perpendicularLine = new PerpendicularLine(205,135,205,145);
        PerpendicularLine perpendicularLine1 = new PerpendicularLine(240,175,240,185);
        PerpendicularLine perpendicularLine2 = new PerpendicularLine(300,240,310,240);

        FlatLine flatLine = new FlatLine(205,140,290,140);
        FlatLine flatLine1 = new FlatLine(320,140,350,140);
        FlatLine flatLine2 = new FlatLine(305,137,305,165);
        FlatLine flatLine3 = new FlatLine(305,195,305,240);
        FlatLine flatLine4 = new FlatLine(240,180,308,180);

        SemiCircle semiCircle = new SemiCircle(305,140,15,15,0,180);
        SemiCircle semiCircle1 = new SemiCircle(305,180,15,15,270,180);

        Scene scene = new Scene(pane3, 400, 400);
        primaryStage.setTitle("Level 3"); // Set the stage title
        primaryStage.setResizable(false); //Makes stage resizable
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage

    }
}