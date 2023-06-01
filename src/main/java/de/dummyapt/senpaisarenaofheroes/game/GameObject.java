package de.dummyapt.senpaisarenaofheroes.game;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class GameObject implements Attackable, Attack {
    String[] actionHistory = new String[30];
    int historyIndex = 0;

    protected void logAction(String s) {
        if (historyIndex >= 30) {
            System.out.println("History full");
            return;
        }
        actionHistory[historyIndex] = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date(System.currentTimeMillis())) + ": " + s);
        historyIndex++;
    }

    public void print() {
        var stringBuilder = new StringBuilder();
        for (var s : actionHistory)
            if (s != null) stringBuilder.append(s).append("\n");
        System.out.print(stringBuilder);
    }

    public String save() {
        var stringBuilder = new StringBuilder();
        for (var s : actionHistory)
            if (s != null) stringBuilder.append(s).append("\n");
        return stringBuilder.toString();
    }
}
