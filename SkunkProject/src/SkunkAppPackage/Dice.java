package SkunkAppPackage;
/**
 * Dice represents a single pair of rollable Die objects, randomly generating
 * sums of their two values
 * @authors Brima  and Sharifah
 *
 */
 

public class Dice{
	private int lastRoll;
	private Die die1;
	private Die die2;
	private PredictableDie pDie1; 
	private PredictableDie pDie2;

	public Dice(){
		this.die1 = new Die();
		this.die2 = new Die();
		this.roll();
	}

	public Dice(Die die1, Die die2) // overloaded constructor
	{
		this.die1 = die1;
		this.die2 = die2;
	}
	
	public Dice(PredictableDie pDie1, PredictableDie pDie2) // overloaded constructor
	{
		this.pDie1 = pDie1;
		this.pDie2 = pDie2;
	}
	
	
	public int getLastRoll()	{
		return this.lastRoll;
	}

	public void roll(){
		die1.roll();
		die2.roll();
		this.lastRoll = die1.getLastRoll() + die2.getLastRoll();
	}

	public String toString(){
		return "Dice with last roll: " + getLastRoll() + " => " + die1.getLastRoll() + " + " + die2.getLastRoll();
	}

	public Die getDie1() {
		return this.die1;
	}

	public Die getDie2() {
		return this.die2;
	}
}
