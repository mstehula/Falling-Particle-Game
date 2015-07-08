package io.github.mstehula.fpg;

import io.github.mstehula.fpg.UI.UI;

import java.awt.*;

/**
 * Created by MStehula on 7/8/2015.
 */
public class Main {

    private static Game game;
    public static void setGame(Game game) {
        Main.game = game;
    }
    public static Game getGame() {
        return Main.game;
    }

    private static Dimension defaultDimension = new Dimension(800,600);
    public static Dimension getDefaultDimension() { return defaultDimension; }

    private static UI ui = new UI();
    public static UI getUI() { return ui; }

    public static void main(String args[]) {
        setGame(new Game());
        Main.getGame().startup();
        Main.getGame().loop();
        Main.getGame().shutdown();
    }
}
