package al.artofsoul.batbatgame.entity;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import al.artofsoul.batbatgame.tilemap.TileMap;

public class TestFireball {

	TileMap tm = new TileMap(10);
	FireBall fb = new FireBall(tm, true);

	@Test
	public void testIsHit() {
		assertTrue("Fireball hit", fb.isHit());
	}

	@Test
	public void testShouldRemove() {
		assertTrue("Should remove", fb.shouldRemove());
	}

}
