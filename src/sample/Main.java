package sample;


import javafx.application.Application;
import javafx.event.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.input.*;
import javafx.scene.layout.*;
import javafx.stage.*;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Level level1 = new Level(1);
        Level level2 = new Level(2);
        Level level3 = new Level(3);
        Level level4 = new Level(4);
        Level level5 = new Level(5);

        Pane[] levelPanes = new Pane[5];

        levelPanes[0] = level1.getPane();
        levelPanes[1] = level2.getPane();
        levelPanes[2] = level3.getPane();
        levelPanes[3] = level4.getPane();
        levelPanes[4] = level5.getPane();

        primaryStage.setTitle("Hook Game");
        primaryStage.setResizable(false);
        primaryStage.setWidth(500);
        primaryStage.setHeight(500);
        Scene scene = new Scene(new Group());
        FlowPane flowPane = new FlowPane();
        flowPane.setVgap(8);
        flowPane.setHgap(4);
        flowPane.setPrefWrapLength(300); // preferred width = 300


        Scene scene1 = new Scene(level1.getPane(), 400, 400);
        Scene scene2 = new Scene(level2.getPane(), 400, 400);
        Scene scene3 = new Scene(level3.getPane(), 400, 400);
        Scene scene4 = new Scene(level4.getPane(), 400, 400);
        Scene scene5 = new Scene(level5.getPane(), 400, 400);

        Button goBack1 = new Button("Go Back");
        goBack1.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                primaryStage.setTitle("Hook Game");
                primaryStage.setScene(scene);
            }
        });
        Button goBack2 = new Button("Go Back");
        goBack2.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                primaryStage.setTitle("Hook Game");
                primaryStage.setScene(scene);
            }
        });
        Button goBack3 = new Button("Go Back");
        goBack3.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                primaryStage.setTitle("Hook Game");
                primaryStage.setScene(scene);
            }
        });
        Button goBack4 = new Button("Go Back");
        goBack4.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                primaryStage.setTitle("Hook Game");
                primaryStage.setScene(scene);
            }
        });
        Button goBack5 = new Button("Go Back");
        goBack5.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                primaryStage.setTitle("Hook Game");
                primaryStage.setScene(scene);
            }
        });

        Button closeGame = new Button("Close");
        closeGame.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                primaryStage.close();
            }
        });


        Button buttonL1 = new Button("Level 1");
        buttonL1.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                primaryStage.setTitle("Level 1");
                primaryStage.setScene(scene1);
            }
        });


        Button buttonL2 = new Button("Level 2");
        buttonL2.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                primaryStage.setTitle("Level 2");
                primaryStage.setScene(scene2);
            }
        });


        Button buttonL3 = new Button("Level 3");
        buttonL3.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                primaryStage.setTitle("Level 3");
                primaryStage.setScene(scene3);
            }
        });


        Button buttonL4 = new Button("Level 4");
        buttonL4.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                primaryStage.setTitle("Level 4");
                primaryStage.setScene(scene4);
            }
        });

        Button buttonL5 = new Button("Level 5");
        buttonL5.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                primaryStage.setTitle("Level 5");
                primaryStage.setScene(scene5);
            }
        });

        flowPane.getChildren().add(buttonL1);
        flowPane.getChildren().add(buttonL2);
        flowPane.getChildren().add(buttonL3);
        flowPane.getChildren().add(buttonL4);
        flowPane.getChildren().add(buttonL5);
        flowPane.getChildren().add(closeGame);

        level1.getPane().getChildren().add(goBack1);
        level2.getPane().getChildren().add(goBack2);
        level3.getPane().getChildren().add(goBack3);
        level4.getPane().getChildren().add(goBack4);
        level5.getPane().getChildren().add(goBack5);

        scene.setRoot(flowPane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }


}