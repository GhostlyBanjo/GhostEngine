package net.ge.src.States;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.*;

public class StateHandler implements KeyListener {


	private Stack<GameState> stateStack = new Stack<GameState>();
	
	public  void Update(long elapsedTime){
		GameState currentState = stateStack.peek();
		currentState.Update(elapsedTime);
	}
	public void Render(Graphics g){
		stateStack.peek().Render(g);
	}
	public void Push(GameState state){
		stateStack.push(state);
		stateStack.peek().OnEnter();
	}
	public void Pop(){
		stateStack.pop().OnExit();
	}

    @Override
    public void keyTyped(KeyEvent e) {
        stateStack.peek().HandleInput(e);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        stateStack.peek().HandleInput(e);
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
