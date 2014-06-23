package game;

import java.util.List;

public enum BioticPower implements Ability{
	Warp{	

		@Override
		public boolean useAbility(Player usingPlayer, Player usedOnPlayer,
				BattleFieldCard usingCharacter,
				List<BattleFieldCard> usedOnCharacters) {
			int bioticCost = 2;
			boolean exhausts = true;			
			
			return false;
		}
	};
}
