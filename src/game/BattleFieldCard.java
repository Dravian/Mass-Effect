package game;

import game.Weapon.HitType;

import java.util.List;
import java.util.Random;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public abstract class BattleFieldCard implements Card {
	private int id;
	private String name;
	private CharacterType characterType;
	private int cost;

	private int healthMax;
	private int health;
	private int shieldsMax;
	private int shields;

	private String Image;
	private List<Passive> passives;
	
	private Ability ability;
	private int warAsset;
	private int bioticPower;
	private int techPower;
	private boolean exhausted;
	private List<Status> status;
	private Race race;
	private Weapon weapon;
	

	protected BattleFieldCard(int id, Connection con) {
		this.id = id;
	}

	public enum CharacterType {
		Organic, Synthetic;
	}

	public enum Race {
		None,Asari, Krogan, Human, Quarian, Geth, Reaper;
	}

	protected List<Passive> getPassives() {
		return passives;
	}

	private int damageShield(int damage) {
		int rest = shields - damage;

		if (rest < 0) {
			shields = 0;
			return rest;
		} else {
			shields = shields - damage;
			return 0;
		}
	}

	protected void regenerateShields(int regen) {

	}

	protected void gainShields(int gain) {

	}

	protected void damageHealth(int damage) {
		health = health - damage;

		if (health < 0) {
			health = 0;
		}
		
		if(health == 0) {
			//TODO Death
		}
	}

	protected void regenerateHealth(int regen) {

	}

	protected void gainHealth(int gain) {

	}
	
	protected void exhausts(){
		exhausted = true;
	}
	
	protected HitType attack(BattleFieldCard defender, int attackerRow, int attackerColumn,
			int defenderRow, int defenderColumn) {
		exhausts();
		return weapon.attack(defender,attackerRow, attackerColumn, defenderRow, defenderColumn);
	}
}
