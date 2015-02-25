package net.ge.src.States;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.*;

public class StateHandler implements KeyListener {


	private Stack<GameState> stateStack = new Stack<GameState>();

    /**
     * Updates the gamestate that's the newest on the stack.
     * @param elapsedTime
     */
	public  void Update(long elapsedTime){
		//Updates the game state.
		GameState currentState = stateStack.peek();
		currentState.Update(elapsedTime);
	}

    /**
     * Renders the current GameState
     * @param g
     */
	public void Render(Graphics g){
		//Renders according to the current game state
		stateStack.peek().Render(g);
	}

    /**
     * Adds a game to the tope of the stack, and then executes its OnEnter() method.
     * @param state
     */
	public void Push(GameState state){
		//Puts a game state on top of the stack, making it the primary.
		stateStack.push(state);
		stateStack.peek().OnEnter();
	}

    /**
     * Removes a state from the stack, then does that state's OnExit() method.
     */
	public void Pop(){
		//Removes a game state from the stack, reverting to the last previous  
		stateStack.pop().OnExit();
	}
    public GameState Peek(){
        return stateStack.peek();
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
