package de.dummyapt.senpaisarenaofheroes.hero;

import de.dummyapt.senpaisarenaofheroes.fiend.Fiend;
import de.dummyapt.senpaisarenaofheroes.game.GameObject;

public class Knight extends Hero {
    public Knight(int health, String name) {
        super(health, name);
    }

    @Override
    public void attack(Fiend fiend) {
        if (fiend.getHealth() > 0) fiend.setHealth(fiend.getHealth() - 10);
        if (fiend.getHealth() <= 0) {
            fiend.setHealth(0);
            System.out.println("The " + fiend.getClass().getSimpleName() + " has been defeated!");
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
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
        return "Knight{" + "name='" + name + '\'' + ", health=" + health + '}';
    }

    @Override
    public void attack(GameObject fiend) {
    }

    @Override
    public void sustainDamage(int damage) {
    }
}
