package net.ge.src.Entities;

import net.ge.src.util.*;

import java.awt.*;

/**
 * Created by s613271 on 2/9/2015.
 */
public class Entity implements Collider,Drawable,WorldObject{


    //Name of the entity.  Used for debugging more than anything else.
    protected String name;
    //Pair<Integer, Integer> objects used to identify the location and size of the entity.
    protected Pair<Integer, Integer> loc, size;
    //Vector object to identify movement.
    protected Vector movement;

    public Entity(String name, Pair<Integer, Integer> loc, Pair<Integer, Integer> size){
        this.name = name;
        this.loc = loc;
        this.size = size;
    }
    public void Update(){
        this.loc.setKey(this.loc.getKey() + this.movement.getX());
        this.loc.setValue(this.loc.getValue() + this.movement.getY());
    }
    @Override
    public void drawObject(Graphics g){

    }
    @Override
    public Pair<Integer, Integer> getSize() {
        return this.size;
    }
    @Override
    public Pair<Integer, Integer> getLocation() {
        return this.loc;
    }
    @Override
    public String name() {
        return name;
    }
    @Override
    public void Collide(Collision c) {}

    @Override
    public Rectangle getBounds() {
        return new Rectangle(loc.getKey(),loc.getValue(),size.getKey(),size.getValue());
    }

    /**
     *
     * @return the movement Vector
     */
    public Vector getMovement(){
        return movement;
    }

    /**
     *
     * @param v replaces the movement Vector with a new one.
     * @return the new movement vector
     */
    public Vector changeMovement(Vector v){
        return null;
    }

    /**
     *
     * @param v add v to the current movement Vector
     * @return the new movement vector
     */
    public Vector addMovement(Vector v){
        return null;
    }

    /**
     * Updates the Entity
     */

    public Vector multiplyMovement(int i){
        this.movement.multiply(i);
        return movement;
    }
}
