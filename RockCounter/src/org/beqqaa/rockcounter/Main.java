package org.beqqaa.rockcounter;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {
    private double xPos = 0;
    private double yPos = 0;

    @Override
    public void start(Stage stage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("fxml/main.fxml"));

        root.setOnMousePressed(event -> {
            xPos = event.getSceneX();
            yPos = event.getSceneY();
        });

        root.setOnMouseDragged(event -> {
            stage.setX(event.getScreenX() - xPos);
            stage.setY(event.getScreenY() - yPos);
        });
        stage.getIcons().add(new Image(Main.class.getResourceAsStream(
                "media/pictures/png/ticket.png")));
        stage.setTitle("Rock Counter");
        stage.setScene(new Scene(root));
        stage.initStyle(StageStyle.UNDECORATED);
        stage.show();
    }



    public static void main(String[] args) {
        launch(args);
    }
}
