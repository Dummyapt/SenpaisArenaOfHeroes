package de.dummyapt.senpaisarenaofheroes.game;

public class Game implements Runnable {
    public static final int HEROES_LOST = -1;
    public static final int HEROES_WON = 1;
    public static final int STILL_MORE_FIGHTING = 0;
    private static final int DELAY_IN_MS = 100;
    protected String gameName;
    protected Arena arena;
    protected int gameState;
    private int roundCounter;

    public Game(String gameName, Arena arena) {
        this.gameName = gameName;
        this.arena = arena;
    }

    public Arena getArena() {
        return arena;
    }

    public void iterate() {
        var enemyCount = arena.getFiends().length;
        var heroCount = arena.getHeroes().length;
        var fiendDie = new Die(enemyCount);
        var heroDie = new Die(heroCount);
        var fiends = arena.getFiends();
        var heroes = arena.getHeroes();
        for (var e : heroes) e.attack(fiends[fiendDie.throwDie() - 1]);
        for (var f : fiends) f.attack(heroes[heroDie.throwDie() - 1]);
        roundCounter++;
    }

    @Override
    public void run() {
        while ((gameState = checkIfGameOver()) == STILL_MORE_FIGHTING) {
            iterate();
            try {
                Thread.sleep(DELAY_IN_MS);
            } catch (InterruptedException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }
        }
        switch (gameState) {
            case HEROES_LOST ->
                    System.out.println("The game '" + gameName + "' ended after " + roundCounter + " rounds," + " the heroes lost the fierce battle");
            case HEROES_WON ->
                    System.out.println("The game '" + gameName + "' ended after " + roundCounter + " rounds," + " the heroes won the fierce battle");
            default ->
                    System.out.println("The game '" + gameName + "' ended after " + roundCounter + " rounds," + " the game ended in a draw");
        }
    }

    public int getGameState() {
        return gameState;
    }

    private int checkIfGameOver() {
        var fiends = arena.getFiends();
        var heroes = arena.getHeroes();
        var heroesAlive = heroes.length;
        var fiendsAlive = fiends.length;
        var status = 2;
        for (var e : heroes) if (e.getHealth() == 0) heroesAlive--;
        for (var f : fiends)
            if (f.getHealth() == 0) fiendsAlive--;
        if (heroesAlive == 0) status = HEROES_LOST;
        if (heroesAlive != 0 && fiendsAlive == 0) status = HEROES_WON;
        if (heroesAlive != 0 && fiendsAlive != 0) status = STILL_MORE_FIGHTING;
        return status;
    }
}
