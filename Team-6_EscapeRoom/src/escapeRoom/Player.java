/**
 * 
 */
package escapeRoom;

import java.awt.Graphics2D;

/**
 * @author Mr_El
 * Player class will involve entity that moves via user input
 */
public class Player {
	int x = 0; //starting coordinates
	int y = 0;
	int moveX = 1;
	int moveY = 1;
	
	@SuppressWarnings("unused")
	private Game game;
	public Player(Game game) {
		this.game = game;
	}
	
	public void paint(Graphics2D g) {
		g.fillRect(x, y, 400, 400);
	}

	public void move() {
		if (x + moveX > 0 && x + moveY < 0);
	}
}
