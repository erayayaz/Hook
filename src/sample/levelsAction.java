package sample;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.Scene;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;
import javafx.util.Duration;



public class levelsAction {
    boolean level1 = false;
    boolean level2 = false;
    boolean level3 = false;
    boolean level4 = false;
    boolean level5 = false;
    boolean quıt = false;

    //This method open the level 1
    public void level1(Shape levelShapes[], Stage stage, Scene scene) {
        Timeline animation1 = new Timeline( // level 1 dikey çizgiyi siler flatline2
                new KeyFrame(Duration.millis(10), e -> {
                    menuArc1((Arc) levelShapes[0]);
                   if(level1){
                       stage.setScene(scene);
                   }
                    menuArc1((Arc) levelShapes[0]);

                })
        );
        animation1.setCycleCount(60); // 1 fazlası olsun ki if e girsin

        levelShapes[0].setOnMouseClicked(event -> {
            animation1.play();

        });
    }
    //This method open the level 2
    public void level2(Shape levelShapes[], Stage stage, Scene scene) {
        Timeline animation2 = new Timeline( // level 1 dikey çizgiyi siler flatline2
                new KeyFrame(Duration.millis(10), e -> {
                    menuArc2((Arc) levelShapes[1]);
                    if(level2){
                        stage.setScene(scene);
                    }

                })
        );
        animation2.setCycleCount(60); // 1 fazlası olsun ki if e girsin

        levelShapes[1].setOnMouseClicked(event -> {
            animation2.play();

        });
    }
    //This method open the level 3
    public void level3(Shape levelShapes[], Stage stage, Scene scene) {
        Timeline animation3 = new Timeline( // level 1 dikey çizgiyi siler flatline2
                new KeyFrame(Duration.millis(10), e -> {
                    menuArc3((Arc) levelShapes[2]);
                    if(level3){
                        stage.setScene(scene);
                    }

                })
        );
        animation3.setCycleCount(60); // 1 fazlası olsun ki if e girsin

        levelShapes[2].setOnMouseClicked(event -> {
            animation3.play();

        });
    }
    //This method open the level 4
    public void level4(Shape levelShapes[], Stage stage, Scene scene) {
        Timeline animation4 = new Timeline( // level 1 dikey çizgiyi siler flatline2
                new KeyFrame(Duration.millis(10), e -> {
                    menuArc4((Arc) levelShapes[3]);
                    if(level4){
                        stage.setScene(scene);
                    }

                })
        );
        animation4.setCycleCount(60); // 1 fazlası olsun ki if e girsin

        levelShapes[3].setOnMouseClicked(event -> {
            animation4.play();

        });
    }
    //This method open the level 5
    public void level5(Shape levelShapes[], Stage stage, Scene scene) {
        Timeline animation5 = new Timeline( // level 1 dikey çizgiyi siler flatline2
                new KeyFrame(Duration.millis(10), e -> {
                    menuArc5((Arc) levelShapes[4]);
                    if(level5){
                        stage.setScene(scene);
                    }

                })
        );
        animation5.setCycleCount(60); // 1 fazlası olsun ki if e girsin

        levelShapes[4].setOnMouseClicked(event -> {
            animation5.play();

        });
    }
    //This method close the game
    public void quıtt(Shape levelShapes[], Stage stage, Scene scene) {
        Timeline animation6 = new Timeline( // level 1 dikey çizgiyi siler flatline2
                new KeyFrame(Duration.millis(10), e -> {
                    QuıtArc((Arc) levelShapes[5]);
                    if(quıt){
                        stage.close();
                    }

                })
        );
        animation6.setCycleCount(60); // 1 fazlası olsun ki if e girsin

        levelShapes[5].setOnMouseClicked(event -> {
            animation6.play();

        });

    }
    //This method turn the level 1 arc
    public void menuArc1(Arc arc){
        if(arc.getLength() > 0){
            arc.setLength(arc.getLength() - 6);
            if(arc.getLength() <5){
                level1 = true;
            }
        }
    }
    //This method turn the level 2 arc
    public void menuArc2(Arc arc){
        if(arc.getLength() > 0){
            arc.setLength(arc.getLength() - 6);
            if(arc.getLength() <5){
                level2 = true;
            }
        }
    }
    //This method turn the level 3 arc
    public void menuArc3(Arc arc){
        if(arc.getLength() > 0){
            arc.setLength(arc.getLength() - 6);
            if(arc.getLength() <5){
                level3 = true;
            }
        }
    }
    //This method turn the level 4 arc
    public void menuArc4(Arc arc){
        if(arc.getLength() > 0){
            arc.setLength(arc.getLength() - 6);
            if(arc.getLength() <5){
                level4 = true;
            }
        }
    }
    //This method turn the level 5 arc
    public void menuArc5(Arc arc){
        if(arc.getLength() > 0){
            arc.setLength(arc.getLength() - 6);
            if(arc.getLength() <5){
                level5 = true;
            }
        }
    }
    //This method turn the quıt arc
    public void QuıtArc(Arc arc){
        if(arc.getLength() > 0){
            arc.setLength(arc.getLength() - 6);
            if(arc.getLength() <5){
                quıt = true;
            }
        }
    }
}

