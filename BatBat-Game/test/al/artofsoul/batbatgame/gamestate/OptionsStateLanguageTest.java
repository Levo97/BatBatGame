package al.artofsoul.batbatgame.gamestate;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class OptionsStateLanguageTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

	}

	@Test
	public void testSiLuhet() {
		/*
		 * boolean x = GameStateManager.language_state; boolean[] excepted = { x };
		 * boolean[] actual = { x }; assertArrayEquals(excepted, actual);
		 */
		boolean actual = GameStateManager.language_state;
		assertEquals(true, actual);
	}

	@Test
	public void draw() {
		/*
		 * boolean x = GameStateManager.language_state; boolean[] excepted = { x };
		 * boolean[] actual = { x }; assertArrayEquals(excepted, actual);
		 */
		boolean actual = GameStateManager.language_state;
		assertEquals(true, actual);
	}
}
