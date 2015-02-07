package net.ge.src.States;

import net.ge.src.Game;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Created by Forrest on 2/7/2015.
 */
public class DevState implements GameState{
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

    }
}
