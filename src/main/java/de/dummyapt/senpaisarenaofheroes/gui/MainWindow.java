package de.dummyapt.senpaisarenaofheroes.gui;

import de.dummyapt.senpaisarenaofheroes.game.Arena;
import de.dummyapt.senpaisarenaofheroes.game.Game;
import de.dummyapt.senpaisarenaofheroes.game.HeroCreator;
import de.dummyapt.senpaisarenaofheroes.game.SpawnEngine;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class MainWindow extends Application {
    private static Game game;

    public static void setGame(Game game) {
        MainWindow.game = game;
    }

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        setGame(new Game("MainWindow", new Arena(HeroCreator.createHeroes(), SpawnEngine.spawn())));
        var stringBuilder = new StringBuilder();
        for (var hero : game.getArena().getHeroes()) stringBuilder.append(hero.getName()).append(", ");
        var circleGroup = new Group();
        var radius = 200;
        var offsetX = 500 / 2;
        var offsetY = 500 / 2;
        var circles = 30;
        for (var i = 0; i < circles; i++) {
            var rectangle = new Rectangle();
            rectangle.setX(Math.cos(i * 2.0 * Math.PI / circles) * radius + offsetX);
            rectangle.setY(Math.sin(i * 2.0 * Math.PI / circles) * radius + offsetY);
            rectangle.setWidth(10);
            rectangle.setHeight(10);
            rectangle.setFill(Color.BLACK);
            rectangle.setStroke(Color.YELLOW);
            rectangle.setStrokeWidth(3);
            circleGroup.getChildren().add(rectangle);
        }
        stage.setTitle("Senpais' Arena of Champions");
        stage.setScene(new Scene(new StackPane(new Label("Stay tuned for a new adventure of " + stringBuilder.substring(0, stringBuilder.length() - 2)), circleGroup), 500, 500));
        stage.show();
    }
}
