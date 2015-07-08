package io.github.mstehula.fpg.UI;

import io.github.mstehula.fpg.Main;

import javax.swing.*;
import java.awt.*;

/**
 * Created by MStehula on 7/8/2015.
 */
public class UI {

    private JFrame window;
    private Canvas canvas;

    public void startup() {
        this.window = new JFrame();
        this.window.setSize(Main.getDefaultDimension());

        this.canvas = new Canvas();
        this.canvas.setSize(Main.getDefaultDimension());
        this.window.add(this.canvas);

        this.window.pack();
        this.window.setVisible(true);
    }

    public void shutdown() {
        this.window.setVisible(false);
        this.window.dispose();
    }
}
