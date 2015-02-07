package net.ge.src.States;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;

import net.ge.src.Game;
import net.ge.src.Main;

public class MainMenuState implements GameState {

	char key = ' ';
	Option current = Option.DEV1;
	
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
        if(e.getKeyCode() == KeyEvent.VK_ENTER || e.getKeyCode() == KeyEvent.VK_SPACE){
            doOption();}

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
		if(current == Option.DEV1){
			g.setColor(Color.yellow);
			g.drawString("Dev mode 1",150,150);
			g.setColor(Color.white);
		}else{
			g.drawString("Dev mode 1",150,150);
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
		if(current == Option.DEV1){ current = Option.LOAD;		}
		else if(current == Option.LOAD){ current = Option.OPTIONS;		}
		else if(current == Option.OPTIONS){current = Option.EXIT;		}
		else if(current == Option.EXIT){current = Option.DEV1;		}
	}
	private void lastOption(){
		if(current == Option.DEV1){current = Option.EXIT;	}
		else if(current == Option.LOAD){ current = Option.DEV1;		}
		else if(current == Option.OPTIONS){ current = Option.LOAD;		}
		else if(current == Option.EXIT){current = Option.OPTIONS;		}
	}

    private void doOption(){
        if(current == Option.DEV1){
            Game.stateHandler.Push(new DevState());
        }
        else if(current == Option.LOAD){}
        else if(current == Option.OPTIONS){}
        else if(current == Option.EXIT){
            net.ge.src.Main.game.closeGame();}
    }
}
enum Option{
	DEV1,LOAD,OPTIONS,EXIT
	
}