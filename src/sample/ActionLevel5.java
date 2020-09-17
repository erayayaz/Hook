package sample;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ActionLevel5 {

    boolean rotate = false;
    boolean rotate1 = true;
    boolean delete = false;
    int removeEmpty = 0;
    boolean delete1 = false;
    boolean delete2 = false;
    boolean delete3 = false;
    boolean reset, reset1, reset2;
    boolean collision = true;
    boolean collision1 = true;
    boolean collision2 = true;
    int count, count1, count2;
    boolean resetPane;

    ReLevelAction regame = new ReLevelAction();

    public void buttonCircle(Shape levelShapes[], Pane pane, Stage primaryStage, Scene scenes[], Shape reagain[]){

        Timeline animation= new Timeline(
                new KeyFrame(Duration.millis(14), e -> {
                    if(rotate && !collision){
                        shortenYLine((Line) levelShapes[30]);
                    }
                })
        );
        animation.setCycleCount(65);

        Timeline animation1= new Timeline(
                new KeyFrame(Duration.millis(14), e -> {
                    if(rotate && !collision){
                        carryYArc((Arc) levelShapes[6]);
                    }
                })
        );
        animation1.setCycleCount(100);

        Timeline animation5 = new Timeline(
                new KeyFrame(Duration.millis(10), e -> {
                    if(rotate && !collision)
                        addPerpendicular((Line)levelShapes[27], 15);

                }));
        animation5.setCycleCount(25);


        Timeline animation2= new Timeline(
                new KeyFrame(Duration.millis(14), e -> {
                    if(rotate && !collision){
                        carryYLine((Line) levelShapes[31], (Line)levelShapes[27]);
                    }
                    if(delete){
                        pane.getChildren().remove(levelShapes[31]);
                        pane.getChildren().remove(levelShapes[27]);
                        pane.getChildren().remove(levelShapes[30]);
                        pane.getChildren().remove(levelShapes[0]);
                        pane.getChildren().remove(levelShapes[11]);
                        pane.getChildren().remove(levelShapes[16]);
                        pane.getChildren().remove(levelShapes[15]);
                        pane.getChildren().remove(levelShapes[6]);
                        pane.getChildren().remove(levelShapes[23]);

                    }

                })
        );
        animation2.setCycleCount(115);

        Timeline animation8 = new Timeline(
                new KeyFrame(Duration.millis(14), e -> {
                    try{
                        if(rotate && collision){
                            collisionArc((Arc)levelShapes[6], (Line) levelShapes[32]);
                            collisionLine((Line) levelShapes[31], (Line) levelShapes[32]);
                            shortenYLine((Line)levelShapes[30]);
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
                            turnArc((Arc)levelShapes[6]);
                            turnLine2((Line) levelShapes[31]);
                            turnLine((Line) levelShapes[30]);
                            animation.pause();
                            animation1.pause();
                            animation2.pause();
                            animation5.pause();
                            primaryStage.setScene(scenes[8]);
                            regame.buttonCircle(reagain,primaryStage,scenes[4]);
                        }
                    }
                    catch(Exception ex){
                        System.out.println(ex);
                    }

                }));
        animation9.setCycleCount(12);

        levelShapes[0].setOnMouseClicked(event -> {
            animation.play();
            animation1.play();
            animation2.play();
            animation5.play();
            animation8.play();
            animation9.play();
        });

    }

    public void buttonCircle2(Shape levelShapes[], Pane pane, Stage primaryStage, Scene scenes[], Shape reagain[]){
        Timeline animation20 = new Timeline( // level 2 yatay çizgiyi siler
                new KeyFrame(Duration.millis(14), e -> {
                    if(!rotate && !rotate1 && !collision2)
                        shortenXLine((Line) levelShapes[33]);

                })
        );
        animation20.setCycleCount(60); // 1 fazlası olsun ki if e girsin

        Timeline animation3 = new Timeline( // level 2 yatay çizgiyi siler
                new KeyFrame(Duration.millis(14), e -> {
                    if(!rotate && !rotate1 && !collision2){
                        carryXLine((Line)levelShapes[34], (Line)levelShapes[29]);
                    }

                    if (delete2) {

                        pane.getChildren().remove(levelShapes[2]);
                        pane.getChildren().remove(levelShapes[13]);
                        pane.getChildren().remove(levelShapes[14]);
                        pane.getChildren().remove(levelShapes[19]);
                        pane.getChildren().remove(levelShapes[25]);
                        pane.getChildren().remove(levelShapes[20]);
                        pane.getChildren().remove(levelShapes[29]);
                        pane.getChildren().remove(levelShapes[33]);
                        pane.getChildren().remove(levelShapes[7]);
                        pane.getChildren().remove(levelShapes[34]);
                        if(removeEmpty == 1){
                            pane.getChildren().remove(levelShapes[5]);
                            pane.getChildren().remove(levelShapes[10]);

                        }
                    }


                })
        );
        animation3.setCycleCount(210);


        Timeline animation4 = new Timeline( // carrying semi circle to the perpendicular line
                new KeyFrame(Duration.millis(14), e -> {
                    if(!rotate && !rotate1 && !collision2)
                        carryXArc((Arc)levelShapes[7], (Line)levelShapes[29]);



                })
        );
        animation4.setCycleCount(160);


        Timeline animation5 = new Timeline(
                new KeyFrame(Duration.millis(10), e -> {
                    if(!rotate1 && !rotate && !collision2)
                        addPerpendicular((Line)levelShapes[29], 15);

                }));
        animation5.setCycleCount(15);

        Timeline animation8 = new Timeline(
                new KeyFrame(Duration.millis(14), e -> {
                    try{
                        if(!rotate1 && !rotate && collision2){
                            collisionArc((Arc)levelShapes[7], (Line) levelShapes[31]);
                            collisionLine((Line) levelShapes[34], (Line) levelShapes[31]);
                            shortenXLine((Line)levelShapes[33]);
                            if(resetPane){

                                try{
                                    pane.getChildren().add(levelShapes[3]);
                                    pane.getChildren().add(levelShapes[18]);
                                    pane.getChildren().add(levelShapes[17]);
                                    pane.getChildren().add(levelShapes[24]);
                                    pane.getChildren().add(levelShapes[28]);
                                    pane.getChildren().add(levelShapes[32]);

                                    resetXLine((Line)levelShapes[32]);
                                    resetPerpendicular((Line)levelShapes[28]);
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
                        if(reset2){
                            turnArc((Arc)levelShapes[7]);
                            turnLine2((Line) levelShapes[34]);
                            turnLine((Line) levelShapes[33]);
                            animation20.pause();
                            animation4.pause();
                            animation3.pause();
                            animation5.pause();
                            primaryStage.setScene(scenes[8]);
                            regame.buttonCircle(reagain,primaryStage,scenes[0]);
                        }
                    }
                    catch(Exception ex){
                        System.out.println(ex);
                    }

                }));
        animation9.setCycleCount(12);

        levelShapes[2].setOnMouseClicked(event -> {
            animation20.play();
            animation4.play();
            animation3.play();
            animation5.play();
            animation8.play();
            animation9.play();
        });


    }

    public void buttonCircle1(Shape levelShapes[], Pane pane, Stage primaryStage, Scene scenes[], Shape reagain[]){
        //this method will be add y axis to the line and carry the line
        Timeline animation8= new Timeline(
                new KeyFrame(Duration.millis(14), (ActionEvent e) -> {
                    if(rotate1 && !collision1){
                        carryY2Line((Line) levelShapes[37], (Line) levelShapes[36]);
                    }

                    if(delete1){
                        pane.getChildren().remove(levelShapes[36]);
                        pane.getChildren().remove(levelShapes[37]);
                        pane.getChildren().remove(levelShapes[35]);
                        pane.getChildren().remove(levelShapes[8]);
                        pane.getChildren().remove(levelShapes[1]);
                        pane.getChildren().remove(levelShapes[12]);
                        pane.getChildren().remove(levelShapes[21]);
                        pane.getChildren().remove(levelShapes[26]);
                        pane.getChildren().remove(levelShapes[22]);
                        primaryStage.setScene(scenes[7]);
                        if(removeEmpty == 2){
                            pane.getChildren().remove(levelShapes[4]);
                            pane.getChildren().remove(levelShapes[9]);
                        }
                    }

                })
        );
        animation8.setCycleCount(205);

        Timeline animation9 = new Timeline(
                new KeyFrame(Duration.millis(10), e -> {
                    if(rotate1 && !collision1){
                        addPerpendicular((Line)levelShapes[36], 15);
                    }
                }));
        animation9.setCycleCount(15);

        Timeline animation10= new Timeline(
                new KeyFrame(Duration.millis(14), e -> {
                    if(rotate1 && !collision1){
                        shortenYLine((Line) levelShapes[35]);
                    }
                })
        );
        animation10.setCycleCount(155);

        Timeline animation11= new Timeline(
                new KeyFrame(Duration.millis(14), e -> {
                    if(rotate1 && !collision1){
                        carryY2Arc((Arc) levelShapes[8]);
                    }

                })
        );
        animation11.setCycleCount(185);

        Timeline animation6 = new Timeline(
                new KeyFrame(Duration.millis(14), e -> {
                    try{
                        if(rotate1 && collision1){
                            collisionArc((Arc)levelShapes[8], (Line) levelShapes[34]);
                            collisionLine((Line) levelShapes[37], (Line) levelShapes[34]);
                            shortenYLine((Line)levelShapes[35]);
                            if(resetPane){

                                try{
                                    pane.getChildren().add(levelShapes[3]);
                                    pane.getChildren().add(levelShapes[18]);
                                    pane.getChildren().add(levelShapes[17]);
                                    pane.getChildren().add(levelShapes[24]);
                                    pane.getChildren().add(levelShapes[28]);
                                    pane.getChildren().add(levelShapes[32]);

                                    resetXLine((Line)levelShapes[32]);
                                    resetPerpendicular((Line)levelShapes[28]);


                                }
                                catch (Exception ex){
                                    System.out.println(ex);
                                }
                            }

                            if(resetPane){

                                try{
                                    pane.getChildren().add(levelShapes[31]);
                                    pane.getChildren().add(levelShapes[27]);
                                    pane.getChildren().add(levelShapes[30]);
                                    pane.getChildren().add(levelShapes[0]);
                                    pane.getChildren().add(levelShapes[11]);
                                    pane.getChildren().add(levelShapes[16]);
                                    pane.getChildren().add(levelShapes[15]);
                                    pane.getChildren().add(levelShapes[6]);
                                    pane.getChildren().add(levelShapes[23]);

                                    resetPerpendicular((Line)levelShapes[27]);
                                    resetYLine((Line)levelShapes[31]);
                                    resetYLine2((Line)levelShapes[30]);
                                    resetArc((Arc)levelShapes[6]);

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
        animation6.setCycleCount(12);


        Timeline animation7 = new Timeline(
                new KeyFrame(Duration.millis(14), e -> {
                    try{
                        if(reset1){
                            turnArc((Arc)levelShapes[8]);
                            turnLine2((Line) levelShapes[37]);
                            turnLine((Line) levelShapes[35]);
                            animation9.pause();
                            animation8.pause();
                            animation10.pause();
                            animation11.pause();
                            primaryStage.setScene(scenes[8]);
                            regame.buttonCircle(reagain,primaryStage,scenes[4]);
                        }
                    }
                    catch(Exception ex){
                        System.out.println(ex);
                    }

                }));
        animation7.setCycleCount(12);

        levelShapes[1].setOnMouseClicked(event -> {
            animation9.play();
            animation8.play();
            animation10.play();
            animation11.play();
            animation6.play();
            animation7.play();
        });


    }
    public void buttonCircle3(Shape levelShapes[], Pane pane){
        Timeline animation12= new Timeline(
                new KeyFrame(Duration.millis(14), e -> {
                    shortenX2Line((Line) levelShapes[32]);
                    if (delete3) {
                        pane.getChildren().remove(levelShapes[3]);
                        pane.getChildren().remove(levelShapes[18]);
                        pane.getChildren().remove(levelShapes[17]);
                        pane.getChildren().remove(levelShapes[24]);
                        pane.getChildren().remove(levelShapes[28]);
                        pane.getChildren().remove(levelShapes[32]);
                    }
                })
        );
        animation12.setCycleCount(39);

        Timeline animation9 = new Timeline(
                new KeyFrame(Duration.millis(10), e -> {
                        addPerpendicular((Line)levelShapes[28], 15);

                }));
        animation9.setCycleCount(15);

        levelShapes[3].setOnMouseClicked(event -> {
            animation12.play();
            animation9.play();
        });


    }
    public void emptyCircle(Shape levelShapes[]){

        Timeline animation1 = new Timeline( // level 1 dikey çizgiyi siler flatline2
                new KeyFrame(Duration.millis(14), e -> {
                    rotateLine((Line)levelShapes[9], (Circle)levelShapes[4]);
                })
        );
        animation1.setCycleCount(1); // 1 fazlası olsun ki if e girsin

        levelShapes[4].setOnMouseClicked(event -> {
            animation1.play();
        });

    }
    public void emptyCircle1(Shape levelShapes[]){

        Timeline animation1 = new Timeline( // level 1 dikey çizgiyi siler flatline2
                new KeyFrame(Duration.millis(14), e -> {
                    rotateLine((Line)levelShapes[10], (Circle)levelShapes[5]);
                })
        );
        animation1.setCycleCount(1); // 1 fazlası olsun ki if e girsin

        levelShapes[5].setOnMouseClicked(event -> {
            animation1.play();
        });

    }


    public void shortenYLine(Line flat) {
        double begin = flat.getStartY();
        double end = flat.getEndY();
        if (begin >= end ) {
            delete = true;

        }
        else {
            begin += 1;
            flat.setStartY(begin);
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


    public void carryXLine(Line flat, Line perpendicular) {
        double x = flat.getEndX();
        double y = flat.getStartX();
        if (perpendicular.getStartX() <= flat.getStartX()) {
            y -= 1;
            flat.setStartX(y);
            count1++;
            if(count1 > 3)
                collision1 = false;

        }
        if (perpendicular.getStartX() <= flat.getEndX()) {
            x -= 1;
            flat.setEndX(x);

        }
        if(perpendicular.getStartX() == flat.getEndX()){
            delete2 = true;
        }
    }
    public void carryXArc(Arc arc, Line perpendicular) {
        double centerX = arc.getCenterX();
        double length = arc.getLength();
        double arcX = arc.getCenterX() + 15;
        double arcY = arc.getCenterX() - 15;

        if (arcX >= perpendicular.getStartX()) {
            if (arcY <= perpendicular.getStartX()) {
                arc.setLength(length - 6);

            }
            centerX -= 1;
            arc.setCenterX(centerX);

        }


    }
    public void rotateLine(Line line, Circle emptyCircle){

        if(line.getStartX() == line.getEndX()) {
            line.setStartY(line.getStartY() + emptyCircle.getRadius());
            line.setEndY(line.getEndY() - emptyCircle.getRadius());
            line.setStartX(line.getStartX() - emptyCircle.getRadius());
            line.setEndX(line.getEndX() + emptyCircle.getRadius());
            rotate = true;
            rotate1 = true;

        }
        else if(line.getStartY() == line.getEndY()){
            line.setStartX(line.getStartX() + emptyCircle.getRadius());
            line.setStartY(line.getStartY() - emptyCircle.getRadius());
            line.setEndX(line.getEndX() - emptyCircle.getRadius());
            line.setEndY(line.getEndY() + emptyCircle.getRadius());
            rotate = false;
            rotate1 = false;
        }
    }

    //with this method semi circle carry and remove
    public void carryYArc(Arc arc) {
        double centerY = arc.getCenterY();
        double length = arc.getLength();
        double arcX = arc.getCenterY() + 15;
        double arcY = arc.getCenterY() - 15;
        if (arcY <= 185) {
            if (arcX >= 185) {
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

        if (arcY <= 245) {
            if (arcX >= 245) {
                arc.setStartAngle(angle + 6);
                arc.setLength(length - 6);
            }
            centerY += 1;
            arc.setCenterY(centerY);
        }
    }
    public void carryYLine(Line flat, Line perpendicularLine) {
        double x = flat.getEndY();
        double y = flat.getStartY();
        if (perpendicularLine.getStartY() >= flat.getStartY()) {
            y += 1;
            flat.setStartY(y);
            count2++;
            if(count2 > 3)
                collision2 = false;
        }
        if (perpendicularLine.getStartY() >= flat.getEndY()) {
            x += 1;
            flat.setEndY(x);
        }
        if (perpendicularLine.getStartY() <= flat.getEndY() && perpendicularLine.getStartY() <= flat.getStartY()) {
            delete = true;
            removeEmpty = 1;

        }

    }
    public void carryY2Line(Line flat, Line perpendicularLine) {
        double x = flat.getEndY();
        double y = flat.getStartY();
        if (perpendicularLine.getStartY() >= flat.getStartY()) {
            y += 1;
            flat.setStartY(y);
        }
        if (perpendicularLine.getStartY() >= flat.getEndY()) {
            x += 1;
            flat.setEndY(x);
        }
        if (perpendicularLine.getStartY() <= flat.getEndY() && perpendicularLine.getStartY() <= flat.getStartY()) {

            delete1 = true;
            removeEmpty = 2;
        }

    }
    //this method will be delete the flat line 14 then remove this line
    public void shortenX2Line(Line flat) {
        double end = flat.getEndX();
        double begin = flat.getStartX();
        if (begin >= end) {
            delete3 = true;
        } else {
            begin += 1;
            flat.setStartX(begin);
            count++;
            if(count > 3)
                collision = false;
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
            if (flat2.getEndX() + 61 < flat.getEndX()) {
                x -= 1;
                flat.setEndX(x);

            }
            if (flat2.getStartX() + 61 >= flat.getEndX()){
                reset = true;
                reset1 = true;
                reset2 = true;
                resetPane = true;
                collision1 = true;
                collision = true;
                collision2= true;

            }

        }
        else if(flat.getEndX() == flat.getStartX()){
            if (flat2.getEndY() -21 >= flat.getStartY()) {
                y += 1;
                flat.setStartY(y);

            }
            if (flat2.getEndY() - 3 > flat.getEndY()) {
                y1 += 1;
                flat.setEndY(y1);

            }
            if (flat2.getEndY() - 3 <= flat.getEndY()){
                reset = true;
                reset1 = true;
                reset2 = true;
                resetPane = true;
                collision1 = true;
                collision = true;
                collision2= true;
            }

        }



    }
    public void turnArc(Arc arc){

        if(arc.getStartAngle() == 90 || arc.getStartAngle() == 270){
            double centerY = arc.getCenterY()-12;
            arc.setCenterY(centerY);
            reset = false;
            reset1 = false;
            reset2 = false;

        }
        else if(arc.getStartAngle() == 0 || arc.getStartAngle() == 180){
            double centerX = arc.getCenterX()+12;
            arc.setCenterX(centerX);
            reset = false;
            reset1 = false;
            reset2 = false;

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

    public void resetXLine(Line flat){
        flat.setStartX(flat.getStartX() - 38);
        collision1 = true;
        collision = true;
        collision2= true;
        delete3 = false;
        delete = false;


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

    public void resetYLine(Line flat){
        flat.setStartY(82);
        flat.setEndY(100);
        collision1 = true;
        collision = true;
        collision2= true;
        delete3 = false;


    }
    public void resetYLine2(Line flat){
        flat.setStartY(flat.getStartY() - 55);
        collision1 = true;
        collision = true;
        collision2= true;
        delete3 = false;


    }
    public void resetArc(Arc arc){
        arc.setCenterX(260);
        arc.setCenterY(115);
        arc.setStartAngle(90);
        arc.setLength(180);
    }

}