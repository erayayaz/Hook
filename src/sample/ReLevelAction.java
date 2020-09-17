package sample;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ReLevelAction {
    public void buttonCircle(Shape levelShapes[], Stage stage, Scene scene){
            Timeline animation1 = new Timeline( // level 1 dikey çizgiyi siler flatline2
                    new KeyFrame(Duration.millis(10), e -> {
                        stage.setScene(scene);

                    })
            );
            animation1.setCycleCount(1); // 1 fazlası olsun ki if e girsin

            levelShapes[2].setOnMouseClicked(event -> {
                animation1.play();

            });


    }
}
