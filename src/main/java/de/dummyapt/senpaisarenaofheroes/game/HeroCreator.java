package de.dummyapt.senpaisarenaofheroes.game;

import de.dummyapt.senpaisarenaofheroes.hero.Hero;
import de.dummyapt.senpaisarenaofheroes.hero.Knight;
import de.dummyapt.senpaisarenaofheroes.hero.Mage;
import de.dummyapt.senpaisarenaofheroes.hero.Paladin;

public class HeroCreator {
    public static Hero[] createHeroes() {
        return new Hero[]{new Knight("Knight", 20), new Paladin("Paladin", 21), new Mage("Mage", 23)};
    }
}
