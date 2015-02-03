package net.ge.src.States;

public interface GameState {

	public void Update(float elapsedTime);
	public void Render();
	public void OnExit();
	public void OnEnter();
	
}

class EmptyGameState implements GameState {

	@Override
	public void Update(float elapsedTime) {
		// Does nothing
		
	}

	@Override
	public void Render() {
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

}