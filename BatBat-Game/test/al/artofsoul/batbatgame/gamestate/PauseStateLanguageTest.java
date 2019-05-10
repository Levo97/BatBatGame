package al.artofsoul.batbatgame.gamestate;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class PauseStateLanguageTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void testDraw() {
		boolean actual = GameStateManager.language_state;
		assertEquals(true, actual);
	}

}
