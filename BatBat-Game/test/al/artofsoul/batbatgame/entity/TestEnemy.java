package al.artofsoul.batbatgame.entity;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import al.artofsoul.batbatgame.tilemap.TileMap;

public class TestEnemy {

	TileMap tm = new TileMap(10);
	EnemyProjectile ep = new EnemyProjectile(tm);

	@Test
	public void testShouldRemove() {
		assertTrue(ep.shouldRemove());
	}

}
