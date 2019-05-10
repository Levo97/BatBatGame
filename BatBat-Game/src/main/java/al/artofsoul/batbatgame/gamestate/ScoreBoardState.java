package al.artofsoul.batbatgame.gamestate;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;

import al.artofsoul.batbatgame.entity.PlayerScore;
import al.artofsoul.batbatgame.handlers.Keys;
import al.artofsoul.batbatgame.handlers.Scores;
import al.artofsoul.batbatgame.main.GamePanel;

public class ScoreBoardState extends BasicState {
	private GameStateManager mg;
	private String name;
	private ArrayList<PlayerScore> scores;

	public ScoreBoardState(GameStateManager mg) {
		super(mg);
		this.mg = mg;
		this.name = "";
		this.scores = new Scores().getLevelScores(mg.level);
	}

	@Override
	public void draw(Graphics2D g) {
		boolean language = GameStateManager.languageState(GameStateManager.language_state);
		if (language == true) {
			g.setColor(Color.WHITE);
			g.drawString("ScoreBoard", 200, 20);
			g.drawString("Your name: ", 20, 40);
			g.setColor(Color.BLACK);
			g.fillRect(80, 30, 120, 120);
			g.setColor(Color.WHITE);
			g.drawString(this.name, 80, 40);
			g.drawString("Your time: ", 20, 20);
			g.drawString(mg.player.getTimeToString(), 80, 20);

			int x = 200;
			int y = 40;
			for (int i = 0; i < scores.size(); i++) {
				g.drawString((i + 1) + ". " + scores.get(i).getName() + " ..... " + scores.get(i).getTimeToString(), x,
						y);
				y += 20;
			}
		} else {
			g.setColor(Color.WHITE);
			g.drawString("Eredmenytbla", 200, 20);
			g.drawString("Neved: ", 20, 40);
			g.setColor(Color.BLACK);
			g.fillRect(80, 30, 120, 120);
			g.setColor(Color.WHITE);
			g.drawString(this.name, 80, 40);
			g.drawString("Az idod: ", 20, 20);
			g.drawString(mg.player.getTimeToString(), 80, 20);

			int x = 200;
			int y = 40;
			for (int i = 0; i < scores.size(); i++) {
				g.drawString((i + 1) + ". " + scores.get(i).getName() + " ..... " + scores.get(i).getTimeToString(), x,
						y);
				y += 20;
			}
		}
	}

	@Override
	public void handleInput() {
		if (Keys.isPressed(Keys.ENTER)) {
			Scores scores = new Scores();
			scores.save(new PlayerScore(this.name, mg.player.getTime()), mg.level);
			mg.setState(mg.nextLevelState);
			// mg.setState(GameStateManager.MENUSTATE);
		}

		if (this.name.length() < 5) {
			if (GamePanel.isStandardcontroll()) {
				if (Keys.isPressed(Keys.A) || Keys.isPressed(Keys.LEFT)) {
					this.name += "A";
				} else if (Keys.isPressed(Keys.D)) {
					this.name += "D";
				} else if (Keys.isPressed(Keys.E) || Keys.isPressed(Keys.BUTTON2)) {
					this.name += "E";
				} else if (Keys.isPressed(Keys.R) || Keys.isPressed(Keys.BUTTON2)) {
					this.name += "R";
				} else if (Keys.isPressed(Keys.W)) {
					this.name += "W";
				} else if (Keys.isPressed(Keys.Q)) {
					this.name += "Q";
				} else if (Keys.isPressed(Keys.Y) || Keys.isPressed(Keys.BUTTON4)) {
					this.name += "Y";
				} else if (Keys.isPressed(Keys.X) || Keys.isPressed(Keys.BUTTON3)) {
					this.name += "X";
				}
			} else {
				if (Keys.isPressed(Keys.A) || Keys.isPressed(Keys.LEFT)) {
					this.name += "A";
				} else if (Keys.isPressed(Keys.D) || Keys.isPressed(Keys.RIGHT)) {
					this.name += "D";
				} else if (Keys.isPressed(Keys.E) || Keys.isPressed(Keys.BUTTON3)) {
					this.name += "E";
				} else if (Keys.isPressed(Keys.R) || Keys.isPressed(Keys.BUTTON2)) {
					this.name += "R";
				} else if (Keys.isPressed(Keys.W) || Keys.isPressed(Keys.BUTTON1)) {
					this.name += "W";
				} else if (Keys.isPressed(Keys.Q) || Keys.isPressed(Keys.BUTTON4)) {
					this.name += "Q";
				} else if (Keys.isPressed(Keys.Y)) {
					this.name += "Y";
				} else if (Keys.isPressed(Keys.X)) {
					this.name += "X";
				}
			}

			if (Keys.isPressed(Keys.B)) {
				this.name += "B";
			} else if (Keys.isPressed(Keys.C)) {
				this.name += "C";
			} else if (Keys.isPressed(Keys.F)) {
				this.name += "F";
			} else if (Keys.isPressed(Keys.G)) {
				this.name += "G";
			} else if (Keys.isPressed(Keys.H)) {
				this.name += "H";
			} else if (Keys.isPressed(Keys.J)) {
				this.name += "J";
			} else if (Keys.isPressed(Keys.K)) {
				this.name += "K";
			} else if (Keys.isPressed(Keys.L)) {
				this.name += "L";
			} else if (Keys.isPressed(Keys.M)) {
				this.name += "M";
			} else if (Keys.isPressed(Keys.N)) {
				this.name += "N";
			} else if (Keys.isPressed(Keys.O)) {
				this.name += "O";
			} else if (Keys.isPressed(Keys.I)) {
				this.name += "I";
			} else if (Keys.isPressed(Keys.P)) {
				this.name += "P";
			} else if (Keys.isPressed(Keys.Z)) {
				this.name += "Z";
			} else if (Keys.isPressed(Keys.T)) {
				this.name += "T";
			} else if (Keys.isPressed(Keys.S)) {
				this.name += "S";
			} else if (Keys.isPressed(Keys.U)) {
				this.name += "U";
			} else if (Keys.isPressed(Keys.V)) {
				this.name += "V";
			} else if (Keys.isPressed(Keys.NULL)) {
				this.name += "0";
			} else if (Keys.isPressed(Keys.ONE)) {
				this.name += "1";
			} else if (Keys.isPressed(Keys.TWO)) {
				this.name += "2";
			} else if (Keys.isPressed(Keys.THREE)) {
				this.name += "3";
			} else if (Keys.isPressed(Keys.FOUR)) {
				this.name += "4";
			} else if (Keys.isPressed(Keys.FIVE)) {
				this.name += "5";
			} else if (Keys.isPressed(Keys.SIX)) {
				this.name += "6";
			} else if (Keys.isPressed(Keys.SEVEN)) {
				this.name += "7";
			} else if (Keys.isPressed(Keys.EIGHT)) {
				this.name += "8";
			} else if (Keys.isPressed(Keys.NINE)) {
				this.name += "9";
			}
		}

		if (Keys.isPressed(Keys.BACK)) {
			if (this.name.length() > 0) {
				this.name = this.name.substring(0, this.name.length() - 1);
			}
		}
	}
}
