package net.ge.src.util;

import net.ge.src.util.Collision;

import java.awt.*;

/**
 * Created by s613271 on 2/9/2015.
 */
public interface Collider {

    public Collision Collide(Collision c);
    public Rectangle getBounds();
}
