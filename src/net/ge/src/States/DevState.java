package net.ge.src.States;

import net.ge.src.Entities.*;
import net.ge.src.util.*;
import net.ge.src.*;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Forrest on 2/7/2015.
 */
public class DevState implements GameState{
    ArrayList<Entity> entityArrayList = new ArrayList<Entity>();
    @Override
    public void Update(float elapsedTime) {

    }

    @Override
    public void Render(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, Game.WIDTH, Game.HEIGHT);
        g.setColor(Color.WHITE);
        g.setFont(Game.titleFont);
        g.drawString("Dev testing.\n Press space to return to the menu.", 100, 100);
        for(Entity e:entityArrayList){
            e.drawObject(g);
        }
    }
    @Override
    public void HandleInput(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_SPACE){
            Game.stateHandler.Pop();
        }
    }

    @Override
    public void OnExit() {

    }

    @Override
    public void OnEnter() {
        entityArrayList.add(new DevBox(new Pair<Integer,Integer>(300,300), Color.GREEN));
    }
}
