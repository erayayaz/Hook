package sample;


import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.*;
import javafx.geometry.Insets;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.*;
import javafx.scene.layout.*;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.shape.Line;
import javafx.scene.shape.Shape;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.*;
import javafx.util.Duration;
import static javafx.print.PrintColor.COLOR;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        ActionLevel1 action1 = new ActionLevel1();
        ActionLevel2 action2 = new ActionLevel2();
        ActionLevel3 action3 = new ActionLevel3();
        ActionLevel4 action4 = new ActionLevel4();
        ActionLevel5 action5 = new ActionLevel5();
        MenuAction menuAction = new MenuAction();
        levelsAction levelsaction = new levelsAction();
        TheLastAction last = new TheLastAction();

        Level level1 = new Level(1);
        Level level2 = new Level(2);
        Level level3 = new Level(3);
        Level level4 = new Level(4);
        Level level5 = new Level(5);
        Level menu = new Level(6);
        Level levelofmenu = new Level(7);
        Level achieve = new Level(8);
        Level restart = new Level(9);

        Pane[] levelPanes = new Pane[9];

        Pane levelpane = new Pane();

        levelPanes[0] = level1.getPane();
        levelPanes[1] = level2.getPane();
        levelPanes[2] = level3.getPane();
        levelPanes[3] = level4.getPane();
        levelPanes[4] = level5.getPane();
        levelPanes[5] = menu.getPane();
        levelPanes[6] = levelofmenu.getPane();
        levelPanes[7] = achieve.getPane();
        levelPanes[8] =restart.getPane();

        level1.getPane().setStyle("-fx-background-color: pink;");
        level2.getPane().setStyle("-fx-background-color: pink;");
        level3.getPane().setStyle("-fx-background-color: pink;");
        level4.getPane().setStyle("-fx-background-color: pink;");
        level5.getPane().setStyle("-fx-background-color: pink;");
        menu.getPane().setStyle("-fx-background-color: pink;");
        levelofmenu.getPane().setStyle("-fx-background-color: pink;");
        achieve.getPane().setStyle("-fx-background-color: pink;");
        restart.getPane().setStyle("-fx-background-color: pink;");


        Shape level1Shapes[] = level1.shapes;
        Shape level2Shapes[] = level2.shapes;
        Shape level3Shapes[] = level3.shapes;
        Shape level4Shapes[] = level4.shapes;
        Shape level5Shapes[] = level5.shapes;
        Shape menuShapes[] = menu.shapes;
        Shape levelsShapes[] = levelofmenu.shapes;
        Shape endofmenu[] = achieve.shapes;
        Shape reagain [] = restart.shapes;

        primaryStage.setTitle("Game of Hook");
        primaryStage.setResizable(false);
        primaryStage.setWidth(450);
        primaryStage.setHeight(400);
        primaryStage.initStyle(StageStyle.UNDECORATED);

        Scene[] scenes = new Scene[10];

        Scene scene1 = new Scene(level1.getPane(), 400, 400);
        scenes[0] = scene1;
        Scene scene2 = new Scene(level2.getPane(), 400, 400);
        scenes[1] = scene2;
        Scene scene3 = new Scene(level3.getPane(), 400, 400);
        scenes[2] = scene3;
        Scene scene4 = new Scene(level4.getPane(), 400, 400);
        scenes[3] = scene4;
        Scene scene5 = new Scene(level5.getPane(), 400, 400);
        scenes[4] = scene5;
        Scene scenemenu = new Scene(menu.getPane(),400,400);
        scenes[5] = scenemenu;
        Scene level = new Scene (levelofmenu.getPane(),400,400);
        scenes[6] = level;
        Scene gotit = new Scene(achieve.getPane(),400,400);
        scenes[7] = gotit;
        Scene repane = new Scene(restart.getPane(),400,400);
        scenes[8] = repane;

        /**************************************************   Menu  *******************************************************/
        menuAction.startCircle(menuShapes,primaryStage,level);

        menuAction.quitCircle(menuShapes,primaryStage);
        /************************************************Menu 2 ***************************************************/
        levelsaction.level1(levelsShapes,primaryStage,scene1);
        levelsaction.level2(levelsShapes,primaryStage,scene2);
        levelsaction.level3(levelsShapes,primaryStage,scene3);
        levelsaction.level4(levelsShapes,primaryStage,scene4);
        levelsaction.level5(levelsShapes,primaryStage,scene5);
        levelsaction.quıtt(levelsShapes,primaryStage,scene5);

        /************************************************** LEVEL 1 ***************************************************/

        action1.buttonCircle(level1Shapes, level1.getPane());

        action1.buttonCircle2(level1Shapes, level1.getPane(), primaryStage, scenes, reagain);

        /************************************************** LEVEL 2 ***************************************************/

        action2.buttonCircle(level2Shapes, level2.getPane());

        action2.buttonCircle2(level2Shapes, level2.getPane(), primaryStage, scenes, reagain);

        action2.buttonCircle3(level2Shapes, level2.getPane());

        action2.buttonCircle4(level2Shapes, level2.getPane(), primaryStage, scenes, reagain);


        /************************************************** LEVEL 3 ***************************************************/
        action3.buttonCircle(level3Shapes, level3.getPane(), primaryStage, scenes, reagain);

        action3.buttonCircle2(level3Shapes, level3.getPane());


        action3.buttonCircle3(level3Shapes, level3.getPane(), primaryStage, scenes, reagain);


        /************************************************** LEVEL 4***************************************************/

        action4.buttonCircle(level4Shapes, level4.getPane());

        action4.emptyCircle(level4Shapes, level4.getPane());

        action4.buttonCircle1(level4Shapes, level4.getPane(),primaryStage, scenes, reagain);

        /************************************************** LEVEL 5 ***************************************************/

        action5.buttonCircle(level5Shapes, level5.getPane(), primaryStage, scenes, reagain);

        action5.buttonCircle2(level5Shapes, level5.getPane(), primaryStage, scenes, reagain);

        action5.buttonCircle1(level5Shapes, level5.getPane(), primaryStage, scenes, reagain);

        action5.buttonCircle3(level5Shapes, level5.getPane());

        action5.emptyCircle(level5Shapes);

        action5.emptyCircle1(level5Shapes);
        

        last.end(endofmenu,primaryStage);
/******************************************************************* BUTTONS ***************************************************************************/
        Text goBack1 = new Text("Go Back!");
        goBack1.setLayoutX(30);
        goBack1.setLayoutY(30);
        goBack1.setFont(Font.font("Cambria", 10));

        Circle goBackCircle = new Circle();
        goBackCircle.setFill(Color.TRANSPARENT);
        goBackCircle.setStroke(Color.BLACK);
        goBackCircle.setCenterX(49);
        goBackCircle.setCenterY(28);
        goBackCircle.setRadius(20);
        goBackCircle.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                primaryStage.setTitle("Game of Hook");
                primaryStage.setScene(level);
            }
        });
        Text goBack2 = new Text("Go Back!");
        goBack2.setLayoutX(30);
        goBack2.setLayoutY(30);
        goBack2.setFont(Font.font("Cambria", 10));

        Circle goBackCircle2 = new Circle();
        goBackCircle2.setFill(Color.TRANSPARENT);
        goBackCircle2.setStroke(Color.BLACK);
        goBackCircle2.setCenterX(49);
        goBackCircle2.setCenterY(28);
        goBackCircle2.setRadius(20);
        goBackCircle2.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                primaryStage.setTitle("Game of Hook");
                primaryStage.setScene(level);
            }
        });
        Text goBack3 = new Text("Go Back!");
        goBack3.setLayoutX(30);
        goBack3.setLayoutY(30);
        goBack3.setFont(Font.font("Cambria", 10));

        Circle goBackCircle3 = new Circle();
        goBackCircle3.setFill(Color.TRANSPARENT);
        goBackCircle3.setStroke(Color.BLACK);
        goBackCircle3.setCenterX(49);
        goBackCircle3.setCenterY(28);
        goBackCircle3.setRadius(20);
        goBackCircle3.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                primaryStage.setTitle("Game of Hook");
                primaryStage.setScene(level);
            }
        });
        Text goBack4 = new Text("Go Back!");
        goBack4.setLayoutX(30);
        goBack4.setLayoutY(30);
        goBack4.setFont(Font.font("Cambria", 10));

        Circle goBackCircle4 = new Circle();
        goBackCircle4.setFill(Color.TRANSPARENT);
        goBackCircle4.setStroke(Color.BLACK);
        goBackCircle4.setCenterX(49);
        goBackCircle4.setCenterY(28);
        goBackCircle4.setRadius(20);
        goBackCircle4.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                primaryStage.setTitle("Game of Hook");
                primaryStage.setScene(level);
            }
        });
        Text goBack5 = new Text("Go Back!");
        goBack5.setLayoutX(30);
        goBack5.setLayoutY(30);
        goBack5.setFont(Font.font("Cambria", 10));

        Circle goBackCircle5 = new Circle();
        goBackCircle5.setFill(Color.TRANSPARENT);
        goBackCircle5.setStroke(Color.BLACK);
        goBackCircle5.setCenterX(49);
        goBackCircle5.setCenterY(28);
        goBackCircle5.setRadius(20);
        goBackCircle5.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                primaryStage.setTitle("Game of Hook");
                primaryStage.setScene(level);
            }
        });

        Button closeGame = new Button("Close");
        closeGame.setLayoutX(350);
        closeGame.setLayoutY(250);
        closeGame.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                primaryStage.close();
            }
        });


        Button buttonL1 = new Button("Level 1");
        buttonL1.setLayoutY(250);
        buttonL1.setLayoutX(50);
        buttonL1.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                primaryStage.setTitle("Level 1");
                primaryStage.setScene(scene1);
            }
        });


        Button buttonL2 = new Button("Level 2");
        buttonL2.setLayoutY(250);
        buttonL2.setLayoutX(100);
        buttonL2.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                primaryStage.setTitle("Level 2");
                primaryStage.setScene(scene2);
            }
        });


        Button buttonL3 = new Button("Level 3");
        buttonL3.setLayoutX(150);
        buttonL3.setLayoutY(250);
        buttonL3.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                primaryStage.setTitle("Level 3");
                primaryStage.setScene(scene3);
            }
        });


        Button buttonL4 = new Button("Level 4");
        buttonL4.setLayoutY(250);
        buttonL4.setLayoutX(200);
        buttonL4.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                primaryStage.setTitle("Level 4");
                primaryStage.setScene(scene4);
            }
        });

        Button buttonL5 = new Button("Level 5");
        buttonL5.setLayoutY(400);
        buttonL5.setLayoutX(250);
        buttonL5.setMinWidth(10);
        buttonL5.setMinHeight(10);
        buttonL5.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                primaryStage.setTitle("Level 5");
                primaryStage.setScene(scene5);
            }
        });

       // flowPane.getChildren().add(buttonL1);
       // flowPane.getChildren().add(buttonL2);
       // flowPane.getChildren().add(buttonL3);
       // flowPane.getChildren().add(buttonL4);
       // flowPane.getChildren().add(buttonL5);
       // flowPane.getChildren().add(closeGame);
       // flowPane.getChildren().add(label);

        levelpane.getChildren().add(buttonL1);
        levelpane.getChildren().add(buttonL2);
        levelpane.getChildren().add(buttonL3);
        levelpane.getChildren().add(buttonL4);
        levelpane.getChildren().add(buttonL5);
        levelpane.getChildren().add(closeGame);

        level1.getPane().getChildren().add(goBack1);
        level1.getPane().getChildren().add(goBackCircle);
        level2.getPane().getChildren().add(goBack2);
        level2.getPane().getChildren().add(goBackCircle2);
        level3.getPane().getChildren().add(goBack3);
        level3.getPane().getChildren().add(goBackCircle3);
        level4.getPane().getChildren().add(goBack4);
        level4.getPane().getChildren().add(goBackCircle4);
        level5.getPane().getChildren().add(goBack5);
        level5.getPane().getChildren().add(goBackCircle5);


       // scene.setRoot(menu.getPane());

        primaryStage.setScene(scenemenu);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}