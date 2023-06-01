package de.dummyapt.senpaisarenaofheroes.fiend;

import de.dummyapt.senpaisarenaofheroes.game.GameObject;
import de.dummyapt.senpaisarenaofheroes.hero.Hero;

public class Golem extends Fiend {
    protected static final int DAMAGE = 5;

    public Golem(int health) {
        super(health);
    }

    @Override
    public void attack(GameObject h) {
        h.sustainDamage(DAMAGE);
        logAction("Fiend: " + getClass() + " attacks Hero " + ((Hero) h).getName() + " Health: " + ((Hero) h).getHealth());
    }

    @Override
    public void sustainDamage(int damage) {
        setHealth(getHealth() - damage);
    }
}
