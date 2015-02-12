package net.ge.src.net.ge.src.Dev;

import net.ge.src.Entities.Entity;
import net.ge.src.Game;
import net.ge.src.util.*;


import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.geom.Arc2D;

public class DevBoxPlayer extends Entity {

    private Color c;
    private  boolean isMoving = false;

    public DevBoxPlayer(Pair<Float, Float> loc, Color c){
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
        this.multiplyMovement(-1);

    }
    public void HandleInput(KeyEvent e) {



        switch(e.getKeyCode()){
            case KeyEvent.VK_LEFT:
                this.changeMovement(new Vector(-1f,0f));
                break;
            case KeyEvent.VK_RIGHT:
                this.changeMovement(new Vector(1f,0f));
                break;
            case KeyEvent.VK_UP:
                this.changeMovement(new Vector(0f,-1f));
                break;
            case KeyEvent.VK_DOWN:
                this.changeMovement(new Vector(0f,1f));
                break;

        }
    }
}
