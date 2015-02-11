package net.ge.src.util;

import net.ge.src.Entities.Entity;
import net.ge.src.Game;
import java.awt.*;

/**
 * Created by s613271 on 2/10/2015.
 */
public class CollisionHandler {

    public void CheckEntityCollisions(Entity c0, Entity c1){
            Rectangle b0 = c0.getBounds();
            Rectangle b1 = c1.getBounds();
            Side s1 = Side.NONE, s0 = Side.NONE;

            int[] left = { c0.getLocation().getKey().intValue(), c1.getLocation().getKey().intValue()};
            int[] right = { (int)(c0.getLocation().getKey()+c0.getSize().getKey()), (int)(c1.getLocation().getKey()+c1.getSize().getKey())};
            int[] top = { c0.getLocation().getValue().intValue(), c1.getLocation().getValue().intValue()};
            int[] bottom = {(int)(c0.getLocation().getValue()+c0.getSize().getValue()), (int)(c1.getLocation().getValue()+c1.getSize().getValue())};

        if (b0.intersects(b1)) {
            if(left[0] <= right[1]&&right[0]>right[1]){
                s0 = Side.LEFT; s1 = Side.RIGHT;
            }else if(left[1] <= right[0]&&right[1]>right[0]){
                s1 = Side.LEFT; s0 = Side.RIGHT;
            }
        c0.Collide(new Collision(c1,s0));
        c1.Collide(new Collision(c0,s1));
        }
/*
            c0.Collide(new Collision(c1));
            c1.Collide(new Collision(c0));
        }
*/


    }

    public void CheckScreenCollisions(Entity c0){
        if(c0.getLocation().getKey()<0 || (c0.getLocation().getKey() + c0.getSize().getKey()) > Game.WIDTH){
            c0.getMovement().flipX();
        }
        if(c0.getLocation().getValue()<0 || (c0.getLocation().getValue() + c0.getSize().getValue()) > Game.HEIGHT){
            c0.getMovement().flipY();
        }

    }

}
