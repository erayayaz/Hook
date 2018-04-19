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

import static javafx.scene.paint.Color.*;

public class Level2 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane pane2 = new Pane();

        ConnectorLine connectorLine = new ConnectorLine(100, 120, 100, 270);
        ConnectorLine connectorLine1 = new ConnectorLine(110, 110, 115, 110);
        ConnectorLine connectorLine2 = new ConnectorLine(165, 230, 165, 270);
        ConnectorLine connectorLine3 = new ConnectorLine(215, 230, 215, 270);
        ConnectorLine connectorLine4 = new ConnectorLine(337.5,180,337.5,270);
        ConnectorLine connectorLine5 = new ConnectorLine(322,170,327.5,170);

        ConnectorArc connectorArc = new ConnectorArc(110,120,90,90);
        ConnectorArc connectorArc1 = new ConnectorArc(327.5,180,0,90);

        FlatLine flatLine = new FlatLine(115,110,168,110);
        FlatLine flatLine1 = new FlatLine(165,65,165,95);
        FlatLine flatLine2 = new FlatLine(165,125,165,155);
        FlatLine flatLine3 = new FlatLine(165,185,165,230);
        FlatLine flatLine4 = new FlatLine(215,167,215,230);
        FlatLine flatLine5 = new FlatLine(162,170,200,170);
        FlatLine flatLine6 = new FlatLine(230,170,320,170);

        PerpendicularLine perpendicularLine = new PerpendicularLine(115,105,115,115);
        PerpendicularLine perpendicularLine1 = new PerpendicularLine(160,230,170,230);
        PerpendicularLine perpendicularLine2 = new PerpendicularLine(210,230,220,230);
        PerpendicularLine perpendicularLine3 = new PerpendicularLine(320,165,320,175);

        SemiCircle semiCircle = new SemiCircle(165,110,270,180);
        SemiCircle semiCircle1 = new SemiCircle(165,170,90,180);
        SemiCircle semiCircle2 = new SemiCircle(215,170,0,180);

        FullCircle fullCircle = new FullCircle(100, 285);
        FullCircle fullCircle1 = new FullCircle(165, 285);
        FullCircle fullCircle2 = new FullCircle(215, 285);
        FullCircle fullCircle3 = new FullCircle(337.5, 285);

        pane2.getChildren().addAll(connectorLine.connectorLine(), connectorLine1.connectorLine(), connectorLine2.connectorLine(), connectorLine3.connectorLine(), connectorLine4.connectorLine(), connectorLine5.connectorLine(),
                connectorArc.connectorArc(), connectorArc1.connectorArc(),
                flatLine.flatLine(), flatLine1.flatLine(), flatLine2.flatLine(), flatLine3.flatLine(), flatLine4.flatLine(), flatLine5.flatLine(), flatLine6.flatLine(),
                perpendicularLine.perpendicularLine(), perpendicularLine1.perpendicularLine(), perpendicularLine2.perpendicularLine(), perpendicularLine3.perpendicularLine(),
                semiCircle.semiCircle(), semiCircle1.semiCircle(), semiCircle2.semiCircle(),
                fullCircle.fullCircle(), fullCircle1.fullCircle(), fullCircle2.fullCircle(), fullCircle3.fullCircle());


        Scene scene = new Scene(pane2, 400, 400);
        primaryStage.setTitle("Level 2"); // Set the stage title
        primaryStage.setResizable(false);
        primaryStage.setScene(scene); // Place the scene in the stage
        //   primaryStage.setResizable(false);
        primaryStage.show(); // Display the stage


    }

    public static void main(String[] args){
        launch(args);
    }

}

