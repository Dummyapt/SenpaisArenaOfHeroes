package de.dummyapt.senpaisarenaofheroes.game;

import de.dummyapt.senpaisarenaofheroes.fiend.Demon;
import de.dummyapt.senpaisarenaofheroes.fiend.Fiend;
import de.dummyapt.senpaisarenaofheroes.fiend.Golem;
import de.dummyapt.senpaisarenaofheroes.fiend.Spider;

import java.util.Random;

public class SpawnEngine {
    private final Random random = new Random();

    public Fiend spawn() {
        var randomFiend = random.nextInt(3);
        return switch (randomFiend) {
            case 0 -> new Demon();
            case 1 -> new Golem();
            case 2 -> new Spider();
            default -> null;
        };
    }
}
