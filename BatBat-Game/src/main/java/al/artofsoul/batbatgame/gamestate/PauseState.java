package al.artofsoul.batbatgame.gamestate;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

import al.artofsoul.batbatgame.handlers.Keys;
import al.artofsoul.batbatgame.main.GamePanel;

/**
 * @author ArtOfSoul
 */

public class PauseState extends GameState {

	private Font pauseFont;

	public PauseState(GameStateManager gsm) {

		super(gsm);

		// fonts
		pauseFont = new Font("Arial", Font.PLAIN, 12);

	}

	@Override
	public void update() {
		handleInput();
	}

	@Override
	public void draw(Graphics2D g) {
		boolean language = GameStateManager.languageState(GameStateManager.language_state);
		if (language == true) {
			g.setColor(Color.BLACK);
			g.fillRect(0, 0, GamePanel.WIDTH, GamePanel.HEIGHT);
			g.setColor(Color.WHITE);
			g.setFont(pauseFont);
			g.drawString("Game Paused", 110, 110);
			g.drawString("For exit to main menu press ENTER", 50, 150);
		} else {
			g.setColor(Color.BLACK);
			g.fillRect(0, 0, GamePanel.WIDTH, GamePanel.HEIGHT);
			g.setColor(Color.WHITE);
			g.setFont(pauseFont);
			g.drawString("A jatek megallitva", 110, 110);
			g.drawString("Kilepeshez a fomenube nyomj ENTERT", 50, 150);
		}
	}

	@Override
	public void handleInput() {
		if (Keys.isPressed(Keys.ESCAPE))
			gsm.setPaused(false);
		if (Keys.isPressed(Keys.ENTER)) {
			gsm.setPaused(false);
			gsm.setState(GameStateManager.MENUSTATE);
		}
	}

}
