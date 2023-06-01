package de.dummyapt.senpaisarenaofheroes.fiend;

import de.dummyapt.senpaisarenaofheroes.game.GameObject;
import de.dummyapt.senpaisarenaofheroes.hero.Hero;

public class Spider extends Fiend {
    protected static final int DAMAGE = 2;

    public Spider(int health) {
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
