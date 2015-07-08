package io.github.mstehula.fpg.particles.mechanics;

/**
 * Created by MStehula on 7/8/2015.
 */
public class PVector {

    private float x1;
    private float x2;

    public PVector(float x1, float x2) {
        this.x1 = x1;
        this.x2 = x2;
    }

    public PVector (int x1, int x2) {
        this.x1 = x1;
        this.x2 = x2;
    }

    public PVector add(PVector vector) {
        return new PVector(this.x1 + vector.x1, this.x2 + vector.x2);
    }

    public PVector sub(PVector vector) {
        return new PVector(this.x1 - vector.x1, this.x2 - vector.x2);
    }

    public int getX() {
        return (int) this.x1;
    }

    public int getY() {
        return (int) this.x2;
    }
}
