package net.ge.src.Tiles;

import net.ge.src.Entities.Drawable;
import net.ge.src.util.Collider;
import net.ge.src.util.Collision;

import java.awt.*;

/**
 * Created by s613271 on 2/16/2015.
 */
public class Tile implements Collider, Drawable {

    private Image img;

    public Tile(Image img){
        this.img = img;
    }

    @Override
    public void Collide(Collision c) {

    }

    @Override
    public Rectangle getBounds() {
        return null;
    }

    @Override
    public void drawObject(Graphics g) {

    }
}
