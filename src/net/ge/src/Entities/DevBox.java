package net.ge.src.Entities;

import net.ge.src.util.*;


import javax.swing.*;
import java.awt.*;

public class DevBox extends Entity{

    private Color c;

    public DevBox(Pair<Integer, Integer> loc, Color c){
        super("Dev", loc, new Pair<Integer, Integer>(10,10));
        this.loc = loc;
        this.size = new Pair<Integer, Integer>(100,100);
        this.c=c;
        this.movement = new Vector(0,0);
    }
    public void drawObject(Graphics g) {
        Color temp = g.getColor();
        g.setColor(c);
        g.drawRect(this.getLocation().getKey(),this.getLocation().getValue(),this.getSize().getKey(),this.getSize().getValue());
        g.setColor(temp);
    }
    public Vector getMovement(){
        return movement;
    }
    public Vector changeMovement(Vector v){
        this.movement = v;
        return movement;
    }
    public Vector addMovement(Vector v){
        this.movement.addX(v.getX());
        this.movement.addY(v.getY());
        return movement;
    }

    public void Collide(Collision c){

        System.out.print("Collided with " + c.getObject());
    }
}
