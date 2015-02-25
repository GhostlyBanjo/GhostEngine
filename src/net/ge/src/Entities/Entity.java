package net.ge.src.Entities;

import net.ge.src.util.*;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Created by s613271 on 2/9/2015.
 */
public abstract class Entity implements Collider,Drawable,WorldObject{


    //Name of the entity.  Used for debugging more than anything else.
    protected String name;
    //Pair<Integer, Integer> objects used to identify the location and size of the entity.
    protected Pair<Float, Float> loc, size;
    //Vector object to identify movement.
    protected Vector movement;

    public Entity(String name, Pair<Float, Float> loc, Pair<Float, Float> size){
        this.name = name;
        this.loc = loc;
        this.size = size;
        this.changeMovement(new Vector(0,0));
    }
    public void Update(float elapsedTime){
        this.loc.setKey(this.loc.getKey() + this.movement.getX());
        this.loc.setValue(this.loc.getValue() + this.movement.getY());
    }
    @Override
    public void drawObject(Graphics g){

    }
    @Override
    public Pair<Float, Float> getSize() {
        return this.size;
    }
    @Override
    public Pair<Float, Float> getLocation() {
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
        return new Rectangle(loc.getKey().intValue(),loc.getValue().intValue(),size.getKey().intValue(),size.getValue().intValue());
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
    public Vector changeMovement(Vector v) {
        this.movement = v;
        return this.movement;
    }

    /**
     *
     * @param v add v to the current movement Vector
     * @return the new movement vector
     */
    public Vector addMovement(Vector v){
        this.movement.addVector(v);
        return this.movement;
    }

    /**
     * Updates the Entity
     */

    public Vector multiplyMovement(int i){
        this.movement.multiply(i);
        return movement;
    }
    public void HandleInput(KeyEvent e){

    }

    public String toString(){
        return this.name;
    }
}
