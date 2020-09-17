package sample;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ActionLevel2 {
    boolean delete, delete1, delete2, delete3, reset;
    boolean collision = true;
    boolean collision1 = true;
    boolean collision2 = true;
    int count, count1, count2;
    boolean resetPane, resetPane1;

    ReLevelAction regame = new ReLevelAction();

    public void buttonCircle(Shape levelShapes[], Pane pane){


        Timeline level2animation1 = new Timeline(
                new KeyFrame(Duration.millis(14), e -> {
                    shortenXLine((Line) levelShapes[8]);
                    if (delete) {
                        pane.getChildren().remove(levelShapes[8]);
                        pane.getChildren().remove(levelShapes[15]);
                        pane.getChildren().remove(levelShapes[1]);
                        pane.getChildren().remove(levelShapes[6]);
                        pane.getChildren().remove(levelShapes[0]);
                        pane.getChildren().remove(levelShapes[22]);
                    }
                })
        );
        level2animation1.setCycleCount(54);

        Timeline level2animation3 = new Timeline(
                new KeyFrame(Duration.millis(10), e -> {
                    addPerpendicular((Line) levelShapes[15], 15);

                }));
        level2animation3.setCycleCount(15);

        levelShapes[22].setOnMouseClicked(event -> {
            level2animation1.play();
            level2animation3.play();
        });

    }
    public void buttonCircle2(Shape levelShapes[], Pane pane,Stage primaryStage,Scene scenes[], Shape reagain[]){
        //this method will be add y axis to the line and carry the line
        Timeline level2animation8= new Timeline(
                new KeyFrame(Duration.millis(14), e -> {
                    if(!collision1 && !collision2){
                        carryYLine2((Line) levelShapes[9]);
                    }

                    if (delete1) {
                        pane.getChildren().remove(levelShapes[9]);
                        pane.getChildren().remove(levelShapes[19]);
                        pane.getChildren().remove(levelShapes[10]);
                        pane.getChildren().remove(levelShapes[20]);
                        pane.getChildren().remove(levelShapes[16]);
                        pane.getChildren().remove(levelShapes[2]);
                        pane.getChildren().remove(levelShapes[23]);
                        primaryStage.setScene(scenes[2]);
                        primaryStage.setTitle("Level 3");

                    }
                })
        );
        level2animation8.setCycleCount(165);

        Timeline level2animation9= new Timeline(
                new KeyFrame(Duration.millis(14), e -> {
                    if(!collision1 && !collision2){
                        carryYLine((Line) levelShapes[10]);
                    }
                })
        );
        level2animation9.setCycleCount(105);

        Timeline level2animation10= new Timeline(
                new KeyFrame(Duration.millis(14), e -> {
                    if(!collision1 && !collision2){
                        shortenYLine((Line) levelShapes[11]);
                    }
                })
        );
        level2animation10.setCycleCount(45);

        Timeline level2animation11= new Timeline(
                new KeyFrame(Duration.millis(14), e -> {
                    if(!collision1 && !collision2) {
                       carryYArc((Arc) levelShapes[20]);
                    }
                })
        );
        level2animation11.setCycleCount(75);

        Timeline level2animation12= new Timeline(
                new KeyFrame(Duration.millis(14), e -> {
                    if(!collision1 && !collision2){
                       carryY2Arc((Arc) levelShapes[19]);
                    }
                })
        );
        level2animation12.setCycleCount(135);

        Timeline level2animation13 = new Timeline(
                new KeyFrame(Duration.millis(10), e -> {
                   if(!collision1 && !collision2){
                      addXPerpendicularLine((Line) levelShapes[16], 15);
                      addX2PerpendicularLine((Line) levelShapes[16], 15);
                   }

                }));
        level2animation13.setCycleCount(15);

        Timeline animation = new Timeline(
                new KeyFrame(Duration.millis(14), e -> {
                    try{
                        if(collision1 || collision2){
                            collisionYarc((Arc)levelShapes[20]);
                            collisionYarc2((Arc)levelShapes[19]);
                            collisionYLine((Line)levelShapes[9], (Line)levelShapes[8]);
                            collisionYLine((Line)levelShapes[10], (Line)levelShapes[13]);
                            collisionYLine2((Line)levelShapes[11]);
                            if(resetPane1){

                                try{
                                    pane.getChildren().add(levelShapes[8]);
                                    pane.getChildren().add(levelShapes[15]);
                                    pane.getChildren().add(levelShapes[1]);
                                    pane.getChildren().add(levelShapes[6]);
                                    pane.getChildren().add(levelShapes[0]);
                                    pane.getChildren().add(levelShapes[22]);

                                    resetXLine((Line)levelShapes[8]);
                                    resetPerpendicular((Line)levelShapes[15]);


                                }
                                catch (Exception ex){
                                    System.out.println(ex);
                                }
                            }
                            if(resetPane1){

                                try{

                                    pane.getChildren().add(levelShapes[12]);
                                    pane.getChildren().add(levelShapes[24]);
                                    pane.getChildren().add(levelShapes[17]);
                                    pane.getChildren().add(levelShapes[3]);

                                    resetPerpendicular((Line)levelShapes[17]);
                                    resetYLine((Line)levelShapes[12]);

                                }
                                catch (Exception ex){
                                    System.out.println(ex);
                                }
                            }
                            if(resetPane1){

                                try{
                                    pane.getChildren().add(levelShapes[18]);
                                    pane.getChildren().add(levelShapes[5]);
                                    pane.getChildren().add(levelShapes[4]);
                                    pane.getChildren().add(levelShapes[7]);
                                    pane.getChildren().add(levelShapes[25]);
                                    pane.getChildren().add(levelShapes[13]);
                                    pane.getChildren().add(levelShapes[14]);
                                    pane.getChildren().add(levelShapes[21]);

                                    resetPerpendicular((Line)levelShapes[18]);
                                    resetXLine2((Line)levelShapes[13]);
                                    resetXLine3((Line)levelShapes[14]);
                                    resetArc((Arc)levelShapes[21]);

                                }
                                catch (Exception ex){
                                    System.out.println(ex);
                                }
                            }
                        }
                    }
                    catch(Exception ex){
                        System.out.println(ex);
                    }

                }));
        animation.setCycleCount(12);

        Timeline animation2 = new Timeline(
                new KeyFrame(Duration.millis(14), e -> {
                    try{
                        if(reset){
                            turnArc((Arc)levelShapes[20]);
                            turnArc((Arc)levelShapes[19]);
                            turnLine((Line) levelShapes[11]);
                            turnLine2((Line) levelShapes[10]);
                            turnLine2((Line)levelShapes[9]);
                            primaryStage.setScene(scenes[8]);
                            regame.buttonCircle(reagain,primaryStage,scenes[1]);

                        }
                    }
                    catch(Exception ex){
                        System.out.println(ex);
                    }

                }));
        animation2.setCycleCount(12);

        levelShapes[23].setOnMouseClicked(event -> {
            level2animation8.play();
            level2animation9.play();
            level2animation10.play();
            level2animation11.play();
            level2animation12.play();
            level2animation13.play();
            animation.play();
            animation2.play();
        });

    }
    public void buttonCircle3(Shape levelShapes[], Pane pane){
        Timeline level2animation2 = new Timeline(
                new KeyFrame(Duration.millis(14), e -> {
                    shortenYLine((Line) levelShapes[12]);
                    if (delete2) {
                        pane.getChildren().remove(levelShapes[12]);
                        pane.getChildren().remove(levelShapes[24]);
                        pane.getChildren().remove(levelShapes[17]);
                        pane.getChildren().remove(levelShapes[3]);
                    }
                })
        );
        level2animation2.setCycleCount(70);

        Timeline level2animation4 = new Timeline(
                new KeyFrame(Duration.millis(10), e -> {
                    addXPerpendicularLine((Line) levelShapes[17], 15);
                    addX2PerpendicularLine((Line) levelShapes[17], 15);
                }));
        level2animation4.setCycleCount(15);

        levelShapes[24].setOnMouseClicked(event -> {
            level2animation2.play();
            level2animation4.play();
        });

    }
    public void buttonCircle4(Shape levelShapes[], Pane pane,Stage primaryStage, Scene scenes[], Shape reagain[]){

        Timeline level2animation5 = new Timeline( // carrying semi circle to the perpendicular line
                new KeyFrame(Duration.millis(14), e -> {
                    if (!collision) {
                        carryXArc((Arc) levelShapes[21]);
                    }
                })
        );

        level2animation5.setCycleCount(130);


        Timeline level2animation6= new Timeline(
                new KeyFrame(Duration.millis(14), e -> {
                   if(!collision){
                      shortenX2Line((Line) levelShapes[14]);
                   }
                })
        );
        level2animation6.setCycleCount(100);

        //this method will be carry the flat line 13 then remove this flat
        Timeline level2animation7= new Timeline(
                new KeyFrame(Duration.millis(14), e -> {
                    if(!collision){
                       carryXLine((Line) levelShapes[13]);
                    }

                    if (delete3) {
                        pane.getChildren().remove(levelShapes[18]);
                        pane.getChildren().remove(levelShapes[5]);
                        pane.getChildren().remove(levelShapes[4]);
                        pane.getChildren().remove(levelShapes[7]);
                        pane.getChildren().remove(levelShapes[25]);
                        pane.getChildren().remove(levelShapes[13]);
                        pane.getChildren().remove(levelShapes[14]);
                        pane.getChildren().remove(levelShapes[21]);
                    }
                })
        );
        level2animation7.setCycleCount(170);

        Timeline level2animation14 = new Timeline(
                new KeyFrame(Duration.millis(10), e -> {
                    if(!collision){
                       addPerpendicular((Line) levelShapes[18], 15);
                    }

                    if (levelShapes[18] == null) {
                        pane.getChildren().remove(levelShapes[18]);


                    }
                }));
        level2animation14.setCycleCount(15);

        Timeline animation8 = new Timeline(
                new KeyFrame(Duration.millis(14), e -> {
                    try{
                        if(collision){
                            collisionXArc((Arc)levelShapes[21]);
                            collisionXLine((Line) levelShapes[14]);
                            collisionXLine2((Line) levelShapes[13]);
                            if(resetPane){

                                try{
                                    pane.getChildren().add(levelShapes[8]);
                                    pane.getChildren().add(levelShapes[15]);
                                    pane.getChildren().add(levelShapes[1]);
                                    pane.getChildren().add(levelShapes[6]);
                                    pane.getChildren().add(levelShapes[0]);
                                    pane.getChildren().add(levelShapes[22]);

                                    resetXLine((Line)levelShapes[8]);
                                    resetPerpendicular((Line)levelShapes[15]);

                                }
                                catch (Exception ex){
                                    System.out.println(ex);
                                }
                            }
                        }
                    }
                    catch(Exception ex){
                        System.out.println(ex);
                    }

                }));
        animation8.setCycleCount(12);


        Timeline animation9 = new Timeline(
                new KeyFrame(Duration.millis(14), e -> {
                    try{
                        if(reset){
                            turnArc((Arc)levelShapes[21]);
                            turnLine((Line) levelShapes[14]);
                            turnLine2((Line) levelShapes[13]);
                            level2animation5.pause();
                            level2animation6.pause();
                            level2animation7.pause();
                            level2animation14.pause();
                            primaryStage.setScene(scenes[8]);
                            regame.buttonCircle(reagain,primaryStage,scenes[1]);
                        }
                    }
                    catch(Exception ex){
                        System.out.println(ex);
                    }

                }));
        animation9.setCycleCount(12);

        levelShapes[25].setOnMouseClicked(event -> {
            level2animation5.play();
            level2animation6.play();
            level2animation7.play();
            level2animation14.play();
            animation8.play();
            animation9.play();
        });



    }

    //this method will be delete the y properties of line
    public void shortenYLine(Line flat) {
        double begin = flat.getStartY();
        double end = flat.getEndY();

        if (begin >= end) {
            delete2 = true;
        } else {
            begin += 1;
            flat.setStartY(begin);
            count++;
            if(count > 3)
                collision = false;
        }
    }
    //this method will be delete the x properties of line
    public void shortenXLine(Line flat) {
        double begin = flat.getEndX();
        double end = flat.getStartX();

        if (begin <= end) {
            delete = true;
        } else {
            begin -= 1;
            flat.setEndX(begin);
            count2++;
            if(count2 > 3)
                collision2 = false;
        }
    }
    //this method will be add the y properties to perpendicular line
    private void addPerpendicular (Line flat, double a) {
        double y = flat.getStartY();
        double y1 = flat.getEndY();
        double x = flat.getStartX();
        double x1 = flat.getEndX();

        if(y == y1) {
            if (x == (flat.getStartX() - a)) {
                x = flat.getStartX();

            } else {
                x -= 1;
                flat.setStartX(x);
            }
            if (x1 == flat.getEndX() + a) {
                x1 = flat.getEndX();
            } else {
                x1 += 1;
                flat.setEndX(x1);
            }
        }
        else if(x == x1){
            if (y == (flat.getStartY() - a)) {
                y = flat.getStartY();
            } else {
                y -= 1;
                flat.setStartY(y);
            }

            if (y1 == (flat.getEndY() + a) ) {
                y1 = flat.getEndY();
            } else {
                y1 += 1;
                flat.setEndY(y1);
            }
        }

    }
    //this method will be add the x properties to perpendicular line
    public void addXPerpendicularLine(Line flat, double a) {
        double x = flat.getStartX();

        if (x == (flat.getStartX() - a)) {
            x = flat.getStartX();
        } else {
            x -= 1;
            flat.setStartX(x);
        }
    }
    //this method will be add the x properties to perpendicular line
    public void addX2PerpendicularLine(Line flat, double a) {
        double x = flat.getEndX();

        if (x == flat.getEndX() + a) {
            x = flat.getEndX();
        } else {
            x += 1;
            flat.setEndX(x);

        }
    }
    //with this method semi circle remove
    public void carryXArc(Arc arc) {
        double centerX = arc.getCenterX();
        double length = arc.getLength();
        double angle = arc.getStartAngle();

        double arcX = arc.getCenterX() + 15;
        double arcY = arc.getCenterX() - 15;

        if (arcY <= 320) {
            if (arcX >= 320) {
                arc.setStartAngle(angle+6);
                arc.setLength(length-6);

            }
            centerX += 1;
            arc.setCenterX(centerX);
        }
    }
    //this method will be delete the flat line 14 then remove this line
    public void shortenX2Line(Line flat) {
        double end = flat.getEndX();
        double begin = flat.getStartX();

            begin += 1;
            flat.setStartX(begin);

    }
    //with this method flat line 13 remove
    public void carryXLine(Line flat) {
        double x = flat.getEndX();
        double y = flat.getStartX();
        if (320.0 >= flat.getStartX()) {
            y += 1;
            flat.setStartX(y);
            count1++;
            if(count1 > 3)
                collision1 = false;
        }
        if (320.0 >= flat.getEndX()) {
            x += 1;
            flat.setEndX(x);
        }
        else if(320.0 <= flat.getEndX()&& 320.0 <= flat.getStartX()){
            delete3 = true;
        }
    }
    public void carryYLine(Line flat) {
        double x = flat.getEndY();
        double y = flat.getStartY();

        if (230.0 >= flat.getStartY()) {
            y += 1;
            flat.setStartY(y);
        }
        if (230.0 >= flat.getEndY()) {
            x += 1;
            flat.setEndY(x);
        }
    }
    public void carryYLine2(Line flat) {
        double x = flat.getEndY();
        double y = flat.getStartY();

        if (230.0 >= flat.getStartY()) {
            y += 1;
            flat.setStartY(y);
        }
        if (230.0 >= flat.getEndY()) {
            x += 1;
            flat.setEndY(x);
        }
        else if(230.0 <= flat.getEndY()&& 230.0 <= flat.getStartY()){
            delete1 = true;
        }
    }

    //with this method semi circle carry and remove
    public void carryYArc(Arc arc) {
        double centerY = arc.getCenterY();
        double length = arc.getLength();
        double arcX = arc.getCenterY() + 15;
        double arcY = arc.getCenterY() - 15;

        if (arcY <= 230) {
            if (arcX >= 230) {
                arc.setLength(length - 6);

            }
            centerY += 1;
            arc.setCenterY(centerY);
        }
    }
    public void carryY2Arc(Arc arc) {
        double centerY = arc.getCenterY();
        double angle = arc.getStartAngle();
        double length = arc.getLength();
        double arcX = arc.getCenterY() + 15;
        double arcY = arc.getCenterY() - 15;

        if (arcY <= 230) {
            if (arcX >= 230) {
                arc.setStartAngle(angle + 6);
                arc.setLength(length - 6);

            }
            centerY += 1;
            arc.setCenterY(centerY);
        }
    }

    public void collisionXArc(Arc arc){

        double centerX = arc.getCenterX();

        if (centerX >= 227) {
            centerX = 227;
            arc.setCenterX(centerX);
        }
        else {
            centerX += 1;
            arc.setCenterX(centerX);
        }
    }

    public void collisionXLine2(Line flat) {
        double x = flat.getEndX();
        double y = flat.getStartX();

        if (174 >= flat.getStartX()) {
            y += 1;
            flat.setStartX(y);

        }
        if (212 > flat.getEndX()) {
            x += 1;
            flat.setEndX(x);

        }
        if (212 <= flat.getEndX()){
            reset = true;
            resetPane = true;
        }


    }
    public void collisionXLine(Line flat){
        double begin = flat.getStartX();


        if (begin >= 242) {
            flat.setStartX(242);
        } else {
            begin += 1;
            flat.setStartX(begin);

        }

    }

    public void turnArc(Arc arc){

        if(arc.getStartAngle() == 90 || arc.getStartAngle() == 270){
            double centerY = arc.getCenterY()-12;
            arc.setCenterY(centerY);
            reset = false;

        }
        else if(arc.getStartAngle() == 0 || arc.getStartAngle() == 180){
            double centerX = arc.getCenterX()-12;
            arc.setCenterX(centerX);
            reset = false;

        }

    }
    //this method will be given the collision effect for flat line 1
    public void turnLine2(Line flat) {
        if(flat.getEndY() == flat.getStartY()){
            double x = flat.getEndX();
            x-=12;
            double x1 = flat.getStartX();
            x1 -=12;
            flat.setStartX(x1);
            flat.setEndX(x);
        }
        else if(flat.getEndX() == flat.getStartX()){
            double y = flat.getEndY();
            y-=12;
            double y1 = flat.getStartY();
            y1 -=12;
            flat.setStartY(y1);
            flat.setEndY(y);
        }

    }
    public void turnLine(Line flat){
        if(flat.getEndY() == flat.getStartY()){
            double begin = flat.getStartX()-12;
            flat.setStartX(begin);
        }
        else if(flat.getEndX() == flat.getStartX()){
            double begin2 = flat.getStartY()-12;
            flat.setStartY(begin2);
        }

    }

    public void collisionYarc(Arc arc){

        double centerY = arc.getCenterY();

        if (centerY >= 182) {
            centerY = 182;
            arc.setCenterY(centerY);
        }
        else {
            centerY += 1;
            arc.setCenterY(centerY);
        }
    }
    public void collisionYarc2(Arc arc){

        double centerY = arc.getCenterY();

        if (centerY >= 122) {
            centerY = 122;
            arc.setCenterY(centerY);
        }
        else {
            centerY += 1;
            arc.setCenterY(centerY);
        }
    }

    public void collisionYLine(Line flat, Line flat2) {
        double y1 = flat.getEndY();
        double y = flat.getStartY();

        if (flat2.getEndY() - 33 >= flat.getStartY()) {
            y += 1;
            flat.setStartY(y);

        }
        if (flat2.getEndY() - 3 > flat.getEndY()) {
            y1 += 1;
            flat.setEndY(y1);

        }
        if (flat2.getEndY() - 3 <= flat.getEndY()){
            reset = true;
            resetPane1 = true;
        }


    }
    public void collisionYLine2(Line flat) {
        double begin = flat.getStartY();
        double end = flat.getEndY();

        if (begin >= end) {
            delete2 = true;
        } else {
            begin += 1;
            flat.setStartY(begin);
            count++;
        }


    }

    public void resetPerpendicular(Line flat){
        double y = flat.getStartY();
        double y1 = flat.getEndY();
        double x = flat.getStartX();
        double x1 = flat.getEndX();

        if(y == y1) {
            flat.setStartX(flat.getStartX() + 15);
            flat.setEndX(flat.getEndX() - 15);
        }
        else if(x == x1){
            flat.setStartY(flat.getStartY() + 15);
            flat.setEndY(flat.getEndY() - 15);
        }
    }

    public void resetXLine(Line flat){
            flat.setEndX(flat.getEndX() + 53);
            collision2 = true;
            collision1 = true;
            delete = false;


    }

    public void resetXLine2(Line flat){
        flat.setStartX(162);
        flat.setEndX(200);
        collision1 = true;
        collision2 = true;
        delete3 = false;


    }
    public void resetXLine3(Line flat){
        flat.setStartX(flat.getStartX() - 90);
        collision1 = true;
        collision2 = true;
        delete3 = false;


    }
    public void resetArc(Arc arc){
        arc.setCenterX(215);
        arc.setCenterY(170);
        arc.setStartAngle(0);
        arc.setLength(180);
    }

    public void resetYLine(Line flat){
        flat.setStartY(flat.getStartY() - 65);
        collision = true;
        delete2 = false;


    }
}

