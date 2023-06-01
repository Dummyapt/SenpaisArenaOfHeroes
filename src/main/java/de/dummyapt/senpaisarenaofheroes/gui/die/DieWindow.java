package de.dummyapt.senpaisarenaofheroes.gui.die;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.Random;

public class DieWindow extends Application {
    private final Random random = new Random();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        var blackRectangle = new Rectangle();
        blackRectangle.setWidth(150);
        blackRectangle.setHeight(150);
        blackRectangle.setStyle("-fx-fill: #000;");

        var whiteRectangle = new Rectangle();
        whiteRectangle.setWidth(125);
        whiteRectangle.setHeight(125);
        whiteRectangle.setStyle("-fx-fill: #fff;");

        var label = new Label();
        label.setStyle("-fx-font-size: 50px;");

        var button = new Button("Try it");
        button.setOnAction(ae -> label.setText(String.valueOf(random.nextInt(6) + 1)));

        BorderPane.setAlignment(button, Pos.CENTER);
        stage.setScene(new Scene(new BorderPane(new StackPane(blackRectangle, whiteRectangle, label), null, null, button, null), 250, 250));
        stage.setResizable(false);
        stage.setTitle("Würfel JavaFX");
        stage.show();
    }
}
