package SkunkAppPackage;

public class PredictableDie{
	private int lastRoll;
	private int[] dieValues;
	private int rollPosition;
	
	public PredictableDie(int[] dieValues) {
		this.rollPosition = 0;
		this.dieValues 	  = dieValues;
	}
	
	public int getLastRoll() // getter or accessor method
	{
		return this.lastRoll;
	}

	public void roll() // note how this changes Die's state, but doesn't return anything
	{
		this.lastRoll = this.dieValues[this.rollPosition%this.dieValues.length];
		rollPosition++;
	}

	@Override
	public String toString() // this OVERRIDES the default Object.toString()
	{
		return "Die: " + this.getLastRoll();
	}

}
