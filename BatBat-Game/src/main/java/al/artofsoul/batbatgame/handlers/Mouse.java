package al.artofsoul.batbatgame.handlers;

import al.artofsoul.batbatgame.gamestate.BasicState;
import al.artofsoul.batbatgame.gamestate.Dialog;
import al.artofsoul.batbatgame.gamestate.GameStateManager;
import al.artofsoul.batbatgame.gamestate.OptionsState;

public class Mouse extends BasicState {

	public Mouse(GameStateManager gsm) {
		super(gsm);
	}

	private OptionsState optionsState;

	public void clicked(int x, int y) {
		// System.out.println(x + " " + y + " " + gsm.getCurrentState());
		if (gsm.MENUSTATE == gsm.getCurrentState()) {
			switchMenuState(x, y);
		} else if (gsm.OPTIONSSTATE == gsm.getCurrentState()) {
			switchOptionsState(x, y);
		}
	}

	public void switchMenuState(int x, int y) {
		if (betweenX(280, 320, x) && betweenY(250, 265, y)) {
			setPlay();
		} else if (betweenX(280, 345, x) && betweenY(280, 295, y)) {
			setOptions();
		} else if (betweenX(280, 320, x) && betweenY(310, 325, y)) {
			System.exit(1);
		}
	}

	public void switchOptionsState(int x, int y) {
		if (betweenX(280, 320, x) && betweenY(310, 325, y)) {
			setMenu();
		} else if (betweenX(280, 415, x) && betweenY(280, 295, y)) {
			openKeyboardLayout();
		} else if (betweenX(280, 380, x) && betweenY(250, 265, y)) {
			openHowToPlay();
		}
	}

	public void setPlay() {
		gsm.setState(gsm.LEVEL1STATE);
	}

	public void setOptions() {
		gsm.setState(gsm.OPTIONSSTATE);
	}

	public void setMenu() {
		gsm.setState(gsm.MENUSTATE);
	}

	public void openKeyboardLayout() {
		Dialog keys = new Dialog();
	}

	public void openHowToPlay() {
		optionsState = new OptionsState(gsm);
		optionsState.siLuhet();
	}

	public boolean betweenX(int min, int max, int x) {
		return min <= x && x <= max;
	}

	public boolean betweenY(int min, int max, int y) {
		return min <= y && y <= max;
	}
}
