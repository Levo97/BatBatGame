package al.artofsoul.batbatgame.handlers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.BeforeClass;
import org.junit.Test;

import al.artofsoul.batbatgame.entity.PlayerScore;

public class ScoresTest {
	private static Scores scores;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		scores = new Scores();
	}

	@Test
	public void testScores() {
		assertNotNull(new Scores());
	}

	@Test
	public void testGetLevelScores() {
		for (int i = 0; i < 10; i++) {
			assertNotNull(scores.getLevelScores(i));
		}

		// test the list size
		for (int i = 0; i < 10; i++) {
			assertTrue(scores.getLevelScores(i).size() <= 10);
		}
	}

	@Test
	public void testSave() {
		int dbSize = 0;

		try {
			Connection conn = DriverManager.getConnection("jdbc:sqlite:Resources/Scores/scores.db");
			String sql = "SELECT COUNT(*) AS DBSIZE FROM Score";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			// loop through the result set
			while (rs.next()) {
				dbSize = rs.getInt("DBSIZE");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		PlayerScore ps = new PlayerScore("TEST", 0);

		scores.save(ps, 1);

		int dbSizeAfterInsert = 0;

		try {
			Connection conn = DriverManager.getConnection("jdbc:sqlite:Resources/Scores/scores.db");
			String sql = "SELECT COUNT(*) AS DBSIZE FROM Score";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			// loop through the result set
			while (rs.next()) {
				dbSizeAfterInsert = rs.getInt("DBSIZE");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		PlayerScore newPS = null;

		try {
			Connection conn = DriverManager.getConnection("jdbc:sqlite:Resources/Scores/scores.db");
			String sql = "SELECT * FROM Score";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			// loop through the result set
			while (rs.next()) {
				newPS = new PlayerScore(rs.getString("name"), rs.getInt("time"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		assertTrue(dbSize < dbSizeAfterInsert);
		assertEquals(ps.getName(), newPS.getName());
		assertEquals(ps.getTime(), newPS.getTime());
	}
}
