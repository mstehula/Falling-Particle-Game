package io.github.mstehula.fpg;

import io.github.mstehula.fpg.particles.Particle;

import java.util.Iterator;
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
                System.out.println("TPS: " + tickCount + ", FPS: " + renderCount + " : Current List size: " + particles.size());
                tickCount = 0;
                renderCount = 0;
                secondTime = currentTime;
            }
        }
    }

    private void tick() {
        if(Main.getMouse().isButtonDown() && Main.getMouse().getButton() == 1) {
            this.particles.addLast(new Particle(Main.getMouse().getX(), Main.getMouse().getY()));
        }
        if(Main.getMouse().isButtonDown() && Main.getMouse().getButton() == 2) {
            Main.getUI().getGraphics().clearRect(0,0, Main.getDefaultDimension().width, Main.getDefaultDimension().height);
            this.particles.clear();
        }
        for(Iterator<Particle> iterator = particles.iterator(); iterator.hasNext(); ) {
            Particle particle = iterator.next();
            particle.tick();
            if(particle.isOffscreen()) {
                iterator.remove();
            }
        }
    }

    private void render() {
        for (Particle particle : this.particles) {
            particle.render(Main.getUI().getGraphics());
        }
    }

    public void shutdown() {
        Main.getUI().shutdown();
    }

    public void stopLoop() {
        this.isRunning = false;
    }

}
