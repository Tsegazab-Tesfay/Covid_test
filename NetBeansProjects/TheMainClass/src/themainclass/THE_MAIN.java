/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package themainclass;
import java.util.Scanner;

import java.awt.Insets;
import javafx.application.Application;
import static javafx.application.Application.launch;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/**
 *
 * @author tsegazabtesfay
 */

public class THE_MAIN{
    Stage window;
    
    /**
     *
     * @param args
     */
    
 //   public void start(Stage primaryStage) throws Exception{
        
    //    window = primaryStage;
      //  primaryStage.show();
        
  //  }
   
    
    public static void main(String[] args){
       // launch(args);
       p a = new p("Hello");
       p a2 = new p("Hello");
       //mmmk b = new mmmk("Hllo");
       System.out.println(a == a2);
       
       
    }


}
