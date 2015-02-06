package net.ge.src.States;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;

import net.ge.src.Game;

public class MainMenuState implements GameState {

	char key = ' ';
	
	
	@Override
	public void Update(float elapsedTime) {
		// TODO Auto-generated method stub

	}

	@Override
	public void Render(Graphics g) {
		// TODO Auto-generated method stub
			g.setColor(Color.BLACK);
			g.fillRect(0, 0, Game.WIDTH, Game.HEIGHT);
            g.setColor(Color.WHITE);
            g.drawString("Main Menu Test script!", 100, 100);
            g.drawString("The pressed key was: " + key, 100, 125);
	}


    public void HandleInput(KeyEvent e) {
        key = e.getKeyChar();
    }

    @Override
	public void OnExit() {
		// TODO Auto-generated method stub

	}

	@Override
	public void OnEnter() {
		// TODO Auto-generated method stub

	}


}
