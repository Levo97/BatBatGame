package al.artofsoul.batbatgame.gamestate;

import al.artofsoul.batbatgame.audio.JukeBox;
<<<<<<< HEAD
=======
import al.artofsoul.batbatgame.entity.Player;
>>>>>>> develop
import al.artofsoul.batbatgame.main.GamePanel;

/**
 * @author ArtOfSoul
 */

public class GameStateManager {
	// TODO
	public static final int NUMGAMESTATES = 17;
	public static final int MENUSTATE = 0;
	public static final int OPTIONSSTATE = 1;
	public static final int LEVEL1STATE = 2;
	public static final int LEVEL2STATE = 3;
	public static final int LEVEL3STATE = 4;
	public static final int LEVEL4STATE = 5;
	public static final int ACIDSTATE = 15;
	public static final int SCOREBOARDSTATES = 16;
	private BasicState[] gameStates;
	private int currentState;
	private PauseState pauseState;
	private boolean paused;
	protected static boolean language_state = true;
	protected Player player;
	protected int nextLevelState;
	protected int level;

	public GameStateManager() {

		if (language_state == true) {
			// angol
			JukeBox.init();

			gameStates = new BasicState[NUMGAMESTATES];

			pauseState = new PauseState(this);
			paused = false;

			currentState = MENUSTATE;
			loadState(currentState);
		} else {
			// magyar
			JukeBox.init();

			gameStates = new BasicState[NUMGAMESTATES];

			pauseState = new PauseState(this);
			paused = false;

			currentState = MENUSTATE;
			loadState(currentState);
		}
	}

	public static boolean languageState(boolean language) {
		language_state = language;
		return language_state;
	}

	private void loadState(int state) {
		if (language_state == true) {
			if (state == MENUSTATE)
				gameStates[state] = new MenuState(this);
			else if (state == OPTIONSSTATE)
				gameStates[state] = new OptionsState(this);
			else if (state == LEVEL1STATE)
				gameStates[state] = new Level1State(this);
			else if (state == LEVEL2STATE)
				gameStates[state] = new Level2State(this);
			else if (state == LEVEL3STATE)
				gameStates[state] = new Level3State(this);
			else if (state == LEVEL4STATE)
				gameStates[state] = new Level4State(this);
			else if (state == ACIDSTATE)
				gameStates[state] = new AcidState(this);
			else if (state == SCOREBOARDSTATES)
				gameStates[state] = new ScoreBoardState(this);
		} else {
			if (state == MENUSTATE)
				gameStates[state] = new MenuState(this);
			else if (state == OPTIONSSTATE)
				gameStates[state] = new OptionsState(this);
			else if (state == LEVEL1STATE)
				gameStates[state] = new Level1State(this);
			else if (state == LEVEL2STATE)
				gameStates[state] = new Level2State(this);
			else if (state == LEVEL3STATE)
				gameStates[state] = new Level3State(this);
			else if (state == LEVEL4STATE)
				gameStates[state] = new Level4State(this);
			else if (state == ACIDSTATE)
				gameStates[state] = new AcidState(this);
			else if (state == SCOREBOARDSTATES)
				gameStates[state] = new ScoreBoardState(this);
		}
	}

	private void unloadState(int state) {
		gameStates[state] = null;
	}

	public void setState(int state) {
		unloadState(currentState);
		currentState = state;
		loadState(currentState);
	}

	public int getCurrentState() {
		return currentState;
	}

	public void setPaused(boolean b) {
		paused = b;
	}

	public void update() {
		if (paused) {
			pauseState.update();
			return;
		}
		if (gameStates[currentState] != null)
			gameStates[currentState].update();
	}

	public void draw(java.awt.Graphics2D g) {
		if (paused) {
			pauseState.draw(g);
			return;
		}
		if (gameStates[currentState] != null)
			gameStates[currentState].draw(g);
		else {
			g.setColor(java.awt.Color.BLACK);
			g.fillRect(0, 0, GamePanel.WIDTH, GamePanel.HEIGHT);
		}
	}
}
