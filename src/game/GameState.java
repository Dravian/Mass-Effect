package game;

public class GameState {
	private Player player1;
	private Player player2;	
	private Player currentPlayer;
	
	
	
	protected void attack(int attackerRow, int attackerColumn, int defenderRow, int defenderColumn) {
		
		if(currentPlayer == player1) {
			BattleFieldCard attacker = player1.getCardOnField(attackerRow, attackerColumn);
			BattleFieldCard defender = player2.getCardOnField(defenderRow, defenderColumn);
			
			if(defenderColumn == 0 && player2.getCardOnField(defenderRow, 1) != null) {
				defender = player2.getCardOnField(defenderRow, 1);
			} else {
				defender = player2.getCardOnField(defenderRow, defenderColumn);
			}
			
			//attacker.attack(defender,attackerColumn,defenderColumn);
			
		} else {
			
		}
	}
	
	
}
