package net.ge.src.Entities;

import net.ge.src.util.*;


import javax.swing.*;
import java.awt.*;
import java.awt.geom.Arc2D;

public class DevBox extends Entity{

    private Color c;

    public DevBox(Pair<Float, Float> loc, Color c){
        super("Dev", loc, new Pair<Float, Float>(10f,10f));
        this.loc = loc;
        this.size = new Pair<Float, Float>(100f,100f);
        this.c=c;
        this.movement = new Vector(0,0);
    }
    public void drawObject(Graphics g) {
        Color temp = g.getColor();
        g.setColor(c);
        g.drawRect(this.getLocation().getKey().intValue(), this.getLocation().getValue().intValue(), this.getSize().getKey().intValue(), this.getSize().getValue().intValue());
        g.setColor(temp);
    }

    public void Collide(Collision c){

        System.out.println("Collided with " + c.getObject() + " on side " + c.getSide());
        switch(c.getSide()){
            case TOP:
            case BOTTOM:this.getMovement().flipY();break;
            case LEFT:
            case RIGHT:this.getMovement().flipX();break;
            default:
                break;
        }
    }
}
