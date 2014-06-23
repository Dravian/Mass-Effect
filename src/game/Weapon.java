package game;

import java.util.Random;

/**
 * A Weapon
 * @author daniel
 *
 */
public class Weapon {
	private int frtlAcc;
	private int bcklAcc;
	private int shieldMod;
	private int healthDmg;
	private int critChance;
	private WeaponType weaponType;
	private WeaponPower buff;
	private AmmoPower ammoType;
	
	public enum WeaponType {
		None,Melee,Pistol,Smg,Assault,Shotgun,Sniper,Heavy;	
	}
	
	public enum WeaponPower {
		None,Marksman,BulletRain,Overkill,Carnage,Assassination;
		
	}
	
	public enum HitType {
		Impossible,Miss,Hit,CriticalHit;
	}
	
	/**
	 * Given a Defending Card the column it is placedin and the column from which it was attacked. It determines the damage that the defending card is dealt to. 
	 * @param defender
	 * @param attackerColumn
	 * @param defenderColumn
	 */
	protected HitType attack(BattleFieldCard defender, int attackerRow,int attackerColumn,
			int defenderRow, int defenderColumn) {
		
		if(weaponType == WeaponType.None) {
			return HitType.Impossible;
		}

		if(weaponType == WeaponType.Melee && attackerRow != defenderRow) {
			return HitType.Impossible;
		}
		
		
		HitType ratio = HitType.Miss;
		
		int evasion = 0;
		int backLineDefense = 10;
		
		
		if (defender.getPassives().contains(Passive.Evasion)) {
			evasion = 10;
		}
		
		/*
		if (attackerColumn == 1 && defenderColumn == 1) {
			hit = new Random().nextInt(frtlAcc - evasion) == 0;
			// TODO check hit < 0

		} else if (attackerColumn == 0 && defenderColumn == 1) {
			hit = new Random().nextInt(bcklAcc - evasion) == 0;

		} else if (attackerColumn == 1 && defenderColumn == 0) {
			hit = new Random().nextInt(frtlAcc - evasion - backLineDefense) == 0;

		} else {
			hit = new Random().nextInt(bcklAcc - evasion - backLineDefense) == 0;

		}

		if (hit) {
			if (shields > 0) {
				int shieldGate = defender.damageShield(healthDmg * shieldMod);

				if (shieldGate > 0) {
					shieldGate = (shieldGate / shieldMod) / 2;
				}
				
				defender.damageHealth(shieldGate);
			} else {
				defender.damageHealth(healthDmg);
			}
		}*/
		
		if(ratio == HitType.Hit) {
			/*
			 * If WeaponPower temporarily buff damagemodifiers
			 * 
			 * If AmmoPower give damagecalculation to ammo
			 */
			
			
		}
		return ratio;
	}
	
	private HitType hitChance(int accuracy, int crit) {
		float chance = new Random().nextInt(101);
		
		if(chance > accuracy) {
			return HitType.Miss;
		
		} else if(chance <= crit && chance <= accuracy) {
			return HitType.CriticalHit;
		
		} else {
			return HitType.Hit;
		}
		
	}
	
}
