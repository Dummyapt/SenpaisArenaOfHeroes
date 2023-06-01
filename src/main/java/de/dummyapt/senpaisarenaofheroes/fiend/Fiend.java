package de.dummyapt.senpaisarenaofheroes.fiend;

import de.dummyapt.senpaisarenaofheroes.hero.Hero;

public abstract class Fiend {
    protected int health;

    public abstract void attack(Hero hero);

    public abstract int getHealth();

    public abstract void setHealth(int health);
}
