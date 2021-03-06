package net.ge.src;

import net.ge.src.States.StateHandler;
import net.ge.src.util.PhysicsHandler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Game extends JFrame {

	
	public static final int WIDTH = 1024;
	public static final int HEIGHT = 736;
	public static StateHandler stateHandler = new StateHandler();
	public static PhysicsHandler collisionHandler = new PhysicsHandler();
	
	private boolean isRun = true;
	public static Font titleFont = new Font("Terminal", Font.PLAIN,36);
	public static Font menuFont = new Font("Terminal", Font.PLAIN,20);
	

	
	public Game(){
		this.setSize(WIDTH, HEIGHT);

        addKeyListener(stateHandler);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(1);
            }
        });

	}
	
	public void Run(){




        this.setVisible(true);
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
		

        if (deltaU >= 100) {

        	stateHandler.Update(deltaU);
            ticks++;
            deltaU-=100;
        }
        if (deltaR >= 100) {
            this.Render(getGraphics());
            frames++;
            deltaR-=100;
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


	public void Render(Graphics g){
        Image tempImg = null;
        Graphics o;

        Dimension d = getSize();



        tempImg = createImage(d.width,d.height);

        o = tempImg.getGraphics();

        stateHandler.Render(o);

        g.drawImage(tempImg,0,0, this);
	}
	
	public void closeGame(){
		isRun=false;
	}
	
}
 