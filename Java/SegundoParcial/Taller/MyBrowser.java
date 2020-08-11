package ar.itba.edu.POO.SegundoParcial.Taller;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Paso 1: Crear una escena vacía.
 */
public class MyBrowser extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        //Usamos el Layout Vertical Box
        VBox vBox = new VBox();

        //La escena mostrará el layout anterior
        Scene scene = new Scene(vBox, 800, 600);

        //El stage de incio de la aplicación mostrará la escena anterior
        primaryStage.setScene(scene);

        //Mostrar el stage de inicio
        primaryStage.show();
    }
}
