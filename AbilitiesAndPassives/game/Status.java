package game;

public enum Status {
	Frozen, Biotic, Burnt, Stunned, Dampened;
	
	private int turns;
	
	private Status() {
		turns = 0;
	}
	
	public void setTurns(int turns) {
		this.turns = turns;
	}
	
	protected boolean checkStatus() {
		turns--;
		
		if(turns > 0) {
			return true;
		}
		return false;
	}
}
