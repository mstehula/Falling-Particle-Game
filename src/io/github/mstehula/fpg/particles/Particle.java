package io.github.mstehula.fpg.particles;

import io.github.mstehula.fpg.particles.mechanics.PVector;

import java.awt.*;

/**
 * Created by MStehula on 7/8/2015.
 */
public class Particle {

    PVector location;

    int width = 4;
    int height = 4;

    public Particle() {
        location = new PVector(0, 0);
    }

    public Particle(int x, int y) {
        location = new PVector(x, y);
    }

    public void render(Graphics g) {
        g.setColor(new Color(0x00ff00));
        g.fillOval(location.getX() - width/2, location.getY() - height/2, width, height);
    }
}
