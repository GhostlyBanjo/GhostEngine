package net.ge.src;

import java.awt.*;

import net.ge.src.States.*;
import net.ge.src.util.Pair;

public class Game extends Frame {

	
	public static final int WIDTH = 1024;
	public static final int HEIGHT = 728;
	
	
	StateHandler stateHandle = new StateHandler();
	
	public Game(){
		Pair<Integer, String> cunt =  new Pair<Integer, String>(2,2);
		
		stateHandle.Push(new MainMenuState());
		
	}
	
}
