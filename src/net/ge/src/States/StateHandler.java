package net.ge.src.States;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.*;

public class StateHandler implements KeyListener {


	private Stack<GameState> stateStack = new Stack<GameState>();
	
	public  void Update(long elapsedTime){
		//Updates the game state.
		GameState currentState = stateStack.peek();
		currentState.Update(elapsedTime);
	}
	public void Render(Graphics g){
		//Renders according to the current game state
		stateStack.peek().Render(g);
	}
	public void Push(GameState state){
		//Puts a game state on top of the stack, making it the primary.
		stateStack.push(state);
		stateStack.peek().OnEnter();
	}
	public void Pop(){
		//Removes a game state from the stack, reverting to the last previous  
		stateStack.pop().OnExit();
	}
    @Override
    public void keyPressed(KeyEvent e) {  
    	//Sends the key input to the state to be handled.
        stateStack.peek().HandleInput(e);
    }

    @Override
    public void keyTyped(KeyEvent e) {
    	//unused
    }


    @Override
    public void keyReleased(KeyEvent e) {
    	//unused
    }
}
