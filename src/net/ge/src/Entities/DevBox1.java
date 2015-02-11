package net.ge.src.Entities;

import net.ge.src.util.Collision;
import net.ge.src.util.Pair;

import java.awt.*;

import static java.awt.Color.GREEN;

/**
 * Created by s613271 on 2/11/2015.
 */
public class DevBox1 extends Entity {

    private Color[] c = new Color[2];
    private float selfTimer;
    private boolean changed;

    public DevBox1(String name, Pair<Float, Float> loc, Pair<Float, Float> size, Color c) {
        super(name, loc, size);
        this.c[0] = c;
        this.c[1] = Color.cyan;
    }
    public void Update(float elapsedTime){
        if(changed){
        selfTimer+=elapsedTime;
        if(selfTimer>=100000){
            selfTimer = 0;
            changed = false;
        }
        }
    }
    public void drawObject(Graphics g) {
        Color temp = g.getColor();
        if(changed){
        g.setColor(c[0]);}
        else{
            g.setColor(c[1]);
        }
        g.fillRect(this.getLocation().getKey().intValue(),this.getLocation().getValue().intValue(),this.getSize().getKey().intValue(),this.getSize().getValue().intValue());
        g.setColor(temp);
    }

    public void Collide(Collision c){

        System.out.print("Collided with " + c.getObject());
        changed = true;
    }
}
