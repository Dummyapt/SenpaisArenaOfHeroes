package de.dummyapt.senpaisarenaofheroes.game;

import de.dummyapt.senpaisarenaofheroes.fiend.Fiend;
import de.dummyapt.senpaisarenaofheroes.hero.Hero;

public class Arena {
    protected Hero[] heroes;
    protected Fiend[] fiends;

    public Arena(Hero[] heroes, Fiend[] fiends) {
        this.heroes = heroes;
        this.fiends = fiends;
    }

    public Hero[] getHeroes() {
        return heroes;
    }

    public void setHeroes(Hero[] heroes) {
        this.heroes = heroes;
    }

    public Fiend[] getFiends() {
        return fiends;
    }

    public void setFiends(Fiend[] fiends) {
        this.fiends = fiends;
    }
}
