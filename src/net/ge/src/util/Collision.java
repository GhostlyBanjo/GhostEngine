package net.ge.src.util;

import net.ge.src.Entities.Entity;
import net.ge.src.Entities.WorldObject;

/**
 * Created by s613271 on 2/9/2015.
 */
public class Collision {

    private Entity o;
    private Side s;

    public Collision(Entity o,Side s){
        this.o = o;this.s = s;
    }

    public Side getSide(){
        return s;
    }

    public Entity getObject() {
        return o;
    }
}
