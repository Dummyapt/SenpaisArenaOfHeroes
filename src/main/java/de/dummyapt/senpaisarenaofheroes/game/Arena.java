package de.dummyapt.senpaisarenaofheroes.game;

import de.dummyapt.senpaisarenaofheroes.fiend.Fiend;
import de.dummyapt.senpaisarenaofheroes.hero.Hero;

public class Arena {
    Hero[] heroes;
    Fiend[] fiends;

    public Arena(Hero[] heroes, Fiend[] fiends) {
        this.heroes = heroes;
        this.fiends = fiends;
    }

    public Hero[] getHeroes() {
        return heroes;
    }

    public Fiend[] getFiends() {
        return fiends;
    }
}
