package escapeRoom;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;

/**
 * @author Mr_El
 * Commit only the classes and metadata to the github!!!
 */

public class Game {

	private JFrame frame;
	
	Player player = new Player(this);
	
	private void move() {
		player.move();
	}
	
	public void paint(Graphics g) {
		//super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, //turns on anitialising
				RenderingHints.VALUE_ANTIALIAS_ON);
		player.paint(g2d);
	}
		
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame("Escape Room");
		frame.setSize(800, 600); //Standard window size
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Game window = new Game();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Game() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
