package sample;
import javafx.scene.layout.Pane;
public class Level {
    public Pane pane;

    public Level(int level) {

        //Called method return the level
        if (level == 1) this.pane = level1();
        else if (level == 2) this.pane = level2();
        else if (level == 3) this.pane = level3();
        else if (level == 4) this.pane = level4();
        else if (level == 5) this.pane = level5();
        else this.pane = level1();


    }
    //Create a level 1 method
    public Pane level1() {
        //Create a pane1 object
        Pane pane1 = new Pane();

        //Create a connector arcs objects
        ConnectorArc connectorArc = new ConnectorArc(90, 120, 10, 10, 90, 90);
        pane1.getChildren().add(connectorArc);
        ConnectorArc connectorArc1 = new ConnectorArc(90, 200, 10, 10, 180, 90);
        pane1.getChildren().add(connectorArc1);

        //Create a semi circles object
        SemiCircle semiCircle = new SemiCircle(215, 110, 15, 15,0,180);
        pane1.getChildren().add(semiCircle);

        //Create a connector lines objects
        ConnectorLine connectorLine = new ConnectorLine(90, 110, 100, 110);
        pane1.getChildren().add(connectorLine);
        ConnectorLine connectorLine1 = new ConnectorLine(80, 120, 80, 200);
        pane1.getChildren().add(connectorLine1);
        ConnectorLine connectorLine2 = new ConnectorLine(90, 210, 250, 210);
        pane1.getChildren().add(connectorLine2);
        ConnectorLine connectorLine3 = new ConnectorLine(215, 200, 215, 240);
        pane1.getChildren().add(connectorLine3);

        //Create a perpendicular lines objects
        PerpendicularLine perpendicularLine = new PerpendicularLine(100, 105, 100, 115);
        pane1.getChildren().add(perpendicularLine);
        PerpendicularLine perpendicularLine1 = new PerpendicularLine(210, 200, 220, 200);
        pane1.getChildren().add(perpendicularLine1);

        //Create a flat lines objects
        FlatLine flatLine = new FlatLine(102.5, 110, 200, 110);
        pane1.getChildren().add(flatLine);
        FlatLine flatLine1 = new FlatLine(230, 110, 250, 110);
        pane1.getChildren().add(flatLine1);
        FlatLine flatLine2 = new FlatLine(215, 105, 215, 200);
        pane1.getChildren().add(flatLine2);

        //Create a full circles objects
        FullCircle fullCircle = new FullCircle(215, 255);
        pane1.getChildren().add(fullCircle);
        FullCircle fullCircle1 = new FullCircle(265, 210);
        pane1.getChildren().add(fullCircle1);
        FullCircle buttonCircle = new FullCircle(215, 255);
        pane1.getChildren().add(buttonCircle);
        FullCircle buttonCircle1 = new FullCircle(265, 210);
        pane1.getChildren().add(buttonCircle1);

        //Return the level 1
        return pane1;
    }
    //Create a level 2 method
    public Pane level2() {

        //Create a pane2 object
        Pane pane2 = new Pane();

        //Create a connector lines objects
        ConnectorLine connectorLine = new ConnectorLine(100, 120, 100, 270);
        pane2.getChildren().add(connectorLine);
        ConnectorLine connectorLine1 = new ConnectorLine(110, 110, 115, 110);
        pane2.getChildren().add(connectorLine1);
        ConnectorLine connectorLine2 = new ConnectorLine(165, 230, 165, 270);
        pane2.getChildren().add(connectorLine2);
        ConnectorLine connectorLine3 = new ConnectorLine(215, 230, 215, 270);
        pane2.getChildren().add(connectorLine3);
        ConnectorLine connectorLine4 = new ConnectorLine(337.5,180,337.5,270);
        pane2.getChildren().add(connectorLine4);
        ConnectorLine connectorLine5 = new ConnectorLine(322,170,327.5,170);
        pane2.getChildren().add(connectorLine5);

        //Create a connector arcs objects
        ConnectorArc connectorArc = new ConnectorArc(110,120,10,10,90,90);
        pane2.getChildren().add(connectorArc);
        ConnectorArc connectorArc1 = new ConnectorArc(327.5,180,10,10,0,90);
        pane2.getChildren().add(connectorArc1);

        //Create a flat lines objects
        FlatLine flatLine = new FlatLine(115,110,168,110);
        pane2.getChildren().add(flatLine);
        FlatLine flatLine1 = new FlatLine(165,65,165,95);
        pane2.getChildren().add(flatLine1);
        FlatLine flatLine2 = new FlatLine(165,125,165,155);
        pane2.getChildren().add(flatLine2);
        FlatLine flatLine3 = new FlatLine(165,185,165,230);
        pane2.getChildren().add(flatLine3);
        FlatLine flatLine4 = new FlatLine(215,167,215,230);
        pane2.getChildren().add(flatLine4);
        FlatLine flatLine5 = new FlatLine(162,170,200,170);
        pane2.getChildren().add(flatLine5);
        FlatLine flatLine6 = new FlatLine(230,170,320,170);
        pane2.getChildren().add(flatLine6);

        //Create a perpendicular lines objects
        PerpendicularLine perpendicularLine = new PerpendicularLine(115,105,115,115);
        pane2.getChildren().add(perpendicularLine);
        PerpendicularLine perpendicularLine1 = new PerpendicularLine(160,230,170,230);
        pane2.getChildren().add(perpendicularLine1);
        PerpendicularLine perpendicularLine2 = new PerpendicularLine(210,230,220,230);
        pane2.getChildren().add(perpendicularLine2);
        PerpendicularLine perpendicularLine3 = new PerpendicularLine(320,165,320,175);
        pane2.getChildren().add(perpendicularLine3);

        //Create a semi circles object
        SemiCircle semiCircle = new SemiCircle(165,110,15,15,270,180);
        pane2.getChildren().add(semiCircle);
        SemiCircle semiCircle1 = new SemiCircle(165,170,15,15,90,180);
        pane2.getChildren().add(semiCircle1);
        SemiCircle semiCircle2 = new SemiCircle(215,170,15,15,0,180);
        pane2.getChildren().add(semiCircle2);

        //Create a full circles objects
        FullCircle fullCircle = new FullCircle(100, 285);
        pane2.getChildren().add(fullCircle);
        FullCircle fullCircle1 = new FullCircle(165, 285);
        pane2.getChildren().add(fullCircle1);
        FullCircle fullCircle2 = new FullCircle(215, 285);
        pane2.getChildren().add(fullCircle2);
        FullCircle fullCircle3 = new FullCircle(337.5, 285);
        pane2.getChildren().add(fullCircle3);

        //Return the level 2
        return pane2;
    }
    //Create a level 3 method
    public Pane level3() {
        //Create a pane3 object
        Pane pane3 = new Pane();

        //Create a connector arcs objects
        ConnectorArc connectorArc = new ConnectorArc(200,150,10,10,90,90);
        pane3.getChildren().add(connectorArc);
        ConnectorArc connectorArc1 = new ConnectorArc(295,240,10,10,270,90);
        pane3.getChildren().add(connectorArc1);
        ConnectorArc connectorArc2 = new ConnectorArc(220,270,10,10,270,90);
        pane3.getChildren().add(connectorArc2);
        ConnectorArc connectorArc3 = new ConnectorArc(240,190,10,10,90,90);
        pane3.getChildren().add(connectorArc3);

        //Create a connector lines objects
        ConnectorLine connectorLine = new ConnectorLine(95,250,295,250);
        pane3.getChildren().add(connectorLine);
        ConnectorLine connectorLine1 = new ConnectorLine(145,280,220,280);
        pane3.getChildren().add(connectorLine1);
        ConnectorLine connectorLine2 = new ConnectorLine(190,150,190,315);
        pane3.getChildren().add(connectorLine2);
        ConnectorLine connectorLine3 = new ConnectorLine(190,150,190,315);
        pane3.getChildren().add(connectorLine3);
        ConnectorLine connectorLine4 = new ConnectorLine(200,140,205,140);
        pane3.getChildren().add(connectorLine4);
        ConnectorLine connectorLine5 = new ConnectorLine(205,135,205,145);
        pane3.getChildren().add(connectorLine5);
        ConnectorLine connectorLine6 = new ConnectorLine(230,190,230,270);
        pane3.getChildren().add(connectorLine6);

        //Create a full circles objects
        FullCircle fullCircle = new FullCircle(80, 250);
        pane3.getChildren().add(fullCircle);
        FullCircle fullCircle1 = new FullCircle(130, 280);
        pane3.getChildren().add(fullCircle1);
        FullCircle fullCircle2 = new FullCircle(190, 330);
        pane3.getChildren().add(fullCircle2);

        //Create a perpendicular lines objects
        PerpendicularLine perpendicularLine = new PerpendicularLine(205,135,205,145);
        pane3.getChildren().add(perpendicularLine);
        PerpendicularLine perpendicularLine1 = new PerpendicularLine(240,175,240,185);
        pane3.getChildren().add(perpendicularLine1);
        PerpendicularLine perpendicularLine2 = new PerpendicularLine(300,240,310,240);
        pane3.getChildren().add(perpendicularLine2);

        //Create a flat lines objects
        FlatLine flatLine = new FlatLine(205,140,290,140);
        pane3.getChildren().add(flatLine);
        FlatLine flatLine1 = new FlatLine(320,140,350,140);
        pane3.getChildren().add(flatLine1);
        FlatLine flatLine2 = new FlatLine(305,137,305,165);
        pane3.getChildren().add(flatLine2);
        FlatLine flatLine3 = new FlatLine(305,195,305,240);
        pane3.getChildren().add(flatLine3);
        FlatLine flatLine4 = new FlatLine(240,180,308,180);
        pane3.getChildren().add(flatLine4);

        //Create a semi circles object
        SemiCircle semiCircle = new SemiCircle(305,140,15,15,0,180);
        pane3.getChildren().add(semiCircle);
        SemiCircle semiCircle1 = new SemiCircle(305,180,15,15,270,180);
        pane3.getChildren().add(semiCircle1);

        //Return the level 3
        return pane3;
    }
    //Create a level 4 method
    public Pane level4() {
        //Create a pane4 object
        Pane pane4 = new Pane();

        //Create a full circles objects
        FullCircle fullCircle = new FullCircle(80, 220);
        pane4.getChildren().add(fullCircle);
        FullCircle fullCircle1 = new FullCircle(170, 300);
        pane4.getChildren().add(fullCircle1);

        //Create a empty circles objects
        EmptyCircle emptyCircle = new EmptyCircle(170, 220);
        pane4.getChildren().add(emptyCircle);

        //Create a semi circles object
        SemiCircle semiCircle = new SemiCircle(310,110,15,15,0,180);
        pane4.getChildren().add(semiCircle);

        //Create a connector line inside the circle objects
        ConnectorLine connectorLineInsideCircle = new ConnectorLine(170,205,170,235);
        pane4.getChildren().add(connectorLineInsideCircle);

        //Create a connector lines objects
        ConnectorLine connectorLine = new ConnectorLine(95,220,155,220);
        pane4.getChildren().add(connectorLine);
        ConnectorLine connectorLine1 = new ConnectorLine(170,235,170,285);
        pane4.getChildren().add(connectorLine1);
        ConnectorLine connectorLine2 = new ConnectorLine(185,220,300,220);
        pane4.getChildren().add(connectorLine2);
        ConnectorLine connectorLine3 = new ConnectorLine(170,120,170,205);
        pane4.getChildren().add(connectorLine3);
        ConnectorLine connectorLine4 = new ConnectorLine(180,110,185,110);
        pane4.getChildren().add(connectorLine4);
        ConnectorLine connectorLine5 = new ConnectorLine(310,205,310,210);
        pane4.getChildren().add(connectorLine5);

        //Create a connector arcs objects
        ConnectorArc connectorArc = new ConnectorArc(180,120,10,10,90,90);
        pane4.getChildren().add(connectorArc);
        ConnectorArc connectorArc1 = new ConnectorArc(300,210,10,10,270,90);
        pane4.getChildren().add(connectorArc1);

        //Create a perpendicular lines objects
        PerpendicularLine perpendicularLine = new PerpendicularLine(185,105,185,115);
        pane4.getChildren().add(perpendicularLine);
        PerpendicularLine perpendicularLine1 = new PerpendicularLine(305,205,315,205);
        pane4.getChildren().add(perpendicularLine1);

        //Create a flat lines objects
        FlatLine flatLine = new FlatLine(185,110,295,110);
        pane4.getChildren().add(flatLine);
        FlatLine flatLine1 = new FlatLine(310,107,310,205);
        pane4.getChildren().add(flatLine1);
        FlatLine flatLine2 = new FlatLine(325,110,340,110);
        pane4.getChildren().add(flatLine2);

        //Return the level 4
        return pane4;
    }
    //Create a level 5 method
    public Pane level5() {
        //Create a pane5 object
        Pane pane5 = new Pane();

        //Create a full circles objects
        FullCircle fullCircle = new FullCircle(80, 200);
        pane5.getChildren().add(fullCircle);
        FullCircle fullCircle1 = new FullCircle(80,260);
        pane5.getChildren().add(fullCircle1);
        FullCircle fullCircle2 = new FullCircle(180,320);
        pane5.getChildren().add(fullCircle2);
        FullCircle fullCircle3 = new FullCircle(310, 320);
        pane5.getChildren().add(fullCircle3);

        //Create a empty circles objects
        EmptyCircle emptyCircle = new EmptyCircle(180,260);
        pane5.getChildren().add(emptyCircle);
        EmptyCircle emptyCircle1 = new EmptyCircle(180,200);
        pane5.getChildren().add(emptyCircle1);

        //Create a semi circles object
        SemiCircle semiCircle = new SemiCircle(260,115,15,15,90,180);
        pane5.getChildren().add(semiCircle);
        SemiCircle semiCircle1 = new SemiCircle(260,85,15,15,0,180);
        pane5.getChildren().add(semiCircle1);
        SemiCircle semiCircle2 = new SemiCircle(330,85,15,15,270,180);
        pane5.getChildren().add(semiCircle2);

        //Create a connector line inside the circle objects
        ConnectorLine connectorLineInsideCircle = new ConnectorLine(165,260,195,260);
        pane5.getChildren().add(connectorLineInsideCircle);
        ConnectorLine connectorLineInsideCircle1 = new ConnectorLine(180,185,180,215);
        pane5.getChildren().add(connectorLineInsideCircle1);

        //Create a connector lines objects
        ConnectorLine connectorLine = new ConnectorLine(95,200,165,200);
        pane5.getChildren().add(connectorLine);
        ConnectorLine connectorLine1 = new ConnectorLine(95,260,165,260);
        pane5.getChildren().add(connectorLine1);
        ConnectorLine connectorLine2 = new ConnectorLine(180,275,180,305);
        pane5.getChildren().add(connectorLine2);
        ConnectorLine connectorLine3 = new ConnectorLine(180,215,180,245);
        pane5.getChildren().add(connectorLine3);
        ConnectorLine connectorLine4 = new ConnectorLine(195,200,250,200);
        pane5.getChildren().add(connectorLine4);
        ConnectorLine connectorLine5 = new ConnectorLine(260,185,260,190);
        pane5.getChildren().add(connectorLine5);
        ConnectorLine connectorLine6 = new ConnectorLine(310,125,310,305);
        pane5.getChildren().add(connectorLine6);
        ConnectorLine connectorLine7 = new ConnectorLine(295,115,300,115);
        pane5.getChildren().add(connectorLine7);
        ConnectorLine connectorLine8 = new ConnectorLine(180,95,180,185);
        pane5.getChildren().add(connectorLine8);
        ConnectorLine connectorLine9 = new ConnectorLine(190,85,195,85);
        pane5.getChildren().add(connectorLine9);
        ConnectorLine connectorLine10 = new ConnectorLine(195,260,320,260);
        pane5.getChildren().add(connectorLine10);
        ConnectorLine connectorLine11 = new ConnectorLine(330,245,330,250);
        pane5.getChildren().add(connectorLine11);

        //Create a connector arcs objects
        ConnectorArc connectorArc = new ConnectorArc(250,190,10,10,270,90);
        pane5.getChildren().add(connectorArc);
        ConnectorArc connectorArc1 = new ConnectorArc(300,125,10,10,0,90);
        pane5.getChildren().add(connectorArc1);
        ConnectorArc connectorArc2 = new ConnectorArc(190,95,10,10,90,90);
        pane5.getChildren().add(connectorArc2);
        ConnectorArc connectorArc3 = new ConnectorArc(320,250,10,10,270,90);
        pane5.getChildren().add(connectorArc3);

        //Create a perpendicular lines objects
        PerpendicularLine perpendicularLine = new PerpendicularLine(255,185,265,185);
        pane5.getChildren().add(perpendicularLine);
        PerpendicularLine perpendicularLine1 = new PerpendicularLine(295,110,295,120);
        pane5.getChildren().add(perpendicularLine1);
        PerpendicularLine perpendicularLine2 = new PerpendicularLine(195,80,195,90);
        pane5.getChildren().add(perpendicularLine2);

        //Create a flat lines objects
        FlatLine flatLine = new FlatLine(260,130,260,185);
        pane5.getChildren().add(flatLine);
        FlatLine flatLine1 = new FlatLine(260,82,260,100);
        pane5.getChildren().add(flatLine1);
        FlatLine flatLine2 = new FlatLine(257,115,295,115);
        pane5.getChildren().add(flatLine2);
        FlatLine flatLine3 = new FlatLine(195,85,245,85);
        pane5.getChildren().add(flatLine3);
        FlatLine flatLine4 = new FlatLine(275,85,333,85);
        pane5.getChildren().add(flatLine4);
        FlatLine flatLine5 = new FlatLine(330,100,330,245);
        pane5.getChildren().add(flatLine5);
        FlatLine flatLine6 = new FlatLine(325,245,335,245);
        pane5.getChildren().add(flatLine6);
        FlatLine flatLine7 = new FlatLine(330,50,330,70);
        pane5.getChildren().add(flatLine7);

        //Return the level 5
        return pane5;
    }
    //This method return the pane
    public Pane getPane() {
        return pane;
    }
}