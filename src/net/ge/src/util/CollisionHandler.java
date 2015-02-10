package net.ge.src.util;

import net.ge.src.Entities.Entity;

import java.awt.*;

/**
 * Created by s613271 on 2/10/2015.
 */
public class CollisionHandler {

    public void CheckEntityCollisions(Entity c0, Entity c1){
            Rectangle b0 = c0.getBounds();
            Rectangle b1 = c1.getBounds();

            if(b0.intersects(b1)){
                c0.Collide(new Collision());
                c1.Collide(new Collision());
            }
    }

}
