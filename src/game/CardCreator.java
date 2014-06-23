package game;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class CardCreator {
	public static Connection con;

	
	private static void connectToDB() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/emotherearth", "root",
					"help1one3");
			System.out.println("Remote DB connection established");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Remote server could not be connected");
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("Remote server could not be connected");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Remote db connection establishment error");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("False querry");
		}

	}

	public static Card createCard(Card.CardType type, int id) {
		switch (type) {
		case Minion:
			//return new BattleFieldCard(id,con);
		}
		return null;
	}
}
