package net.ge.src.States;

import java.awt.Graphics;
import java.util.*;

public class StateHandler {

	static HashMap<String, GameState> stacks = new HashMap<String,GameState>();
	static Stack<GameState> stateStack = new Stack<GameState>();
	
	public static  void Update(long elapsedTime){
		GameState currentState = stateStack.peek();
		currentState.Update(elapsedTime);
	}
	public static void Render(Graphics g){
		stateStack.peek().Render(g);
	}
	public static void Push(GameState state){
		stateStack.push(state);
		stateStack.peek().OnEnter();
	}
	public static void Pop(){
		stateStack.pop().OnExit();
	}
}
