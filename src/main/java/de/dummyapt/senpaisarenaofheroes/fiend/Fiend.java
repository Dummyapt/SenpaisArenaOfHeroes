package de.dummyapt.senpaisarenaofheroes.fiend;

import de.dummyapt.senpaisarenaofheroes.game.GameObject;

public abstract class Fiend extends GameObject {
    protected int health;

    public abstract int getHealth();

    public abstract void setHealth(int health);
}
