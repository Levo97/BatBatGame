package al.artofsoul.batbatgame.entity;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import al.artofsoul.batbatgame.tilemap.TileMap;

public class TestMap {

	TileMap tm = new TileMap(10);
	MapObject map = new MapObject(tm);

	@Test
	public void testIntersectsMapObject() {
		assertTrue(map.intersects(map));
	}

	@Test
	public void testIntersectsRectangle() {

	}

}
