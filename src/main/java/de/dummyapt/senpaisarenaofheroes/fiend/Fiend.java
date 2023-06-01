package de.dummyapt.senpaisarenaofheroes.fiend;

import de.dummyapt.senpaisarenaofheroes.game.GameObject;

public abstract class Fiend extends GameObject {
    protected int health;

    protected Fiend(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health < 0) {
            this.health = 0;
            return;
        }
        this.health = health;
    }
}
