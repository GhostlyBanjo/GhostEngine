package net.ge.src.States;

import java.awt.Graphics;
import java.awt.event.KeyEvent;

public interface GameState {

	public void Update(float elapsedTime);
	public void Render(Graphics g);
    public void HandleInput(KeyEvent e);
	public void OnExit();
	public void OnEnter();
	
}

class EmptyGameState implements GameState {

	@Override
	public void Update(float elapsedTime) {
		// Does nothing
		
	}

	@Override
	public void OnExit() {
		// Does nothing
		
	}

	@Override
	public void OnEnter() {
		// Does nothing
		
	}

	@Override
	public void Render(Graphics g) {
		// Does Nothing
		
	}

    @Override
    public void HandleInput(KeyEvent e) {

    }

}