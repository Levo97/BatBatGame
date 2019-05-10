package al.artofsoul.batbatgame.handlers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import al.artofsoul.batbatgame.gamestate.GameStateManager;
import al.artofsoul.batbatgame.main.GamePanel;

public class MouseTest {

	/*
	 * @BeforeClass public static void setUpBeforeClass() throws Exception { }
	 */

	private GameStateManager gsm = new GameStateManager();
	private Mouse mouse;

	public MouseTest() {
		mouse = new Mouse(gsm);
	}

	@Test
	public void testClicked() {
		gsm.setState(GameStateManager.MENUSTATE);
		assertEquals(0, gsm.getCurrentState());
	}

	@Test
	public void testSwitchMenuState() {
		mouse.switchMenuState(10, 10);
		assertEquals(GameStateManager.MENUSTATE, gsm.getCurrentState());
	}

	@Test
	public void testSwitchOptionsState() {
		mouse.switchOptionsState(10, 10);
		assertEquals(GameStateManager.MENUSTATE, gsm.getCurrentState());
	}

	@Test
	public void testSetPlay() {
		mouse.setPlay();
		assertEquals(GameStateManager.LEVEL1STATE, gsm.getCurrentState());
	}

	@Test
	public void testSetOptions() {
		mouse.setOptions();
		assertEquals(GameStateManager.OPTIONSSTATE, gsm.getCurrentState());
	}

	@Test
	public void testSetMenu() {
		mouse.setMenu();
		assertEquals(GameStateManager.MENUSTATE, gsm.getCurrentState());
	}

	@Test
	public void testOpenKeyboardLayout() {
		mouse.openKeyboardLayout();
	}

	@Test
	public void testOpenHowToPlay() {
		/*
		 * boolean x = GamePanel.isStandardcontroll(); boolean[] expected = { x };
		 * boolean[] actual = { x }; assertArrayEquals(expected, actual);
		 */
		boolean actual = GamePanel.isStandardcontroll();
		assertEquals(true, actual);
	}

	@Test
	public void testBetweenX() {
		boolean actual = mouse.betweenX(10, 20, 15);
		assertEquals(true, actual);
	}

	@Test
	public void testBetweenY() {
		boolean actual = mouse.betweenY(20, 40, 45);
		assertEquals(false, actual);
	}

}
