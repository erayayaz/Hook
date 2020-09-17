package sample;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.sql.Time;

public class ActionLevel4 {

    boolean rotate = false;
    boolean delete = false;
    boolean removeEmpty = false;
    boolean delete1 = false;
    boolean reset = false;
    boolean collision = true;
    int count;

    ReLevelAction regame = new ReLevelAction();

    public void buttonCircle(Shape levelShapes[], Pane pane){
        Timeline animation1 = new Timeline(
                new KeyFrame(Duration.millis(14), e -> {
                    if (rotate) {
                        shortenYLine((Line) levelShapes[16]);
                    }
                    if (delete) {
                        pane.getChildren().remove(levelShapes[7]);
                        pane.getChildren().remove(levelShapes[0]);
                        pane.getChildren().remove(levelShapes[12]);
                        pane.getChildren().remove(levelShapes[10]);
                        pane.getChildren().remove(levelShapes[5]);
                        pane.getChildren().remove(levelShapes[14]);

                    }
                })
        );
        animation1.setCycleCount(100); // 1 fazlası olsun ki if e girsin


        Timeline animation5 = new Timeline(
                new KeyFrame(Duration.millis(10), e -> {
                   if(rotate)
                       addPerpendicular((Line)levelShapes[14], 15);

                }));
        animation5.setCycleCount(15);

        levelShapes[0].setOnMouseClicked(event -> {
            animation1.play();
            animation5.play();
        });


    }


    public void emptyCircle(Shape levelShapes[], Pane pane){

        Timeline animation1 = new Timeline( // level 1 dikey çizgiyi siler flatline2
                new KeyFrame(Duration.millis(14), e -> {
                  rotateLine((Line)levelShapes[4], (Circle)levelShapes[2]);
                })
        );
        animation1.setCycleCount(1); // 1 fazlası olsun ki if e girsin

        levelShapes[2].setOnMouseClicked(event -> {
            animation1.play();
        });

    }

    public void buttonCircle1(Shape levelShapes[], Pane pane, Stage primaryStage, Scene scenes[], Shape reagain[]){

        Timeline animation2 = new Timeline( // level 2 yatay çizgiyi siler
                new KeyFrame(Duration.millis(13), e -> {
                    if(!rotate && !collision)
                        shortenXLine((Line) levelShapes[15]);

                })
        );
        animation2.setCycleCount(130); // 1 fazlası olsun ki if e girsin

        Timeline animation3 = new Timeline( // level 2 yatay çizgiyi siler
                new KeyFrame(Duration.millis(13), e -> {
                    if(!rotate && !collision){
                        carryXLine((Line)levelShapes[17], (Line)levelShapes[13]);
                    }

                    if (delete1) {

                        pane.getChildren().remove(levelShapes[8]);
                        pane.getChildren().remove(levelShapes[11]);
                        pane.getChildren().remove(levelShapes[6]);
                        pane.getChildren().remove(levelShapes[9]);
                        pane.getChildren().remove(levelShapes[1]);
                        pane.getChildren().remove(levelShapes[3]);
                        pane.getChildren().remove(levelShapes[17]);
                        pane.getChildren().remove(levelShapes[13]);
                        primaryStage.setScene(scenes[4]);

                        if(removeEmpty){
                            pane.getChildren().remove(levelShapes[4]);
                            pane.getChildren().remove(levelShapes[2]);

                        }

                    }


                })
        );
        animation3.setCycleCount(210);


        Timeline animation4 = new Timeline( // carrying semi circle to the perpendicular line
                new KeyFrame(Duration.millis(14), e -> {
                    if(!rotate && !collision)
                        carryXArc((Arc)levelShapes[3], (Line)levelShapes[13]);



                })
        );
        animation4.setCycleCount(160);


        Timeline animation5 = new Timeline(
                new KeyFrame(Duration.millis(10), e -> {
                    if(!rotate && !collision)
                        addPerpendicular((Line)levelShapes[13], 15);

                }));
        animation5.setCycleCount(15);

        Timeline animation6 = new Timeline(
                new KeyFrame(Duration.millis(14), e -> {
                   try{
                       if(collision && !rotate){
                           collisionXArc((Arc)levelShapes[3]);
                           collisionXLine((Line) levelShapes[15]);
                           collisionXLine2((Line) levelShapes[17]);
                       }
                   }
                   catch(Exception ex){
                       System.out.println(ex);
                   }

                }));
        animation6.setCycleCount(12);

        Timeline animation7 = new Timeline(
                new KeyFrame(Duration.millis(14), e -> {
                    try{
                        if(reset){
                            turnXArc((Arc)levelShapes[3]);
                            turnXLine((Line) levelShapes[15]);
                            turnXLine2((Line) levelShapes[17]);
                            animation2.pause();
                            animation4.pause();
                            animation3.pause();
                            animation5.pause();
                            primaryStage.setScene(scenes[8]);
                            regame.buttonCircle(reagain,primaryStage,scenes[3]);
                        }
                    }
                    catch(Exception ex){
                        System.out.println(ex);
                    }

                }));
        animation7.setCycleCount(12);

        levelShapes[1].setOnMouseClicked(event -> {
            animation2.play();
            animation4.play();
            animation3.play();
            animation5.play();
            animation6.play();
            animation7.play();
        });

    }

    public void shortenYLine(Line flat) {
        double begin = flat.getStartY();
        double end = flat.getEndY();
        if (begin >= end ) {
            flat.setStroke(Color.TRANSPARENT);
            delete = true;
            removeEmpty = true;
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

            begin -= 1;
            flat.setEndX(begin);

    }

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


    public boolean carryXLine(Line flat, Line perpendicular) {
        double x = flat.getEndX();
        double y = flat.getStartX();
        if (perpendicular.getStartX() <= flat.getStartX()) {
            y -= 1;
            flat.setStartX(y);

        }
        if (perpendicular.getStartX() <= flat.getEndX()) {
            x -= 1;
            flat.setEndX(x);

        }
        if(perpendicular.getStartX() == flat.getEndX()){
            delete1 = true;

        }

        return delete1;
    }
    public Shape carryXArc(Arc arc, Line perpendicular) {
        double centerX = arc.getCenterX();
        double length = arc.getLength();
        Shape retVal = null;
        double arcX = arc.getCenterX() + 15;
        double arcY = arc.getCenterX() - 15;

        if (arcX >= perpendicular.getStartX()) {
            if (arcY <= perpendicular.getStartX()) {
                arc.setLength(length - 6);

            }
            centerX -= 1;
            arc.setCenterX(centerX);
            retVal = arc;
        }
        else {
            retVal = null;
        }
        return retVal;

    }
    public boolean rotateLine(Line line, Circle emptyCircle){

        if(line.getStartX() == line.getEndX()) {
            line.setStartY(line.getStartY() + emptyCircle.getRadius());
            line.setEndY(line.getEndY() - emptyCircle.getRadius());
            line.setStartX(line.getStartX() - emptyCircle.getRadius());
            line.setEndX(line.getEndX() + emptyCircle.getRadius());
            rotate = true;
            return rotate;

        }
        else if(line.getStartY() == line.getEndY()){
            line.setStartX(line.getStartX() + emptyCircle.getRadius());
            line.setStartY(line.getStartY() - emptyCircle.getRadius());
            line.setEndX(line.getEndX() - emptyCircle.getRadius());
            line.setEndY(line.getEndY() + emptyCircle.getRadius());
            rotate= false;
            return rotate;
        }
        return  rotate;
    }
    //this method will be given the collision effect for semi circle
    public void collisionXArc(Arc arc){

        double centerX = arc.getCenterX();

        if (centerX <= 298) {
            centerX = 298;
            arc.setCenterX(centerX);
        }
        else {
            centerX -= 1;
            arc.setCenterX(centerX);
        }
    }

    public void collisionXLine2(Line flat) {
        double x = flat.getEndX();
        double y = flat.getStartX();

        if (313 <= flat.getStartX()) {
            y -= 1;
            flat.setStartX(y);

        }
        if (328 < flat.getEndX()) {
            x -= 1;
            flat.setEndX(x);

        }
        if (328 >= flat.getEndX()){
            reset = true;
        }


    }
    public void collisionXLine(Line flat){
        double begin = flat.getEndX();


        if (begin <= 283) {
            flat.setEndX(283);
        } else {
            begin -= 1;
            flat.setEndX(begin);

        }

    }
    public void turnXArc(Arc arc){
        double centerX = arc.getCenterX()+12;
        arc.setCenterX(centerX);
        reset = false;

    }
    //this method will be given the collision effect for flat line 1
    public void turnXLine2(Line flat) {
        double x = flat.getEndX();
        x+=12;
        double y = flat.getStartX();
        y+=12;
        flat.setStartX(y);
        flat.setEndX(x);
    }
    public void turnXLine(Line flat){
        double begin = flat.getEndX()+12;
        flat.setEndX(begin);
    }

}
