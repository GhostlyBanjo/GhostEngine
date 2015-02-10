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

            if(b0.intersects(b1)){
                c0.multiplyMovement(-1);
                c1.multiplyMovement(-1);
                System.out.println("Collision!");
            }
    }
    public void CheckScreenCollisions(Entity c0){
        if(c0.getLocation().getKey()<0 || (c0.getLocation().getKey() + c0.getSize().getKey()) > Game.WIDTH){
            c0.multiplyMovement(-1);
        }
        if(c0.getLocation().getValue()<0 || (c0.getLocation().getValue() + c0.getSize().getValue()) > Game.HEIGHT){
            c0.multiplyMovement(-1);
        }

    }

}
