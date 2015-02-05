package net.ge.src;

import java.awt.*;

import javax.swing.JFrame;

import net.ge.src.States.*;
import net.ge.src.util.Pair;

public class Game extends JFrame {

	
	public static final int WIDTH = 1024;
	public static final int HEIGHT = 728;
	private boolean isRun = true;
	

	
	public Game(){
		StateHandler.Push(new MainMenuState());
		this.setSize(WIDTH, HEIGHT);
		

		this.setVisible(true);
		this.Run();
	}
	
	public void Run(){
			
		
		

		long initialTime = System.nanoTime();
		final long timeU = 1000000000;
		final long timeF = 1000000000;
		
long deltaU =0, deltaR =0;
long timer = System.currentTimeMillis();
		 
int frames = 0, ticks = 0;


		do{
			long now = System.nanoTime();
		deltaU +=(now - initialTime) / timeU;
		deltaR +=(now - initialTime) / timeF;	
		

        if (deltaU >= 1) {

        	StateHandler.Update(deltaU);
            ticks++;
            deltaU--;
        }
        if (deltaR >= 1) {
            this.repaint();
            frames++;
            deltaR--;
        }

        if (System.currentTimeMillis() - timer > 1000) {
                System.out.println(String.format("UPS: %s, FPS: %s", ticks, frames));
 
            frames = 0;
            ticks = 0;
            timer += 1000;
        }

        
		}while(isRun);
		
		System.exit(0);
	}

	public void paint(Graphics g){
		StateHandler.Render(getGraphics());
	}
	
	public void closeGame(){
		isRun=false;
	}
	
}
 