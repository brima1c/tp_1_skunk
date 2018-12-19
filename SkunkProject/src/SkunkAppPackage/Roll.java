package SkunkAppPackage;

public class Roll {
	private Dice dice;

	public Roll() {
		this.dice = new Dice();
		this.dice.roll();
	}
 

	public Dice getDice() {
		return this.dice;
	}
	
	//for testing with predictable dice
	public void setDice(PredictableDie pDie, PredictableDie pDie2) {
		this.dice = new Dice(pDie, pDie2);
	}
	
	public boolean isSingleSkunk() {
		if (isDoubleSkunk())
			return false;
		else
			return this.dice.getDie1().getLastRoll() == 1 || this.dice.getDie2().getLastRoll() == 1;
	}

	public boolean isDeuceSkunk() {
		return this.dice.getDie1().getLastRoll() == 1 && this.dice.getDie2().getLastRoll() == 2
				|| this.dice.getDie2().getLastRoll() == 1 && this.dice.getDie1().getLastRoll() == 2;
	}

	public boolean isDoubleSkunk() {
		return (this.dice.getDie1().getLastRoll() == 1 && dice.getDie2().getLastRoll() == 1);

	}
	public int getDie1Value() {
		return this.dice.getDie1().getLastRoll();
	}
	public int getDie2Value() {
		return this.dice.getDie2().getLastRoll();
	}

}
