package al.artofsoul.batbatgame.handlers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import al.artofsoul.batbatgame.entity.PlayerScore;

public class Scores {
	private final String url = "jdbc:sqlite:Resources/Scores/scores.db";
	private Connection conn;

	public Scores() {
		try {
			this.conn = DriverManager.getConnection(url);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void save(PlayerScore playerScore, int level) {
		String sql = "INSERT INTO Score(name, time, level) VALUES (?, ?, ?)";

		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, playerScore.getName());
			pstmt.setInt(2, (int) playerScore.getTime());
			pstmt.setInt(3, level);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public ArrayList<PlayerScore> getLevelScores(int level) {
		ArrayList<PlayerScore> scores = new ArrayList<PlayerScore>();
		try {
			String sql = "SELECT * FROM Score WHERE level = " + level + " ORDER BY time LIMIT 10";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			// loop through the result set
			while (rs.next()) {
				scores.add(new PlayerScore(rs.getString("name"), rs.getInt("time")));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return scores;
	}
}
