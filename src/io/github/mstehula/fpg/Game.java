package io.github.mstehula.fpg;

import io.github.mstehula.fpg.particles.Particle;

import java.util.LinkedList;

/**
 * Created by MStehula on 7/8/2015.
 */
public class Game {

    private boolean isRunning = true;

    private LinkedList<Particle> particles = new LinkedList<Particle>();

    public void startup() {
        Main.getUI().startup();
    }

    public void loop() {
        long currentTime = System.nanoTime();
        long tickTime = currentTime;
        long secondTime = currentTime;
        int tickCount = 0;
        int renderCount = 0;
        while(this.isRunning) {
            currentTime = System.nanoTime();
            if((currentTime - tickTime) > (1000000000/20)) {
                tickCount++;
                tickTime = currentTime;
                tick();
            }
            renderCount++;
            render();
            if((currentTime - secondTime) > 1000000000) {
                System.out.println("TPS: " + tickCount + ", FPS: " + renderCount);
                tickCount = 0;
                renderCount = 0;
                secondTime = currentTime;
            }
        }
    }

    private void tick() {

    }

    private void render() {
        synchronized (this.particles) {
            for (Particle particle : this.particles) {
                particle.render(Main.getUI().getGraphics());
            }
        }
    }

    public void shutdown() {
        Main.getUI().shutdown();
    }

    public void stopLoop() {
        this.isRunning = false;
    }

    public void spawnParticle(int x, int y) {
        synchronized (this.particles) {
            this.particles.addLast(new Particle(x, y));
        }
        System.out.println("Particle spawned at " + x + ", " + y);
    }

}
