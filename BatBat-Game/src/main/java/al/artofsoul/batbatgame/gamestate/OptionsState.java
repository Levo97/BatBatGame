package al.artofsoul.batbatgame.gamestate;

import java.awt.Graphics2D;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import al.artofsoul.batbatgame.audio.JukeBox;
import al.artofsoul.batbatgame.main.GamePanel;

/**
 * @author ArtOfSoul
 */

public class OptionsState extends BasicState {
	final ImageIcon howTo1 = new ImageIcon(getClass().getResource("/Backgrounds/howTo1.gif"));

	final ImageIcon howTo2 = new ImageIcon(getClass().getResource("/Backgrounds/howTo2.gif"));

	final ImageIcon howTo1_hungarian = new ImageIcon(getClass().getResource("/Backgrounds/howTo1_hungarian.gif"));

	final ImageIcon howTo2_hungarian = new ImageIcon(getClass().getResource("/Backgrounds/howTo2_hungarian.gif"));
	
	final ImageIcon textures = new ImageIcon(getClass().getResource("/Backgrounds/textures.gif"));
	
	public static int texture = 0;

	public OptionsState(GameStateManager gsm) {

		super(gsm);
		options = new String[] { "HowTo Play", "Keyboard layout + Language", "Texture Packs","Back" };
		options_hungarian = new String[] { "Hogyan jatssz", "Billentyuzet kiosztas + Nyelv", "Textúrák", "Vissza" };
	}

	@Override
	public void update() {
		// check keys
		handleInput();
	}

	@Override
	public void draw(Graphics2D g) {
		boolean language = GameStateManager.languageState(GameStateManager.language_state);
		if (language == true) {
			super.draw(g);
			g.drawString("HowTo Play", 140, 133);
			g.drawString("Keyboard layout + Language", 140, 148);
			g.drawString("Texture Packs", 140, 163);
			g.drawString("Back", 140, 178);
		} else {
			super.draw(g);
			g.drawString("Hogyan jatssz", 140, 133);
			g.drawString("Billentyuzet kiosztas + Nyelv", 140, 148);
			g.drawString("Textúrák", 140, 163);
			g.drawString("Vissza", 140, 178);
		}
	}
	
	public void siLuhet() {
		boolean x = GamePanel.isStandardcontroll();
		boolean language = GameStateManager.languageState(GameStateManager.language_state);
		System.out.println(x);
		if (language == true) {
			if (x == true) {
				JOptionPane.showMessageDialog(null, "", "HowTo Paldfsfsfy?", JOptionPane.INFORMATION_MESSAGE, howTo1);

			} else {
				JOptionPane.showMessageDialog(null, "", "HowTo Paldfsfsfy?", JOptionPane.INFORMATION_MESSAGE, howTo2);

			}
		} else {
			if (x == true) {
				JOptionPane.showMessageDialog(null, "", "Hogyan Paldfsfsfy?", JOptionPane.INFORMATION_MESSAGE,
						howTo1_hungarian);

			} else {
				JOptionPane.showMessageDialog(null, "", "Hogyan Paldfsfsfy?", JOptionPane.INFORMATION_MESSAGE,
						howTo2_hungarian);

			}
		}

	}

	public int textureSelect() {
		String[] options = { "Basic", "Enhanced" };
		int x = JOptionPane.showOptionDialog(null, "Which texture do you want to use?", "Choose texture",
				JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
		return x;
	}
	
	@Override
	protected void select() {
		if (currentChoice == 0) {
			JukeBox.play("menuselect");
			siLuhet();
		} else if (currentChoice == 1) {
			JukeBox.play("menuselect");

			// K�s�bbiekben nyelvm�dos�t�shoz ezt kell v�ltoztatni
			Dialog keys = new Dialog();
		} else if (currentChoice == 2) {
			JukeBox.play("menuselect");
			texture = textureSelect();
			System.out.println("Texture: " + texture);
		} else {
			gsm.setState(GameStateManager.MENUSTATE);
		}
	}