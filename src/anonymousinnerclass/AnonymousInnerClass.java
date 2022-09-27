package anonymousinnerclass;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
public class AnonymousInnerClass extends Application {
    
    HBox hBox = new HBox();
    Button buttonNew = new Button();
    Button buttonOpen = new Button();
    Button buttonSave = new Button();
    Button buttonPrint = new Button();
    
    Scene scene;
    @Override
    public void start(Stage stage) {
        //Modify buttons        
        buttonNew.setText("New");
        buttonOpen.setText("Open");
        buttonSave.setText("Save");
        buttonPrint.setText("Print");
        
        
        //Modify hBox    
        hBox.getChildren().addAll(buttonNew,buttonOpen,buttonSave,buttonPrint);
        hBox.setAlignment(Pos.CENTER);
        hBox.setSpacing(10);
        
        //Add hBox to scene       
        scene= new Scene(hBox,300,100);
        
        
        //Buttons events
      buttonNew.setOnAction(new EventHandler<ActionEvent>() {
            @Override 
            public void handle(ActionEvent e) {
                System.out.println("Nuevo Proceso");
            }
            });
      
        buttonOpen.setOnAction(new EventHandler<ActionEvent>() {
            @Override 
            public void handle(ActionEvent e) {
                System.out.println("Abrir proceso");
            }
            });
        
          buttonSave.setOnAction(new EventHandler<ActionEvent>() {
            @Override 
            public void handle(ActionEvent e) {
                System.out.println("Guardar proceso");
            }
            });
          
            buttonPrint.setOnAction(new EventHandler<ActionEvent>() {
            @Override 
            public void handle(ActionEvent e) {
                System.out.println("Imprimir proceso");
            }
            });
 
        //Settings stage
        stage.setTitle("AnonymousHandlerDemo");
        stage.setScene(scene);
        stage.show();
        
        
        
    }

    public static void main(String[] args) {
        launch(args);
    }
   
    }
    

