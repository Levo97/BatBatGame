package al.artofsoul.batbatgame.handlers;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class ContentTest {

	@Test
	public void testLoad() {
		assertNotNull("Load method returned NULL", Content.load("/Sprites/Player/EnergyParticle.gif", 10, 10));
	}

}
