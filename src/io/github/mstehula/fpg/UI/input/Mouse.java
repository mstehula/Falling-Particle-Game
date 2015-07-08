package io.github.mstehula.fpg.UI.input;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 * Created by MStehula on 7/8/2015.
 */
public class Mouse implements MouseListener, MouseMotionListener {

    private int x;
    public int getX() { return this.x; }

    private int y;
    public int getY() { return this.y; }

    private int button = 0;
    public int getButton() {
        return button;
    }

    private boolean buttonDown;
    public boolean isButtonDown() {
        return buttonDown;
    }

    public void mouseClicked(MouseEvent e) {
        buttonDown = false;
        button = e.getButton();
        x = e.getX();
        y = e.getY();
    }

    public void mousePressed(MouseEvent e) {
        buttonDown = true;
        button = e.getButton();
        x = e.getX();
        y = e.getY();
    }

    public void mouseReleased(MouseEvent e) {
        buttonDown = false;
        button = e.getButton();
        x = e.getX();
        y = e.getY();

    }

    public void mouseEntered(MouseEvent e) {

    }

    public void mouseExited(MouseEvent e) {

    }

    public void mouseDragged(MouseEvent e) {
        this.x = e.getX();
        this.y = e.getY();
    }

    public void mouseMoved(MouseEvent e) {
        this.x = e.getX();
        this.y = e.getY();
    }
}
