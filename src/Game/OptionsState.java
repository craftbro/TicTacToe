package Game;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

import Components.Button;
import Main.GamePanel;

public class OptionsState extends GameState{


	
	public OptionsState(GameStateManager gsm) {
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
		g.setColor(GamePanel.background.getColor());
		g.fillRect(0, 0, GamePanel.SIZE.width, GamePanel.SIZE.height);
		
		g.drawString("Options", 100, 100);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}

}
