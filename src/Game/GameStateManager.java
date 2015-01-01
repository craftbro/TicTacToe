package Game;

import java.awt.Graphics2D;

import java.awt.event.KeyEvent;
import java.util.ArrayList;




public class GameStateManager {

	private ArrayList<GameState> states;
	private int currentState;
	 
	public static final int MENUSTATE = 0;
	public static final int OPTIONSSTATE = 1;

	
	public GameStateManager(){
		currentState = MENUSTATE;
		
		states = new ArrayList<GameState>();	
		
		states.add(new MenuState(this));
		states.add(new OptionsState(this));

		states.get(currentState).init();
	}
	
	
	public void setState(int state){
		currentState = state;
		states.get(currentState).init();
	}
	
	public void update(){
		states.get(currentState).update();
	}
	
	public void draw(Graphics2D g){
		states.get(currentState).draw(g);
	}
	
	public void keyPressed(KeyEvent e){
		states.get(currentState).keyPressed(e);
	}
	
	public void keyReleased(KeyEvent e){
		states.get(currentState).keyReleased(e);
	}
	



	public void updateSec() {
		states.get(currentState).updateSec();
	}
}
