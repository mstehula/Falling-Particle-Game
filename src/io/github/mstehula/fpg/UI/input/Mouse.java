package io.github.mstehula.fpg.UI.input;

import io.github.mstehula.fpg.Main;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 * Created by MStehula on 7/8/2015.
 */
public class Mouse implements MouseListener, MouseMotionListener {

    public void mouseClicked(MouseEvent e) {
        Main.getGame().spawnParticle(e.getX(), e.getY());
    }

    public void mousePressed(MouseEvent e) {

    }

    public void mouseReleased(MouseEvent e) {

    }

    public void mouseEntered(MouseEvent e) {

    }

    public void mouseExited(MouseEvent e) {

    }

    public void mouseDragged(MouseEvent e) {

    }

    public void mouseMoved(MouseEvent e) {

    }
}
