/*
Class: CSE 1322L
Section: J03
Term: Spring 2021
Instructor: Joseph Tierno
Name: Kainuo He
Assignment#: 7
*/

package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Assignment7 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        //create group object: root
        Group root = new Group();

        //create canvas of size 300x300
        Canvas canvas = new Canvas(300,300);

        //Create a GraphicsContext, set it to your canvas.getGraphicsContext2D();
        GraphicsContext gc = canvas.getGraphicsContext2D();


        //add red to canvas
        for (int i=0;i<=255;i++){
            gc.setStroke(Color.rgb(i,0,0));
            gc.strokeLine(10, i, 50, i);

        }

        //add green to canvas
        for (int i=0;i<=255;i++){
            gc.setStroke(Color.rgb(0,i,0));
            gc.strokeLine(60, i, 100, i);

        }

        //add blue to canvas
        for (int i=0;i<=255;i++){
            gc.setStroke(Color.rgb(0,0,i));
            gc.strokeLine(110, i, 150, i);

        }

        //add purple to canvas
        for (int i=0;i<=255;i++){
            gc.setStroke(Color.rgb(i,0,i));
            gc.strokeLine(160, i, 200, i);

        }

        //add white to canvas
        for (int i=0;i<=255;i++){
            gc.setStroke(Color.rgb(i,i,i));
            gc.strokeLine(210, i, 250, i);

        }




        //add the canvas to root group
        root.getChildren().add(canvas);

        //create Scene with root
        Scene myScene = new Scene(root);

        //set and show primaryStage
        primaryStage.setTitle("Color Choices");
        primaryStage.setScene(myScene);
        primaryStage.show();
    }


    //main method
    public static void main(String[] args) {
        launch(args);
    }
}
