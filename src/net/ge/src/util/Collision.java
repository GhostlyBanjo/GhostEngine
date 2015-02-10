package net.ge.src.util;

import net.ge.src.Entities.Entity;
import net.ge.src.Entities.WorldObject;

/**
 * Created by s613271 on 2/9/2015.
 */
public class Collision {

    private Entity o;

    public Collision(Entity o){
        this.o = o;
    }


    public Entity getObject() {
        return o;
    }
}
