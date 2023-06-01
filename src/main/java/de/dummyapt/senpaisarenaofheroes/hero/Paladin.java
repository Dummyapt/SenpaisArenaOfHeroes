package de.dummyapt.senpaisarenaofheroes.hero;

import de.dummyapt.senpaisarenaofheroes.fiend.Fiend;
import de.dummyapt.senpaisarenaofheroes.game.GameObject;

public class Paladin extends Hero {
    protected static final int DAMAGE = 6;

    public Paladin(String name, int health) {
        super(name, health);
    }

    @Override
    public void attack(GameObject h) {
        h.sustainDamage(DAMAGE);
        logAction("Hero: " + getName() + " attacks Fiend " + h.getClass() + " Health: " + ((Fiend) h).getHealth());
    }

    @Override
    public void sustainDamage(int damage) {
        setHealth(getHealth() - damage);
    }
}
