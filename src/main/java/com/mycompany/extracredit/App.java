package com.mycompany.extracredit;

import static java.lang.Math.random;
import java.util.Random;
import javafx.application.Application;

import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;



/**
 * JavaFX App
 */
public class App extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        stage.setScene(new Scene(createContent()));
        stage.show();
  
    }
    
    public Parent createContent(){
     
     // Circle 1
     Circle c1 = new Circle(150,200,100,Color.LIGHTBLUE);
        c1.setStroke(Color.BLACK);
        
        
     // Circle 2
     Circle c2 = new Circle(50,200,15,Color.GREEN);
        c2.setStroke(Color.BLACK); 
        
        
     var root = new Pane(c1,c2);
     root.setPrefSize(900,800);
     root.getChildren();
     root.getChildren().forEach(node -> this.makeDraggable(c2));
     c2.setFill(Color.color(Math.random(), Math.random(), Math.random()));
     
     return root;
  
    }
    
    
        
    private double mouseAnchorX;
    private double mouseAnchorY;
     
    public void makeDraggable(Node node) {
      
    
     node.setOnMousePressed(e -> {
        mouseAnchorX = e.getSceneX() - node.getTranslateX();
        mouseAnchorY = e.getSceneY() - node.getTranslateY();
         
     }); 
     
     node.setOnMouseDragged(mouseEvent -> {
         node.setTranslateX(mouseEvent.getSceneX() - mouseAnchorX);
         node.setTranslateY(mouseEvent.getSceneY() - mouseAnchorY);
     });
   }
     
    public static void main(String[] args) {
        launch();
    
    }
}