package game;

import java.util.List;

public class Player {
	private int warAssets;
	private BattleFieldCard[][] battleField;
	private int credits;
	private int bioticPower;
	private int techPower;
	private List<Card> cards;
	
	public Player() {
		battleField = new BattleFieldCard[5][2];
	}
	
	protected BattleFieldCard getCardOnField(int row, int column) {
		return battleField[row][column];
	}
}
