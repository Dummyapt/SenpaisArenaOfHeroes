package de.dummyapt.senpaisarenaofheroes.fiend;

import de.dummyapt.senpaisarenaofheroes.hero.Hero;

public class Golem extends Fiend {

    @Override
    public void attack(Hero hero) {
        if (hero.getHealth() > 0) hero.setHealth(hero.getHealth() - 10);
        if (hero.getHealth() <= 0) {
            hero.setHealth(0);
            System.out.println("The " + hero.getClass().getSimpleName() + " has been defeated!");
        }
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return "Golem{" + "health=" + health + '}';
    }
}
