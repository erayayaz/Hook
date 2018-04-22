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


    @Override
    public void start(Stage primaryStage) {

        Pane pane5 = new Pane();

        FullCircle fullCircle = new FullCircle(80, 200);
        FullCircle fullCircle1 = new FullCircle(80,260);
        FullCircle fullCircle2 = new FullCircle(180,320);
        FullCircle fullCircle3 = new FullCircle(310, 320);

        EmptyCircle emptyCircle = new EmptyCircle(180,260);
        EmptyCircle emptyCircle1 = new EmptyCircle(180,200);

        SemiCircle semiCircle = new SemiCircle(260,115,15,15,90,180);
        SemiCircle semiCircle1 = new SemiCircle(260,85,15,15,0,180);
        SemiCircle semiCircle2 = new SemiCircle(330,85,15,15,270,180);

        ConnectorLine connectorLineInsideCircle = new ConnectorLine(165,260,195,260);
        ConnectorLine connectorLineInsideCircle1 = new ConnectorLine(180,185,180,215);

        ConnectorLine connectorLine = new ConnectorLine(95,200,165,200);
        ConnectorLine connectorLine1 = new ConnectorLine(95,260,165,260);
        ConnectorLine connectorLine2 = new ConnectorLine(180,275,180,305);
        ConnectorLine connectorLine3 = new ConnectorLine(180,215,180,245);
        ConnectorLine connectorLine4 = new ConnectorLine(195,200,250,200);
        ConnectorLine connectorLine5 = new ConnectorLine(260,185,260,190);
        ConnectorLine connectorLine6 = new ConnectorLine(310,125,310,305);
        ConnectorLine connectorLine7 = new ConnectorLine(295,115,300,115);
        ConnectorLine connectorLine8 = new ConnectorLine(180,95,180,185);
        ConnectorLine connectorLine9 = new ConnectorLine(190,85,195,85);
        ConnectorLine connectorLine10 = new ConnectorLine(195,260,320,260);
        ConnectorLine connectorLine11 = new ConnectorLine(330,245,330,250);

        ConnectorArc connectorArc = new ConnectorArc(250,190,10,10,270,90);
        ConnectorArc connectorArc1 = new ConnectorArc(300,125,10,10,0,90);
        ConnectorArc connectorArc2 = new ConnectorArc(190,95,10,10,90,90);
        ConnectorArc connectorArc3 = new ConnectorArc(320,250,10,10,270,90);

        PerpendicularLine perpendicularLine = new PerpendicularLine(255,185,265,185);
        PerpendicularLine perpendicularLine1 = new PerpendicularLine(295,110,295,120);
        PerpendicularLine perpendicularLine2 = new PerpendicularLine(195,80,195,90);

        FlatLine flatLine = new FlatLine(260,130,260,185);
        FlatLine flatLine1 = new FlatLine(260,82,260,100);
        FlatLine flatLine2 = new FlatLine(257,115,295,115);
        FlatLine flatLine3 = new FlatLine(195,85,245,85);
        FlatLine flatLine4 = new FlatLine(275,85,333,85);
        FlatLine flatLine5 = new FlatLine(330,100,330,245);
        FlatLine flatLine6 = new FlatLine(325,245,335,245);
        FlatLine flatLine7 = new FlatLine(330,50,330,70);



        Scene scene = new Scene(pane5, 400, 400);
        primaryStage.setTitle("Level 5"); // Set the stage title
        primaryStage.setResizable(false);
        primaryStage.setScene(scene); // Place the scene in the stage
        //   primaryStage.setResizable(false);
        primaryStage.show(); // Display the stage
    }
}