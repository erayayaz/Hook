package sample;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Line;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;
import javafx.util.Duration;

public class MenuAction {
    boolean start = false;
    boolean quıt = false;

    //This method will be given the start button action
    public void startCircle(Shape levelShapes[], Stage stage, Scene scene) {
        Timeline animation1 = new Timeline( // level 1 dikey çizgiyi siler flatline2
                new KeyFrame(Duration.millis(10), e -> {
                    menuArc((Arc) levelShapes[0]);

                    if (start) {
                        stage.setScene(scene);
                    }
                })
        );
        animation1.setCycleCount(60); // 1 fazlası olsun ki if e girsin

        levelShapes[0].setOnMouseClicked(event -> {
            animation1.play();

        });


    }

    //This method will be given the quıt button action
    public void quitCircle(Shape levelShapes[], Stage stage) {
        Timeline animation1 = new Timeline( // level 1 dikey çizgiyi siler flatline2
                new KeyFrame(Duration.millis(10), e -> {
                    menuArc2((Arc) levelShapes[1]);
                    if (quıt) {
                        stage.close();
                    }

                })
        );
        animation1.setCycleCount(60); // 1 fazlası olsun ki if e girsin

        levelShapes[1].setOnMouseClicked(event -> {
            animation1.play();

        });


    }

    //This method start the button action of start
    public void menuArc(Arc arc) {
        if (arc.getLength() > 0) {
            arc.setLength(arc.getLength() - 6);
            if (arc.getLength() < 5) {
                start = true;
            }
        }
    }

    //This method end the game
    public void menuArc2(Arc arc) {
        if (arc.getLength() > 0) {
            arc.setLength(arc.getLength() - 6);
            if (arc.getLength() < 5) {
                quıt = true;
            }
        }
    }
}