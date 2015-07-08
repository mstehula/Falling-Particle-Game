package io.github.mstehula.fpg.particles;

import java.awt.*;

/**
 * Created by MStehula on 7/8/2015.
 */
public class Particle {

    private int x;
    private int y;

    private int width;
    private int height;

    public Particle() {
        this.x = 0;
        this.y = 0;
        this.width = 0;
        this.height = 0;
    }

    public void render(Graphics g) {
        g.fillOval(x - width/2, y - height/2, width, height);
    }
}
