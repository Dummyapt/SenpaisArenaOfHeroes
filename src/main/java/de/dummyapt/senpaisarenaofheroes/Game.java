package de.dummyapt.senpaisarenaofheroes;

import de.dummyapt.senpaisarenaofheroes.fiend.Fiend;
import de.dummyapt.senpaisarenaofheroes.game.Arena;
import de.dummyapt.senpaisarenaofheroes.game.Die;
import de.dummyapt.senpaisarenaofheroes.game.SpawnEngine;
import de.dummyapt.senpaisarenaofheroes.hero.Hero;
import de.dummyapt.senpaisarenaofheroes.hero.Knight;
import de.dummyapt.senpaisarenaofheroes.hero.Mage;

import java.util.Arrays;

public class Game {
    private final Die die;
    private final Fiend[] fiends;
    private final Hero[] heroes;
    private final Arena arena;

    public Game() {
        var spawnEngine = new SpawnEngine();
        die = new Die(3);
        fiends = new Fiend[3];
        heroes = new Hero[3];
        arena = new Arena(heroes, fiends);
        for (var i = 0; i < fiends.length; i++) fiends[i] = spawnEngine.spawn();
        heroes[0] = new Knight(30, "Sir Lancelot");
        heroes[1] = new Mage(20, "Merlin");
        heroes[2] = new Knight(30, "Sir Gawain");
    }

    public static void main(String[] args) {
        new Game().iterate();
    }

    public void iterate() {
        for (var hero : heroes) hero.attack(fiends[die.throwDie() - 1]);
        for (var fiend : fiends) fiend.attack(heroes[die.throwDie() - 1]);
        System.out.println(Arrays.toString(arena.getFiends()));
        System.out.println(Arrays.toString(arena.getHeroes()));
    }
}
