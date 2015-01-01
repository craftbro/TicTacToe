package Main;

import javax.swing.JFrame;

public class Game {
	

	public static void main(String[] args){
		JFrame frame = new JFrame("TicTacToe");
		GamePanel panel = new GamePanel();

		
		//Setting up the window
		frame.setContentPane(panel);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setLocationRelativeTo(null);
		
		frame.setVisible(true);
	}
	
}
