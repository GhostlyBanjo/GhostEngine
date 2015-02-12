package net.ge.src.Dev;

import net.ge.src.Entities.*;
import net.ge.src.States.GameState;
import net.ge.src.util.*;
import net.ge.src.*;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

/**
 * Created by Forrest on 2/7/2015.
 */
public class DevState implements GameState {
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

            e.Update(elapsedTime);

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
        switch(e.getKeyCode()){
            case KeyEvent.VK_LEFT:
            case KeyEvent.VK_RIGHT:
            case KeyEvent.VK_UP:
            case KeyEvent.VK_DOWN:
                entityArrayList.get(0).HandleInput(e);
                break;

        }
    }

    @Override
    public void OnExit() {

    }

    @Override
    public void OnEnter() {
        entityArrayList.add(new DevBoxPlayer(new Pair<Float,Float>(310f,300f), Color.GREEN));
        entityArrayList.get(0).addMovement(new Vector(.5f,4f));
        entityArrayList.add(new DevBox1("DevBox1",new Pair<Float,Float>(Game.WIDTH/2f,Game.HEIGHT/2f),new Pair<Float,Float>(150f,150f), Color.GREEN));

    }
}
