package sample;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.sql.Time;

public class Level {

    public Pane pane;
    public Shape[] shapes ;

    public Level(int level) {


        if (level == 1) this.pane = level1();
        else if (level == 2) this.pane = level2();
        else if (level == 3) this.pane = level3();
        else if (level == 4) this.pane = level4();
        else if (level == 5) this.pane = level5();
        else if (level == 6) this.pane = Menu();
        else if (level == 7) this.pane = levels();
        else if(level ==8) this.pane = congratulations();
        else if(level ==9) this.pane = restart();
        else this.pane = level1();
    }

    public Pane level1() {
        Pane pane1 = new Pane();
        this.shapes = new Shape[14];

        ConnectorArc connectorArc = new ConnectorArc(90, 120, 10, 10, 90, 90);
        pane1.getChildren().add(connectorArc);
        this.shapes[0] = connectorArc;
        ConnectorArc connectorArc1 = new ConnectorArc(90, 200, 10, 10, 180, 90);
        pane1.getChildren().add(connectorArc1);
        this.shapes[1] = connectorArc1;

        SemiCircle semiCircle = new SemiCircle(215, 110, 15, 15, 0, 180);
        pane1.getChildren().add(semiCircle);
        this.shapes[2] = semiCircle;

        ConnectorLine connectorLine = new ConnectorLine(90, 110, 100, 110);
        pane1.getChildren().add(connectorLine);
        this.shapes[3] = connectorLine;
        ConnectorLine connectorLine1 = new ConnectorLine(80, 120, 80, 200);
        pane1.getChildren().add(connectorLine1);
        this.shapes[4] = connectorLine1;
        ConnectorLine connectorLine2 = new ConnectorLine(90, 210, 250, 210);
        pane1.getChildren().add(connectorLine2);
        this.shapes[5] = connectorLine2;
        ConnectorLine connectorLine3 = new ConnectorLine(215, 200, 215, 240);
        pane1.getChildren().add(connectorLine3);
        this.shapes[6] = connectorLine3;

        PerpendicularLine perpendicularLine = new PerpendicularLine(100, 105, 100, 115);
        pane1.getChildren().add(perpendicularLine);
        this.shapes[7] = perpendicularLine;
        PerpendicularLine perpendicularLine1 = new PerpendicularLine(210, 200, 220, 200);
        pane1.getChildren().add(perpendicularLine1);
        this.shapes[8] = perpendicularLine1;

        FlatLine flatLine = new FlatLine(102.5, 110, 200, 110);
        pane1.getChildren().add(flatLine);
        this.shapes[9] = flatLine;
        FlatLine flatLine1 = new FlatLine(230, 110, 250, 110);
        pane1.getChildren().add(flatLine1);
        this.shapes[10] = flatLine1;
        FlatLine flatLine2 = new FlatLine(215, 105, 215, 200);
        pane1.getChildren().add(flatLine2);
        this.shapes[11] = flatLine2;

        FullCircle fullCircle = new FullCircle(215, 255);
        pane1.getChildren().add(fullCircle);
        this.shapes[12] = fullCircle;
        FullCircle fullCircle1 = new FullCircle(265, 210);
        pane1.getChildren().add(fullCircle1);
        this.shapes[13] = fullCircle1;

        return pane1;
    }

        public Pane level2() {

        Pane pane2 = new Pane();
        this.shapes = new Shape[26];

        ConnectorLine connectorLine = new ConnectorLine(100, 120, 100, 270);
        pane2.getChildren().add(connectorLine);
        this.shapes [0] = connectorLine;
        ConnectorLine connectorLine1 = new ConnectorLine(110, 110, 115, 110);
        pane2.getChildren().add(connectorLine1);
        this.shapes [1] = connectorLine1;
        ConnectorLine connectorLine2 = new ConnectorLine(165, 230, 165, 270);
        pane2.getChildren().add(connectorLine2);
        this.shapes [2] = connectorLine2;
        ConnectorLine connectorLine3 = new ConnectorLine(215, 230, 215, 270);
        pane2.getChildren().add(connectorLine3);
        this.shapes [3] = connectorLine3;
        ConnectorLine connectorLine4 = new ConnectorLine(337.5, 180, 337.5, 270);
        pane2.getChildren().add(connectorLine4);
        this.shapes [4] = connectorLine4;
        ConnectorLine connectorLine5 = new ConnectorLine(322, 170, 327.5, 170);
        pane2.getChildren().add(connectorLine5);
        this.shapes [5] = connectorLine5;

        ConnectorArc connectorArc = new ConnectorArc(110, 120, 10, 10, 90, 90);
        pane2.getChildren().add(connectorArc);
        this.shapes [6] = connectorArc;
        ConnectorArc connectorArc1 = new ConnectorArc(327.5, 180, 10, 10, 0, 90);
        pane2.getChildren().add(connectorArc1);
        this.shapes [7] = connectorArc1;

        FlatLine flatLine = new FlatLine(115, 110, 168, 110);
        pane2.getChildren().add(flatLine);
        this.shapes [8] = flatLine;
        FlatLine flatLine1 = new FlatLine(165, 65, 165, 95);
        pane2.getChildren().add(flatLine1);
        this.shapes [9] = flatLine1;
        FlatLine flatLine2 = new FlatLine(165, 125, 165, 155);
        pane2.getChildren().add(flatLine2);
        this.shapes [10] = flatLine2;
        FlatLine flatLine3 = new FlatLine(165, 185, 165, 230);
        pane2.getChildren().add(flatLine3);
        this.shapes [11] = flatLine3;
        FlatLine flatLine4 = new FlatLine(215, 167, 215, 230);
        pane2.getChildren().add(flatLine4);
        this.shapes [12] = flatLine4;
        FlatLine flatLine5 = new FlatLine(162, 170, 200, 170);
        pane2.getChildren().add(flatLine5);
        this.shapes [13] = flatLine5;
        FlatLine flatLine6 = new FlatLine(230, 170, 320, 170);
        pane2.getChildren().add(flatLine6);
        this.shapes [14] = flatLine6;

        PerpendicularLine perpendicularLine = new PerpendicularLine(115, 105, 115, 115);
        pane2.getChildren().add(perpendicularLine);
        this.shapes [15] = perpendicularLine;
        PerpendicularLine perpendicularLine1 = new PerpendicularLine(160, 230, 170, 230);
        pane2.getChildren().add(perpendicularLine1);
        this.shapes[16] = perpendicularLine1;
        PerpendicularLine perpendicularLine2 = new PerpendicularLine(210, 230, 220, 230);
        pane2.getChildren().add(perpendicularLine2);
        this.shapes[17] = perpendicularLine2;
        PerpendicularLine perpendicularLine3 = new PerpendicularLine(320, 165, 320, 175);
        pane2.getChildren().add(perpendicularLine3);
        this.shapes [18] = perpendicularLine3;

        SemiCircle semiCircle = new SemiCircle(165, 110, 15, 15, 270, 180);
        pane2.getChildren().add(semiCircle);
        this.shapes [19] = semiCircle;
        SemiCircle semiCircle1 = new SemiCircle(165, 170, 15, 15, 90, 180);
        pane2.getChildren().add(semiCircle1);
        this.shapes[20] = semiCircle1;
        SemiCircle semiCircle2 = new SemiCircle(215, 170, 15, 15, 0, 180);
        pane2.getChildren().add(semiCircle2);
        this.shapes [21] = semiCircle2;

        FullCircle fullCircle = new FullCircle(100, 285);
        pane2.getChildren().add(fullCircle);
        this.shapes [22] = fullCircle;
        FullCircle fullCircle1 = new FullCircle(165, 285);
        pane2.getChildren().add(fullCircle1);
        this.shapes[23] = fullCircle1;
        FullCircle fullCircle2 = new FullCircle(215, 285);
        pane2.getChildren().add(fullCircle2);
        this.shapes [24] = fullCircle2;
        FullCircle fullCircle3 = new FullCircle(337.5, 285);
        pane2.getChildren().add(fullCircle3);
        this.shapes [25] = fullCircle3;

        return pane2;
    }

    public Pane level3() {
        Pane pane3 = new Pane();
        this.shapes = new Shape[23];

        ConnectorArc connectorArc = new ConnectorArc(200, 150, 10, 10, 90, 90);
        pane3.getChildren().add(connectorArc);
        this.shapes [0] = connectorArc;
        ConnectorArc connectorArc1 = new ConnectorArc(295, 240, 10, 10, 270, 90);
        pane3.getChildren().add(connectorArc1);
        this.shapes [1] = connectorArc1;
        ConnectorArc connectorArc2 = new ConnectorArc(220, 270, 10, 10, 270, 90);
        pane3.getChildren().add(connectorArc2);
        this.shapes [2] = connectorArc2;
        ConnectorArc connectorArc3 = new ConnectorArc(240, 190, 10, 10, 90, 90);
        pane3.getChildren().add(connectorArc3);
        this.shapes [3] = connectorArc3;

        ConnectorLine connectorLine = new ConnectorLine(95, 250, 295, 250);
        pane3.getChildren().add(connectorLine);
        this.shapes [4] = connectorLine;
        ConnectorLine connectorLine1 = new ConnectorLine(145, 280, 220, 280);
        pane3.getChildren().add(connectorLine1);
        this.shapes [5] = connectorLine1;
        ConnectorLine connectorLine2 = new ConnectorLine(190, 150, 190, 315);
        pane3.getChildren().add(connectorLine2);
        this.shapes [6] = connectorLine2;
        ConnectorLine connectorLine3 = new ConnectorLine(200, 140, 205, 140);
        pane3.getChildren().add(connectorLine3);
        this.shapes [7] = connectorLine3;
        //ConnectorLine connectorLine4 = new ConnectorLine(205, 135, 205, 145);
        //pane3.getChildren().add(connectorLine4);
        //this.shapes [8] = connectorLine4;
        ConnectorLine connectorLine5 = new ConnectorLine(230, 190, 230, 270);
        pane3.getChildren().add(connectorLine5);
        this.shapes [9] = connectorLine5;


        FullCircle fullCircle = new FullCircle(80, 250);
        pane3.getChildren().add(fullCircle);
        this.shapes [10] = fullCircle;
        FullCircle fullCircle1 = new FullCircle(130, 280);
        pane3.getChildren().add(fullCircle1);
        this.shapes [11] = fullCircle1;
        FullCircle fullCircle2 = new FullCircle(190, 330);
        pane3.getChildren().add(fullCircle2);
        this.shapes [12] = fullCircle2;

        PerpendicularLine perpendicularLine = new PerpendicularLine(205, 135, 205, 145);
        pane3.getChildren().add(perpendicularLine);
        this.shapes [13] = perpendicularLine;
        PerpendicularLine perpendicularLine1 = new PerpendicularLine(240, 175, 240, 185);
        pane3.getChildren().add(perpendicularLine1);
        this.shapes [14] = perpendicularLine1;
        PerpendicularLine perpendicularLine2 = new PerpendicularLine(300, 240, 310, 240);
        pane3.getChildren().add(perpendicularLine2);
        this.shapes [15] = perpendicularLine2;

        FlatLine flatLine = new FlatLine(205, 140, 290, 140);
        pane3.getChildren().add(flatLine);
        this.shapes [16] = flatLine;
        FlatLine flatLine1 = new FlatLine(320, 140, 350, 140);
        pane3.getChildren().add(flatLine1);
        this.shapes [17] = flatLine1;
        FlatLine flatLine2 = new FlatLine(305, 137, 305, 165);
        pane3.getChildren().add(flatLine2);
        this.shapes [18] = flatLine2;
        FlatLine flatLine3 = new FlatLine(305, 195, 305, 240);
        pane3.getChildren().add(flatLine3);
        this.shapes [19] = flatLine3;
        FlatLine flatLine4 = new FlatLine(240, 180, 308, 180);
        pane3.getChildren().add(flatLine4);
        this.shapes [20] = flatLine4;

        SemiCircle semiCircle = new SemiCircle(305, 140, 15, 15, 0, 180);
        pane3.getChildren().add(semiCircle);
        this.shapes [21] = semiCircle;
        SemiCircle semiCircle1 = new SemiCircle(305, 180, 15, 15, 270, 180);
        pane3.getChildren().add(semiCircle1);
        this.shapes [22] = semiCircle1;

        return pane3;
    }

    public Pane level4() {
        Pane pane4 = new Pane();
        this.shapes = new Shape[18];

        FullCircle fullCircle = new FullCircle(80, 220);
        pane4.getChildren().add(fullCircle);
        this.shapes[0] = fullCircle;
        FullCircle fullCircle1 = new FullCircle(170, 300);
        pane4.getChildren().add(fullCircle1);
        shapes[1] = fullCircle1;

        EmptyCircle emptyCircle = new EmptyCircle(170, 220);
        pane4.getChildren().add(emptyCircle);
        shapes[2] = emptyCircle;

        SemiCircle semiCircle = new SemiCircle(310, 110, 15, 15, 0, 180);
        pane4.getChildren().add(semiCircle);
        shapes[3] = semiCircle;

        ConnectorLine connectorLineInsideCircle = new ConnectorLine(170, 205, 170, 235);
        pane4.getChildren().add(connectorLineInsideCircle);
        shapes[4] = connectorLineInsideCircle;

        ConnectorLine connectorLine = new ConnectorLine(95, 220, 155, 220);
        pane4.getChildren().add(connectorLine);
        shapes[5] = connectorLine;
        ConnectorLine connectorLine1 = new ConnectorLine(170, 235, 170, 285);
        pane4.getChildren().add(connectorLine1);
        shapes[6] = connectorLine1;
        ConnectorLine connectorLine2 = new ConnectorLine(185, 220, 300, 220);
        pane4.getChildren().add(connectorLine2);
        shapes[7] = connectorLine2;
        ConnectorLine connectorLine3 = new ConnectorLine(170, 120, 170, 205);
        pane4.getChildren().add(connectorLine3);
        shapes[8] = connectorLine3;
        ConnectorLine connectorLine4 = new ConnectorLine(180, 110, 185, 110);
        pane4.getChildren().add(connectorLine4);
        shapes[9] = connectorLine4;
        ConnectorLine connectorLine5 = new ConnectorLine(310, 205, 310, 210);
        pane4.getChildren().add(connectorLine5);
        shapes[10] = connectorLine5;

        ConnectorArc connectorArc = new ConnectorArc(180, 120, 10, 10, 90, 90);
        pane4.getChildren().add(connectorArc);
        shapes[11] = connectorArc;
        ConnectorArc connectorArc1 = new ConnectorArc(300, 210, 10, 10, 270, 90);
        pane4.getChildren().add(connectorArc1);
        shapes[12] = connectorArc1;

        PerpendicularLine perpendicularLine = new PerpendicularLine(185, 105, 185, 115);
        pane4.getChildren().add(perpendicularLine);
        shapes[13] = perpendicularLine;
        PerpendicularLine perpendicularLine1 = new PerpendicularLine(305, 205, 315, 205);
        pane4.getChildren().add(perpendicularLine1);
        shapes[14] = perpendicularLine1;

        FlatLine flatLine = new FlatLine(185, 110, 295, 110);
        pane4.getChildren().add(flatLine);
        shapes[15] = flatLine;
        FlatLine flatLine1 = new FlatLine(310, 107, 310, 205);
        pane4.getChildren().add(flatLine1);
        this.shapes[16] = flatLine1;
        FlatLine flatLine2 = new FlatLine(325, 110, 340, 110);
        pane4.getChildren().add(flatLine2);
        shapes[17] = flatLine2;

        return pane4;
    }

    public Pane level5() {
        Pane pane5 = new Pane();
        this.shapes = new Shape[40];

        FullCircle fullCircle = new FullCircle(80, 200);
        pane5.getChildren().add(fullCircle);
        shapes[0] = fullCircle;
        FullCircle fullCircle1 = new FullCircle(80, 260);
        pane5.getChildren().add(fullCircle1);
        shapes[1] = fullCircle1;
        FullCircle fullCircle2 = new FullCircle(180, 320);
        pane5.getChildren().add(fullCircle2);
        shapes[2] = fullCircle2;
        FullCircle fullCircle3 = new FullCircle(310, 320);
        pane5.getChildren().add(fullCircle3);
        shapes[3] = fullCircle3;

        EmptyCircle emptyCircle = new EmptyCircle(180, 260);
        pane5.getChildren().add(emptyCircle);
        shapes[4] = emptyCircle;
        EmptyCircle emptyCircle1 = new EmptyCircle(180, 200);
        pane5.getChildren().add(emptyCircle1);
        shapes[5] = emptyCircle1;

        SemiCircle semiCircle = new SemiCircle(260, 115, 15, 15, 90, 180);
        pane5.getChildren().add(semiCircle);
        shapes[6] = semiCircle;
        SemiCircle semiCircle1 = new SemiCircle(260, 85, 15, 15, 0, 180);
        pane5.getChildren().add(semiCircle1);
        shapes[7] = semiCircle1;
        SemiCircle semiCircle2 = new SemiCircle(330, 85, 15, 15, 270, 180);
        pane5.getChildren().add(semiCircle2);
        shapes[8] = semiCircle2;

        ConnectorLine connectorLineInsideCircle = new ConnectorLine(165, 260, 195, 260);
        pane5.getChildren().add(connectorLineInsideCircle);
        shapes[9] = connectorLineInsideCircle;
        ConnectorLine connectorLineInsideCircle1 = new ConnectorLine(180, 185, 180, 215);
        pane5.getChildren().add(connectorLineInsideCircle1);
        shapes[10] = connectorLineInsideCircle1;

        ConnectorLine connectorLine = new ConnectorLine(95, 200, 165, 200);
        pane5.getChildren().add(connectorLine);
        shapes[11] = connectorLine;
        ConnectorLine connectorLine1 = new ConnectorLine(95, 260, 165, 260);
        pane5.getChildren().add(connectorLine1);
        shapes[12] = connectorLine1;
        ConnectorLine connectorLine2 = new ConnectorLine(180, 275, 180, 305);
        pane5.getChildren().add(connectorLine2);
        shapes[13] = connectorLine2;
        ConnectorLine connectorLine3 = new ConnectorLine(180, 215, 180, 245);
        pane5.getChildren().add(connectorLine3);
        shapes[14] = connectorLine3;
        ConnectorLine connectorLine4 = new ConnectorLine(195, 200, 250, 200);
        pane5.getChildren().add(connectorLine4);
        shapes[15] = connectorLine4;
        ConnectorLine connectorLine5 = new ConnectorLine(260, 185, 260, 190);
        pane5.getChildren().add(connectorLine5);
        shapes[16] = connectorLine5;
        ConnectorLine connectorLine6 = new ConnectorLine(310, 125, 310, 305);
        pane5.getChildren().add(connectorLine6);
        shapes[17] = connectorLine6;
        ConnectorLine connectorLine7 = new ConnectorLine(295, 115, 300, 115);
        pane5.getChildren().add(connectorLine7);
        shapes[18] = connectorLine7;
        ConnectorLine connectorLine8 = new ConnectorLine(180, 95, 180, 185);
        pane5.getChildren().add(connectorLine8);
        shapes[19] = connectorLine8;
        ConnectorLine connectorLine9 = new ConnectorLine(190, 85, 195, 85);
        pane5.getChildren().add(connectorLine9);
        shapes[20] = connectorLine9;
        ConnectorLine connectorLine10 = new ConnectorLine(195, 260, 320, 260);
        pane5.getChildren().add(connectorLine10);
        shapes[21] = connectorLine10;
        ConnectorLine connectorLine11 = new ConnectorLine(330, 245, 330, 250);
        pane5.getChildren().add(connectorLine11);
        shapes[22] = connectorLine11;

        ConnectorArc connectorArc = new ConnectorArc(250, 190, 10, 10, 270, 90);
        pane5.getChildren().add(connectorArc);
        shapes[23] = connectorArc;
        ConnectorArc connectorArc1 = new ConnectorArc(300, 125, 10, 10, 0, 90);
        pane5.getChildren().add(connectorArc1);
        shapes[24] = connectorArc1;
        ConnectorArc connectorArc2 = new ConnectorArc(190, 95, 10, 10, 90, 90);
        pane5.getChildren().add(connectorArc2);
        shapes[25] = connectorArc2;
        ConnectorArc connectorArc3 = new ConnectorArc(320, 250, 10, 10, 270, 90);
        pane5.getChildren().add(connectorArc3);
        shapes[26] = connectorArc3;

        PerpendicularLine perpendicularLine = new PerpendicularLine(255, 185, 265, 185);
        pane5.getChildren().add(perpendicularLine);
        shapes[27] = perpendicularLine;
        PerpendicularLine perpendicularLine1 = new PerpendicularLine(295, 110, 295, 120);
        pane5.getChildren().add(perpendicularLine1);
        shapes[28] = perpendicularLine1;
        PerpendicularLine perpendicularLine2 = new PerpendicularLine(195, 80, 195, 90);
        pane5.getChildren().add(perpendicularLine2);
        shapes[29] = perpendicularLine2;
        PerpendicularLine perpendicularLine3 = new PerpendicularLine(325, 245, 335, 245);
        pane5.getChildren().add(perpendicularLine3);
        shapes[36] = perpendicularLine3;

        FlatLine flatLine = new FlatLine(260, 130, 260, 185);
        pane5.getChildren().add(flatLine);
        shapes[30] = flatLine;
        FlatLine flatLine1 = new FlatLine(260, 82, 260, 100);
        pane5.getChildren().add(flatLine1);
        shapes[31] = flatLine1;
        FlatLine flatLine2 = new FlatLine(257, 115, 295, 115);
        pane5.getChildren().add(flatLine2);
        shapes[32] = flatLine2;
        FlatLine flatLine3 = new FlatLine(195, 85, 245, 85);
        pane5.getChildren().add(flatLine3);
        shapes[33] = flatLine3;
        FlatLine flatLine4 = new FlatLine(275, 85, 333, 85);
        pane5.getChildren().add(flatLine4);
        shapes[34] = flatLine4;
        FlatLine flatLine5 = new FlatLine(330, 100, 330, 245);
        pane5.getChildren().add(flatLine5);
        shapes[35] = flatLine5;
        FlatLine flatLine7 = new FlatLine(330, 50, 330, 70);
        pane5.getChildren().add(flatLine7);
        shapes[37] = flatLine7;


        return pane5;
    }
    public Pane Menu(){

        Pane menupane = new Pane();
        this.shapes = new Shape[10];


        Text text = new Text("Game of Hook");
        text.setLayoutX(90);
        text.setLayoutY(140);
        text.setFont(Font.font("Cambria", 45));

        Text text2 = new Text();
        text2.setText("Start");
        text2.setLayoutX(90);
        text2.setLayoutY(290);
        text2.setFont(Font.font("Cambria", 32));

        Text text3 = new Text();
        text3.setText("Quit");
        text3.setLayoutX(292);
        text3.setLayoutY(290);
        text3.setFont(Font.font("Cambria", 32));


        Arc startArc = new Arc();
        startArc.setCenterX(122);
        startArc.setCenterY(280);
        startArc.setRadiusX(60);
        startArc.setRadiusY(60);
        startArc.setStrokeWidth(15);
        startArc.setFill(Color.TRANSPARENT);
        startArc.setStroke(Color.BLACK);
        startArc.setStartAngle(0);
        startArc.setLength(360);
        startArc.setType(ArcType.OPEN);
        shapes[0] =startArc;


        Arc quıtArc = new Arc();
        quıtArc.setCenterX(322);
        quıtArc.setCenterY(280);
        quıtArc.setRadiusX(60);
        quıtArc.setRadiusY(60);
        quıtArc.setStrokeWidth(15);
        quıtArc.setFill(Color.TRANSPARENT);
        quıtArc.setStroke(Color.BLACK);
        quıtArc.setStartAngle(0);
        quıtArc.setLength(360);
        quıtArc.setType(ArcType.OPEN);
        shapes[1] =quıtArc;


        menupane.getChildren().add(startArc);
        menupane.getChildren().add(quıtArc);
        menupane.getChildren().add(text);
        menupane.getChildren().add(text2);
        menupane.getChildren().add(text3);


        return menupane;
    }
    public Pane levels() {

        Pane levelpane = new Pane();
        this.shapes = new Shape[10];

        Arc buttonL1 = new Arc();
        buttonL1.setCenterX(55);
        buttonL1.setCenterY(280);
        buttonL1.setFill(Color.TRANSPARENT);
        buttonL1.setStroke(Color.BLACK);
        buttonL1.setStrokeWidth(4);
        buttonL1.setRadiusX(30);
        buttonL1.setRadiusY(30);
        buttonL1.setStartAngle(0);
        buttonL1.setLength(360);
        buttonL1.setType(ArcType.OPEN);
        shapes[0]=buttonL1;

        Text text1 = new Text();
        text1.setText("Level 1");
        text1.setLayoutX(33);
        text1.setLayoutY(285);
        text1.setFont(Font.font("Cambria", 16));

        Arc buttonL2 = new Arc();
        buttonL2.setCenterX(125);
        buttonL2.setCenterY(280);
        buttonL2.setFill(Color.TRANSPARENT);
        buttonL2.setStroke(Color.BLACK);
        buttonL2.setStrokeWidth(4);
        buttonL2.setRadiusX(30);
        buttonL2.setRadiusY(30);
        buttonL2.setStartAngle(0);
        buttonL2.setLength(360);
        buttonL2.setType(ArcType.OPEN);
        shapes[1]=buttonL2;


        Text text2 = new Text();
        text2.setText("Level 2");
        text2.setLayoutX(103);
        text2.setLayoutY(285);
        text2.setFont(Font.font("Cambria", 16));

        Arc buttonL3 = new Arc();
        buttonL3.setCenterX(195);
        buttonL3.setCenterY(280);
        buttonL3.setFill(Color.TRANSPARENT);
        buttonL3.setStroke(Color.BLACK);
        buttonL3.setStrokeWidth(4);
        buttonL3.setRadiusX(30);
        buttonL3.setRadiusY(30);
        buttonL3.setStartAngle(0);
        buttonL3.setLength(360);
        buttonL3.setType(ArcType.OPEN);
        shapes[2]=buttonL3;

        Text text3 = new Text();
        text3.setText("Level 3");
        text3.setLayoutX(173);
        text3.setLayoutY(285);
        text3.setFont(Font.font("Cambria", 16));


        Arc buttonL4 = new Arc();
        buttonL4.setCenterX(265);
        buttonL4.setCenterY(280);
        buttonL4.setFill(Color.TRANSPARENT);
        buttonL4.setStroke(Color.BLACK);
        buttonL4.setStrokeWidth(4);
        buttonL4.setRadiusX(30);
        buttonL4.setRadiusY(30);
        buttonL4.setStartAngle(0);
        buttonL4.setLength(360);
        buttonL4.setType(ArcType.OPEN);
        shapes[3]=buttonL4;

        Text text4 = new Text();
        text4.setText("Level 4");
        text4.setLayoutX(240);
        text4.setLayoutY(285);
        text4.setFont(Font.font("Cambria", 16));


        Arc buttonL5 = new Arc();
        buttonL5.setCenterX(335);
        buttonL5.setCenterY(280);
        buttonL5.setFill(Color.TRANSPARENT);
        buttonL5.setStroke(Color.BLACK);
        buttonL5.setStrokeWidth(4);
        buttonL5.setRadiusX(30);
        buttonL5.setRadiusY(30);
        buttonL5.setStartAngle(0);
        buttonL5.setLength(360);
        buttonL5.setType(ArcType.OPEN);
        shapes[4]=buttonL5;

        Text text5 = new Text();
        text5.setText("Level 5");
        text5.setLayoutX(312);
        text5.setLayoutY(285);
        text5.setFont(Font.font("Cambria", 16));

        Arc quıt = new Arc();
        quıt.setCenterX(405);
        quıt.setCenterY(280);
        quıt.setFill(Color.TRANSPARENT);
        quıt.setStroke(Color.BLACK);
        quıt.setStrokeWidth(4);
        quıt.setRadiusX(30);
        quıt.setRadiusY(30);
        quıt.setStartAngle(0);
        quıt.setLength(360);
        quıt.setType(ArcType.OPEN);
        shapes[5]=quıt;

        Text textquıt = new Text();
        textquıt.setText("Quıt");
        textquıt.setLayoutX(390);
        textquıt.setLayoutY(285);
        textquıt.setFont(Font.font("Cambria", 16));

        Text text = new Text("Welcome the Hook");
        text.setLayoutX(46);
        text.setLayoutY(160);
        text.setFont(Font.font("Cambria", 45));




        levelpane.getChildren().add(buttonL1);
        levelpane.getChildren().add(buttonL2);
        levelpane.getChildren().add(buttonL3);
        levelpane.getChildren().add(buttonL4);
        levelpane.getChildren().add(buttonL5);
        levelpane.getChildren().add(quıt);
        levelpane.getChildren().add(text);
        levelpane.getChildren().add(text1);
        levelpane.getChildren().add(text2);
        levelpane.getChildren().add(text3);
        levelpane.getChildren().add(text4);
        levelpane.getChildren().add(text5);
        levelpane.getChildren().add(textquıt);



        return levelpane;
    }
    public Pane congratulations() {

        Pane congratulations = new Pane();
        this.shapes = new Shape[10];

        Text cong = new Text();
        cong.setText("Congratulations!");
        cong.setLayoutY(160);
        cong.setLayoutX(60);
        cong.setFont(Font.font("Cambria", 50));
        shapes[1]=cong;

        Text click = new Text();
        click.setText("(Click The Screen to Quit!)");
        click.setLayoutY(195);
        click.setLayoutX(148);
        click.setFont(Font.font("Cambria", 15));
        shapes[2]=click;

        Rectangle end = new Rectangle();
        end.setX(0);
        end.setY(0);
        end.setHeight(500);
        end.setWidth(500);
        end.setFill(Color.TRANSPARENT);
        shapes[0]=end;

        congratulations.getChildren().add(cong);
        congratulations.getChildren().add(end);
        congratulations.getChildren().add(click);

        return congratulations;
    }
    public Pane restart() {

        Pane restart = new Pane();
        this.shapes = new Shape[3];

        Text text = new Text("You failed.Try Again!");
        text.setLayoutX(65);
        text.setLayoutY(160);
        text.setFont(Font.font("Cambria", 35));
        shapes[0] = text;

        Text again = new Text();
        again.setText("(Click The Screen to Restart!)");
        again.setLayoutY(195);
        again.setLayoutX(128);
        again.setFont(Font.font("Cambria", 15));
        shapes[1]=again;

        Rectangle end = new Rectangle();
        end.setX(0);
        end.setY(0);
        end.setHeight(500);
        end.setWidth(500);
        end.setFill(Color.TRANSPARENT);
        shapes[2]=end;

        restart.getChildren().add(text);
        restart.getChildren().add(again);
        restart.getChildren().add(end);

        return restart;
    }


    public Pane getPane() {
        return pane;
    }
}