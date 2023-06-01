package de.dummyapt.senpaisarenaofheroes.game;

import de.dummyapt.senpaisarenaofheroes.fiend.Demon;
import de.dummyapt.senpaisarenaofheroes.fiend.Fiend;
import de.dummyapt.senpaisarenaofheroes.fiend.Golem;
import de.dummyapt.senpaisarenaofheroes.fiend.Spider;

public class SpawnEngine {
    public static Fiend[] spawn() {
        return new Fiend[]{new Spider(10), new Golem(25), new Demon(20)};
    }
}
