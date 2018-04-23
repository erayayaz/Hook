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

        //Calling the levels
        Level level1 = new Level(1);
        Level level2 = new Level(2);
        Level level3 = new Level(3);
        Level level4 = new Level(4);
        Level level5 = new Level(5);

        //Create a pane array for levels
        Pane[] levelPanes = new Pane[5];

        //adding index for array then we get a levels
        levelPanes[0] = level1.getPane();
        levelPanes[1] = level2.getPane();
        levelPanes[2] = level3.getPane();
        levelPanes[3] = level4.getPane();
        levelPanes[4] = level5.getPane();

        //adding a features for scene
        primaryStage.setTitle("Hook Game");
        primaryStage.setResizable(false);
        primaryStage.setWidth(500);
        primaryStage.setHeight(500);

        //Create a scene object
        Scene scene = new Scene(new Group());
        //Create a flow pane object
        FlowPane flowPane = new FlowPane();
        flowPane.setVgap(8);
        flowPane.setHgap(4);
        flowPane.setPrefWrapLength(300); // preferred width = 300

        //every level has a special scene
        Scene scene1 = new Scene(level1.getPane(), 400, 400);
        Scene scene2 = new Scene(level2.getPane(), 400, 400);
        Scene scene3 = new Scene(level3.getPane(), 400, 400);
        Scene scene4 = new Scene(level4.getPane(), 400, 400);
        Scene scene5 = new Scene(level5.getPane(), 400, 400);

        //Create return button for level 1
        Button goBack1 = new Button("Go Back");
        goBack1.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                primaryStage.setTitle("Hook Game");
                primaryStage.setScene(scene);
            }
        });
        //Create return button for level 2
        Button goBack2 = new Button("Go Back");
        goBack2.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                primaryStage.setTitle("Hook Game");
                primaryStage.setScene(scene);
            }
        });
        //Create return button for level 3
        Button goBack3 = new Button("Go Back");
        goBack3.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                primaryStage.setTitle("Hook Game");
                primaryStage.setScene(scene);
            }
        });
        //Create return button for level 4
        Button goBack4 = new Button("Go Back");
        goBack4.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                primaryStage.setTitle("Hook Game");
                primaryStage.setScene(scene);
            }
        });
        //Create return button for level 5
        Button goBack5 = new Button("Go Back");
        goBack5.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                primaryStage.setTitle("Hook Game");
                primaryStage.setScene(scene);
            }
        });
        //Create a button for closing game
        Button closeGame = new Button("Close");
        closeGame.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                primaryStage.close();
            }
        });

        //we reach level 1 in the menu
        Button buttonL1 = new Button("Level 1");
        buttonL1.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                primaryStage.setTitle("Level 1");
                primaryStage.setScene(scene1);
            }
        });
        //we reach level 2 in the menu
        Button buttonL2 = new Button("Level 2");
        buttonL2.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                primaryStage.setTitle("Level 2");
                primaryStage.setScene(scene2);
            }
        });
        //we reach level 3 in the menu
        Button buttonL3 = new Button("Level 3");
        buttonL3.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                primaryStage.setTitle("Level 3");
                primaryStage.setScene(scene3);
            }
        });
        //we reach level 4 in the menu
        Button buttonL4 = new Button("Level 4");
        buttonL4.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                primaryStage.setTitle("Level 4");
                primaryStage.setScene(scene4);
            }
        });
        //we reach level 5 in the menu
        Button buttonL5 = new Button("Level 5");
        buttonL5.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                primaryStage.setTitle("Level 5");
                primaryStage.setScene(scene5);
            }
        });
        //adding the level buttons and close buttons to pane
        flowPane.getChildren().add(buttonL1);
        flowPane.getChildren().add(buttonL2);
        flowPane.getChildren().add(buttonL3);
        flowPane.getChildren().add(buttonL4);
        flowPane.getChildren().add(buttonL5);
        flowPane.getChildren().add(closeGame);

        //adding the return buttons to pane
        level1.getPane().getChildren().add(goBack1);
        level2.getPane().getChildren().add(goBack2);
        level3.getPane().getChildren().add(goBack3);
        level4.getPane().getChildren().add(goBack4);
        level5.getPane().getChildren().add(goBack5);

        //Showing part
        scene.setRoot(flowPane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    //Launch a game
    public static void main(String[] args) {
        launch(args);
    }
}