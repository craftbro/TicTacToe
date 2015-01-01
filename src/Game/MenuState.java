package Game;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

import Main.GamePanel;

public class MenuState extends GameState{

	Color c = Color.blue;
	
	public MenuState(GameStateManager gsm) {
		super(gsm);
	}

	@Override
	public void init() {
		
	}

	@Override
	public void update() {
		
	}

	@Override
	public void draw(Graphics2D g) {
		g.setColor(c);
		
		g.fillRect(0, 0, GamePanel.SIZE.width, GamePanel.SIZE.height);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_E){
			c = Color.red;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}

}
