package net.ge.src.States;

import java.util.*;

public class StateHandler {

	HashMap<String, GameState> stacks = new HashMap<String,GameState>();
	Stack<GameState> stateStack = new Stack<GameState>();
	
	public void Update(float elapsedTime){
		GameState currentState = stateStack.peek();
		currentState.Update(elapsedTime);
	}
	public void Render(){
		
	}
	public void Push(GameState state){
		stateStack.push(state);
	}
}
