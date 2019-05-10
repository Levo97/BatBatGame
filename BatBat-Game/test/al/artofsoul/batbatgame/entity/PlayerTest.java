package al.artofsoul.batbatgame.entity;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import al.artofsoul.batbatgame.tilemap.TileMap;

public class PlayerTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	private Player p;

	public PlayerTest() {
		p = new Player(new TileMap(30));
	}

	@Test
	public void testSetHealth() {
		int t = 10;
		p.setHealth(t);
		int q = p.getHealth();
		assertEquals(t, q);
	}

	@Test
	public void testSetRunning() {
		p.setRunning(true);
		assertEquals(true, p.isRunning());
	}

	@Test
	public void testSetDashing() {
		p.setDashing(true);
		assertEquals(true, p.isDashing());
	}

	@Test
	public void testSetTime() {
		p.setTime(0);
		assertEquals(0, p.getTime());
	}

	@Test
	public void testGainLife() {
		p.setLives(1);
		p.gainLife();
		assertEquals(2, p.getLives());
	}

	@Test
	public void testLoseLife() {
		p.setLives(2);
		p.loseLife();
		assertEquals(1, p.getLives());
	}

	@Test
	public void testGetLive() {
		p.setLives(1);
		assertEquals(1, p.getLives());
	}

	@Test
	public void testDead() {
		p.setLives(10);
		assertEquals(10, p.getLives());
	}
}
