package net.ge.src.Entities;

import net.ge.src.util.*;
import net.ge.src.Game;


import java.awt.*;

public class DevBox extends Entity{

    private Color c;
    public DevBox(Pair<Integer, Integer> loc, Color c){
        super("Dev", loc, new Pair<Integer, Integer>(10,10));
        this.loc = loc;
        this.size = new Pair<Integer, Integer>(10,10);
        this.c=c;
    }
    public void drawObject(Graphics g) {
        Color temp = g.getColor();
        g.setColor(c);
        g.drawRect(this.getLocation().getKey(),this.getLocation().getValue(),100,100);
        g.setColor(temp);
    }
}
