package de.dummyapt.senpaisarenaofheroes;

import de.dummyapt.senpaisarenaofheroes.game.Arena;
import de.dummyapt.senpaisarenaofheroes.game.Game;
import de.dummyapt.senpaisarenaofheroes.game.HeroCreator;
import de.dummyapt.senpaisarenaofheroes.game.SpawnEngine;
import de.dummyapt.senpaisarenaofheroes.gui.MainWindow;
import javafx.application.Application;

public class Main {
    public static void main(String[] args) {
        Application.launch(MainWindow.class);
        MainWindow.setGame(new Game("Main", new Arena(HeroCreator.createHeroes(), SpawnEngine.spawn())));
        System.out.println("This should not be seen until the window has been closed.");
    }
}
