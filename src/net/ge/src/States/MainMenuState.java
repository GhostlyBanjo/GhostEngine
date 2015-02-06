package net.ge.src.States;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;

import net.ge.src.Game;

public class MainMenuState implements GameState {

	char key = ' ';
	Option current = Option.NEW;
	
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
            g.setFont(Game.titleFont);
            g.drawString("Main Menu Test script!", 100, 100);
            g.setFont(Game.menuFont);
            g.drawString("The pressed key was: " + key, 100, 700);
            drawOptions(g);
	}


    public void HandleInput(KeyEvent e) {
        key = e.getKeyChar();
        if(e.getKeyCode() == KeyEvent.VK_DOWN){
        	nextOption();
        }
        if(e.getKeyCode() == KeyEvent.VK_UP){
        	lastOption();
        }
       
    }

    @Override
	public void OnExit() {
		// TODO Auto-generated method stub

	}

	@Override
	public void OnEnter() {
		// TODO Auto-generated method stub

	}
	
	private void drawOptions(Graphics g){
		if(current == Option.NEW){
			g.setColor(Color.yellow);
			g.drawString("New Game",150,150);
			g.setColor(Color.white);
		}else{
			g.drawString("New Game",150,150);
		}
		if(current == Option.LOAD){
			g.setColor(Color.yellow);
			g.drawString("Load Game",150,175);
			g.setColor(Color.white);
		}else{
			g.drawString("Load Game",150,175);
		}
		if(current == Option.OPTIONS){
			g.setColor(Color.yellow);
			g.drawString("Options",150,200);
			g.setColor(Color.white);
		}else{
			g.drawString("Options",150,200);
		}
		if(current == Option.EXIT){
			g.setColor(Color.yellow);
			g.drawString("Exit Game",150,225);
			g.setColor(Color.white);
		}else{
			g.drawString("Exit Game",150,225);
		}
	}

	private void nextOption(){
		if(current == Option.NEW){ current = Option.LOAD;		}
		else if(current == Option.LOAD){ current = Option.OPTIONS;		}
		else if(current == Option.OPTIONS){current = Option.EXIT;		}
		else if(current == Option.EXIT){current = Option.NEW;		}
	}
	private void lastOption(){
		if(current == Option.NEW){current = Option.EXIT;	}
		else if(current == Option.LOAD){ current = Option.NEW;		}
		else if(current == Option.OPTIONS){ current = Option.LOAD;		}
		else if(current == Option.EXIT){current = Option.OPTIONS;		}
	}
}
enum Option{
	NEW,LOAD,OPTIONS,EXIT
	
}