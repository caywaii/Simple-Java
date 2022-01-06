
import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class WINDOWS_FOR_FIRST_GAME extends Canvas {

	
	private static final long serialVersionUID = 165166132304048821L;

	public WINDOWS_FOR_FIRST_GAME(int width, int height, String title, FIRST_GAME_BY_REALTUTSGML game) {
		
		JFrame frame = new JFrame(title);
		
		frame.setPreferredSize(new Dimension(width, height));
		frame.setMaximumSize(new Dimension(width, height));
		frame.setMinimumSize(new Dimension(width, height));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.add(game);
		frame.setVisible(true);
		game.start();
		
	}
}
