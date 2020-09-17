package sample;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ActionLevel3 {
    boolean delete, delete1, delete2, reset, reset1;
    boolean collision = true;
    boolean collision1 = true;
    int count, count1;
    boolean resetPane;

    ReLevelAction regame = new ReLevelAction();


    public void buttonCircle(Shape levelShapes[], Pane pane, Stage primaryStage, Scene scenes[], Shape reagain[]){
        Timeline level3animation3 = new Timeline(
                new KeyFrame(Duration.millis(14), e -> {
                    if(!collision){
                        shortenYLine((Line) levelShapes[19]);
                    }
                })
        );
        level3animation3.setCycleCount(55);

        Timeline level3animation4 = new Timeline(
                new KeyFrame(Duration.millis(10), e -> {
                    if(!collision){
                        addXPerpendicularLine((Line) levelShapes[15], 15);
                        addX2PerpendicularLine((Line) levelShapes[15], 15);
                    }
                }));
        level3animation4.setCycleCount(15);

        Timeline level3animation5= new Timeline(
                new KeyFrame(Duration.millis(14), e -> {
                    if(!collision){
                        carryY2Arc((Arc) levelShapes[22]);
                    }

                })
        );
        level3animation5.setCycleCount(85);

        Timeline level3animation6= new Timeline(
                new KeyFrame(Duration.millis(14), e -> {
                    if(!collision){
                        carryYLine((Line) levelShapes[18]);
                    }
                    if (delete) {
                        pane.getChildren().remove(levelShapes[22]);
                        pane.getChildren().remove(levelShapes[19]);
                        pane.getChildren().remove(levelShapes[15]);
                        pane.getChildren().remove(levelShapes[1]);
                        pane.getChildren().remove(levelShapes[4]);
                        pane.getChildren().remove(levelShapes[10]);
                    }
                })
        );
        level3animation6.setCycleCount(115);

        Timeline animation8 = new Timeline(
                new KeyFrame(Duration.millis(14), e -> {
                    try{
                        if(collision){
                            collisionArc((Arc)levelShapes[22], (Line) levelShapes[20]);
                            collisionLine((Line) levelShapes[18], (Line) levelShapes[20]);
                            shortenYLine((Line)levelShapes[19]);
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
                            turnArc((Arc)levelShapes[22]);
                            turnLine((Line) levelShapes[19]);
                            turnLine2((Line) levelShapes[18]);
                            level3animation3.pause();
                            level3animation4.pause();
                            level3animation5.pause();
                            level3animation6.pause();
                            primaryStage.setScene(scenes[8]);
                            regame.buttonCircle(reagain,primaryStage,scenes[2]);
                        }
                    }
                    catch(Exception ex){
                        System.out.println(ex);
                    }

                }));
        animation9.setCycleCount(12);

        levelShapes[10].setOnMouseClicked(event -> {
            level3animation3.play();
            level3animation4.play();
            level3animation5.play();
            level3animation6.play();
            animation8.play();
            animation9.play();
        });

    }
    public void buttonCircle2(Shape levelShapes[], Pane pane){
        Timeline level3animation1 = new Timeline( // level 2 yatay çizgiyi siler
                new KeyFrame(Duration.millis(14), e -> {
                    shortenXLine((Line) levelShapes[20]);
                    if (delete1) {
                        pane.getChildren().remove(levelShapes[20]);
                        pane.getChildren().remove(levelShapes[11]);
                        pane.getChildren().remove(levelShapes[5]);
                        pane.getChildren().remove(levelShapes[2]);
                        pane.getChildren().remove(levelShapes[9]);
                        pane.getChildren().remove(levelShapes[3]);
                        pane.getChildren().remove(levelShapes[14]);

                    }
                })
        );
        level3animation1.setCycleCount(69); // 1 fazlası olsun ki if e girsin

        Timeline level3animation2 = new Timeline(
                new KeyFrame(Duration.millis(10), e -> {
                   addYLine((Line) levelShapes[14], 15);
                   addY2Line((Line) levelShapes[14]);
                }));
        level3animation2.setCycleCount(15);

        levelShapes[11].setOnMouseClicked(event -> {
            level3animation1.play();
            level3animation2.play();
        });

    }
    public void buttonCircle3(Shape levelShapes[], Pane pane, Stage primaryStage, Scene scenes[], Shape reagain[]){

        Timeline level3animation7= new Timeline(
                new KeyFrame(Duration.millis(14), e -> {
                    if(!collision1){
                        carryXLine((Line) levelShapes[17]);
                    }
                    if (delete2) {
                        pane.getChildren().clear();
                        primaryStage.setScene(scenes[3]);
                        primaryStage.setTitle("Level 4");
                    }
                })
        );
        level3animation7.setCycleCount(170);

        Timeline level3animation8= new Timeline(
                new KeyFrame(Duration.millis(14), e -> {
                    if(!collision1){
                        carryXArc((Arc) levelShapes[21]);
                    }
                })
        );
        level3animation8.setCycleCount(140);

        Timeline level3animation9 = new Timeline(
                new KeyFrame(Duration.millis(14), e -> {
                    if(!collision1){
                        shortenXLine((Line) levelShapes[16]);
                    }
                })
        );
        level3animation9.setCycleCount(110);

        Timeline level3animation10 = new Timeline(
                new KeyFrame(Duration.millis(10), e -> {
                   if(!collision1){
                       addYLine((Line) levelShapes[13], 15);
                       addY2Line((Line) levelShapes[13]);
                   }
                }));
        level3animation10.setCycleCount(15);



        Timeline animation8 = new Timeline(
                new KeyFrame(Duration.millis(14), e -> {
                    try{
                        if(collision1){
                            collisionArc((Arc)levelShapes[21], (Line) levelShapes[18]);
                            collisionLine((Line) levelShapes[17], (Line) levelShapes[18]);
                            collisionXLine((Line)levelShapes[16]);
                            if(resetPane ){

                                try{
                                    pane.getChildren().add(levelShapes[20]);
                                    pane.getChildren().add(levelShapes[11]);
                                    pane.getChildren().add(levelShapes[5]);
                                    pane.getChildren().add(levelShapes[2]);
                                    pane.getChildren().add(levelShapes[9]);
                                    pane.getChildren().add(levelShapes[3]);
                                    pane.getChildren().add(levelShapes[14]);

                                    resetLine((Line)levelShapes[20]);
                                    resetPerpendicular((Line)levelShapes[14]);

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
                        if(reset1){
                            turnArc((Arc)levelShapes[21]);
                            turnLine2((Line) levelShapes[17]);
                            turnLine((Line) levelShapes[16]);
                            level3animation7.pause();
                            level3animation9.pause();
                            level3animation8.pause();
                            level3animation10.pause();
                            primaryStage.setScene(scenes[8]);
                            regame.buttonCircle(reagain,primaryStage,scenes[2]);
                        }
                    }
                    catch(Exception ex){
                        System.out.println(ex);
                    }

                }));
        animation9.setCycleCount(12);

        levelShapes[12].setOnMouseClicked(event -> {
            level3animation7.play();
            level3animation9.play();
            level3animation8.play();
            level3animation10.play();
            animation8.play();
            animation9.play();
        });

    }
    //with this method flat line remove
    public void shortenXLine(Line flat) {
        double end = flat.getEndX();
        double begin = flat.getStartX();
        if (end <= begin) {
            delete1 = true;
            collision = false;
        } else {
            end -= 1;
            flat.setEndX(end);
            count++;
            if(count > 3)
                collision = false;
        }
    }

    public void addYLine(Line flat, double a) {
        double x = flat.getStartY();

        if (x == (flat.getStartY() - a)) {
            x = flat.getStartY();
        } else {
            x -= 1;
            flat.setStartY(x);

        }
    }

    public void addY2Line(Line flat) {
        double x = flat.getEndY();

        if (x == 130) {
            x = flat.getEndY();
        } else {
            x += 1;
            flat.setEndY(x);
        }
    }

    public void shortenYLine(Line flat) {
        double begin = flat.getStartY();
        double end = flat.getEndY();
        if (begin >= end) {
            flat.setStroke(Color.TRANSPARENT);
        } else {
            begin += 1;
            flat.setStartY(begin);
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

    public void carryY2Arc(Arc arc) {
        double centerY = arc.getCenterY();
        double angle = arc.getStartAngle();
        double length = arc.getLength();
        double arcX = arc.getCenterY() + 15;
        double arcY = arc.getCenterY() - 15;

        if (arcY <= 240) {
            if (arcX >= 240) {
                arc.setStartAngle(angle + 6);
                arc.setLength(length - 6);
            }
            centerY += 1;
            arc.setCenterY(centerY);
        }
    }

    public void carryYLine(Line flat) {
        double x = flat.getEndY();
        double y = flat.getStartY();
        if (240.0 >= flat.getStartY()) {
            y += 1;
            flat.setStartY(y);
            count1++;
            if(count1 > 3)
                collision1 = false;
        }
        if (240.0 >= flat.getEndY()) {
            x += 1;
            flat.setEndY(x);
        } else if (240.0 <= flat.getEndY() && 240.0 <= flat.getStartY()) {
            flat.setStroke(Color.TRANSPARENT);
            delete = true;
        }
    }

    public void carryXLine(Line flat) {
        double x = flat.getEndX();
        double y = flat.getStartX();
        if (205.0 <= flat.getStartX()) {
            y -= 1;
            flat.setStartX(y);
        }
        if (205.0 <= flat.getEndX()) {
            x -= 1;
            flat.setEndX(x);
        } else if (205.0 >= flat.getEndX() && 205.0 >= flat.getStartX()) {
            flat.setStroke(Color.TRANSPARENT);
            delete2 = true;
        }

    }

    public void carryXArc(Arc arc) {
        double centerX = arc.getCenterX();
        double length = arc.getLength();
        double arcX = arc.getCenterX() + 15;
        double arcY = arc.getCenterX() - 15;

        if (arcX >= 205) {
            if (arcY <= 205) {
                arc.setLength(length - 6);

            }
            centerX -= 1;
            arc.setCenterX(centerX);
        }
    }

    public void collisionArc(Arc arc, Line flat){
        double centerX = arc.getCenterX();
        double centerY = arc.getCenterY();

        if(arc.getStartAngle() == 90 || arc.getStartAngle() == 270){
            if (centerY >= flat.getEndX() - 12) {
                centerY = flat.getEndX() - 12;
                arc.setCenterY(centerY);
            }
            else {
                centerY += 1;
                arc.setCenterY(centerY);
            }
        }
        else if(arc.getStartAngle() == 0 || arc.getStartAngle() == 180){
            if (centerX <= flat.getEndY() - 12) {
                centerX = flat.getEndY() - 12;
                arc.setCenterX(centerX);
            }
            else {
                centerX -= 1;
                arc.setCenterX(centerX);
            }
        }

    }
    public void collisionXLine(Line flat) {
        double end = flat.getEndX();
        double begin = flat.getStartX();
        if (end <= begin) {
            delete1 = true;
        } else {
            end -= 1;
            flat.setEndX(end);
        }
    }

    public void collisionLine(Line flat, Line flat2) {
        double y1 = flat.getEndY();
        double y = flat.getStartY();
        double x = flat.getEndX();
        double x1 = flat.getStartX();

        if(flat.getEndY() == flat.getStartY()){
            if (flat2.getEndX() + 3   <= flat.getStartX()) {
                x1 -= 1;
                flat.setStartX(x1);

            }
            if (flat2.getEndX() + 33 < flat.getEndX()) {
                x -= 1;
                flat.setEndX(x);

            }
            if (flat2.getStartX() + 33 >= flat.getEndX()){
                reset1 = true;
                resetPane = true;
                collision = true;
                collision1 =true;


            }

        }
        else if(flat.getEndX() == flat.getStartX()){
            if (flat2.getEndY() -31 >= flat.getStartY()) {
                y += 1;
                flat.setStartY(y);

            }
            if (flat2.getEndY() - 3 > flat.getEndY()) {
                y1 += 1;
                flat.setEndY(y1);

            }
            if (flat2.getEndY() - 3 <= flat.getEndY()){
                reset = true;
            }

        }



    }
    public void turnArc(Arc arc){

        if(arc.getStartAngle() == 90 || arc.getStartAngle() == 270){
            double centerY = arc.getCenterY()-12;
            arc.setCenterY(centerY);
            reset = false;

        }
        else if(arc.getStartAngle() == 0 || arc.getStartAngle() == 180){
            double centerX = arc.getCenterX()+12;
            arc.setCenterX(centerX);
            reset = false;

        }

    }
    //this method will be given the collision effect for flat line 1
    public void turnLine2(Line flat) {
        if(flat.getEndY() == flat.getStartY()){
            double x = flat.getEndX();
            x+=12;
            double x1 = flat.getStartX();
            x1 +=12;
            flat.setStartX(x1);
            flat.setEndX(x);
            reset1 = false;
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
            double begin = flat.getEndX()+12;
            flat.setEndX(begin);
        }
        else if(flat.getEndX() == flat.getStartX()){
            double begin2 = flat.getStartY()-12;
            flat.setStartY(begin2);
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

    public void resetLine(Line flat){

        flat.setEndX(flat.getEndX() + 68);
        collision = true;
        delete1 = false;
    }
}