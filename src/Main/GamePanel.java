package Main;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

import Game.GameStateManager;
import Util.Background;
import Util.Mouse;

public class GamePanel extends JPanel implements Runnable, KeyListener{


	private static final long serialVersionUID = 1L;
	
	
	//Window (Size)
	public static final int WIDTH = 800;
	public static final int HEIGHT = 600;
	public static Dimension SIZE = new Dimension(WIDTH, HEIGHT);
	
	
	//Game Loop (Updating and Frame Drawing)
	private Thread thread;
	private boolean running = false;
	private int FPS = 60;
	private long targetTime = FPS/1000;

	
	//Mouse
	public static Mouse mouse;

	
	//Drawing (Drawing)
	private BufferedImage image;
	private Graphics2D g;
	private GameStateManager manager;
	public static Background background;


	public GamePanel(){
		super();
		setPreferredSize(SIZE);
		setFocusable(true);
		requestFocus();
	}
	
	public void addNotify(){
		super.addNotify();
		
		if(thread == null){
			thread = new Thread(this);
			addKeyListener(this);
			thread.start();
		}
	}
	
	private void init(){

	
		
		running = true;
		
		image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_ARGB);
		
		g = (Graphics2D) image.getGraphics();
		
		manager = new GameStateManager();
		
		background = new Background();
		
		mouse = new Mouse();
		
		this.addMouseListener(mouse);
		this.addMouseMotionListener(mouse);
	}

	@Override
	public void run() {
		
		init();
		
		long start;
		long elapsed;
		long wait;
		

		
		while(running){
			start = System.nanoTime();
			
			update();
			draw();
			drawToScreen();
			

			elapsed = System.nanoTime() - start;
			
			wait = targetTime - elapsed / 1000000;
			
			if(wait >= 1)
			try {
				Thread.sleep(wait);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	private void update(){
		background.update();
		
		manager.update();
	}

	
	private void draw(){
		manager.draw(g);
	}
	
	private void drawToScreen(){
		Graphics g1 = getGraphics();
		g1.drawImage(image, 0, 0, null);
		g1.dispose();
	}
	
	@Override
	public void keyPressed(KeyEvent k) {
		manager.keyPressed(k);
	}

	@Override
	public void keyReleased(KeyEvent k) {
		
	}

	@Override
	public void keyTyped(KeyEvent k) {
		
	}
	
}
