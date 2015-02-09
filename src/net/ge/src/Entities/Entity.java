package net.ge.src.Entities;

import net.ge.src.util.Pair;

import java.awt.*;
import java.awt.Color;
import java.awt.Graphics;
/**
 * Created by s613271 on 2/9/2015.
 */
public abstract class Entity implements Collider,Drawable,WorldObject{

    protected String name;
    protected Pair<Integer, Integer> loc, size;


    public Entity(String name, Pair<Integer, Integer> loc, Pair<Integer, Integer> size){
        this.name = name;
        this.loc = loc;
        this.size = size;
    }

    @Override
    public abstract void drawObject(Graphics g);
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
    public Collision collide(Collision c) {
        return null;
    }
}
