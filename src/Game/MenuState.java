package Game;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

import Components.Button;
import Main.GamePanel;

public class MenuState extends GameState{


	
	public MenuState(GameStateManager gsm) {
		super(gsm);
	}

	@Override
	public void init() {
		Button b = new Button(400, 300, "Play", 50, true, new Runnable(){

			@Override
			public void run() {
				gsm.setState(GameStateManager.OPTIONSSTATE);
			}
			
			});
		
		this.addComponent(b);
	}

	@Override
	public void update() {
		
	}

	@Override
	public void draw(Graphics2D g) {
		g.setColor(GamePanel.background.getColor());
		g.fillRect(0, 0, GamePanel.SIZE.width, GamePanel.SIZE.height);
		
		
		this.drawComponents(g);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}

}
