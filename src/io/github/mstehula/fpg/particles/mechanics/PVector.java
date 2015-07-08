package io.github.mstehula.fpg.particles.mechanics;

/**
 * Created by MStehula on 7/8/2015.
 */
public class PVector {

    private int x1;
    private int x2;

    public PVector (int x1, int x2) {
        this.x1 = x1;
        this.x2 = x2;
    }

    public int getX() {
        return this.x1;
    }

    public int getY() {
        return this.x2;
    }
}
