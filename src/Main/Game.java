package Main;

import javax.swing.JFrame;

public class Game {

	
	public static void main(String[] args){
		JFrame frame = new JFrame("TicTacToe");
		GamePanel panel = new GamePanel();
		
		frame.setResizable(false);
		frame.setPreferredSize(panel.SIZE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setContentPane(panel);
		
		frame.setVisible(true);
	}
	
}
