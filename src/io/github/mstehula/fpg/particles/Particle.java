package io.github.mstehula.fpg.particles;

import io.github.mstehula.fpg.Main;
import io.github.mstehula.fpg.particles.mechanics.PVector;

import java.awt.*;
import java.util.Random;

/**
 * Created by MStehula on 7/8/2015.
 */
public class Particle {

    Random random = new Random();

    PVector location;
    PVector velocity;
    PVector acceleration;

    int width = 10;
    int height = 10;

    public Particle() {
        location = new PVector(random.nextInt(800), random.nextInt(600));
        velocity = new PVector(random.nextFloat(), random.nextFloat());
        acceleration = new PVector(random.nextFloat(), random.nextFloat());
    }

    public Particle(int x, int y) {
        location = new PVector(x, y);
        velocity = new PVector(random.nextFloat()-.5F, 0);
        acceleration = new PVector(0, .05F);
    }

    public void tick() {
        velocity = velocity.add(acceleration);
        location = location.add(velocity);

    }

    public boolean isOffscreen() {
        if (location.getX() >= Main.getDefaultDimension().width ||
                location.getX() < 0 ||
                location.getY() >= Main.getDefaultDimension().height ||
                location.getY() < 0) {
            return true;
        }
        return false;
    }

    public void render(Graphics g) {
        g.setColor(new Color(0x00ff00));
        g.fillOval(location.getX() - width/2, location.getY() - height/2, width, height);
    }
}
