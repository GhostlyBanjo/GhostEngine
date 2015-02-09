package net.ge.src.Entities;

import net.ge.src.util.Pair;

import java.awt.*;

/**
 * Created by s613271 on 2/9/2015.
 */
public class Entity implements Collider,Drawable,WorldObject{

    private String name;
    private Pair<Integer, Integer> loc, size;


    public Entity(String name, Pair<Integer, Integer> loc, Pair<Integer, Integer> size){
        this.name = name;
        this.loc = loc;
        this.size = size;
    }

    @Override
    public void drawObject(Graphics g) {
        g.drawRect(getLocation().getKey(),getLocation().getValue(),getSize().getKey(),getSize().getValue());
    }

    @Override
    public Pair<Integer, Integer> getSize() {
        return size;
    }

    @Override
    public Pair<Integer, Integer> getLocation() {
        return loc;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String key() {
        return key;
    }

    @Override
    public Collision collide(Collision c) {
        return null;
    }
}
