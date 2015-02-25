package net.ge.src.States;

import net.ge.src.Game;

import java.awt.Graphics;
import java.awt.event.KeyEvent;

public interface GameState {

	public void Update(float elapsedTime);
	public void Render(Graphics g);
    public void HandleInput(KeyEvent e);
	public void OnExit();
	public void OnEnter();
	
}

