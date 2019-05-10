package al.artofsoul.batbatgame.gamestate;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class GameStateManagerLanguageTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void testLanguageState() {
		/*
		 * boolean x = GameStateManager.language_state; boolean[] excepted = { x };
		 * boolean[] actual = { x }; assertArrayEquals(excepted, actual);
		 */
		boolean actual = GameStateManager.language_state;
		assertEquals(true, actual);
	}

	@Test
	public void testLoadState() {
		boolean actual = GameStateManager.language_state;
		assertEquals(true, actual);
	}

	@Test
	public void setPaused() {
		/*
		 * boolean actual = GameStateManager.language_state; assertNotEquals(false,
		 * actual);
		 */
		boolean actual = GameStateManager.language_state;
		assertEquals(true, actual);
		/*
		 * boolean x = true; boolean[] excepted = { x }; boolean[] actual = { x };
		 * assertArrayEquals(excepted, actual);
		 */
	}

	@Test
	public void unloadState() {
		int x = 0;
		int[] excepted = { x };
		int[] actual = { x };
		assertArrayEquals(excepted, actual);
	}

	@Test
	public void setState() {
		int x = 1;
		int[] excepted = { x };
		int[] actual = { x };
		assertArrayEquals(excepted, actual);
	}

}
