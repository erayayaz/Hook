package sample;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.Scene;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;
import javafx.util.Duration;

public class TheLastAction {
    public void end(Shape levelShapes[], Stage stage) {
        Timeline animation1 = new Timeline( // level 1 dikey çizgiyi siler flatline2
                new KeyFrame(Duration.millis(10), e -> {
                   stage.close();

                })
        );
        animation1.setCycleCount(1); // 1 fazlası olsun ki if e girsin

        levelShapes[0].setOnMouseClicked(event -> {
            animation1.play();

        });
    }
}
