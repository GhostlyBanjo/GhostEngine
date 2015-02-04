package net.ge.src.States;

import java.awt.Graphics;

public interface GameState {

	public void Update(float elapsedTime);
	public void Render(Graphics g);
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
		// TODO Auto-generated method stub
		
	}

}