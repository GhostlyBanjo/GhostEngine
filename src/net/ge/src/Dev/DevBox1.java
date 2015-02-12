package net.ge.src.Dev;

import net.ge.src.Entities.Entity;
import net.ge.src.util.Collision;
import net.ge.src.util.Pair;

import java.awt.*;



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
        selfTimer= selfTimer + elapsedTime;
        if(selfTimer>10000){
            changed = false;
            selfTimer = 0;
        }
        }
    }
    public void drawObject(Graphics g) {
        Color temp = g.getColor();
        if(!changed){
        g.setColor(c[0]);}
        else{
            g.setColor(c[1]);
        }
        g.drawRect(this.getLocation().getKey().intValue(), this.getLocation().getValue().intValue(), this.getSize().getKey().intValue(), this.getSize().getValue().intValue());
        g.setColor(temp);
    }

    public void Collide(Collision c){

        if(!changed){changed = true;}
    }
}
