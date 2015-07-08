package io.github.mstehula.fpg;

/**
 * Created by MStehula on 7/8/2015.
 */
public class Game {

    private boolean isRunning = true;

    public void startup() {
        Main.getUI().startup();
    }

    public void loop() {
        long currentTime = System.nanoTime();
        long tickTime = currentTime;
        long secondTime = currentTime;
        int tickCount = 0;
        int renderCount = 0;
        while(isRunning) {
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

    }

    public void shutdown() {
        Main.getUI().shutdown();
    }

    public void stopLoop() {
        isRunning = false;
    }

}
