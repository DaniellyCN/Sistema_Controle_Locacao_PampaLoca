package GUI;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;

public class App extends Application{

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Menu Principal");
        Button botao = new Button("teste");
        botao.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("clicou no teste");
            }
            
        });
        StackPane root = new StackPane();
        root.getChildren().addAll(botao);
        primaryStage.setScene(new Scene(root,300, 250));
        primaryStage.show();
        
    }
    
}

