package de.dummyapt.senpaisarenaofheroes.game;

import java.util.Random;

public class Die {
    private final Random random;
    protected int sides;

    public Die(int sides) {
        this.sides = sides;
        random = new Random();
    }

    public int throwDie() {
        return random.nextInt(sides) + 1;
    }
}
