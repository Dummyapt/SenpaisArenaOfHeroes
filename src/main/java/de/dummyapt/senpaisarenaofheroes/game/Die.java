package de.dummyapt.senpaisarenaofheroes.game;

import java.util.Random;

public class Die {
    protected int sides;

    public Die(int sides) {
        this.sides = sides;
    }

    public int throwDie() {
        return new Random().nextInt(sides) + 1;
    }
}