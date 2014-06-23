package game;

import game.Weapon.HitType;

import java.sql.Connection;

public class CommanderCard extends BattleFieldCard {
	private int maxAmmo;
	private int ammo;
	private CommanderClass commanderClass;
	private boolean assaultTraining;
	private boolean pistolTraining;
	private boolean smgTraining;
	private boolean sniperTraining;
	private boolean shotgunTraining;

	protected CommanderCard(int id, Connection con) {
		super(id, con);
		// TODO Auto-generated constructor stub
	}
	
	public enum CommanderClass{
		Soldier,Engineer,Adept, Infiltrator, Vanguard, Sentinel;
	}

	@Override
	protected HitType attack(BattleFieldCard defender, int attackerRow,
			int attackerColumn, int defenderRow, int defenderColumn) {
		
		if (ammo > 0) {
			ammo--;
			exhausts();
			return super.attack(defender, attackerRow, attackerColumn,
					defenderRow, defenderColumn);
		} else {
			return Weapon.HitType.Impossible;
		}
	}
	
	protected void refillThermoClip() {
		ammo = maxAmmo;
	}
}
