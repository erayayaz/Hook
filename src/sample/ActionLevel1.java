package sample;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ActionLevel1 {
    boolean delete, delete1;
    boolean collision = true;
    int count;

    ReLevelAction regame = new ReLevelAction();

    //This method start first button animation for level 1
    public void buttonCircle(Shape levelShapes[], Pane pane){

        Timeline animation1 = new Timeline( // level 1 dikey çizgiyi siler flatline2
                new KeyFrame(Duration.millis(14), e -> {
                    shortenYLine((Line) levelShapes[11]);
                    if (delete) {
                        pane.getChildren().remove(levelShapes[8]);
                        pane.getChildren().remove(levelShapes[11]);
                        pane.getChildren().remove(levelShapes[6]);
                        pane.getChildren().remove(levelShapes[12]);
                    }
                })
        );
        animation1.setCycleCount(96); // 1 fazlası olsun ki if e girsin

        Timeline animation5 = new Timeline(
                new KeyFrame(Duration.millis(10), e -> {
                    addXPerpendicularLine((Line) levelShapes[8], 15);
                    addX2PerpendicularLine((Line) levelShapes[8], 15);
                }));
        animation5.setCycleCount(15);

        levelShapes[12].setOnMouseClicked(event -> {
            animation1.play();
            animation5.play();
        });


    }

    //This method start second button animation for level 1
    public void buttonCircle2(Shape levelShapes[], Pane pane, Stage primaryStage,Scene[] scenes, Shape reagain[]){
        Timeline animation2 = new Timeline( // level 2 yatay çizgiyi siler
                new KeyFrame(Duration.millis(14), e -> {
                    if(!collision){
                        shortenXLine((Line) levelShapes[9]);
                    }

                })
        );
        animation2.setCycleCount(110); // 1 fazlası olsun ki if e girsin

        Timeline animation3 = new Timeline( // level 2 yatay çizgiyi siler
                new KeyFrame(Duration.millis(14), e -> {
                    if(!collision){
                        carryXLine((Line) levelShapes[10]);
                    }

                        if (delete1) {
                            pane.getChildren().clear();
                            primaryStage.setScene(scenes[1]);
                            primaryStage.setTitle("Level 2");
                        }
                })
        );
        animation3.setCycleCount(165);


        Timeline animation4 = new Timeline( // carrying semi circle to the perpendicular line
                new KeyFrame(Duration.millis(14), e -> {
                    if(!collision){
                        carryXArc((Arc) levelShapes[2]);
                    }
                })
        );

        animation4.setCycleCount(135); // 1 fazlası olsun ki if e girsin

        Timeline animation6 = new Timeline(
                new KeyFrame(Duration.millis(10), e -> {
                  if(!collision){
                      addYLine((Line) levelShapes[7], 15);
                      addY2Line((Line) levelShapes[7], 15);
                  }
                }));
        animation6.setCycleCount(16);


        Timeline animation8 = new Timeline(
                new KeyFrame(Duration.millis(14), e -> {
                    try{
                        if (collision) {
                            collisionXArc((Arc) levelShapes[2]);
                            collisionXLine2((Line) levelShapes[10]);
                            collisionXLine((Line) levelShapes[9]);
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
                        if(finish){
                            TurnXArc((Arc) levelShapes[2]);
                            TurnXLine2((Line) levelShapes[10]);
                            TurnXLine((Line) levelShapes[9]);
                            animation2.pause();
                            animation3.pause();
                            animation4.pause();
                            animation6.pause();
                            primaryStage.setScene(scenes[8]);
                            regame.buttonCircle(reagain,primaryStage,scenes[0]);
                        }
                    }
                    catch (Exception ex1){
                        System.out.println(ex1);
                    }

                }));
        animation9.setCycleCount(12);

        levelShapes[13].setOnMouseClicked(event -> {
            animation2.play();
            animation3.play();
            animation4.play();
            animation6.play();
            animation8.play();
            animation9.play();

        });

    }
    boolean finish = false;

    //This method delete the line with respect to y axis
    public void shortenYLine(Line flat) {

        double begin = flat.getStartY();
        double end = flat.getEndY();
        if (begin >= end) {
            flat.setStroke(Color.TRANSPARENT);
            delete = true;

        }
        else {
            begin += 1;
            flat.setStartY(begin);
            count++;
            if(count > 3)
                collision = false;
        }
    }
    //This method delete the line with respect to x axis
    public void shortenXLine(Line flat) {
        double begin = flat.getEndX();
        double end = flat.getStartX();
        if (begin <= end) {
            flat.setStroke(Color.TRANSPARENT);
        }
        else {
            begin -= 1;
            flat.setEndX(begin);
        }
    }

    //This method carry the line and delete with respect to x axis
    public void carryXLine(Line flat) {
        double x = flat.getEndX();
        double y = flat.getStartX();
        if (100.0 <= flat.getStartX()) {
            y -= 1;
            flat.setStartX(y);
        }
        if (100.0 <= flat.getEndX()) {
            x -= 1;
            flat.setEndX(x);
        }
        if(flat.getStartX() == flat.getEndX()){
            delete1 = true;
        }

    }
    //This method carry the arc and delete with respect to x axis
    public void carryXArc(Arc arc) {
        double centerX = arc.getCenterX();
        double length = arc.getLength();
        double arcX = arc.getCenterX() + 15;
        double arcY = arc.getCenterX() - 15;

        if (arcX >= 100) {
            if (arcY <= 100) {
                arc.setLength(length - 6);

            }
            centerX -= 1;
            arc.setCenterX(centerX);
        }
    }
    //this method will be given the collision effect for flat line
    public void collisionXLine(Line flat){
        double begin = flat.getEndX();
        if (begin <= 188) {
            flat.setEndX(188);
        } else {
            begin -= 1;
            flat.setEndX(begin);
        }

    }
    public void TurnXLine(Line flat){
        double begin = flat.getEndX()+12;
        flat.setEndX(begin);
    }
    //this method will be given the collision effect for semi circle
    public void collisionXArc(Arc arc){
        double centerX = arc.getCenterX();
        if (centerX <= 203) {
            centerX = 203;
            arc.setCenterX(centerX);
        }
        else {
            centerX -= 1;
            arc.setCenterX(centerX);
        }

    }
    //this method will be given the collision effect for semi circle
    public void TurnXArc(Arc arc){
        double centerX = arc.getCenterX()+12;
        arc.setCenterX(centerX);

    }
    //this method will be given the collision effect for flat line 1
    public void TurnXLine2(Line flat) {
        double x = flat.getEndX();
        x+=12;
        double y = flat.getStartX();
        y+=12;
        flat.setStartX(y);
        flat.setEndX(x);
        finish = false;
    }

    //this method will be given the collision effect for flat line 1
    public void collisionXLine2(Line flat) {
        double x = flat.getEndX();
        double y = flat.getStartX();

        if (218 <= flat.getStartX()) {
            y -= 1;
            flat.setStartX(y);

        }
        if (238 < flat.getEndX()) {
            x -= 1;
            flat.setEndX(x);

        }
        if (238 >= flat.getEndX()) {
            finish = true;
        }
    }
    //This method add the 15 to start x of line
    public void addXPerpendicularLine(Line flat, double a) {
        double x = flat.getStartX();

        if (x == (flat.getStartX() - a)) {
            x = flat.getStartX();
        } else {
            x -= 1;
            flat.setStartX(x);
        }
    }
    //This method add the 15 to end x of line
    public void addX2PerpendicularLine(Line flat, double a) {
        double x = flat.getEndX();

        if (x == flat.getEndX() + a) {
            x = flat.getEndX();
        } else {
            x += 1;
            flat.setEndX(x);
        }
    }
    //This method add the 15 to start y of line
    public void addYLine(Line flat, double a) {
        double x = flat.getStartY();

        if (x == (flat.getStartY() - a)) {
            x = flat.getStartY();
        } else {
            x -= 1;
            flat.setStartY(x);

        }
    }
    //This method add the 15 to end x of line
    public void addY2Line(Line flat, double a) {
        double x = flat.getEndY();

        if (x == 130) {
            x = flat.getEndY();
        } else {
            x += 1;
            flat.setEndY(x);
        }
    }
}

