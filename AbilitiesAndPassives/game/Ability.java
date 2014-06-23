package game;

import java.util.List;

public interface Ability {
	boolean useAbility(Player usingPlayer, Player usedOnPlayer, BattleFieldCard usingCharacter, 
			List<BattleFieldCard> usedOnCharacters);

}
