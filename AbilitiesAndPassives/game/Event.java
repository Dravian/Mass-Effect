package game;

import java.util.List;

public enum Event implements Ability{
	;

	@Override
	public boolean useAbility(Player usingPlayer, Player usedOnPlayer,
			BattleFieldCard usingCharacter,
			List<BattleFieldCard> usedOnCharacters) {
		// TODO Auto-generated method stub
		return false;
	}

}
