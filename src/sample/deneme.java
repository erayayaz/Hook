package sample;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.scene.shape.Arc;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.util.Duration;

public class deneme extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane pane = new Pane();

        Arc arc = new Arc(90, 120, 10, 10, 90, 90);
        arc.setStroke(Color.GREY);
        arc.setType(ArcType.OPEN);
        arc.setStrokeWidth(1);
        arc.setFill(Color.WHITE);

        Arc arc1 = new Arc(215, 110, 15, 15, 0, 180);
        arc1.setStroke(Color.BLACK);
        arc1.setType(ArcType.OPEN);
        arc1.setStrokeWidth(2.5);
        arc1.setFill(Color.WHITE);

        Arc arc2 = new Arc(90, 200, 10, 10, 180, 90);
        arc2.setStroke(Color.GREY);
        arc2.setType(ArcType.OPEN);
        arc2.setStrokeWidth(1);
        arc2.setFill(Color.WHITE);


        Line flat = new Line(90, 110, 100, 110);
        flat.setStrokeWidth(1);
        flat.setStroke(Color.GREY);

        Line flat2 = new Line(80, 120, 80, 200);
        flat2.setStrokeWidth(1);
        flat2.setStroke(Color.GREY);


        Line flat3 = new Line(100, 105, 100, 115);
        flat3.setStrokeWidth(2.5);
        flat3.setStroke(Color.BLACK);


        Line flat4 = new Line(100, 110, 200, 110);
        flat4.setStrokeWidth(2.5);
        flat4.setStroke(Color.BLACK);

        Line flat5 = new Line(230, 110, 250, 110);
        flat5.setStrokeWidth(2.5);
        flat5.setStroke(Color.BLACK);

        Line flat6 = new Line(90, 210, 250, 210);
        flat6.setStrokeWidth(1);
        flat6.setStroke(Color.GREY);

        Line flat7 = new Line(215, 200, 215, 240);
        flat7.setStrokeWidth(1);
        flat7.setStroke(Color.GREY);

        Line flat8 = new Line(210, 200, 220, 200);
        flat8.setStrokeWidth(2.5);
        flat8.setStroke(Color.BLACK);

        Line flat9 = new Line(215, 105, 215, 200);
        flat9.setStrokeWidth(2.5);
        flat9.setStroke(Color.BLACK);

        Circle circle1 = new Circle();
        circle1.setCenterX(215);
        circle1.setCenterY(255);
        circle1.setRadius(15);
        circle1.setFill(Color.BLACK);

        Circle circle2 = new Circle();
        circle2.setCenterX(265);
        circle2.setCenterY(210);
        circle2.setRadius(15);
        circle2.setFill(Color.BLACK);


        pane.getChildren().addAll(arc, arc1, arc2, flat, flat2, flat3, flat4, flat5, flat6, flat7, flat8, flat9, circle1, circle2); // Add arc to pane

        Timeline animation = new Timeline(
                new KeyFrame(Duration.millis(17), e -> deleteYLine(flat9, 95)));
        animation.setCycleCount(95);

        Timeline animation1 = new Timeline(
                new KeyFrame(Duration.millis(10), e -> addXPerpendicularLine(flat8, 15)));
        animation1.setCycleCount(15);

        Timeline animation2 = new Timeline(
                new KeyFrame(Duration.millis(10), e -> addX2PerpendicularLine(flat8, 15)));
        animation2.setCycleCount(15);

        circle1.setOnMouseClicked(event -> {
            animation.play();
            animation1.play();
            animation2.play();
        });

        Timeline animation3 = new Timeline(
                new KeyFrame(Duration.millis(17), e -> pullXLine(flat5, 153)));
        animation3.setCycleCount(150);

        Timeline animation4 = new Timeline(
                new KeyFrame(Duration.millis(17), e -> deleteXLine(flat4, 97.5)));
        animation4.setCycleCount(98);

        Timeline animation5 = new Timeline(
                new KeyFrame(Duration.millis(17), e -> deleteArc(arc1, 130)));
        animation5.setCycleCount(130);

        Timeline animation6 = new Timeline(
                new KeyFrame(Duration.millis(10), e -> addYLine(flat3, 15)));
        animation6.setCycleCount(15);

        Timeline animation7 = new Timeline(
                new KeyFrame(Duration.millis(10), e -> addY2Line(flat3, 15)));
        animation7.setCycleCount(15);


        circle2.setOnMouseClicked(event -> {


                animation3.play();
                animation4.play();
                animation5.play();
                animation6.play();
                animation7.play();


        });

        for(double i =flat5.getStartX(); i < flat5.getStartX()-30; i--){
            if(flat5.getStartX() == flat9.getStartX()){
                animation3.stop();
                animation4.pause();
                animation5.pause();
                animation6.pause();
                animation7.pause();
            }
        }

        primaryStage.setTitle("Level 1");
        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

    private void deleteYLine(Line flat, double a) {
        double x = flat.getStartY();

        if (x == flat.getEndY()) {
            x = flat.getEndY();
        } else {
            x += 1;
            flat.setStartY(x);
        }
    }

    private void addYLine(Line flat, double a) {
        double x = flat.getStartY();

        if (x == (flat.getStartY() - a)) {
            x = flat.getStartY();
        } else {
            x -= 1;
            flat.setStartY(x);
        }
    }

    private void addY2Line(Line flat, double a) {
        double x = flat.getEndY();

        if (x == 130) {
            x = flat.getEndY();
        } else {
            x += 1;
            flat.setEndY(x);
        }
    }

    private void pullXLine(Line flat, double a) {
        double x = flat.getEndX();
        double y = flat.getStartX();

        if (100 == flat.getStartX()) {
            y = 100;
        } else {
            y -= 1;
            flat.setStartX(y);
        }
        if (100.0 != flat.getEndX()) {
            x -= 1;
            flat.setEndX(x);
        }
    }

    private void deleteXLine(Line flat, double a) {
        double x = flat.getEndX();

        if (x == flat.getStartX()) {
            x = flat.getStartX();
        } else {
            x -= 1;
            flat.setEndX(x);
        }
    }

    private void deleteArc(Arc arc, double a) {
        double x = arc.getCenterX();
        double y = arc.getLength();


        if (0 >= y) {
            arc.setLength(0);
            arc.setRadiusX(0);
            arc.setCenterY(0);
        } else if(x<=117.5){
            arc.setLength(y-5);
        }

        if (85 == arc.getCenterX()) {
            x = 85;
        } else {
            x -= 1;
            arc.setCenterX(x);
        }

    }

    private void addXPerpendicularLine(Line flat, double a) {
        double x = flat.getStartX();

        if (x == (flat.getStartX() - a)) {
            x = flat.getStartX();
        } else {
            x -= 1;
            flat.setStartX(x);
        }
    }

    private void addX2PerpendicularLine(Line flat, double a) {
        double x = flat.getEndX();

        if (x == flat.getEndX() + a) {
            x = flat.getEndX();
        } else {
            x += 1;
            flat.setEndX(x);
        }
    }

}
//need to remove