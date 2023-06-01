package de.dummyapt.senpaisarenaofheroes.hero;

import de.dummyapt.senpaisarenaofheroes.fiend.Fiend;

public abstract class Hero {
    protected String name;
    protected int health;

    protected Hero(int health, String name) {
        this.health = health;
        this.name = name;
    }

    public abstract void attack(Fiend fiend);

    public abstract String getName();

    public abstract void setName(String name);

    public abstract int getHealth();

    public abstract void setHealth(int health);
}
