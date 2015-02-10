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

        for(int x = 0; x<=entityArrayList.size()-1; x++){
            for(int y = x+1;y<=entityArrayList.size()-1; y++){
                Game.collisionHandler.CheckEntityCollisions(entityArrayList.get(x),entityArrayList.get(y));
            }
            Game.collisionHandler.CheckScreenCollisions(entityArrayList.get(x));
        }
        for(Entity e:entityArrayList){

            e.Update();

        }
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
        entityArrayList.add(new DevBox(new Pair<Integer,Integer>(310,300), Color.GREEN));
        entityArrayList.get(0).addMovement(new Vector(1,1));
        entityArrayList.add(new DevBox(new Pair<Integer,Integer>(800,300), Color.RED));
        entityArrayList.get(1).addMovement(new Vector(-2,-1));
    }
}
